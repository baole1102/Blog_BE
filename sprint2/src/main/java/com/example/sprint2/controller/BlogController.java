package com.example.sprint2.controller;

import com.example.sprint2.dto.BlogDTO;
import com.example.sprint2.dto.IBlogDto;
import com.example.sprint2.model.Blog;
import com.example.sprint2.model.Category;
import com.example.sprint2.model.Topic;
import com.example.sprint2.service.IBlogService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping
    public ResponseEntity<?> getAllBlogs() {
        List<IBlogDto> list = blogService.listBlog();
        if (list == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/maxBlog")
    public ResponseEntity<?> getMaxViewBlog() {
        Optional<IBlogDto> blogs = blogService.maxViewBlog();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<?> getBlogById(@PathVariable Long id) {
        Optional<IBlogDto> blog = blogService.findByBlogId(id);
        if (blog.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping("/admin/search")
    public ResponseEntity<?> getAllBlogBySearch(@RequestParam(name = "id", defaultValue = "0") Long id,
                                                @RequestParam(name = "page", defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page, 5);
        if (id == 0) {
        Page<IBlogDto> list = blogService.pageListBlog(pageable);
        return new ResponseEntity<>(list,HttpStatus.OK);
        }
        Page<IBlogDto> list = blogService.getAllBlogSearch(pageable, id);
        if (list == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/admin/addBlog")
    public ResponseEntity<?> save(@RequestBody @Valid BlogDTO blogDTO, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        blogService.create(blogDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/highView")
    public ResponseEntity<?> getBlogHighView(){
        List<IBlogDto> list = blogService.getBlogHighView();
        if (list == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/current")
    public ResponseEntity<?> getListBlogCurrent(){
        List<IBlogDto> list = blogService.listBlogCurrent();
        if (list == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}

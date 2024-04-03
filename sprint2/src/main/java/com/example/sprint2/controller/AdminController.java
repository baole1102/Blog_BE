package com.example.sprint2.controller;

import com.example.sprint2.dto.*;
import com.example.sprint2.model.Product;
import com.example.sprint2.service.IBlogService;
import com.example.sprint2.service.IProductService;
import com.example.sprint2.service.IUserService;
import com.example.sprint2.service.ProductService;
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


@RestController
@CrossOrigin("*")
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ProductService productService;
    @Autowired
    private IUserService userService;

    @PatchMapping("/editBlog")
    public ResponseEntity<?> editBlogByAdmin(@RequestBody @Valid BlogDTO blogDTO, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        blogService.editBlog(blogDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBlogByAdmin(@PathVariable Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.deleteBlog(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/manageBlog")
    public ResponseEntity<?> manageBlog(@RequestParam(name = "id", defaultValue = "0") Long id,
                                        @RequestParam(name = "page", defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page, 6);
        if (id == 0) {
            Page<IBlogDto> list = blogService.pageListBlog(pageable);
            return new ResponseEntity<>(list, HttpStatus.OK);
        } else {
            Page<IBlogDto> list = blogService.manageBlog(pageable, id);
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }

    @PostMapping("/addBlog")
    public ResponseEntity<?> save(@RequestBody @Valid BlogDTO blogDTO, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        blogService.create(blogDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<?> getAllBlogBySearch(@RequestParam(name = "id", defaultValue = "0") Long id,
                                                @RequestParam(name = "page", defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page, 5);
        if (id == 0) {
            Page<IBlogDto> list = blogService.pageListBlog(pageable);
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
        Page<IBlogDto> list = blogService.getAllBlogSearch(pageable, id);
        if (list == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/manageProduct")
    public ResponseEntity<?> manageProduct(@RequestParam(name = "name", defaultValue = "") String name,
                                           @RequestParam(name = "page", defaultValue = "0") int page){
        Pageable pageable = PageRequest.of(page,5);
        Page<Product> list = productService.manageProduct(pageable,name.trim());
        if (list == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody @Valid ProductDto product,BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        productService.createProduct(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/editProduct")
    public ResponseEntity<?> editProductByAdmin(@RequestBody @Valid ProductDto productDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        productService.updateProduct(productDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<?> deleteProductByAdmin(@PathVariable Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getAllAccount")
    public ResponseEntity<?> getAllAccountByAdmin(@RequestParam(name = "name", defaultValue = "") String name,
                                                  @RequestParam(name = "page",defaultValue = "0") int page){
        Pageable pageable = PageRequest.of(page,5);
        Page<IUserDto> list = userService.getAllUserByAmin(pageable,name);
        if (list == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @DeleteMapping("/deleteAccount/{id}")
    public ResponseEntity<?> deleteAccountByAdmin(@PathVariable Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        userService.deleteAccount(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}

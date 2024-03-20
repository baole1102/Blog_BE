package com.example.sprint2.repository;

import com.example.sprint2.dto.BlogDTO;
import com.example.sprint2.dto.IBlogDto;
import com.example.sprint2.model.Blog;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Long> {
    @Query(value = "select b.id as id," +
            "b.title as title," +
            " b.content as content, " +
            "b.create_day as createDay," +
            "u.name as nameUser," +
            "b.viewer as viewer ," +
            "b.image_blog as imageBlog," +
            "u.image as imageUser \n" +
            "from blog b \n" +
            "join user u on b.user_id = u.id\n" +
            "where b.is_deleted = 0 and b.status = 0", nativeQuery = true)
    List<IBlogDto> listBlog();

    @Query(value = "select b.id as id," +
            "b.title as title," +
            " b.content as content," +
            " b.create_day as createDay," +
            "u.name as nameUser," +
            "b.viewer as viewer ," +
            "b.image_blog as imageBlog," +
            "u.image as imageUser \n" +
            "from blog b \n" +
            "join user u on b.user_id = u.id\n" +
            "where b.is_deleted = 0 and b.status = 0", nativeQuery = true)
    Page<IBlogDto> pageListBlog(Pageable pageable);


    @Query(value = "select b.id as id,b.title as title,\n" +
            " b.content as content, \n" +
            " b.create_day as createDay,\n" +
            " u.name as nameUser,b.viewer as viewer,\n" +
            " b.image_blog as imageBlog,\n" +
            " u.image as imageUser,\n" +
            " b.category_id as idCategory\n" +
            "from blog b \n" +
            "join user u on b.user_id = u.id\n" +
            "join category c on b.category_id = c.id\n" +
            "where b.is_deleted = 0 and b.status = 0 and b.category_id = :id", nativeQuery = true)
    Page<IBlogDto> getAllBlogSearch(Pageable pageable, @Param("id") Long id);


    @Query(value = "select b.id as id,b.title as title, b.content as content,\n" +
            " b.create_day as createDay,u.name as nameUser,b.viewer as viewer ,\n" +
            " b.image_blog as imageBlog,u.image as imageUser \n" +
            "from blog b \n" +
            "join user u on b.user_id = u.id\n" +
            "where b.is_deleted = 0 and b.status = 0 and b.viewer = (select max(b.viewer) from blog b)" +
            "limit 1", nativeQuery = true)
    Optional<IBlogDto> maxViewBlog();

    @Query(value = "select b.id as id,b.title as title, b.content as content, \n" +
            "b.create_day as createDay,u.name as nameUser,\n" +
            "b.viewer as viewer ,b.image_blog as imageBlog,u.image as imageUser ,\n" +
            "b.description as description\n" +
            "from blog b \n" +
            "join user u on b.user_id = u.id\n" +
            "where b.is_deleted = 0 and b.status = 0 and b.id = :id", nativeQuery = true)
    Optional<IBlogDto> findByBlogId(@Param("id") Long id);
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO blog (content,create_day,description,image_blog,title,viewer,category_id,topic_id) " +
            "VALUES(:#{#blog.content},:#{#blog.createDay},:#{#blog.description},:#{#blog.imageBlog}," +
            ":#{#blog.title},:#{#blog.viewer},:#{#blog.categoryId},:#{#blog.topicId})", nativeQuery = true)
    void create(BlogDTO blog);


    @Query(value = "select b.id as id,b.title as title,\n" +
            " b.content as content, \n" +
            " b.create_day as createDay,\n" +
            " u.name as nameUser,\n" +
            " b.viewer as viewer,\n" +
            " b.image_blog as imageBlog,\n" +
            " u.image as imageUser,\n" +
            " b.category_id as idCategory\n" +
            "from blog b \n" +
            "join user u on b.user_id = u.id\n" +
            "join category c on b.category_id = c.id\n" +
            "where b.is_deleted = 0 and b.status = 0 \n" +
            "order by b.viewer desc\n" +
            "limit 5",nativeQuery = true)
    List<IBlogDto> getBlogHighView();

    @Query(value = "select b.id as id,b.title as title,\n" +
            " b.content as content, \n" +
            " b.create_day as createDay,\n" +
            " u.name as nameUser,\n" +
            " b.viewer as viewer,\n" +
            " b.image_blog as imageBlog,\n" +
            " u.image as imageUser,\n" +
            " b.category_id as idCategory\n" +
            "from blog b \n" +
            "join user u on b.user_id = u.id\n" +
            "join category c on b.category_id = c.id\n" +
            "where b.is_deleted = 0 and b.status = 0 and date_sub(curdate(), INTERVAL 7 DAY) <= b.create_day\n" +
            "limit 4",nativeQuery = true)
    List<IBlogDto> listBlogCurrent();
}

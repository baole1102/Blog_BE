
use blogs;

select b.id as id,b.title as title,
 b.content as content, 
 b.create_day as createDay,
 u.name as nameUser,b.viewer as viewer,
 b.image_blog as imageBlog,
 u.image as imageUser,
 b.category_id as idCategory
from blog b 
join user u on b.id = u.blog_id
join category c on b.category_id = c.id
where b.is_deleted = 0 and b.status = 0 and b.category_id = 1;


select b.id as id,b.title as title, b.content as content, 
b.create_day as createDay,u.name as nameUser,
b.viewer as viewer ,b.image_blog as imageBlog,u.image as imageUser ,
b.description as description
from blog b 
join user u on b.id = u.blog_id
where b.is_deleted = 0 and b.status = 0 and b.id = 1;



select c.type_category as typeCategory,
c.id as id, t.id as idTopic,b.id as idBlog, t.name_topic as nameTopic 
from category c 
join topic t on c.id = t.category_id
join blog b on b.category_id = c.id
where b.is_deleted = 0 and b.status = 0;

select * from category c join topic t on c.id = t.category_id;

select b.id as id,b.title as title,
 b.content as content, 
 b.create_day as createDay,
 u.name as nameUser,
 b.viewer as viewer,
 b.image_blog as imageBlog,
 u.image as imageUser,
 b.category_id as idCategory
from blog b 
join user u on b.user_id = u.id
join category c on b.category_id = c.id
where b.is_deleted = 0 and b.status = 0 
order by b.viewer desc
limit 5;
;



	select b.id as id,b.title as title,
	 b.content as content, 
	 b.create_day as createDay,
	 u.name as nameUser,
	 b.viewer as viewer,
	 b.image_blog as imageBlog,
	 u.image as imageUser,
	 b.category_id as idCategory
	from blog b 
	join user u on b.user_id = u.id
	join category c on b.category_id = c.id
	where b.is_deleted = 0 and b.status = 0 and date_sub(curdate(), INTERVAL 7 DAY) <= b.create_day
	limit 4;
	;

select *
from topic t
where t.category_id = 1;
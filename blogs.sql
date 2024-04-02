
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
b.viewer as viewer ,b.image_blog as imageBlog,
u.image as imageUser,
b.description as description,
b.category_id as idCategory,
b.topic_id as idTopic
from blog b 
join user u on b.user_id = u.id
join topic t on b.topic_id = t.id
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

select b.id as id,b.title as title,
 b.content as content, 
 b.create_day as createDay,
 u.name as nameUser,b.viewer as viewer,
 b.image_blog as imageBlog,
 u.image as imageUser,
 b.category_id as idCategory
from blog b 
join user u on b.user_id = u.id
join category c on b.category_id = c.id
where b.is_deleted = 0 and b.status = 0 and b.topic_id = 1;



select b.id as id,b.title as title,
 b.content as content, 
 b.create_day as createDay,
 u.name as nameUser,b.viewer as viewer,
 b.image_blog as imageBlog,
 u.image as imageUser,
 b.category_id as idCategory
from blog b 
join user u on b.user_id = u.id
join category c on b.category_id = c.id
where b.is_deleted = 0 and b.status = 0 and b.category_id = 1;

select u.* from user u
where u.is_deleted = 0 and u.number = "0768568963"
limit 1;

select count(*),max(f.blog_id) as idBlog
from favorite f where f.user_id = 1 and 1;



select * 
from favorite f 
where f.blog_id = 1;

select *
from topic t
where t.category_id = 1;

select b.id as id,b.title as title,
 b.content as content, 
 b.create_day as createDay,
 u.name as nameUser,b.viewer as viewer,
 b.image_blog as imageBlog,
 u.image as imageUser
from blog b 
join user u on b.user_id = u.id
join favorite f on b.id = f.blog_id
where b.is_deleted = 0 and b.status = 0 ;


-- Favorite
select b.id as id,b.title as title,
 b.content as content, 
 b.create_day as createDay,
 u.name as nameUser,b.viewer as viewer,
 b.image_blog as imageBlog,
 u.image as imageUser,
 f.user_id as idUser
from blog b 
join user u on b.user_id = u.id
join favorite f on b.id = f.blog_id
where b.is_deleted = 0 and b.status = 0 and f.user_id = 2;

-- FindBlogByidUser 
select b.id as id,b.title as title,
 b.content as content, 
 b.create_day as createDay,
 b.image_blog as imageBlog
from blog b 
where b.is_deleted = 0 and b.status = 0 and b.user_id = 3;

select p.* from product p where p.is_deleted = false;

select p.id as id,p.name_product as nameProduct,
p.price as price, p.image_product as imageProduct,
c.quantity
from product p
join cart c on p.id = c.product_id
where c.user_id = 3 and p.is_deleted = 0;

select sum(c.quantity*p.price)
from product p
join cart c on p.id = c.product_id
where c.user_id = 3 and p.is_deleted = 0;

select count(*) 
from cart c 
where c.user_id = 3 and c.status = false;

UPDATE `blogs`.`cart` SET `status` = '1' WHERE cart.user_id =3;

select * from cart c where c.product_id =5 and c.user_id =3 and c.status = false;

select count(*) from favorite f where f.blog_id = 3 and f.user_id=3 ;

select * from product p
where p.is_deleted = false
order by p.content desc
limit 4;

select c.quantity as cartQuantity,
p.name_product as nameProduct,p.price as priceProduct,
p.image_product as imageProduct
from cart c
join product p on c.product_id = p.id
where c.user_id = 2 and c.status = 1
;

select r.name as roleName from user u
join user_has_role uhr on u.id = uhr.user_id
join role r on r.id = uhr.role_id
where u.is_deleted = 0 and u.account = "bao" limit 1;

select * from product p where p.is_deleted = false and p.content like "%a%"

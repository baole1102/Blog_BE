use blogs;
-- role -- 
INSERT INTO role (`role_enum`) VALUES ('ROLE_ADMIN'),('ROLE_USER'),('ROLE_MEMBER');

-- category--
 INSERT INTO category (`is_deleted`,`type_category`) 
 VALUES ('0','Front end');
  INSERT INTO category (`is_deleted`,`type_category`) 
 VALUES ('0','Backend');
  INSERT INTO category (`is_deleted`,`type_category`) 
 VALUES ('0','Cơ sở dữ liệu');
    INSERT INTO category (`is_deleted`,`type_category`) 
 VALUES ('0','GitHub');

-- topic --
 INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','Html','1');
  INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','Css','1');
  INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','MySql','3');
 INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','Java','2');
  INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','Javascript','1');
  INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','ReactJs','1');
  INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','GitHub','4');
 INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','PHP','2');
   INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','MongoDB','3');
   INSERT INTO topic (`is_deleted`,`name_topic`,`category_id`) 
 VALUES ('0','NextJs','1');
 
 -- user--
 INSERT INTO user (`account`,`email`,`image`,`is_deleted`,`name`,`number`,`password`,`role_id`) 
 VALUES ('bao','levannhatbao29@gmail.com','https://scontent.fdad1-1.fna.fbcdn.net/v/t39.30808-1/284180584_1458094071312347_7463131271359909719_n.jpg?stp=c7.0.40.40a_cp0_dst-jpg_p40x40&_nc_cat=104&ccb=1-7&_nc_sid=5f2048&_nc_ohc=WpGDAXd8M9EAX9pkjSD&_nc_ht=scontent.fdad1-1.fna&oh=00_AfDzdJ6ceaZJA36KXYN4RfinlbB6T7Nzdhi-goUB7Jvhyw&oe=65FAF645','0','Bao Le','0768568963','$2a$12$yPU2ZYoEwsiy9uho55s8nu3jKtA2tYDfi/44BGcOyrgpe5MNMHlYq','1');
 INSERT INTO user (`account`,`email`,`image`,`is_deleted`,`name`,`number`,`password`,`role_id`) 
 VALUES ('baole','levannhatbao28@gmail.com','https://scontent.fdad1-1.fna.fbcdn.net/v/t39.30808-1/284180584_1458094071312347_7463131271359909719_n.jpg?stp=c7.0.40.40a_cp0_dst-jpg_p40x40&_nc_cat=104&ccb=1-7&_nc_sid=5f2048&_nc_ohc=WpGDAXd8M9EAX9pkjSD&_nc_ht=scontent.fdad1-1.fna&oh=00_AfDzdJ6ceaZJA36KXYN4RfinlbB6T7Nzdhi-goUB7Jvhyw&oe=65FAF645','0','Bao Le','0768568963','$2a$12$yPU2ZYoEwsiy9uho55s8nu3jKtA2tYDfi/44BGcOyrgpe5MNMHlYq','2');
 INSERT INTO user (`account`,`email`,`image`,`is_deleted`,`name`,`number`,`password`,`role_id`) 
 VALUES ('baonhat','levannhatbao27@gmail.com','https://scontent.fdad1-1.fna.fbcdn.net/v/t39.30808-1/284180584_1458094071312347_7463131271359909719_n.jpg?stp=c7.0.40.40a_cp0_dst-jpg_p40x40&_nc_cat=104&ccb=1-7&_nc_sid=5f2048&_nc_ohc=WpGDAXd8M9EAX9pkjSD&_nc_ht=scontent.fdad1-1.fna&oh=00_AfDzdJ6ceaZJA36KXYN4RfinlbB6T7Nzdhi-goUB7Jvhyw&oe=65FAF645','0','Bao Le','0768568963','$2a$12$yPU2ZYoEwsiy9uho55s8nu3jKtA2tYDfi/44BGcOyrgpe5MNMHlYq','2');
INSERT INTO user (`account`,`email`,`image`,`is_deleted`,`name`,`number`,`password`,`role_id`) 
 VALUES ('dole','dole27@gmail.com','https://scontent.fdad1-1.fna.fbcdn.net/v/t39.30808-1/284180584_1458094071312347_7463131271359909719_n.jpg?stp=c7.0.40.40a_cp0_dst-jpg_p40x40&_nc_cat=104&ccb=1-7&_nc_sid=5f2048&_nc_ohc=WpGDAXd8M9EAX9pkjSD&_nc_ht=scontent.fdad1-1.fna&oh=00_AfDzdJ6ceaZJA36KXYN4RfinlbB6T7Nzdhi-goUB7Jvhyw&oe=65FAF645','0','Do Beo','0768568963','$2a$12$yPU2ZYoEwsiy9uho55s8nu3jKtA2tYDfi/44BGcOyrgpe5MNMHlYq','3');
INSERT INTO user (`account`,`email`,`image`,`is_deleted`,`name`,`number`,`password`,`role_id`) 
 VALUES ('tunglam','tunglam27@gmail.com','https://scontent.fdad1-1.fna.fbcdn.net/v/t39.30808-1/284180584_1458094071312347_7463131271359909719_n.jpg?stp=c7.0.40.40a_cp0_dst-jpg_p40x40&_nc_cat=104&ccb=1-7&_nc_sid=5f2048&_nc_ohc=WpGDAXd8M9EAX9pkjSD&_nc_ht=scontent.fdad1-1.fna&oh=00_AfDzdJ6ceaZJA36KXYN4RfinlbB6T7Nzdhi-goUB7Jvhyw&oe=65FAF645','0','Tung Lam','0768568963','$2a$12$yPU2ZYoEwsiy9uho55s8nu3jKtA2tYDfi/44BGcOyrgpe5MNMHlYq','3');

 
 -- blog -- 
INSERT INTO blog (`content`,`create_day`,`description`,`image_blog`,`is_deleted`,`title`,`viewer`,`category_id`,`user_id`) 
VALUES('Xin các chào các bạn, khi mình đọc những bài viế trên nhóm thì mình thấy có nhiều bạn vẫn không biết đưa code lên GitHub, hoặc bị lỗi, hoặc có thể là những bạn mới và đặc biệt là các bạn không biết tạo GitHub Pages (cụ thể là hiển thị ra trang web để cho mọi người xem nhá!).','2024-03-16','Bước 1: Tạo tài khoản GitHub và download Git
Ở bước này mình để hai đường dẫn bên dưới các bạn tự thực hiện nhe.
Link GitHub: https://github.com/
Link download Git: https://git-scm.com/downloads
Bước 2: Tạo một repository mới trên Github
Sau khi các bạn đã thực hiện bước 1 xong, các bạn đăng nhập vào GitHub và tạo một repository mới để đưa code lên GitHub. Các bạn thực hiện giống như ảnh bên dưới:','https://files.fullstack.edu.vn/f8-prod/blog_posts/677/615424715714d.png','0','Cách đưa code lên GitHub và tạo GitHub Pages','500','4','2');
INSERT INTO blog (`content`,`create_day`,`description`,`image_blog`,`is_deleted`,`title`,`viewer`,`category_id`,`user_id`) 
VALUES('Hôm nay mình có quay một video trong khóa học ReactJS là "Tạo dự án ReactJS với Webpack và Babel". Mình làm video này với mong muốn chia sẻ cho các bạn có thể hình dung ra dự án được tạo bởi "create-react-app" được xây dựng như thế nào. Các bạn có thể xem thêm video hướng dẫn ở đây nhé.','2024-03-16','1. Biên dịch code với Webpack
Tại Ternimal hãy chạy:
npm start
Lệnh này sẽ chạy webpack --mode development --watch mà ta đã cấu hình trong package.json, --watch để webpack sẽ luôn lắng nghe thay đổi, khi file thay đổi webpack sẽ thực hiện biên dịch nhé.','https://i3.ytimg.com/vi/1EBe-l1E3pM/maxresdefault.jpg','0','Tạo dự án ReactJS với Webpack và Babel','1000','1','3');
INSERT INTO blog (`content`,`create_day`,`description`,`image_blog`,`is_deleted`,`title`,`viewer`,`category_id`,`user_id`) 
VALUES('Có bạn nào thắc mắc thẻ rel="preconnect" trong trường hợp này dùng để làm gì không?
Thì câu trả lời là nó để "kết nối trước", từ này có vẻ hơi khó hiểu nhỉ. Ok, để mình giải thích thêm cho các bạn hiểu rõ hơn','2024-03-16','Khi bạn biết mình sẽ sớm cần một tài nguyên từ 1 URL nào đó (trong trường hợp này là từ https://fonts.googleapis.com và https://fonts.gstatic.com để lấy các font), nhưng bạn chưa biết url đầy đủ của nó (url đầy đủ của nó là: https://fonts.googleapis.com/css2?family=Roboto:wght@500;700&display=swap)
Thì lúc này HTML sẽ tới trang web lấy font về cho chúng ta trước khi dòng này được gọi <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@500;700&display=swap" rel="stylesheet">
Ưu điểm: Dùng cách này tốc độ lấy tài nguyên từ 1 trang web bên thứ 3 về sẽ nhanh hơn 1 tẹo
Nhược điểm: Song, có ưu thì cũng phải có nhược. Việc thiết lập và duy trì kết nối mở này rất tốn kém – cho cả máy khách và máy chủ. Vì vậy, lời khuyên của mình là các bạn chỉ nên sd cách tiếp cận này cho từ 4-6 trang web bên thứ 3 là hợp lí rồi.','https://files.fullstack.edu.vn/f8-prod/blog_posts/6782/6412fd42b7052.jpg','0','"Kết nối trước" với preconnect, prefetch để làm gì?','700','1','4');
INSERT INTO blog (`content`,`create_day`,`description`,`image_blog`,`is_deleted`,`title`,`viewer`,`category_id`,`user_id`) 
VALUES('Trong bài viết này, tôi muốn giới thiệu các trang web khác nhau mà bạn có thể sử dụng để học JavaScript khi chơi trò chơi. Phương pháp này được gọi là game hóa và là một kỹ thuật nổi tiếng hiện nay.','2024-03-19','Thông thường, nếu bạn học một công nghệ hoặc ngôn ngữ mới, bạn có thể không giữ được động lực của mình. Điều này là do số lượng công nghệ dường như vô tận. Có thể khó tiếp tục gắn bó với công nghệ đặc biệt phức tạp và việc học bị bế tắc.
Gamification là một giải pháp tốt cho vấn đề này. Nó sử dụng một nỗ lực chiến lược đơn giản để thúc đẩy và thu hút người dùng trong khi tìm hiểu điều gì đó mới. Đó là một kỹ thuật thêm các yếu tố thiết kế điển hình từ các trò chơi để nâng cao quá trình học tập. Điều này được thực hiện bằng cách thúc đẩy mong muốn tự nhiên của mọi người về giao tiếp xã hội, học tập, làm chủ, cạnh tranh, thành tích, địa vị hoặc thể hiện bản thân. Việc triển khai sớm Gamification sử dụng một hệ thống phần thưởng đơn giản cho người chơi sau khi họ hoàn thành nhiệm vụ để thu hút họ. Phần thưởng bao gồm điểm số, huy hiệu thành tích hoặc tiền ảo để sử dụng.
+Một cách tiếp cận khác của Gamification biến đổi chính nhiệm vụ trong trò chơi. Điều này được thực hiện bằng cách bao gồm một lựa chọn có ý nghĩa, hướng dẫn giới thiệu hoặc thêm một câu chuyện.
+Trong chương tiếp theo, tôi sẽ chỉ ra các trang web khác nhau có thể được sử dụng để học JavaScript bằng cách chơi trò chơi hoặc giải câu đố.','https://files.fullstack.edu.vn/f8-prod/blog_posts/6936/6422afa5a62f8.jpg','0','Learn JavaScript while Playing Games — Gamify Your Learning','600','1','3');

 INSERT INTO blog_has_topic (`blog_id`,`topic_id`) 
 VALUES ('1','7');
 INSERT INTO blog_has_topic (`blog_id`,`topic_id`) 
 VALUES ('2','6');
  INSERT INTO blog_has_topic (`blog_id`,`topic_id`) 
 VALUES ('3','1');
  INSERT INTO blog_has_topic (`blog_id`,`topic_id`) 
 VALUES ('4','5');
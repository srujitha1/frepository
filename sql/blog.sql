create database Srujitha;
use Srujitha;
create table if not exists blog(
    blog_id int unsigned primary key auto_increment,
	b_name varchar(50) not null,
	blog_url varchar(50) unique,
	created_date date not null);
create  table if not exists category(
	cat_id int unsigned primary key,
	cat_name varchar(50),
	blog_id int unsigned,
parent_cat_id int unsigned,
	constraint blog_id_fk foreign key(blog_id) references blog(blog_id),
	constraint cat_id_fk foreign key(parent_cat_id) references category(cat_id)
);
create table if not exists post(
	post_id int unsigned primary key,
	post_name varchar(40) not null,
	author_name varchar(50),
	cat_id int unsigned,
	constraint cat_post_id_fk foreign key(cat_id) references category(cat_id)
);
create table if not exists comments(
	c_id int unsigned primary key,
	c_text varchar(50),
	c_by_person varchar(50),
    p_id int unsigned,
	constraint p_id_fk foreign key(p_id) references post(post_id)
);
create table if not exists tag(
	t_id int unsigned primary key, 
	t_name varchar(50),
	t_date date
);
create table if not exists post_tag(
      post_id int unsigned,
		tag_id int unsigned,
primary key(tag_id,post_id),
constraint post_id_fk foreign key(post_id) references post(post_id),
constraint tag_id_fk foreign key(tag_id) references tag(t_id)
);







alter table blog change created_date dateofb date;
use srujitha;
show create table comments;

show create table category;

alter table comments drop foreign key p_id_fk;

alter table blog change  dateofb blog_date date;

alter table blog modify blog_name varchar(30);

insert into blog(b_name,blog_url,blog_date) values("jhansi","www.jhansi.com","2019-03-02");

select * from blog;

delete from blog where blog_id=2;

insert into category(cat_id,cat_name,blog_id,parent_cat_id) values(1,"adult",1,null),(2,"child",1,1);
select * from category;

insert into post(post_id,post_name,author_name,cat_id) values(3,"ajgwef","x",2),(4,"gayug","y",2),(5,"sguizg","z",1);
select * from post;

insert into tag(t_id,t_name,t_date) values(1,"#btech","2019-01-02"),(2,"#degreey","2019-02-02");
select * from tag;

insert into post_tag(post_id,tag_id) values(1,1),(1,2),(2,2);

select * from post_tag;

update tag set t_name="#bacheloroftechnology" where t_date="2019-01-02";

select * from post_tag where tag_id=1;

select category.cat_name,post.post_name from category left join post on post.cat_id=category.cat_id;


select * from category where cat_id in (select cat_id from post where post_name="btechlife");

select count(*) from post; 

select 
post_name,count(*) as no_of_authors from post  where cat_id=2 group by post_name;

select post_name from post where post_id > (select avg(post_id) from post) ;

select post_name from post where post_id between 1 and 4;

select post_name from post where post_id not in (1,3,4);

select author_name,count(*) from post where cat_id in (select cat_id from category where cat_name="child") group by author_name

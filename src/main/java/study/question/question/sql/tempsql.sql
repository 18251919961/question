drop table if exists question_info;
create table question_info(
	`question_id` int(11) not null auto_increment primary key,
	`question_desc` VARCHAR(1024) not null,
	`question_detail` varchar(1024),
	`question_picture` varchar(1024),
	`question_type_id` int(2),
	`question_classfy` int(2),
	`question_child_ids` varchar(1024),
	`parent_id` int(11),
	`answer_id` int(11),
	`create_time` date not null,
	`update_time` date not null,
  KEY `parent_id` (`parent_id`)
) ENGINE=InnoDB AUTO_INCREMENT=77498 DEFAULT CHARSET=utf8;

drop table if exists question_type_info;
create table question_type_info(
	`question_type_id` int(11) not null auto_increment primary key,
	`question_type_name` VARCHAR(128) not null,
	`question_type_desc` varchar(1024),
	`create_time` date not null,
	`update_time` date not null
) ENGINE=InnoDB AUTO_INCREMENT=77498 DEFAULT CHARSET=utf8;

drop table if exists question_classfy_info;
create table question_classfy_info(
	`question_classfy_id` int(11) not null auto_increment primary key,
	`question_classfy_name` VARCHAR(128) not null,
	`question_classfy_desc` varchar(1024),
	`create_time` date not null,
	`update_time` date not null
) ENGINE=InnoDB AUTO_INCREMENT=77498 DEFAULT CHARSET=utf8;
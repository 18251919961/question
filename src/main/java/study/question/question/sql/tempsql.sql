create table question_info(
	`id` int(11) not null auto_increment primary key,
	`question_desc` VARCHAR(1024) not null,
	`question_detail` varchar(1024),
	`question_picture` varchar(1024),
	`question_type` int(2),
	`question_classfy` int(2),
	`question_child_ids` varchar(1024),
	`parent_id` int(11),
	`answer_id` int(11),
	`create_time` date not null,
	`update_time` date not null,
	KEY `question_child_ids` (`question_child_ids`),
  KEY `parent_id` (`parent_id`)
) ENGINE=InnoDB AUTO_INCREMENT=77498 DEFAULT CHARSET=utf8;
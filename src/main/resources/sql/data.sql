insert into `user`(`user_name`, `user_age`, `user_status`, `ctime`, `utime`)
values ("Tom", 20, 1, unix_timestamp(now()), unix_timestamp(now()));
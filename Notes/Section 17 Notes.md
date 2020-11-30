# Spring 17 Connecting to MySQl --Ongoing
---------
297 Mysql command line for OSX or linux
```

>mysql
>alias mysql=/usr/local/mysql/bin/mysql
>mysql --user=root -p
>show databases
>use mysql;
>show tables;
>describe user;
>select host,user  from user;
>exit or quit

```
---------
297 Mysql from docker
```
>docker run --name jt-mysql -e MYSQL_ROOT_PASSWORD=password -d mysql
>docker ps
>docker exec -it jt-mysql bash 
>whoami
>mysql --user=root -p
[Enter password]
>


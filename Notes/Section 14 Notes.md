# Spring 14 Working with Containers and Image MongoDB --Ongoing
---------
259  --Done Some docker command
```
https://hub.docker.com/_/mongo
Mongo library official

docker command
--List the running images
docker ps
--List all images
docker images

--Remove images
docker rmi -f <image id>

--List all docker container
docker ps -a

-- Remove docker container
docker rm <Container ID>

---- To install Mongo
docker run mongo

---To run mongo
docker run -d mongo 

Chandras-MacBook-Pro:~ ckgauro$ docker ps -a
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS               NAMES
e9ae850062f9        mongo               "docker-entrypoint.s…"   4 minutes ago       Up 4 minutes        27017/tcp           gifted_pasteur

---To stop docker images
docker stop <container Id>

--TO change port 
docker run -p 27017:27017 -d mongo

Chandras-MacBook-Pro:~ ckgauro$ docker run -p 27017:27017 -d mongo
fd4c91efb33e7752122f2df386daf776b57b981411d4fcdc2eb2f1f569693bf0
Chandras-MacBook-Pro:~ ckgauro$ docker ps
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                      NAMES
fd4c91efb33e        mongo               "docker-entrypoint.s…"   5 seconds ago       Up 5 seconds        0.0.0.0:27017->27017/tcp   wizardly_gates
Chandras-MacBook-Pro:~ ckgauro$ 

---to see docker log
docker logs -f <container id>
   
--To see images of mongo detial information
docker image inspect mongo   

--
docker images -q --no-trunc



```
registry.hub.docker.com/mongo:latest

---------
261 --Ongoing
```
https://github.com/springframeworkguru/spring-boot-mongodb
clone it

[open terminal in intllij and type following command
mvn spring-boot:run]

localhost:8080/product/new

localhost:8080/product/

add another product
and view

```
---------
264
```
Docker files Command


localhost/8080/product/edit
{revise video}

---

docker ps
docker stop <continer id>
docker run -p 27017:27017 -d mongo
docker logs -f <container id>


localhost/8080/product/list

```
---------
265
```

--Persistent Container

>history| grep mongo
>pwd
>docker ps 
>docker stop <containerID>
>mkdir /Users/ckgauro/dockerdata/mongo
>cd  /Users/ckgauro/dockerdata/mongo
>docker run -p 27017:27017 -v /Users/ckgauro/dockerdata/mongo:/data/db  -d mongo
>docker ps
>docker ps -a
>docker logs <container id>
[
<restart springboot mongo project>
then do CRUD . now data will be persistent
]
>docker stop <container ID>
> cd /Users/ckgauro/dockerdata/mongo
>ls
>history| grep mongo
To run from command from history 
!<id>
!575

>docker ps
```
---------
267 Run Rabbit MQ container
```
docker run -d --hostname guru-rabbit --name some-rabbit -p 8080:15672 -p 5671:5671 -p 5672:5672 rabbitmq:3-management

docker ps
docker kill <containerID>
--To Run another rabbit mq
docker run -d --hostname guru-rabbit --name some-rabbit2 -p 8080:15672 -p 5671:5671 -p 5672:5672 rabbitmq:3-management

docker ps

```
---------
269 Run MYSQL in a container
```

>mkdir /Users/jt/mysqlData
>docker run --name guru-mysql -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -v /Users/jt/mysqlData:/var/lib/mysql -p 3306:3306 -d mysql
>docker ps
>Install [Sequel Pro] mysql utility
{revise video}

-------

```
---------
270
```
Container command




























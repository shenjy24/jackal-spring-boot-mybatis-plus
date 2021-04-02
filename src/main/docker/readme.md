#### 一.启动`MySQL`服务

```
docker run -p 3306:3306 --name mysql-web -e MYSQL_ROOT_PASSWORD=123456 -d mysql:5.7
```

#### 二.构建`SpringBoot`服务镜像

```
docker build -t jackal-image .
```
- 通过`spring.config.location`配置使得可以在宿主机修改配置文件，但必须重启才能生效。

#### 三.启动`SpringBoot`服务

1. 配置文件中的数据库`host`需要修改为`MySQL`容器名，如下所示：

```
url: jdbc:mysql://mysql-web:3306/db_master?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Hongkong
```
2. 执行如下命令启动服务
```
docker run -d -p 18080:8080 -e TZ=Asia/Shanghai --name jackal-web --link mysql-web:mysql-web -v D:\java\workspace\jackal-spring-boot-mybatis-plus\src\main\docker\logs:/logs -v D:\java\workspace\jackal-spring-boot-mybatis-plus\src\main\docker\conf\application.yml:/conf/application.yml jackal-image
```
- 通过挂载日志目录，使得可以在工作目录下的`logs`目录查看到服务日志。
- `--link mysql-web:mysql-web`：第一个参数为docker镜像名称，第二个参数为别名，此处应和配置文件中数据库的地址保持一致 。



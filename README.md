# SpringBoot 集成 Sharding Sphere 

## 参考

- [【SpringBoot实战】整合sharding-jdbc+mybatis][1]
- [SPRING BOOT配置][2]

## Quick Start

### 创建数据库和表

下面三种情况有些不一样

- 数据分片：两个数据库uc0、uc1 每个数据库两种表user0、user1
- 读写分离：一个主库，一个从库
- 数据分片+读写分离：两个主库、两个从库、每个库里存在两种表

### 修改配置文件

数据库表创建完后，修改 application.properties 数据库连接信息，然后针对不同的功能去掉对应的注释即可。


  [1]: http://www.chaiguanxin.com/articles/2018/12/02/1543757738369.html
  [2]: https://shardingsphere.apache.org/document/legacy/3.x/document/cn/manual/sharding-jdbc/configuration/config-spring-boot/
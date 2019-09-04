# cas-simple-sso

pom.xml文件报错有可能是版本号的问题可以试着改一下父级依赖的版本号

客户端是一个业务模块是一个客户端是吗 如果是多个业务模块 每个客户端都得写个过滤器 ? 这样不是代码冗余了吗 ？

通过JDBC数据库认证时，有可能连接不到数据库，将数据库链接改成：
cas.authn.jdbc.query[0].url=jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
即可连接数据库

Jdk的证书是写在D:\Java\jre1.8.0_181\lib\security\cacerts中的，而非在D:\Java\jdk1.8.0_181\jre\lib\security\cacerts中

如何将https改为http来登录cas服务器：
1.将target\cas\WEB-INF\classes的services目录以及application.properties文件复制到cas-overlay-template-master\src\main\resources中
2.修改application.properties，加入配置：
  cas.tgc.secure=false
  cas.serviceRegistry.initFromJson=true
  并且注释掉# server.ssl.key-store=file:D:/sso/keystore/casServer.keystore
           # server.ssl.key-store-password=htrjsyb
           # server.ssl.key-password=htrjsyb
3.修改services\HTTPSandIMAPS-10000001.json
      "serviceId" : "^(https|http|imaps)://.*",
 	    "name" : "HTTPS and HTTP and IMAPS",
即可以用http登录cas

CAS-自定义CAS Server端登录页面可参考链接：https://www.jianshu.com/p/72af74575f6d

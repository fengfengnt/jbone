依赖引用
        <dependency>
            <groupId>cn.jbone</groupId>
            <artifactId>jbone-session/artifactId>
        </dependency>

redis进行如下配置：
spring:
  redis:
    host: 192.168.100.100
    port: 6379
    password: jbone
    # 连接池最大连接数（使用负值表示没有限制）
    # 连接超时时间（毫秒）
    timeout: 0
    pool:
      max-active: 8
      # 连接池最大阻塞等待时间（使用负值表示没有限制）
      max-wait: -1
      # 连接池中的最大空闲连接
      max-idle: 8
      # 连接池中的最小空闲连接
      min-idle: 0

如果要配置Tomcat的jvmRoute， yml配置tomcat.jvmroute: c
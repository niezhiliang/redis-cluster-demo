# springBoot整合redis-cluster

### Redis集群搭建

[Linux docker集群搭建傻瓜式脚本](https://github.com/niezhiliang/docker-redis-colony)

### spring boot 使用集群

- 集群配置

```yaml
spring:
  redis:
    cluster:
      nodes:
        - 127.0.0.1:7000
        - 127.0.0.1:7001
        - 127.0.0.1:7002
        - 127.0.0.1:7003
        - 127.0.0.1:7004
        - 127.0.0.1:7005
    database: 0
    password: 
```

- 使用方式

使用集群的方式和使用单体的方式一样，有一个地方需要注意的是
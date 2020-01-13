package cn.isuyu.redis.cluster.demo;

import cn.isuyu.redis.cluster.demo.utils.RedisTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2020/1/13 下午5:50
 */
@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private RedisTools redisTools;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @RequestMapping(value = "save")
    public String save (String value) {
        redisTools.save("a",value,10);
        return "success";
    }

    @RequestMapping(value = "get")
    public String get () {

        return redisTools.get("a");
    }

}

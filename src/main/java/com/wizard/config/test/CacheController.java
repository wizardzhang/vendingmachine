package com.wizard.config.test;

import com.wizard.config.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 10992 on 2017/8/9.
 */
@RestController
@RequestMapping("/caches")
public class CacheController {

    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("/test")
    public String  test(){
        redisUtils.set("123", "hello world");
        System.out.println("进入了方法");
        String string= redisUtils.get("123").toString();
        return string;
    }

}

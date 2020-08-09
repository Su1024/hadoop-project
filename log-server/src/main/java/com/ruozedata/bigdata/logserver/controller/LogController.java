package com.ruozedata.bigdata.logserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @ClassName LogController
 * @Description
 * @Author suguoming
 * @Date 2020/8/9 7:49 下午
 */
@Controller
public class LogController {

    @PostMapping(value = "/upload")
    public void upload(@RequestBody String log) {
        System.out.println(log);
    }
}

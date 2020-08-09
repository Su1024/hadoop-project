package com.ruozedata.bigdata.logserver.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName LogController
 * @Description
 * @Author suguoming
 * @Date 2020/8/9 7:49 下午
 */
@Controller
public class LogController {
    private static final Logger logger = Logger.getLogger("LogController");
    @PostMapping(value = "/upload")
    @ResponseBody
    public void upload(@RequestBody String log) {
        System.out.println(log);
        logger.info(log);
    }
}

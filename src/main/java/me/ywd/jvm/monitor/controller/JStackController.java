package me.ywd.jvm.monitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Understanding JVM - page 111
 *
 *  @Author Ye_Wenda
 * @Date 8/19/2017
 */
@Controller
@RequestMapping("/index")
public class JStackController {

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/stackTrace")
    public String stackTrace() {
        return "getAllStackTrace";
    }
}

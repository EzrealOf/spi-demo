package com.ezreal.spi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2021/7/12.
 *
 * @author Ezreal
 * @since 2.0.0
 */
@RestController
public class HelloController {

    @GetMapping(value = "/api/hello")
    public String hello(@RequestParam(value = "str", defaultValue = "world") String str) {
        return "hello " + str;
    }
}

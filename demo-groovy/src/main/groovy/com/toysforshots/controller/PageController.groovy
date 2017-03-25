package com.toysforshots.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by manish on 25/3/17.
 */

@Controller
class PageController {

    @RequestMapping("/")
    public String home(Map model){
        return "thymeleaf-demo"
    }

}

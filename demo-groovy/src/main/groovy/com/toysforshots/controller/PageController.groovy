package com.toysforshots.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by manish on 25/3/17.
 */

@RestController
class PageController {

//    @RequestMapping("/")
    public String home(){
        return "helloworld.html"
    }

}

package com.example

import com.foo.NotificationService
import com.foo.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    NotificationService notificationService
    User user

    @Value('${pageController.msg}')
    String pageControllerMsg

    @Autowired
    void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService
    }

    @Autowired
    void setUser(User user) {
        this.user = user
    }

    @RequestMapping("/")
    def home(){
        notificationService.toString()
    }


    @RequestMapping("/newhome")
    def home2(){
        user.toString()
    }

    @RequestMapping("/homeFromProperties")
    def homeFromProperties(){
        pageControllerMsg
    }
}

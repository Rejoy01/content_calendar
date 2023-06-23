package com.rejo.contentcalendar.controller;

import com.rejo.contentcalendar.config.ContentCalenderProps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // we implemented another method
//    @Value("${cc.welcomeMessage: Default Welcome Message}")
//    private String welcomeMessage;
//
//    @Value("${cc.about}")
//    private String about;
    private final ContentCalenderProps properties;

    public HomeController(ContentCalenderProps properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalenderProps home() {
        return properties;
    }
}

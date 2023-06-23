package com.rejo.contentcalendar.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "cc")
public record ContentCalenderProps(String welcomeMessage,String about) {

}

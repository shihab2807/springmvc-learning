package com.jspiders;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = { "com.jspiders","com.jspiders.service","com.jspiders.controller","com.jspiders.repositary"})
public class UserConfig {


}

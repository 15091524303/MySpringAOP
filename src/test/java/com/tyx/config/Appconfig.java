package com.tyx.config;

import com.tyx.annotation.EnableAop;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tyx")
@EnableAop
public class Appconfig {
}

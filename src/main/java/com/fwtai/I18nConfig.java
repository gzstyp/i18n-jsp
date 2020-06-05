package com.fwtai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-06-05 17:28
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
@Configuration
public class I18nConfig{

    @Bean(name = "localeResolver")
    public MyLocaleResolver myLocaleResolver(){
        System.out.println("#####cookieLocaleResolver---create");
        MyLocaleResolver myLocaleResolver = new MyLocaleResolver();
        myLocaleResolver.setDefaultLocale(Locale.ENGLISH);
        return myLocaleResolver;
    }
}
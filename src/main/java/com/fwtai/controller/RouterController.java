package com.fwtai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-06-05 17:30
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
@Controller
public class RouterController{

    @GetMapping(value = {"/","/index"})
    public String index(){
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/language")
    public ModelAndView language(HttpServletRequest request,HttpServletResponse response,String language){
        final Locale locale = request.getLocale();
        final LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        language = language.toLowerCase();
        System.out.println("locale:-->" + locale);
        System.out.println("language:-->" + language);
        if(language == null || language.equals("")){
            return new ModelAndView("index");
        }else{
            if(language.equals("zh_cn")){
                localeResolver.setLocale(request,response,Locale.CHINA);
            }else if(language.equals("en_us")){
                localeResolver.setLocale(request,response,Locale.US);
            }else{
                localeResolver.setLocale(request,response,Locale.CHINA);
            }
        }
        return new ModelAndView("redirect:index");
    }

    @GetMapping("/target")
    public ModelAndView page(final String page,final String language ,final HttpServletRequest request,final HttpServletResponse response){
        final Locale locale = request.getLocale();
        final LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        System.out.println("locale:-->" + locale);
        if(language == null || language.equals("")){
            return new ModelAndView(page);
        }else{
            if(language.equalsIgnoreCase("zh_cn")){
                localeResolver.setLocale(request,response,Locale.CHINA);
            }else if(language.equalsIgnoreCase("en_us")){
                localeResolver.setLocale(request,response,Locale.US);
            }else{
                localeResolver.setLocale(request,response,Locale.CHINA);
            }
        }
        return new ModelAndView("redirect:"+page);
    }
}
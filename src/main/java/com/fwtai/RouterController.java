package com.fwtai;

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

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/language")
    public ModelAndView language(HttpServletRequest request,HttpServletResponse response,String language){
        Locale locale = request.getLocale();
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        language = language.toLowerCase();
        System.out.println("locale:-->" + locale);
        System.out.println("language:-->" + language);
        if(language == null || language.equals("")){
            return new ModelAndView("welcome");
        }else{
            if(language.equals("zh_cn")){
                localeResolver.setLocale(request,response,Locale.CHINA);
            }else if(language.equals("en")){
                localeResolver.setLocale(request,response,Locale.US);
            }else{
                localeResolver.setLocale(request,response,Locale.CHINA);
            }
        }
        return new ModelAndView("redirect:welcome");
    }
}
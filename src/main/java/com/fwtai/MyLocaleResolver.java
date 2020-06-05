package com.fwtai;

import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-06-05 17:27
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
public class MyLocaleResolver extends AcceptHeaderLocaleResolver{

    private Locale myLocal;

    @Override
    public Locale resolveLocale(HttpServletRequest request){
        return myLocal == null ? request.getLocale() : myLocal;
    }

    @Override
    public void setLocale(HttpServletRequest request,HttpServletResponse response,Locale locale){
        myLocal = locale;
    }
}
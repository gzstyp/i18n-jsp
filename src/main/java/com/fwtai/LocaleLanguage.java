package com.fwtai;

import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 国际化文件配置
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-06-05 17:27
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
public class LocaleLanguage extends AcceptHeaderLocaleResolver{

    private Locale locale;

    @Override
    public Locale resolveLocale(HttpServletRequest request){
        return locale == null ? request.getLocale() : locale;
    }

    @Override
    public void setLocale(HttpServletRequest request,HttpServletResponse response,Locale locale){
        this.locale = locale;
    }
}
package com.cnki.chickenwingsweb.config;

import com.cnki.chickenwingsweb.component.LoginHandlerInterceptor;
import com.cnki.chickenwingsweb.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
   /* @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/test").setViewName("/index");
    }*/
   //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //组件注册
    public WebMvcConfigurerAdapter webMvc(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
               registry.addViewController("/index.html").setViewName("index");
               registry.addViewController("/").setViewName("login");
               registry.addViewController("/lyear_pages_login.html").setViewName("login");
            }
            //配置拦截器   暂时注释掉不然每次都需要登录
           @Override
            public void addInterceptors(InterceptorRegistry registry) {
               //静态资源；  *.css , *.js
               //SpringBoot已经做好了静态资源映射
                /*registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/static/**")
                        .excludePathPatterns("/login","/","/user/login","/user/login/in");*/
                //  .excludePathPatterns("**/**.js","**/**.css","**/**.ico")
                //,"/login"
            }
            /**
             * 添加静态资源文件，外部可以直接访问地址
             * @param registry
             */
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                //如下配置则能可以访问src/main/resources/static下面的文件,
                //如访问static文件夹下的XX.css，则输入：localhost:8080/static/xx.css 即可访问
                //注意   registry.addResourceHandler("/static/**")配置得是静态资源访问路径，访问时必须将            //该路径添加进去
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/static/");
            }
        };
        return adapter;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
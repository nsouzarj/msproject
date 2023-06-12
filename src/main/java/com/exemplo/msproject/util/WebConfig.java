package com.exemplo.msproject.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.teiid.adminapi.impl.VDBMetaData;
import org.teiid.spring.autoconfigure.TeiidServer;
import org.teiid.spring.identity.SpringSecurityHelper;

import javax.servlet.ServletContext;
import java.util.Properties;

@Configuration
@PropertySource ("classpath:odata.properties")
public class WebConfig implements WebMvcConfigurer {
    private static String BATCH_SIZE = "batch-size";
    private static String BATCH_SIZE_VALUE = "256";
    private static String SKIPTOKEN_CACHE_TIME = "skiptoken-cache-time";
    private static String SKIPTOKEN_CACHE_TIME_VALUE = "300000";

    ApplicationContext context;

    @Autowired
    TeiidServer server;

    @Autowired
    VDBMetaData vdb;

    @Autowired
    ServletContext servletContext;

    @Autowired
    SpringSecurityHelper securityHelper;

    private Properties props = new Properties();

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
//    @PostConstruct
//    private void init() {
//      //  addProperty(BATCH_SIZE, BATCH_SIZE_VALUE);
//      //  addProperty(SKIPTOKEN_CACHE_TIME, SKIPTOKEN_CACHE_TIME_VALUE);
//    }
//
////    private void addProperty(String key, String defalt) {
////        String value = context.getEnvironment().getProperty("spring.teiid.odata."+key, defalt);
////        this.props.setProperty(key, value);
////    }

//    @Bean
//    SpringODataFilter getOdataFilter() {
//        return new SpringODataFilter(this.props, this.server, this.vdb, this.servletContext);
//    }

//    @Bean
//    public CommonsRequestLoggingFilter requestLoggingFilter() {
//        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
//        loggingFilter.setIncludeClientInfo(true);
//        loggingFilter.setIncludeQueryString(true);
//        loggingFilter.setIncludePayload(true);
//        loggingFilter.setIncludeHeaders(true);
//        return loggingFilter;
//    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(getOdataFilter())
//                .addPathPatterns("/odata/**");
//    }
}
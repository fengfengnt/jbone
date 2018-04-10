package cn.jbone.session.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class TomcatConfiguration {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${tomcat.jvmroute}")
    private String jvmRoute;

    //设置jvmRoute，和nginx配置中的srun_id一致
//    @PostConstruct
//    public void setJvmRoute() {
//        logger.info("设置jvmroute");
//        System.setProperty("jvmRoute", jvmRoute);
//    }

//    @Bean
//    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> tomcatCustomizer() {
//        return (tomcat) -> tomcat.addContextCustomizers((context) -> {
//            Manager manager = context.getManager();
//            if (manager == null) {
//                manager = new StandardManager();
//                context.setManager(manager);
//            }
//            manager.getSessionIdGenerator().setJvmRoute(jvmRoute);
//        });
//    }
}

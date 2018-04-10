package cn.jbone.session.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * This is {@link RedisSessionConfiguration}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@Configuration("redisSessionConfiguration")
@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 1800) //maxInactiveIntervalInSeconds为SpringSession的过期时间（单位：秒）
public class RedisSessionConfiguration {


//    /**
//     * 修改数据在redis中的存储方式，方便调试
//     * @Title: sessionRedisTemplate
//     * @Description: TODO
//     * @param connectionFactory
//     * @return
//     * @return: RedisTemplate<Object,Object>
//     */
//    @Bean
//    public RedisTemplate<Object, Object> sessionRedisTemplate(
//            RedisConnectionFactory connectionFactory) {
//        RedisTemplate<Object, Object> template = new RedisTemplate<Object, Object>();
//        template.setKeySerializer(new GenericJackson2JsonRedisSerializer());
//        template.setHashKeySerializer(new GenericJackson2JsonRedisSerializer());
//        template.setConnectionFactory(connectionFactory);
//        return template;
//    }



}

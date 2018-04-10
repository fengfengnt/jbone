package cn.jbone.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

@Component
public class MyPreFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyPreFilter.class);
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {

//        String path = RequestContext.getCurrentContext().getRequest().getRequestURI();
//        if(path.matches("/111/cas/*")) {
//            return false;
//        } else if(path.matches("/cas/webjars/*")){
//            return true;
//        } else {
//            return false;
//        }
        return false;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
//        request.getRequestDispatcher("").forward(request, null);
//        ctx.setz
        String test1 = RequestContext.getCurrentContext().getRequest().getRequestURI()
                .replace("/cas/webjars", "111/cas/webjars");
        String test2 = RequestContext.getCurrentContext().getRequest().getRequestURI();
//        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
//        Object accessToken = request.getParameter("token");
//        if(accessToken == null) {
//            log.warn("token is empty");
//            ctx.setSendZuulResponse(false);//不对其进行路由
//            ctx.setResponseStatusCode(401);
//            try {
//                ctx.getResponse().getWriter().write("token is empty");
//            }catch (Exception e){}
//
//            return null;
//        } else {
//            ctx.setSendZuulResponse(true); //对请求进行路由
//            ctx.setResponseStatusCode(200);
//            ctx.set("isSuccess", true);
//            log.info("ok");
//            return null;
//        }

            ctx.setSendZuulResponse(true); //对请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            log.info("ok");
        return null;
    }
}


package cn.mediinfo.springdemo.context.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 登录拦截器示例
 */
@Component
@Log4j2
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) throws Exception {


        var userid=request.getParameter("userid");
        if (!StringUtils.hasText(userid)) {
            log.info("未登录！");
            response.sendError(-1,"未登录");
        }
        else
        {
            log.info("登录！");
        }
    }
}

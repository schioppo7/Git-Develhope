package co.develhope.MiddlewareV1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LegacyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().equals(("/legacy"))) {
            response.setStatus(HttpStatus.GONE.value());
            response.getWriter().write("ERROR 410: ENDPOINT LEGACY GONE");
            return false;
        }
        return true;
    }
}

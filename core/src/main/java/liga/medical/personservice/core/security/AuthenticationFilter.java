package liga.medical.personservice.core.security;

import liga.medical.personservice.core.api.LogService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private LogService logService;

    public AuthenticationFilter(LogService logService, AuthenticationManager authenticationManager) {
        super.setAuthenticationManager(authenticationManager);
        this.logService = logService;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        logService.logAuth(request.getParameter("username"));
        return super.attemptAuthentication(request, response);
    }
}

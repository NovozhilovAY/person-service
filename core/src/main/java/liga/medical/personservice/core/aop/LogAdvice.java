package liga.medical.personservice.core.aop;

import liga.medical.personservice.core.api.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {

    private LogService logService;

    public LogAdvice(LogService logService) {
        this.logService = logService;
    }

    @Pointcut(value = "execution(* liga.medical.personservice.core.controller.*.*(..))")
    public void restPointcut() { }

    @Before("restPointcut()")
    public void restLogger(JoinPoint pjp) {
        String className = pjp.getTarget().getClass().getName();
        String methodName = pjp.getSignature().getName();
        logService.logRest(className, methodName);
    }
}

package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Aspect
@Component
public class LoggingAspect {
    // Запись журнала
    public Logger log = Logger.getLogger("reqTime_logger");

    /**
     * Подсчитайте время вызова метода в Сервисе
     * @param joinPoint
     * @throws Throwable
     */
    @Around("execution(* com.dufy..*Service.*(..))")
    public Object logServiceMethodAccess(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        long end = System.currentTimeMillis();
        long t = end - start;
        if(t>=1000){
            String tmp = joinPoint.getSignature().toString();
            log.info(String.format("class:%s,invoke_time:%s",tmp,t));
        }
        return object;
    }
}

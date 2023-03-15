package com.isen.test.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {
    private final static Logger LOG = LogManager.getLogger();

    @Before("execution(* com.isen.test.api.TestController.*(..))")
    public void logBefore(JoinPoint jp) {
        LOG.info("Passage avant {} {}", jp.getTarget(), jp.getSignature());
    }

    @After("execution(* com.isen.test.api.TestController.*(..))")
    public void logAfter(JoinPoint jp) {
        LOG.info("Passage apres {} {}", jp.getTarget(), jp.getSignature());
    }
}

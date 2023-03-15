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
public class PersonneServiceLoger {

    private final static Logger LOG = LogManager.getLogger();

    @Before("execution(* com.isen.test.service.PersonneServiceJPA.*(..))")
    public void logBefore(JoinPoint jp) {
        LOG.info("Service {} {}", jp.getTarget(), jp.getSignature());
    }

    @After("execution(* com.isen.test.service.PersonneServiceJPA.*(..))")
    public void logAfter(JoinPoint jp) {
        LOG.info("Service {} {}", jp.getTarget(), jp.getSignature());
    }

}

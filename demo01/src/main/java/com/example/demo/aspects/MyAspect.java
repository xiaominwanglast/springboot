package com.example.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

//    @Before(value = "within(com.example.demo.service.*Service)")
//    public void beforeTest(JoinPoint joinPoint){
//        System.out.println("方法名："+joinPoint.getSignature().getName());
//        System.out.println("参数名："+joinPoint.getArgs()[0]);
//        System.out.println("参数名："+joinPoint.getTarget());
//        System.out.println("======通知前======");
//    }
//
//    @After(value = "within(com.example.demo.service.*Service)")
//    public void afterTest(JoinPoint joinPoint){
//        System.out.println("方法名："+joinPoint.getSignature().getName());
//        System.out.println("参数名："+joinPoint.getArgs()[0]);
//        System.out.println("参数名："+joinPoint.getTarget());
//        System.out.println("======通知后======");
//    }

    @Around("within(com.example.demo.service.*Service)")
    public Object aroundTest(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("======目标前进入环绕======");
        System.out.println("方法名："+proceedingJoinPoint.getSignature().getName());
        System.out.println("参数名："+proceedingJoinPoint.getArgs()[0]);
        System.out.println("参数名："+proceedingJoinPoint.getTarget());
        try {
            Object proceed = proceedingJoinPoint.proceed();
            System.out.println("======目标方法执行后进入环绕通过======");
            return proceed;
        }catch(Exception e){
            System.out.println("======目标异常时执行======");
            return null;
        }
    }


}

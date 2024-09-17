package com.cebbank.bookstore.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
//@Order注解可以设置切面的优先级，默认Integer的最大值，@Order注解的Value属性值越小，优先级越高
public class LoggerAspect {

    /*
        切入点表达式语法：
        execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int,int))
        或写的宽泛一点：execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))
        上面的切入点表达式中的第一个*表示任意的访问修饰符和返回值类型，第二个*表示类中任意的方法，".."表示任意的参数列表，
        类的地方也可以使用*，表示包下所有的类。
     */
    @Pointcut("execution(* com.cebbank.bookstore.service.impl.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeMethod(){
        System.out.println("Logger-->前置通知");
    }

    @After("pointCut()")
    public void afterMethod(){
        System.out.println("Logger-->后置通知");
    }

    @AfterReturning("pointCut()")
    public void afterReturningMethod(){
        System.out.println("Logger-->返回通知");
    }
}

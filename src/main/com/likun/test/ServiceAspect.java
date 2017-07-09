package likun.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017-07-07.
 */
@Component
@Aspect
public class ServiceAspect {

  //  @Pointcut("execution(* likun.ctrl.*.*(..))")
  //@Pointcut("execution(* likun.ctrl.HelloController.test(..))")
  @Pointcut("execution(* likun.ctrl.HelloController.dubbo(..))")

  //声明一个切入点
    private void anyMethod() {
    }


    @Before("anyMethod() && args(name)")//声明前置通知
    public void doBefore(HttpServletRequest name) {
        System.out.println("前置通知");
        System.out.println("---" + name + "---");
    }

    @AfterReturning(pointcut = "anyMethod()", returning = "result")//声明后置通知
    public void doAfterReturning(String result) {
        System.out.println("后置通知");
        System.out.println("---" + result + "---");
    }

    @AfterThrowing(pointcut = "anyMethod()", throwing = "e")//声明例外通知
    public void doAfterThrowing(Exception e) {
        System.out.println("例外通知");
        System.out.println(e.getMessage());
    }

    @After("anyMethod()")//声明最终通知
    public void doAfter() {
        System.out.println("最终通知");
    }

    @Around("anyMethod()")//声明环绕通知
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入方法---环绕通知");
        //显示调用，确保被代理的方法被调用
        Object o = pjp.proceed();
        System.out.println("退出方法---环绕通知");
        return o;
    }
}

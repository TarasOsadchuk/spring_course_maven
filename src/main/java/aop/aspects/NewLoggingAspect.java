package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: у бібліотеку " +
                "пробують повернути книгу");

//        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: спіймали помилку " + e);
            throw e;
        }
//        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: у бібліотеку " +
                "успішно повернули книгу");
//        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook " +
//                "виконав роботу за " + (end - begin) + " милесекунд");
        return targetMethodResult;
    }
}

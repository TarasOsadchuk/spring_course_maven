package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логуємо надходження " +
//                "списка студентів перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())"
//    , returning = "students")
//    public void afterReturnGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturnGetStudentsLoggingAdvice: логуємо надходження " +
//                "списка студентів після роботи методу getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())"
//            , throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
//                "логіруємо викидання вийнятку " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логіруємо нормальне " +
                "закінчення роботи метода або викидання виключення");
    }
}

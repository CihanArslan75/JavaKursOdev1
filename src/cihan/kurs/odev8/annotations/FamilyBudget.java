package cihan.kurs.odev8.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FamilyBudget {
    String userRole() default "GUEST";
    int budget();
	
}

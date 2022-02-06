package ch09.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 정의하는 방법
// @메타어노테이션명
// public @interface 어노테이션명 {
// 	 자료형 요소명() [default 기본값];
// }

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnot {
	String value();
	int number() default 5;
}

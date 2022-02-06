package ch09.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// ������̼� �����ϴ� ���
// @��Ÿ������̼Ǹ�
// public @interface ������̼Ǹ� {
// 	 �ڷ��� ��Ҹ�() [default �⺻��];
// }

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnot {
	String value();
	int number() default 5;
}

package com.ta.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class GlobalExceptionLoggingAdvice implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target,
			IllegalArgumentException e) {
		System.out.println("Message " + e.getMessage() + " Reported by "
				+ method.getName());
	}

	public void afterThrowing(IllegalArgumentException iae) {
		System.out.println("Only Excetion " + iae.getMessage());
	}

}
/**
 * IQ: When there are two signatures of the method if i write two which one will be called?
 * A: There is no guarantee, but only one will be called that is what guarantee.
 */

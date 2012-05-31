package br.com.springaspect.core.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import br.com.springaspect.core.anotacoes.Teste;

@Aspect
@Component("businessProfiler")
public class BusinessProfiler {

	@Around(value = "@annotation(teste)", argNames = "teste")
	public Object profile(ProceedingJoinPoint pjp, Teste teste) throws Throwable {

		long start = System.currentTimeMillis();
		System.out.println("Going to call the method.");
		Object output = pjp.proceed();
		System.out.println("Method execution completed.");
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
		return output;
	}
}

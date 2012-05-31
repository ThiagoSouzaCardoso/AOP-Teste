package br.com.springaspect.core.business;

import org.springframework.stereotype.Component;

import br.com.springaspect.core.anotacoes.Teste;

@Component("myBusinessClass")
public class BusinessImpl implements Business {

	@Teste
	public void doSomeOperation() {
		System.out.println("I do what I do best, i.e sleep.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("How dare you to wake me up?");
		}
		System.out.println("Done with sleeping.");
	}

}

package br.com.springaspect.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.springaspect.core.business.Business;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class SpringAOPDemo {

	@Autowired
	@Qualifier("myBusinessClass")
	Business bc;

	@Test
	public void test() {
		bc.doSomeOperation();
	}

}

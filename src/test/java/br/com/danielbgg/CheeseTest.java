package br.com.danielbgg;

import org.junit.Test;

public class CheeseTest extends BaseRulesTestTemplate {

	public CheeseTest() {
		super("CheeseSession");
	}

	@Test
	public void testAND() {
		Cheese c = new Cheese();
		c.setType("parmesao");

		Person p = new Person();
		p.setFavoriteCheese("parmesao");
		p.setName("Daniel");

		ksession.insert(c);
		ksession.insert(p);
		ksession.fireAllRules();
	}

	@Test
	public void testOR() {
		Person p = new Person();
		p.setFavoriteCheese("prato");
		p.setName("Daniel");

		Mouse m = new Mouse();
		m.setFavoriteCheese("parmesao");
		m.setName("Mouse");

		ksession.insert(m);
		ksession.insert(p);
		ksession.fireAllRules();
	}

	@Test
	public void testEVAL() {
		Observation o1 = new Observation();
		o1.setVal(1);
		o1.setPer(2);

		Observation o2 = new Observation();
		o2.setVal(3);
		o2.setPer(4);

		ksession.insert(o1);
		ksession.insert(o2);
		ksession.fireAllRules();
	}

	@Test
	public void testEXISTS() {
		Cheese c = new Cheese();
		c.setType("parmesao");

		Person p = new Person();
		p.setFavoriteCheese("parmesao");
		p.setName("Daniel");

		Person p2 = new Person();
		p2.setFavoriteCheese("prato");
		p2.setName("Daniel2");

		ksession.insert(c);
		ksession.insert(p);
		ksession.insert(p2);
		ksession.fireAllRules();
	}

}

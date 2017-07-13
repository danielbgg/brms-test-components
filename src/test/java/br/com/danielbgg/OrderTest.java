package br.com.danielbgg;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OrderTest extends BaseRulesTestTemplate {

	public OrderTest() {
		super("OrderSession");
	}

	@Test
	public void test1() {
		Order o = new Order();
		o.setId(1);
		
		List<OrderItem> l = new ArrayList<OrderItem>();
		for (int i = 0; i < 100; i++) {
			OrderItem oi = new OrderItem();
			oi.setName("item: " + i);
			oi.setValue((i+1) * 10);
			l.add(oi);
		}
		
		o.setItems(l);

		ksession.insert(o);
		ksession.fireAllRules();
	}

	@Test
	public void test2() {
		Town t = new Town();
		t.setName("Paris");
		
		
		List<Person> l = new ArrayList<Person>();
		for (int i = 0; i < 3; i++) {
			Person p = new Person();
			p.setName("Name " + i);
			p.setGender("F");
			p.setChildren(i);
			l.add(p);
		}
		
		t.setPeople(l);

		ksession.insert(t);
		ksession.fireAllRules();
	}
	
	@Test
	public void test3() {
		Order o = new Order();
		o.setId(1);
		
		List<OrderItem> l = new ArrayList<OrderItem>();
		for (int i = 0; i < 100; i++) {
			OrderItem oi = new OrderItem();
			oi.setName("item: " + i);
			oi.setValue((i+1) * 10);
			ksession.insert(oi);
		}
		
		ksession.insert(o);
		ksession.fireAllRules();
	}

}

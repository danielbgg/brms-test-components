package br.com.danielbgg;

import java.math.BigDecimal;

import org.junit.Test;

public class CarrinhoDeCompraTest extends BaseRulesTestTemplate {

	public CarrinhoDeCompraTest() {
		super("CarrinhoDeCompraSession");
	}

	@Test
	public void test1() {
		CarrinhoDeCompra c1 = new CarrinhoDeCompra();
		c1.setNome("Daniel B. G. Gonçalves");
		c1.setCidade("Sao Paulo");
		c1.setValorDaCompra(new BigDecimal(1234));
		ksession.insert(c1);
		ksession.fireAllRules();
	}

}

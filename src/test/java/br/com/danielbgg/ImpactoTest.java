package br.com.danielbgg;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.danielbgg.impacto.Calculo;
import br.com.danielbgg.impacto.Recebimento;

public class ImpactoTest extends BaseRulesTestTemplate {

	public ImpactoTest() {
		super("ImpactoSession");
	}

	@Test
	public void test1() {
		Calculo c = new Calculo();
		List l = new ArrayList();
		l.add(new Recebimento("A1", 100d));
		l.add(new Recebimento("B1", 200d));
		l.add(new Recebimento("C1", 300d));
		c.setRecebimentos(l);
		
		ksession.insert(c);
		ksession.insert(new Recebimento("A", 10d));
		ksession.insert(new Recebimento("B", 5d));
		ksession.insert(new Recebimento("C", 3d));
		
		ksession.fireAllRules();
	}

}

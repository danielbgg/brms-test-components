package br.com.danielbgg;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.redhat.alcada.ClassificacaoCliente;
import com.redhat.alcada.Elemento;
import com.redhat.alcada.Grupo;
import com.redhat.alcada.Pais;

public class AlcadaTest extends BaseRulesTestTemplate {

	public AlcadaTest() {
		super("AlcadaSession");
	}

	@Test
	public void test1() {

		List<Elemento> l = new ArrayList<Elemento>();
		l.add(new Elemento("A", Pais.BRASIL, ClassificacaoCliente.BOM, 2000d, 12));
		l.add(new Elemento("B", Pais.PARAGUAI, ClassificacaoCliente.BOM, 800d, 20));
		l.add(new Elemento("C", Pais.BRASIL, ClassificacaoCliente.REGULAR, 400d, 25));
		l.add(new Elemento("D", Pais.PARAGUAI, ClassificacaoCliente.BOM, 300d, 40));

		Grupo g = new Grupo();
		g.setElementos(l);

		ksession.insert(g);
		ksession.fireAllRules();
	}

}

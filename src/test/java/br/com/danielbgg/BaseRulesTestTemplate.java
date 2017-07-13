package br.com.danielbgg;

import org.junit.After;
import org.junit.Before;
import org.kie.api.KieServices;
import org.kie.api.builder.Message;
import org.kie.api.builder.Message.Level;
import org.kie.api.builder.Results;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class BaseRulesTestTemplate {

	protected KieSession ksession;
	private String sessionId;

	public BaseRulesTestTemplate(String sessionId) {
		this.sessionId = sessionId;
	}

	@Before
	public void createRulesEngine() {
		KieServices services = KieServices.Factory.get();

		KieContainer container = services.newKieClasspathContainer();
		if (checkErrors(container)) {
			throw new IllegalArgumentException("Rule Errors.");
		}
		ksession = container.newKieSession(sessionId);
	}

	@After
	public void shutdownRulesEngine() {
		ksession.dispose();
	}

	public static boolean checkErrors(KieContainer container) {
		Results results = container.verify();
		boolean hasErrors = results.hasMessages(Level.ERROR);
		if (hasErrors) {
			for (Message message : results.getMessages()) {
				System.err.println(String.format("Line: %1$s / Column: %2$s , Path: %3$s / Error Message: %4$s ",
						message.getLine(), message.getColumn(), message.getPath(), message.toString()));
			}

		}
		return hasErrors;
	}
}

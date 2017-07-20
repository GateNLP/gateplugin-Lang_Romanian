package romanian;

import gate.creole.ResourceReference;
import gate.creole.Transducer;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Romanian Transducer", comment = "A module for executing Jape grammars")
public class RomanianTransducer extends Transducer {

	private static final long serialVersionUID = -5848481918991024567L;

	@Override
	@CreoleParameter(defaultValue = "resources/Grammar/main.jape")
	public void setGrammarURL(ResourceReference grammar) {
		super.setGrammarURL(grammar);
	}
}
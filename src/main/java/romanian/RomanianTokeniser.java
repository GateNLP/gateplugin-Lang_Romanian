package romanian;

import gate.creole.ResourceReference;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;
import gate.creole.tokeniser.DefaultTokeniser;

@CreoleResource(name = "Romanian Tokeniser", comment = "A customisable Romanian tokeniser.")
public class RomanianTokeniser extends DefaultTokeniser {

	private static final long serialVersionUID = 7816208836127678739L;

	@Override
	@CreoleParameter(defaultValue = "resources/Tokeniser/OBtokeniser.rules")
	public void setTokeniserRulesURL(ResourceReference rules) {
		super.setTokeniserRulesURL(rules);
	}

	@Override
	@CreoleParameter(defaultValue = "resources/Tokeniser/postprocess.jape")
	public void setTransducerGrammarURL(ResourceReference grammar) {
		super.setTransducerGrammarURL(grammar);
	}
}
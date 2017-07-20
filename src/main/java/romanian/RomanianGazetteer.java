package romanian;

import gate.creole.ResourceReference;
import gate.creole.gazetteer.DefaultGazetteer;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;
import gate.creole.metadata.Optional;

@CreoleResource(name = "Romanian Gazetteer", comment = "A list lookup component.")
public class RomanianGazetteer extends DefaultGazetteer {

	private static final long serialVersionUID = 3284137978256832610L;

	@Override
	@CreoleParameter(defaultValue = "resources/Gazeteer/list.lst")
	public void setListsURL(ResourceReference lists) {
		super.setListsURL(lists);
	}

	@Optional
	@CreoleParameter(defaultValue = "\t")
	public void setGazetteerFeatureSeparator(String gazetteerFeatureSeparator) {
		super.setGazetteerFeatureSeparator(gazetteerFeatureSeparator);
	}
}
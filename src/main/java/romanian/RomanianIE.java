package romanian;

import gate.creole.PackagedController;
import gate.creole.metadata.AutoInstance;
import gate.creole.metadata.AutoInstanceParam;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

import java.net.URL;
import java.util.List;

@CreoleResource(name = "Romanian IE System",
    comment = "Ready-made Romanian IE application",
    autoinstances = @AutoInstance(parameters = {
	@AutoInstanceParam(name="pipelineURL", value="resources/romanian.gapp"),
	@AutoInstanceParam(name="menu", value="Romanian")}))
public class RomanianIE extends PackagedController {

  private static final long serialVersionUID = -4943333454613689694L;
}

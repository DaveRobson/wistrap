package david.robson.wistrap.app.plugins;

import david.robson.wistrap.app.BasePage;
import david.robson.wistrap.app.plugins.modal.ModalDocPanel;

public class PluginsPage extends BasePage
{
	public PluginsPage() 
	{
		add(new ModalDocPanel("modalDocPanel"));
	}
}

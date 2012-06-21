package david.robson.wistrap.app.components;

import david.robson.wistrap.app.BasePage;
import david.robson.wistrap.base.components.button.ButtonType;
import david.robson.wistrap.base.components.button.WiStrapButton;

@SuppressWarnings("serial")
public class ComponentsPage extends BasePage
{
	public ComponentsPage()
	{
		add(new WiStrapButton("defaultButton", ButtonType.DEFAULT));
		add(new WiStrapButton("primaryButton", ButtonType.PRIMARY));
		add(new WiStrapButton("infoButton", ButtonType.INFO));
		add(new WiStrapButton("successButton", ButtonType.SUCCESS));
		add(new WiStrapButton("warningButton", ButtonType.WARNING));
		add(new WiStrapButton("dangerButton", ButtonType.DANGER));
		add(new WiStrapButton("inverseButton", ButtonType.INVERSE));
		
		
		
		
	}
}

package david.robson.wistrap.base.components.modal;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.Panel;


/**
 * 
 * A wicket version of the bootstrap Modal. 
 * http://twitter.github.com/bootstrap/javascript.html#modals
 * 
 * This this just a window the content is provided by the @WiStrapModalPanel.
 * 
 * @author drobson
 *
 */
public class WiStrapModalWindow extends Panel
{
	private WebMarkupContainer wmc;
	
	public static String MODAL_PANEL_ID = "modalPanel";

	public WiStrapModalWindow(String id, WiStrapModalPanel modalPanel) 
	{
		super(id);
		
		wmc = new WebMarkupContainer("wmc")
		{		
			protected void onComponentTag(ComponentTag tag) 
			{
				tag.put("id", getMarkupId());
				
				super.onComponentTag(tag);
			};
		};
		add(wmc);
		
		wmc.add(modalPanel);
	}

	public String getModalWindowId()
	{
		return wmc.getMarkupId();
	}
}

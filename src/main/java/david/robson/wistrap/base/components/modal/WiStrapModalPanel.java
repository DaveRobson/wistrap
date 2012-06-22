package david.robson.wistrap.base.components.modal;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Adds the content for the @WiStrapModalWindow.
 * 
 * Contains header, content and button sections.
 * Content is provided by the supplied panel from the getContent method.
 *  
 * 
 * @author drobson
 *
 */
public abstract class WiStrapModalPanel extends Panel
{
	public WiStrapModalPanel(String id, String header) 
	{
		super(id);
		
		//Modal window header
		Label label = new Label("header", header);
		add(label);
		
		//the windows content
		add(WiStrapModalPanel.this.getContent("content"));	
		
		//Buttons
		AjaxLink<Void> cancel = new AjaxLink<Void>("cancel")
		{
			@Override
			public void onClick(AjaxRequestTarget target) 
			{
				WiStrapModalPanel.this.onCancel(target);			
			}			
		};
		add(cancel);
			
		AjaxLink<Void> submit = new AjaxLink<Void>("submit")
		{
			@Override
			public void onClick(AjaxRequestTarget target) 
			{
				WiStrapModalPanel.this.onSubmit(target);	
			}			
		};
		add(submit);
	}
	
	public abstract Panel getContent(String id);
	
	public abstract void onCancel(AjaxRequestTarget target);
	
	public abstract void onSubmit(AjaxRequestTarget target);
}

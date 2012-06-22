package david.robson.wistrap.base.behavior;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.IHeaderResponse;

/**
 * Adds the data-toggle and href tags needed for the bootstrap-modal.js
 * Also loads the the js in the header. Requires the id of the modal the 
 * js will target.
 * 
 * @author drobson
 *
 */
@SuppressWarnings("serial")
public class ModalBehavior extends Behavior
{
	private String modalWindowId;
	
	public ModalBehavior(String modalWindowId)
	{
		this.modalWindowId = modalWindowId;
	}
	
	@Override
	public void renderHead(Component component, IHeaderResponse response) 
	{
		response.renderJavaScriptReference("$('#" + modalWindowId + "').modal()");
		super.renderHead(component, response);
	}
	
	@Override
	public void onComponentTag(Component component, ComponentTag tag) 
	{	
		tag.put("data-toggle", "modal");
		tag.put("href", "#" + modalWindowId);
		
		super.onComponentTag(component, tag);
	}
}

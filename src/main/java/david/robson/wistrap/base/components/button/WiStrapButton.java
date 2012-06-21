package david.robson.wistrap.base.components.button;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.model.IModel;

public class WiStrapButton extends Button
{
	private ButtonType type;
	
	
	public WiStrapButton(String id, ButtonType type)
	{
		this(id, null, type);
	}

	public WiStrapButton(String id, IModel<String> model, ButtonType type)
	{
		super(id, model);
		
		this.type = type;
	}
	
	@Override
	protected void onComponentTag(ComponentTag tag) 
	{
		tag.put("class", type.getCssClass());
		
		super.onComponentTag(tag);
	}
}

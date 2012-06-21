package david.robson.wistrap.base.components.button;

import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;


public abstract class WiStrapAjaxButton extends AjaxButton
{
	private ButtonType type;
	
	public WiStrapAjaxButton(String id, ButtonType type)
	{
		this(id, null, null, type);
	}

	public WiStrapAjaxButton(String id, IModel<String> model, ButtonType type)
	{
		this(id, model, null, type);
	}


	public WiStrapAjaxButton(String id, Form<?> form, ButtonType type)
	{
		this(id, null, form, type);
	}
	
	public WiStrapAjaxButton(String id, IModel<String> model, final Form<?> form, ButtonType type)
	{
		super(id, model, form);
		
		this.type = type;
	}
	
	@Override
	protected void onComponentTag(ComponentTag tag) 
	{
		tag.put("class", type.getCssClass());
		
		super.onComponentTag(tag);
	}
	
}

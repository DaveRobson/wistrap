package david.robson.wistrap.base.components.nav;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

import david.robson.wistrap.base.components.nav.domain.MenuItem;

@SuppressWarnings("serial")
public abstract class ItemAction extends Panel
{
	public ItemAction(String id, final MenuItem item) 
	{
		super(id);
		
		setRenderBodyOnly(true);
				
		add(new Link<Void>("itemLink")
		{
			{
				final Label label = new Label("linkName", item.getTitle());
				add(label);
				label.setRenderBodyOnly(true);			
			}
				
			@Override
			public void onClick() 
			{
				ItemAction.this.onClick();
			}
		});
	}
	
	public abstract void onClick();
}


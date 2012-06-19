package david.robson.wistrap.base.nav;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

@SuppressWarnings("serial")
public class ItemLink extends Panel
{
	public ItemLink(String id, final ListItem<MenuItem> item) 
	{
		super(id);
		
		setRenderBodyOnly(true);
		
		add(new Link<Class<? extends WebPage>>("pageLink", new Model<Class<? extends WebPage>>(item.getModelObject().getPage()))
		{
			{
				final Label label = new Label("linkName", item.getModelObject().getTitle());
				add(label);
				label.setRenderBodyOnly(true);			
			}
		
			@Override
			public void onClick()
			{
				setResponsePage(getModelObject());
			}
		});
	}
}

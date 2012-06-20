package david.robson.wistrap.base.nav;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

/**
 * Creates a new link to be added to the menu
 * 
 * @param menu
 *            the menu to add the link to
 * @return the link
 */
@SuppressWarnings("serial")
public class ItemPageLink extends Panel
{
	public ItemPageLink(String id, final MenuItem item) 
	{
		super(id);
		
		setRenderBodyOnly(true);
		
		add(new Link<Class<? extends WebPage>>("pageLink", new Model<Class<? extends WebPage>>(item.getPage()))
		{
			{
				final Label label = new Label("linkName", item.getTitle());
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

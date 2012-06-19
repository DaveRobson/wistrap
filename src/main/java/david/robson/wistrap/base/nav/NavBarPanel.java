package david.robson.wistrap.base.nav;

import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;


@SuppressWarnings("serial")
public class NavBarPanel extends Panel
{
	
	private Class<? extends WebPage> parentWebPage;
	
	public NavBarPanel(String id, List<MenuItem> items, Class<? extends WebPage> parentWebPage)
	{
		this(id, items, null, parentWebPage);
	}
	
	public NavBarPanel(String id, List<MenuItem> items, String brand, final Class<? extends WebPage> parentWebPage) 
	{
		super(id);

		Link<Void> link = new Link<Void>("brand") 
		{
			@Override
			public void onClick() 
			{
				setResponsePage(getSession().getApplication().getHomePage());
			}
			
		};
		
		link.add(new Label("brandLabel", brand).setRenderBodyOnly(true));
		
		link.setVisible(false);
		
		add(link);
		
		if(brand != null)
		{
			link.setVisible(true);		
		}
		
		
		ListView<MenuItem> menuLinks = new ListView<MenuItem>("menuLinks", items)
		{
			protected void populateItem(final ListItem<MenuItem> item)
			{
				item.setModel(new CompoundPropertyModel<MenuItem>(item.getModelObject()));	
							
				item.add(new ItemLink("item", item));	
							
				if (item.getModelObject().isSelected(parentWebPage))
				{
					item.add(AttributeAppender.replace("class", new Model<String>("active")));
				}
					
			}
		};
		add(menuLinks);

	}
		
	/**
	 * Creates a new link to be added to the menu
	 * 
	 * @param menu
	 *            the menu to add the link to
	 * @return the link
	 */
	private Component link(final ListItem<MenuItem> item)
	{
		return new Link<Class<? extends WebPage>>("pageLink", new Model<Class<? extends WebPage>>(item.getModelObject().getPage()))
		{
			{
				final Label label = new Label("linkName", item.getModelObject().getTitle());
				add(label);
				label.setRenderBodyOnly(true);
				
				if (item.getModelObject().isSelected(parentWebPage))
				{
					item.add(AttributeAppender.replace("class", new Model<String>("active")));
				}
			}
		
			@Override
			public void onClick()
			{
				setResponsePage(getModelObject());
			}
		};
	}
	
	
	
	
	@Override
	protected void onComponentTag(ComponentTag tag) 
	{
		tag.put("class", "navbar navbar-fixed-top");
		
		super.onComponentTag(tag);
	}
	
	
}

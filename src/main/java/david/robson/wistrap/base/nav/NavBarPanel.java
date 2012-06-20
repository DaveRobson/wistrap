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
							
				if(item.getModelObject() instanceof MenuItemAsPage)
				{
					if (item.getModelObject().isSelected(parentWebPage))
					{
						item.add(AttributeAppender.replace("class", new Model<String>("active")));
					}
				}		
				
				if(item.getModelObject() instanceof MenuItemAsDropDown)
				{				
					item.add(AttributeAppender.replace("class", new Model<String>("dropdown")));
				}	
				
				item.add(item.getModelObject().getComponent("item", item.getModelObject()));
			}
		};
		add(menuLinks);

	}
		
	
	@Override
	protected void onComponentTag(ComponentTag tag) 
	{
		tag.put("class", "navbar navbar-fixed-top");
		
		super.onComponentTag(tag);
	}
	
	
}

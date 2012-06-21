package david.robson.wistrap.base.components.nav.domain;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;

import david.robson.wistrap.base.components.nav.ItemPageLink;

@SuppressWarnings("serial")
public class MenuItemAsPage extends MenuItem
{

	public MenuItemAsPage(Class<? extends WebPage> page, String title,
			String className) {
		super(page, title, className);
		
	}

	@Override
	public Component getComponent(String id, MenuItem item)
	{
		return new ItemPageLink(id, item);
	}
	
	

}

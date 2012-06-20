package david.robson.wistrap.base.nav;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;

@SuppressWarnings("serial")
public class MenuItemAsPage extends MenuItem
{

	public MenuItemAsPage(Class<? extends WebPage> page, String title,
			String className) {
		super(page, title, className);
		
	}

	@Override
	Component getComponent(String id, MenuItem item)
	{
		return new ItemPageLink(id, item);
	}
	
	

}

package david.robson.wistrap.app;

import java.util.ArrayList;
import java.util.List;

import david.robson.wistrap.app.components.ComponentsPage;
import david.robson.wistrap.app.home.HomePage;
import david.robson.wistrap.app.plugins.PluginsPage;
import david.robson.wistrap.base.components.nav.NavBarPanel;
import david.robson.wistrap.base.components.nav.domain.MenuItem;
import david.robson.wistrap.base.components.nav.domain.MenuItemAsAction;
import david.robson.wistrap.base.components.nav.domain.MenuItemAsDropDown;
import david.robson.wistrap.base.components.nav.domain.MenuItemAsPage;
import david.robson.wistrap.base.webpage.DocsPage;


@SuppressWarnings("serial")
public class BasePage extends DocsPage
{
	public BasePage()
	{
		List<MenuItem> items = new ArrayList<MenuItem>();
		items.add(new MenuItemAsPage(HomePage.class, "Home", "homePage"));
		items.add(new MenuItemAsPage(ComponentsPage.class, "Components", "componentsPage"));
		items.add(new MenuItemAsPage(PluginsPage.class, "Plugins", "pluginsPage"));
		
		
			List<MenuItem> childItems = new ArrayList<MenuItem>();
			childItems.add(new MenuItemAsAction("Action", "testAction")
			{
				@Override
				public void onClick() 
				{
					
					
				}
				
			});
		
		items.add(new MenuItemAsDropDown("Dropdown", "dropdown", childItems));
		
		add(new NavBarPanel("navBar", items, BasePage.this.getClass()));
	}
}

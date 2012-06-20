package david.robson.wistrap.app;

import java.util.ArrayList;
import java.util.List;

import david.robson.wistrap.app.components.ComponentsPage;
import david.robson.wistrap.app.home.HomePage;
import david.robson.wistrap.base.nav.MenuItem;
import david.robson.wistrap.base.nav.MenuItemAsAction;
import david.robson.wistrap.base.nav.MenuItemAsDropDown;
import david.robson.wistrap.base.nav.MenuItemAsPage;
import david.robson.wistrap.base.nav.NavBarPanel;
import david.robson.wistrap.base.webpage.DocsPage;


@SuppressWarnings("serial")
public class BasePage extends DocsPage
{
	public BasePage()
	{
		List<MenuItem> items = new ArrayList<MenuItem>();
		items.add(new MenuItemAsPage(HomePage.class, "Home", "homePage"));
		items.add(new MenuItemAsPage(ComponentsPage.class, "Components", "componentsPage"));
		
		
		
			List<MenuItem> childItems = new ArrayList<MenuItem>();
			childItems.add(new MenuItemAsAction("Action", "testAction")
			{
				@Override
				public void onClick() 
				{
					// TODO Auto-generated method stub
					
				}
				
			});
		
		items.add(new MenuItemAsDropDown("Dropdown", "dropdown", childItems));
		
		add(new NavBarPanel("navBar", items, BasePage.this.getClass()));
	}
}

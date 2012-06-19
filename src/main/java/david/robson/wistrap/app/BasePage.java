package david.robson.wistrap.app;

import java.util.ArrayList;
import java.util.List;

import david.robson.wistrap.app.components.ComponentsPage;
import david.robson.wistrap.app.home.HomePage;
import david.robson.wistrap.base.nav.MenuItem;
import david.robson.wistrap.base.nav.NavBarPanel;
import david.robson.wistrap.base.webpage.DocsPage;


@SuppressWarnings("serial")
public class BasePage extends DocsPage
{
	public BasePage()
	{
		List<MenuItem> items = new ArrayList<MenuItem>();
		items.add(new MenuItem(HomePage.class, "Home", "homePage"));
		items.add(new MenuItem(ComponentsPage.class, "Components", "componentsPage"));
		
		add(new NavBarPanel("navBar", items, BasePage.this.getClass()));
	}
}

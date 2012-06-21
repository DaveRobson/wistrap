package david.robson.wistrap.base.components.nav.domain;

import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.list.ListItem;

import david.robson.wistrap.app.home.HomePage;
import david.robson.wistrap.base.domain.CommonDomainBase;

@SuppressWarnings("serial")
public abstract class MenuItem extends CommonDomainBase
{
	private Class<? extends WebPage> page;
	private String title;
	private String className;
	private List<MenuItem> childItems;
	
	public MenuItem(String title, String className)
	{
		this(null, title, className, null);
	}
	
	public MenuItem(Class<? extends WebPage> page, String title, String className)
	{
		this(page, title, className, null);
	}
	
	public MenuItem(String title, String className, List<MenuItem> childItems)
	{
		this(null, title, className, childItems);
	}
	
	public MenuItem(Class<? extends WebPage> page, String title, String className, List<MenuItem> childItems)
	{
		this.page = page;
		this.title = title;
		this.className = className;
		this.childItems = childItems;
	}
		
	/**
	 * 
	 * @param currentPage
	 * @return
	 */
	public boolean isSelected(final Class<? extends WebPage> currentPage)
	{
		// The current page matches the menu item page
		if (page.isAssignableFrom(currentPage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public abstract Component getComponent(String id, MenuItem item);
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public Class<? extends WebPage> getPage() {
		return page;
	}

	public void setPage(Class<? extends WebPage> page) {
		this.page = page;
	}
	
	public List<MenuItem> getChildItems() {
		return childItems;
	}

	public void setChildItems(List<MenuItem> childItems) {
		this.childItems = childItems;
	}
	
	
}

package david.robson.wistrap.base.nav;

import org.apache.wicket.markup.html.WebPage;

import david.robson.wistrap.app.home.HomePage;
import david.robson.wistrap.base.domain.CommonDomainBase;

@SuppressWarnings("serial")
public class MenuItem extends CommonDomainBase
{
	private Class<? extends WebPage> page;
	private String title;
	private String className;

	public MenuItem(Class<? extends WebPage> page, String title, String className)
	{
		this.page = page;
		this.title = title;
		this.className = className;
	}
	
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
}

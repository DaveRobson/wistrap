package david.robson.wistrap.base.nav;

import java.util.List;

import org.apache.wicket.Component;

@SuppressWarnings("serial")
public class MenuItemAsDropDown extends MenuItem
{	
	public MenuItemAsDropDown(String title, String className, List<MenuItem> childItems) 
	{
		super(title, className, childItems);	
	}

	@Override
	Component getComponent(String id, MenuItem item) 
	{
		return new ItemDropDown(id, item);
	}



}

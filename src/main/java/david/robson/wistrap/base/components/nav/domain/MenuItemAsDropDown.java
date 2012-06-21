package david.robson.wistrap.base.components.nav.domain;

import java.util.List;

import org.apache.wicket.Component;

import david.robson.wistrap.base.components.nav.ItemDropDown;

@SuppressWarnings("serial")
public class MenuItemAsDropDown extends MenuItem
{	
	public MenuItemAsDropDown(String title, String className, List<MenuItem> childItems) 
	{
		super(title, className, childItems);	
	}

	@Override
	public Component getComponent(String id, MenuItem item) 
	{
		return new ItemDropDown(id, item);
	}



}

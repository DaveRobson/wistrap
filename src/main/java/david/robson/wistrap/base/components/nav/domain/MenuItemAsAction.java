package david.robson.wistrap.base.components.nav.domain;

import org.apache.wicket.Component;

import david.robson.wistrap.base.components.nav.ItemAction;



@SuppressWarnings("serial")
public abstract class MenuItemAsAction extends MenuItem
{
	public MenuItemAsAction(String title, String className) 
	{
		super(title, className);		
	}
	
	@Override
	public Component getComponent(String id, MenuItem item) 
	{
		return new ItemAction(id, item)
		{

			@Override
			public void onClick() {
				MenuItemAsAction.this.onClick();
				
			}
			
		};
	}
	
	public abstract void onClick();

}

package david.robson.wistrap.base.nav;

import org.apache.wicket.Component;



@SuppressWarnings("serial")
public abstract class MenuItemAsAction extends MenuItem
{
	public MenuItemAsAction(String title, String className) 
	{
		super(title, className);		
	}
	
	@Override
	Component getComponent(String id, MenuItem item) 
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

package david.robson.wistrap.base.components.nav;

import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;

import david.robson.wistrap.base.components.nav.domain.MenuItem;
import david.robson.wistrap.base.components.nav.domain.MenuItemAsDropDown;


public class ItemDropDown extends Panel
{

	public ItemDropDown(String id, final MenuItem item) 
	{
		super(id);
		
		final MenuItemAsDropDown itemAsDropDown = (MenuItemAsDropDown) item;
		
		List<MenuItem> childItems = itemAsDropDown.getChildItems();
		setRenderBodyOnly(true);
		
		
		Label label = new Label("dropdownLabel", itemAsDropDown.getTitle());
		label.setRenderBodyOnly(true);
		add(label);
		
		
		ListView<MenuItem> dropdownChildren = new ListView<MenuItem>("dropdownChildren", childItems)
		{
			protected void populateItem(final ListItem<MenuItem> childItem)
			{						
				childItem.add(childItem.getModelObject().getComponent("childItem", childItem.getModelObject()));
			}
		};
		add(dropdownChildren);
		
	}

}

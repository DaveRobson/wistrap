package david.robson.wistrap.app.plugins.modal;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.panel.Panel;

import david.robson.wistrap.base.behavior.ModalBehavior;
import david.robson.wistrap.base.components.modal.WiStrapModalPanel;
import david.robson.wistrap.base.components.modal.WiStrapModalWindow;

public class ModalDocPanel extends Panel
{

	public ModalDocPanel(String id) 
	{
		super(id);
		
		setRenderBodyOnly(true);

		WiStrapModalWindow mw = new WiStrapModalWindow("mw", 
				new WiStrapModalPanel(WiStrapModalWindow.MODAL_PANEL_ID, "Example") 
		{
			@Override
			public void onSubmit(AjaxRequestTarget target) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onCancel(AjaxRequestTarget target) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Panel getContent(String id) 
			{
				return new TestPanel(id);
			}
		});
		
		add(mw);
		
		AjaxLink<Void> link = new AjaxLink<Void>("link")
		{
			@Override
			public void onClick(AjaxRequestTarget target)
			{
				//nothing needed we just want the onclick action.
			}
		};
		
		link.add(new ModalBehavior(mw.getModalWindowId()));
		add(link);
		
	}

}

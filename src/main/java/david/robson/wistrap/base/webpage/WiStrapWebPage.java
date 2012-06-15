package david.robson.wistrap.base.webpage;

import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;

@SuppressWarnings("serial")
public class WiStrapWebPage extends WebPage
{
	@Override
	public void renderHead(IHeaderResponse response) 
	{
		super.renderHead(response);
		
		response.renderCSSReference("css/bootstrap.css");
			
		response.renderJavaScriptReference("js/jquery-1.7.1.min.js");
		
		//Bootstrap.js must be loaded after jQuery
		response.renderJavaScriptReference("js/bootstrap.js");	
	}
}

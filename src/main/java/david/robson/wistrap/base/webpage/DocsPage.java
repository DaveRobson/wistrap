package david.robson.wistrap.base.webpage;

import org.apache.wicket.markup.html.IHeaderResponse;

@SuppressWarnings("serial")
public class DocsPage extends WiStrapWebPage
{
	@Override
	public void renderHead(IHeaderResponse response) 
	{
		super.renderHead(response);
		
		response.renderCSSReference("css/docs.css");			
	}
}

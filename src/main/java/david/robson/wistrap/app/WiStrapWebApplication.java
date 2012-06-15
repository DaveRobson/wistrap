package david.robson.wistrap.app;

import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

public class WiStrapWebApplication extends WebApplication
{


	@Override
	public Class<? extends Page> getHomePage()
	{
		return HomePage.class;
	}
	
	
	
	@Override
	protected void init() 
	{
		super.init();
			
		getComponentInstantiationListeners().add(new SpringComponentInjector(this));
				
		//new AnnotatedMountScanner().scanPackage("david.robson.wistrap.app.*").mount(this);
	}
	
	@Override
	public RuntimeConfigurationType getConfigurationType() 
	{
		return RuntimeConfigurationType.DEVELOPMENT;
	}
	
}

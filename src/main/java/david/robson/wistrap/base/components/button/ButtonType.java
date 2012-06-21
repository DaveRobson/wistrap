package david.robson.wistrap.base.components.button;

public enum ButtonType 
{
	DEFAULT("btn"), PRIMARY("btn-primary"),
	INFO("btn-info"), SUCCESS("btn-success"),
	WARNING("btn-warning"), DANGER("btn-danger"),
	INVERSE("btn-inverse");
	
	private String cssClass;
	
	ButtonType(String cssClass)
	{
		this.cssClass = cssClass;
	}
	
	public String getCssClass()
	{
		if(!cssClass.equals("btn"))
		{
			return "btn " + cssClass;
		}
		else
		{
			return cssClass;
		}	
	}		
}

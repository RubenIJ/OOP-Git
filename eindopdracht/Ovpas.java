package eindopdracht;

public class Ovpas
{
    public double kaartBalance;
   
    public String inchecken;
    public String ingecheckt;
    public char[] incheckPaal;
    public String uitchecken;
    public String uitcheck;
 
    public void deposit(double x)
    {
 
    }
 
    public String incheckPaal()
    {
	int accept = 0;
	if (inchecken.equalsIgnoreCase("yes") || inchecken.equalsIgnoreCase("ja") || inchecken.equalsIgnoreCase("yahoo") || inchecken.equalsIgnoreCase("misschien :)"))
	{
	    accept = accept + 1;
	}
	if (accept == 1 && kaartBalance >= 20)
	{
	    ingecheckt = "Ingecheckt";
 
	}
	else if (accept == 1 && kaartBalance <= 20)
	{
	    ingecheckt = "Sorry geen balance:(";
	}
	else
	{
	    ingecheckt = "doei:(";
	}
	return ingecheckt;
    }
    public String uitcheckpaal() {
	if(ingecheckt.equalsIgnoreCase("ingechekt")) {
	  uitcheck = "uitgecheckt";
	    
	    
	}
	
	    
	    
    }
}
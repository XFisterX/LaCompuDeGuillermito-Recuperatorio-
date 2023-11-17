package computadora;

public class Motherboard 
{
	  private String fabricantePlaca;
	  private String modeloPlaca;
	  private String caracteristicasPlaca;
	  
	  public Motherboard(String fabricantePlaca, String modeloPlaca, String caracteristicasPlaca)
	  {
		  this.fabricantePlaca = fabricantePlaca;
		  this.modeloPlaca = modeloPlaca;
		  this.caracteristicasPlaca = caracteristicasPlaca;
	  }
	  
	public void setFabricantePlaca(String fabricantePlaca)
	  {
		   this.fabricantePlaca = fabricantePlaca;
	  }
	  
	  public String getFabricantePlaca()
	  {
		   return fabricantePlaca;
	  }
	  
	  public void setModeloPlaca(String modeloPlaca)
	  {
		   this.modeloPlaca = modeloPlaca;
	  }
	  
	  public String getModeloPlaca()
	  {
		   return modeloPlaca;
	  }
	  
	  public void setcaracteristicasPlaca(String caracteristicasPlaca)
	  {
		   this.caracteristicasPlaca = caracteristicasPlaca;
	  }
	  
	  public String getCaracteristicasPlaca() 
	  {
		   return caracteristicasPlaca;
	  }
}

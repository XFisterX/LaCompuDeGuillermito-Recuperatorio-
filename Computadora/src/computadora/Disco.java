package computadora;

public class Disco 
{
	  private String fabricanteDisco;
	  private String modeloDisco;
	  private String caracteristicasDisco;
	  private int capacidadDisco;
	  
	  public Disco(String fabricanteDisco, String modeloDisco, String caracteristicasDisco, int capacidadDisco)
	  {
		  this.fabricanteDisco = fabricanteDisco;
		  this.modeloDisco = modeloDisco;
		  this.caracteristicasDisco = caracteristicasDisco;
		  this.capacidadDisco = capacidadDisco;
	  }
	  
	  public void setCapacidadDisco(int capacidadDisco)
	  {
		  this.capacidadDisco = capacidadDisco;
	  }
	  
	  public int getCapacidadDisco()
	  {
		  return capacidadDisco;
	  }
	  
	  public void setFabricanteDisco(String fabricanteDisco)
	  {
		   this.fabricanteDisco = fabricanteDisco;
	  }
	  
	  public String getFabricanteDisco()
	  {
		   return fabricanteDisco;
	  }
	  
	  public void setModelo(String modeloDisco)
	  {
		   this.modeloDisco = modeloDisco;
	  }
	  
	  public String getModeloDisco()
	  {
		   return modeloDisco;
	  }
	  
	  public void setcaracteristicasDisco(String caracteristicasDisco)
	  {
		   this.caracteristicasDisco = caracteristicasDisco;
	  }
	  
	  public String getCaracteristicasDisco() 
	  {
		   return caracteristicasDisco;
	  }
}

package computadora;

public class Memoria 
{
	  private String fabricanteMemoria;
	  private String modeloMemoria;
	  private String caracteristicasMemoria;
	  private int capacidadMemoria;
	  
	  public Memoria(String fabricanteMemoria, String modeloMemoria, String caracteristicasMemoria, int capacidadMemoria)
	  {
		  this.fabricanteMemoria = fabricanteMemoria;
		  this.modeloMemoria = modeloMemoria;
		  this.caracteristicasMemoria = caracteristicasMemoria;
		  this.capacidadMemoria = capacidadMemoria;
	  }
	  
	  public void setCapacidadMemoria(int capacidadMemoria)
	  {
		  this.capacidadMemoria = capacidadMemoria;
	  }
	  
	  public int getCapacidadMemoria()
	  {
		  return capacidadMemoria;
	  }
	  
	  public void setFabricanteMemoria(String fabricanteMemoria)
	  {
		   this.fabricanteMemoria = fabricanteMemoria;
	  }
	  
	  public String getFabricanteMemoria()
	  {
		   return fabricanteMemoria;
	  }
	  
	  public void setModeloMemoria(String modeloMemoria)
	  {
		   this.modeloMemoria = modeloMemoria;
	  }
	  
	  public String getModeloMemoria()
	  {
		   return modeloMemoria;
	  }
	  
	  public void setcaracteristicasMemoria(String caracteristicasMemoria)
	  {
		   this.caracteristicasMemoria = caracteristicasMemoria;
	  }
	  
	  public String getCaracteristicasMemoria() 
	  {
		   return caracteristicasMemoria;
	  }
}

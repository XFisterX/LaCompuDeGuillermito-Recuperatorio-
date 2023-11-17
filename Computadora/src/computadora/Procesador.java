package computadora;

public class Procesador 
{
	  private String fabricanteProcesador;
	  private String modeloProcesador;
	  private String caracteristicasProcesador;
	  
	  public Procesador(String fabricanteProcesador, String modeloProcesador, String caracteristicasProcesador)
	  {
		  this.fabricanteProcesador = fabricanteProcesador;
		  this.modeloProcesador = modeloProcesador;
		  this.caracteristicasProcesador = caracteristicasProcesador;
	  }
	  
	  public void setFabricanteProcesador(String fabricanteProcesador)
	  {
		   this.fabricanteProcesador = fabricanteProcesador;
	  }
	  
	  public String getFabricanteProcesador()
	  {
		   return fabricanteProcesador;
	  }
	  
	  public void setModeloProcesador(String modeloProcesador)
	  {
		   this.modeloProcesador = modeloProcesador;
	  }
	  
	  public String getModeloProcesador()
	  {
		   return modeloProcesador;
	  }
	  
	  public void setcaracteristicasProcesador(String caracteristicasProcesador)
	  {
		   this.caracteristicasProcesador = caracteristicasProcesador;
	  }
	  
	  public String getCaracteristicasProcesador() 
	  {
		   return caracteristicasProcesador;
	  }
}

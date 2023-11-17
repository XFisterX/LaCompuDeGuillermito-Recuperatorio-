package computadora;

public class Monitor 
{
  private String fabricanteMonitor;
  private String modeloMonitor;
  private String caracteristicasMonitor;
  
  public Monitor(String fabricanteMonitor, String modeloMonitor, String caracteristicasMonitor)
  {
	  this.fabricanteMonitor = fabricanteMonitor;
	  this.modeloMonitor = modeloMonitor;
	  this.caracteristicasMonitor = caracteristicasMonitor;
  }
  
   public Monitor()
   {
	   System.out.println("Los componentes del monitor son: " );
	   System.out.println(fabricanteMonitor);
	   System.out.println(modeloMonitor);
	   System.out.println(caracteristicasMonitor);
   }
   
   public void encenderMonitor()
   {
	   System.out.println("Se encendio el monitor.");
   }
   
   public void apagarMonitor()
   {
	   System.out.println("Se apago el monitor.");
   }
   
   public void setFabricanteMonitor(String fabricanteMonitor)
   {
	   this.fabricanteMonitor = fabricanteMonitor;
   }
   
   public String getFabricanteMonitor()
   {
	   return fabricanteMonitor;
   }
   
   public void setModeloMonitor(String modeloMonitor)
   {
	   this.modeloMonitor = modeloMonitor;
   }
   
   public String getModeloMonitor()
   {
	   return modeloMonitor;
   }
   
   public void setcaracteristicasMonitor(String caracteristicasMonitor)
   {
	   this.caracteristicasMonitor = caracteristicasMonitor;
   }
   
   public String getCaracteristicasMonitor() 
   {
	   return caracteristicasMonitor;
   }
}

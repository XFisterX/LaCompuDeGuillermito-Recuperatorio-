package computadora;

public class Teclado 
{
	  private String fabricanteTeclado;
	  private String modeloTeclado;
	  private String caracteristicasTeclado;
	  
	  public Teclado(String fabricanteTeclado, String modeloTeclado, String caracteristicasTeclado)
	  {
		  this.fabricanteTeclado = fabricanteTeclado;
		  this.modeloTeclado = modeloTeclado;
		  this.caracteristicasTeclado = caracteristicasTeclado;
	  }
	  
	   public Teclado()
	   {
		   System.out.println("Los componentes del teclado son: " );
		   System.out.println(fabricanteTeclado);
		   System.out.println(modeloTeclado);
		   System.out.println(caracteristicasTeclado);
	   }
	   
	   public void tomarBuffer()
	   {
		System.out.println("Se utilizo el buffer.");   
	   }
	   
	   public void setFabricanteTeclado(String fabricanteTeclado)
	   {
		   this.fabricanteTeclado = fabricanteTeclado;
	   }
	   
	   public String getFabricanteTeclado()
	   {
		   return fabricanteTeclado;
	   }
	   
	   public void setModeloTeclado(String modeloTeclado)
	   {
		   this.modeloTeclado = modeloTeclado;
	   }
	   
	   public String getModeloTeclado()
	   {
		   return modeloTeclado;
	   }
	   
	   public void setcaracteristicasTeclado(String caracteristicasTeclado)
	   {
		   this.caracteristicasTeclado = caracteristicasTeclado;
	   }
	   
	   public String getCaracteristicasTeclado() 
	   {
		   return caracteristicasTeclado;
	   }
}

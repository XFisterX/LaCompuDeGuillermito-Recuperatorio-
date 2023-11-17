package computadora;

public class Mouse 
{
  private String fabricanteMouse;
  private String modeloMouse;
  private String caracteristicasMouse;
  
  public Mouse(String fabricanteMouse, String modeloMouse, String caracteristicasMouse)
  {
	  this.fabricanteMouse = fabricanteMouse;
	  this.modeloMouse = modeloMouse;
	  this.caracteristicasMouse = caracteristicasMouse;
  }
  
  public Mouse()
  {
	   System.out.println("Los componentes del mouse son: " );
	   System.out.println(fabricanteMouse);
	   System.out.println(modeloMouse);
	   System.out.println(caracteristicasMouse);
  }
  
  public void desplazarMouse()
  {
	  System.out.println("Se esta moviendo el mouse.");  
  }
  
  public void clicDerecho()
  {
	System.out.println("Se presiono el boton derecho del raton.");  
  }
  
  public void clicIzquierdo()
  {
	  System.out.println("Se presiono el boton izquierdo del raton.");
  }
  
  public void setFabricanteMouse(String fabricanteMouse)
  {
	   this.fabricanteMouse = fabricanteMouse;
  }
  
  public String getFabricanteMouse()
  {
	   return fabricanteMouse;
  }
  
  public void setModeloMouse(String modeloMouse)
  {
	   this.modeloMouse = modeloMouse;
  }
  
  public String getModeloMouse()
  {
	   return modeloMouse;
  }
  
  public void setcaracteristicasMouse(String caracteristicasMouse)
  {
	   this.caracteristicasMouse = caracteristicasMouse;
  }
  
  public String getCaracteristicasMouse() 
  {
	   return caracteristicasMouse;
  }
}

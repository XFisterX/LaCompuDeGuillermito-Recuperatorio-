package computadora;

public class Sistema 
{
	private Motherboard placa;
    private Procesador procesador;
    private Memoria memoria;
    private Disco disco;
    
    public Sistema(String fabricantePlaca, String modeloPlaca, String caracteristicasPlaca, String fabricanteProcesador,
    		String modeloProcesador, String caracteristicasProcesador, String fabricanteMemoria , String modeloMemoria,
    		String caracteristicasMemoria, int capacidadMemoria, String fabricanteDisco , String modeloDisco, String caracteristicasDisco, int capacidadDisco)
    {
    	this.placa = new Motherboard(fabricantePlaca , modeloPlaca, caracteristicasPlaca);
    	this.procesador = new Procesador(fabricanteProcesador , modeloProcesador, caracteristicasProcesador);
    	this.memoria = new Memoria(fabricanteMemoria , modeloMemoria, caracteristicasMemoria, capacidadMemoria);
    	this.disco = new Disco(fabricanteDisco , modeloDisco, caracteristicasDisco, capacidadDisco);
    }
    
    public void encenderSistema()
    {
    	System.out.println("Ha iniciado el sistema.");
    }
    
    public void apagarSistema()
    {
    	System.out.println("Se apagara en brevessss.");
    }
}

package computadora;

public abstract class Computadora 
{
        private Sistema sistema;
        private Monitor monitor;
        private Mouse mouse;
        private Teclado teclado;
        
        public Computadora(Motherboard placa, Procesador procesador, Memoria memoria, Disco disco, String fabricantePlaca, String modeloPlaca, String caracteristicasPlaca, String fabricanteProcesador,
        		String modeloProcesador, String caracteristicasProcesador, String fabricanteMemoria , String modeloMemoria,
        		String caracteristicasMemoria, int capacidadMemoria, String fabricanteDisco , String modeloDisco, String caracteristicasDisco, int capacidadDisco)
        {
        	this.sistema = new Sistema(fabricantePlaca , modeloPlaca, caracteristicasPlaca, fabricanteProcesador , modeloProcesador, caracteristicasProcesador, fabricanteMemoria , modeloMemoria, caracteristicasMemoria, capacidadMemoria, fabricanteDisco , modeloDisco, caracteristicasDisco, capacidadDisco);
        	this.monitor = new Monitor();
        	this.mouse = new Mouse();
        	this.teclado = new Teclado();
        }
        
        public void encenderPc()
        {
        	System.out.println("Se ha encendico la computadora.");
        }
        
        public void apagarPc()
        {
        	System.out.println("Se ha apagado la computadora.");
        }
}

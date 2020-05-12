import java.util.ArrayList;

public class FIFO implements TAD {
	private ArrayList<String> pila;
	int numMaximo;
	
	public FIFO(int numMaximo) {
		this.numMaximo=numMaximo;
		pila=new ArrayList<String>(numMaximo); 
	}
	
	public void push(String p) throws TADLleno, TADLlenado {
		if(pila.size()<numMaximo) {
			pila.add(p);
			if(pila.size()==numMaximo) {
				throw new TADLlenado("TAD se ha llenado tras la última inserción");
			}
		}
		else {
			throw new TADLleno("TAD lleno. No es posible insertar más elementos");
		}
		
	}
	public String pop() throws TADVacio, TADVaciado {
		return "CACA";
	}
	public String peek() throws TADVacio {
		return "CACA";
	}
	public int size() {
		return pila.size();
	}
	public boolean estaVacia() {
		return true;
	}
	public boolean estaLlena() {
		return true;
	}
	public void listar() {
		
	}

}

import java.util.ArrayList;

public class LIFO implements TAD {
	private ArrayList<String> pila;
	int numMaximo;
	
	public LIFO(int numMaximo) {
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
		if(pila.size()==0) {
			throw new TADVacio("TAD vacio. No es posible retirar más elementos");
		}
		else {
			pila.remove(pila.size()-1); 
			if(pila.size()==0) {
				throw new TADVaciado("TAD se ha vaciado tras la última retirada");
			}
			else {
				return "Elemento retirado de la pila";
			}
		}	
	}
	public String peek() throws TADVacio {
		if(pila.size()==0) {
			throw new TADVacio("TAD vacio. No es posible retirar más elementos");
		}
		else {
			return pila.get(pila.size()-1);
		}
	}
	public int size() {
		return pila.size();
	}
	public boolean estaVacia() {
		if(pila.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean estaLlena() {
		if(pila.size()==numMaximo) {
			return true;
		}
		else {
			return false;
		}
	}
	public void listar() {
		for(int x=0;x<pila.size();x++) {
			System.out.println(pila.get(x));
		}
	}

}

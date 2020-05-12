public interface TAD {
		public void push(String input) throws TADLleno, TADLlenado;				
		public String pop() throws TADVacio, TADVaciado;				
		public String peek() throws TADVacio;		
		public int size();	
		public boolean estaVacia();	
		public boolean estaLlena();	
		public void listar();
}
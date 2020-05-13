import java.io.*;

public class MainTAD {
	
	public void guardar(TAD t,String ruta) {
		ObjectInputStream ois=null;
		try {
			if(t instanceof FIFO) {
				FIFO fifo=(FIFO)t;
				ruta=ruta+"fifo.txt";
				File archivo=new File(ruta);
				
				BufferedWriter bw;
				FileWriter fw;
			
					if(archivo.exists()) {
						System.out.println("EXISTE");
						FileInputStream fis=new FileInputStream(archivo);
						ois=new ObjectInputStream(fis);
						ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("fifo.dat") );
			            escribiendoFichero.writeObject(fifo);
			            escribiendoFichero.close(); 
					}
					else {
						System.out.println("NO EXISTE");
						archivo.createNewFile();
						FileInputStream fis=new FileInputStream(archivo);
						ois=new ObjectInputStream(fis);
						ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("fifo.dat") );
			            escribiendoFichero.writeObject(fifo);
			            escribiendoFichero.close(); 
					}
				}
				else {
					System.out.println("ES UN LIFO");
				}
			}
			catch(Exception ex) {
				System.out.println("ERROR: "+ex.getMessage());
			}
	}
	
	public static void main(String[] args) {		
		FIFO f=new FIFO(10);
		String s="CACA";
		try {
			for(int x=0;x<=7;x++ ) {
			    String numCadena= String.valueOf(x);
				f.push(numCadena);
			}
		}
		catch(TADLleno e) {		
			System.out.println(e.getMessage());
		}
		catch(TADLlenado e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Listado de elementos de la pila:");	
		f.listar();
		
		try{ 
			System.out.println("Elemento que se retiraria: "+f.peek());
		}
		catch(TADVacio e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			s=f.pop();
			System.out.println(s);
		}
		catch(TADVacio e) {		
			System.out.println(e.getMessage());
		}
		catch(TADVaciado e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("Tamaño de la pila: "+f.size());
		
		if(f.estaLlena()==true) {
			System.out.println("La pila está llena");
		}
		else {
			System.out.println("La pila no está llena");
		}
			
		System.out.println("Listado de elementos de la pila:");	
			f.listar();
			
		String ruta="C:/Java/";
			MainTAD t=new MainTAD();
			t.guardar(f, ruta);
			
	}
	
	
	
		
}

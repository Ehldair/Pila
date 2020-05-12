
public class MainTAD {

	public static void main(String[] args) {		
		FIFO f=new FIFO(7);
		String s="CACA";
		try {
			for(int x=0;x<7;x++ ) {
				f.push(s);
			}
		}
		catch(TADLleno e) {		
			System.out.println(e.getMessage());
		}
		catch(TADLlenado e) {
			System.out.println(e.getMessage());
		}
		
		try {
			f.push("Mierda");
		}
		catch(TADLleno e) {		
			System.out.println(e.getMessage());
		}
		catch(TADLlenado e) {
			System.out.println(e.getMessage());
		}

		
	}
}

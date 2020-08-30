
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		/*int i = 0;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}*/
		
		/*int x = 100;
		while (x >= 0) {
			System.out.println(x);
			x = x - 3;
		}*/
		
		/*for (int a = 1; a <= 100; a++) {
			System.out.println(a);
		}*/
		
		for (int i = 0; i <= 100; i++) {
			if ( i % 3 == 0 ) {
				System.out.println("Hello");
			} else if (i % 5 == 0 ) {
				System.out.println("World");
			}
			if (i % 3 == 0 && i % 5 == 0){
				System.out.println("Hello World");
			}
		}
		
	}

}

import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	int [] A = new int [11];
	int f;

	for(int i=0;i<A.length;i++) {
		System.out.println(" Digite um número para a " +(i+1) +"° posição ");
		A[i]=in.nextInt();
	}

	for(int i=0;i<A.length;i++) {
		aux=2*2;
		f++;

		if(f==A[i]) {
			System.out.println(" o fatorial da posição " +(i+1) + " = " +A[i]);
		}

	}

}

}

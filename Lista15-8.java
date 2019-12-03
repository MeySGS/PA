import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int VetorA[] = new int [10];
		int VetorB[] = new int [10];
		int j=1,aux=1;
		for(int i=0;i<VetorA.length;i++) {
			System.out.println("Digite um numero para a posição " +(i+1));
			VetorA[i]=in.nextInt();
			
		}
		for( int i=0;i<VetorA.length;i++) {
			aux=VetorA[i]/2*VetorA[i]+1;
			VetorB[i]=aux;
		
		}
		for(int i=0;i<VetorA.length;i++) {
			System.out.println(" Vetor B posição "+ (i+1) + " = " +VetorB[i]);
		}
	

	}
}

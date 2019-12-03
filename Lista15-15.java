import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int VetorA[] = new int [10];
	int VetorB[] = new int [10];
	int j,i;
	for( i=0;i<VetorA.length;i++) {
		System.out.println("Digite a posição " +(i+1) +" do vetor A");
		VetorA[i]=in.nextInt();
		VetorB[i]=VetorA[i];
	}
	
	System.out.println("\n____________\n");
	
	for( i=0;i<VetorA.length;++i) {
		System.out.println(  "Vetor A "+(i+1)+ "° posição:  " +VetorA[i]);
	}
	
	System.out.println("\n____________\n");
	
	for( i=9,j=0;i>=0;--i,j++) {
		System.out.println(  "Vetor B "+(j+1)+ "° posição:  " +VetorB[i]);
	}
	}

}

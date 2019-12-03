
import java.util.Scanner;
import java.util.Arrays;
public class Ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int VetorA[] = new int[10];
		int VetorB[]= new int [10];
		int VetorC[] = new int [10];
		int i,j;
		
		
		//PERGUNTA
		
		for(  i=0;i<VetorA.length;i++) {
			System.out.println("Digite a posição " + (i+1) + "° Vetor");
			VetorA[i]=in.nextInt();
			VetorB[i]=VetorA[i];
			
			
		}
		
		//ORDEM CRESCENTE
		
		System.out.println("\nOrdem crescente\n");
		
		Arrays.sort(VetorB);
		
		for( i=0;i<VetorA.length;i++) {
			System.out.println(VetorB[i]);
		
		}
		
		//ORDEM DECRESCENTE
		
		System.out.println("\nOrdem decrescente\n");
		
		for(i=9,j=0;i>0 && j<VetorC.length;--i,j++) {
			VetorC[j]=VetorB[i];
			System.out.println(" Vetor c = " +VetorC[j] );
		}
		
		
	}

}

import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n,c=0;
		int VetorA[] = new int [10];
		
		for(int i=0;i<VetorA.length;i++) {
			System.out.println("Digite um numero pfv");
			VetorA[i]=in.nextInt();
		}
		System.out.println("Qual n�mero deseja buscar ?");
		n=in.nextInt();
		for(int i=0;i<VetorA.length;i++) {
			if(n==VetorA[i]) {
				c=VetorA[i];
		}
		}
		if(c==n) {
			System.out.println(" o n�mero que estava procurando est� no Vetor ");
		}else {
			System.out.println(" esse n�mero n�o est� no vetor");
		}
	

	}
}

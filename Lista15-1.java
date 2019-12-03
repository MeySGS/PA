import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int VetorA[] = new int [20];
		int VetorB[] = new int [20];
		int i,j=19;
		
		for(i=0;i<VetorA.length;i++) {
		System.out.println("Digite o número da  posição " +(i+1) );
		VetorA[i]=in.nextInt();
		}
	for(i=0;i<VetorA.length;i++,--j) {
		if(VetorA[i]%2==0) {
			VetorB[i]=VetorA[i];
			System.out.println("Par");
			System.out.println(" " +VetorB[i]);
		}else {
			VetorB[j]=VetorA[i];
			System.out.println("Ímpa");
			System.out.println(" " +VetorB[i]);
		}
	}
	
	}
}


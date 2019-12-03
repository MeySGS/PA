import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int VetorA[] = new int[10];
		int VetorB[] = new int[10];
		int VetorC[] = new int[10];

		for(int i=0;i<VetorA.length;i++) {
		System.out.println("Digite um valor para o VetorA posição " + (i+1));
		VetorA[i]=in.nextInt();
		}
		System.out.println("  ");
		for(int i=0;i<VetorA.length;i++) {
			System.out.println("Digite um valor para o VetorB posição " +(i+1));
			VetorB[i]=in.nextInt();
			}
		for(int i=0;i<VetorA.length;i++) {
			
			if(VetorA[i]>VetorB[i]) {
				VetorC[i]=1;
			}else if(VetorB[i]>VetorA[i]){
				VetorC[i]=-1;
			}else {
				VetorC[i]=0;
			
			}
			for( i=0;i<VetorA.length;i++) {
				System.out.println(" VetorC posição " + (i+1) + " = " +VetorC[i]);
			}
		}
	}
	

}

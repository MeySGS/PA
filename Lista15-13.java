import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int VetorA[] = new int [10];
		int VetorB[] = new int [10];
		
	for(int i=0;i<VetorA.length;i++) {
		System.out.println(" Digite um número nessa bosta " + (i+1));
		VetorA[i]=in.nextInt();
		if(VetorA[i]%2==0) {
			VetorB[i]=1;
		}else {
			VetorB[i]=0;
		}
	}
	for(int i=0;i<VetorA.length;i++) {
		System.out.println(" VetorB na posição "+(i+1) + " = "+VetorB[i]);
	}
	}

}

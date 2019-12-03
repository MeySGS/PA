
import java.util.Arrays;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int VetorA[] = new int [10];
	int i=0,Maior=0,Menor=0,j=9;
	
	for( i=0;i<VetorA.length;i++) {
		System.out.println("Digite a posição " +(i+1) );
		VetorA[i]=in.nextInt();
	}
	Arrays.sort(VetorA);
	Maior=VetorA[9];
	Menor=VetorA[0];
	System.out.println(" maior número é " +Maior + " e o menor é esse  " +Menor);
	}
}


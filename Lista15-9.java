
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int []A = new int[10];
		int []B = new int[10];
		int []C = new int[A.length+B.length];
	
	for(int i=0;i<10;i++){
		System.out.println("Digite um n�emro para a "+(i+1) + "� posi��o do vetor A" );
		A[i]=in.nextInt();
	}

	for(int i=0;i<10;i++){
		System.out.println("Digite um n�emro para a "+(i+1) + "� posi��o do vetor B" );
		B[i]=in.nextInt();
	}
	for(int i=0;i<=C.length;i++){
		C[i]= A[i];
		C[i]= B[i];
		System.out.println(C[i]);
	}

	}

}

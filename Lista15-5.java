import java.util.Scanner;
public class Ex5{

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		final int TAM = 10;
		int [] A = new int [TAM];
		int divisor =0,resultado;

		 for(int i=0;i<TAM;i++){
			System.out.println("Digite um n�mero para a " +(i+1) + "posi��o " );
			A[i] = in.nextInt();
		}

		for(int i=1,J=0;j<=A[j] ;i++,j++){
			if(A[j]%i==0){
				System.out.println(i);		
			}	
		}	
	}
}

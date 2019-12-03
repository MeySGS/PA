import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int j=1,aux;
	int [] A = new int[5];
	for(int i=0;i<A.length;i++) {
		System.out.println("Digite um numero ");
		A[i]=in.nextInt();
	}
	for(int i=0;i<A.length;j++, i++) {
			aux=A[i]*j;
			System.out.println(A[i] + " x " +j + " = " +aux);
		if(j==10) {
			
			j=10;
			
		}
	}
			
}	
	


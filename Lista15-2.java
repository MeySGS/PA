import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int j=1,c=0,aux;
	int Vetor[] = new int[5];
	for(int i=0;i<Vetor.length;i++) {
		System.out.println("Digite um numero ");
		Vetor[i]=in.nextInt();
	}
	for(int i=0;i<Vetor.length;j++,c++) {
			aux=Vetor[i]*j;
			System.out.println(Vetor[i] + " x " +j + " = " +aux);
		if(j==10) {
			i++;
			j=10;
			
		}
	}
			
}	
	


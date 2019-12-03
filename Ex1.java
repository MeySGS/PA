import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int VetorA[] = new int [10];
		int VetorB[]= new int [10];
		
		for(int i=0; i<VetorA.length;i++) {
			System.out.println("Digite a posição " +(i+1));
			VetorA[i] = in.nextInt();
		}
    for(int i =9;i>=0;--i) {
    	VetorB[i]=VetorA[i]*VetorA[i];
    }
	for(int i=0;i<VetorA.length;i++) {
		System.out.println(" raiz quadrada do número  " +VetorA[i]+ " = " +VetorB[i] );
	}
	}

}

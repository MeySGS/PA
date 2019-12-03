import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int VetorA[] = new int [15];
		int VetorB[] = new int [15];
		int i=0,aux=1;
		
				
		for(i=0,;i<VetorA.length;i++) {
			System.out.println("Digite um número para a posição " +(i+1));
			VetorA[i]=in.nextInt();
		}
			for(i=0,f=VetorA[i];i<VetorA.length;f--) {
				aux=aux*f;
			if(f<=2) {
				VetorB[i]=aux;
				i++;
			}
			}
		
			
		
		}
	}

//TEM QUE ARRUMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAARRRRRRRRRRRRRRRRRR TA ERRADOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO

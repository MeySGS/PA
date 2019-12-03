import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int VetorA[]= new int[10];
		int i,f,cont=0;
		for( i=0;i<6;i++) {
			System.out.println(" Digite um numero para a posição "+(i+1));
			VetorA[i]=in.nextInt();
		}for( i=0,f=5;i<6;--f,i++) {
			if(VetorA[i]==VetorA[f]) {
				cont++;
			}else  {
				
			}
		}
		if(cont==6) {
			System.out.println(" o VetorA é um palimdrom");
		}else {
			System.out.println(" o VetorA não é um palindromo ");
		}

	}
// NÃO TENHO CERTEZA SE ESTÁ CORRETO ENTAO TA ERRADO ;[
}

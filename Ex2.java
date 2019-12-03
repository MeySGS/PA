import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int tam  =10;
		int[] a = new int [tam];
		
		for(int i=0;i<tam;i++) {
			System.out.println("digite um numero para a " +(i+1) + " posição do vetor");
			a[i]=in.nextInt();
		}
		for(int i=2;i<tam;i++) {
			a[i]=i;
		}
		for(int i=2;i<tam;i++) {
			if(a[i]!=0) {
				for(int j=2*i;j<tam;j+=i) {
					a[j]=0;
				}
			}
		}
		for(int i =2;i<tam;i++) {
			a[i]=i;
		}
		for(int i=2;i<tam;i++) {
			if(a[i]!=0) {
				for(int j=2*i;j<tam;j+=i) {
					a[j]=0;
				}
			}
		}
		for(int i=2;i<tam;i++) {
			if(a[i]!=0) {
				System.out.println(a[i] +".");
			}
		}
	}

}

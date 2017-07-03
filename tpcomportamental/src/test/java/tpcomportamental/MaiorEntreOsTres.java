package tpcomportamental;

public class MaiorEntreOsTres {

	public static int a;
	public static int b;
	public static int c;

	public static Character maior;
	public static boolean igualdadeEntreDoisMaiores = false;
	public static Character menor;

	public static void main(String[] args) {

		a = 4;
		b = 0;
		c = 4;
		//testa se há igualdade entre dois deles
		if (a == b && a > c) {
			igualdadeEntreDoisMaiores = true;
			menor = 'C';
		} 
		else if (b == c && b > a) {
				igualdadeEntreDoisMaiores = true;
				menor = 'A';	
		}
		else if (a == c && a > b) {
			igualdadeEntreDoisMaiores = true;
			menor = 'B';
		}	//retorna o maior entre os 3	
		else {

			if (a > b && a > c) {
				maior = 'A';
			} else {
				if (b > a && b > c) {
					maior = 'B';
				} else {
					maior = 'C';
				}
			}
		}
		//Retorna o resultado do perfil 
		if (igualdadeEntreDoisMaiores && menor == 'C'){
			System.out.println("Igualdade entre os perfis: A e B");
			
		}else if (igualdadeEntreDoisMaiores && menor == 'A'){
			System.out.println("Igualdade entre os perfis: B e C");
			
		}else if (igualdadeEntreDoisMaiores && menor == 'B'){
			System.out.println("Igualdade entre os perfis: A e C");
		}	
		else{
			System.out.println("o maior entre os 3 é Seu perfil: " + maior);
		}

	}

}

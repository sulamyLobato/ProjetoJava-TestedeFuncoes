public class TestaCaracteres{
	
	//Diferen�a entre String e Char
	

    public static void main(String[] args){

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;                    // Compila!
        System.out.println(valor);

        //valor = (char) (valor + 1);         // N�o compila!
        //System.out.println(valor);

        String palavra = "Aprendendo tecnologia com Alura";
        System.out.println(palavra);

        palavra = palavra + 2020;
        System.out.println(palavra);
    }
}
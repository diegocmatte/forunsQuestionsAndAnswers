import java.util.Scanner;
public class Exercicio19 {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        String nome;
        char sexo;
        int cont = 5;
        int totalHomem = 0;
        int totalMulher = 0;

        while (cont > 0 ){
            System.out.println("Digite seu nome");
            nome = leitorScanner.nextLine();

            System.out.println(nome+" ,digite seu genero \n" +
                    " M para mulher ou H para homem");
            sexo = leitorScanner.next().charAt(0);

            if  (sexo == 'h' || sexo == 'H'){
                totalHomem = totalHomem + 1;
                System.out.println(nome+" - sexo: Masculino");
            } else {
                totalMulher = totalMulher + 1;
                System.out.println(nome+" - sexo: Feminino");
            }
            cont = cont - 1;
            System.out.println("");
        }

        System.out.println("Total de Homens: "+totalHomem);
        System.out.println("Total de Mulheres: "+totalMulher);
    }
}
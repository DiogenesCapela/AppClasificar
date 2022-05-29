import java.util.Scanner;

public class ExercicioAula02 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome completo: ");
        String nome = leitor.next();
        String sobrenome = leitor.next();

        System.out.println("Digite sua data de nascimento com dia/mes/ano");
        System.out.println(imprimeNome(nome, sobrenome) + " " + nome.substring(0,1) + sobrenome.substring(0,1)
        + " " + "Voce nasceu em : " + imprimeData(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));


    }
    public static String imprimeNome(String nome, String sobrenome) {
        return  "Nome completo: " + nome + " " + sobrenome;
    }

    public static  String imprimeData(Integer dia, Integer mes, Integer ano) {
        return dia + "/" + mes + "/" + ano;
    }
}

import java.util.Scanner;

public class SomaVariáveis {
    public static void main (String[] args) {
        // criar um objeto Scanner que recebe a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Inserir a primeira variável
        System.out.println("escolha um número:");
    
        int n1 = scanner.nextInt();
        System.out.println("escolha um numero:");
        int n2 = scanner.nextInt();
        int x = n1 + n2;

        System.out.println("o valor da soma dos dois números é:"+ x);
        
        if (x % 2 == 0) {
            System.out.println( "o resultado da soma é par");
            
        }
        else
        { 
            System.out.println( "o resultado da soma é ímpar");
        }
}

}

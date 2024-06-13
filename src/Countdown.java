public class Countdown {

    public static void main(String[] args) {
        
        System.out.println("Countdown to Launch: ");

        // Loop for que conta de 5 até 0
        for(int i = 5; i >= 0; i--) {
            // Imprime o valor atual de i
            System.out.println("Valor atual de i: " + i);
            // Imprime o valor de i na mesma linha, seguido de um espaço
            System.out.print(i + " ");
        }

        // Imprime a mensagem final após o loop
        System.out.println("\nBlast Off!");
    }
}
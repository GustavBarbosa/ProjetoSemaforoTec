// Cria a Classe Rua
public class Rua {
    //Cria um método main com throws InterruptedException para interromper a Thread.sleep()
    public static void main(String[] args) throws InterruptedException{

        int tamanhoRua = 20; // tamanho da rua
        // Cria um Array chamado rua com o tamanho definido na linha de cima. Cada posição representará um espaço da rua
        char[] rua = new char[tamanhoRua];

        // Inicializa cada posição da rua com o caractere '_' que representa cada espaço vazio da rua
        for (int i = 0; i < tamanhoRua; i++) {
            rua[i] = '-' ;
        }

        // Define a posição inicial do carro como 0
        int posicaoCarro = 0;
        rua[posicaoCarro] = 'C'; // Coloca o caractere 'C' na posição 0 do Array, marcando a posição inicial do carro 

        // Inicia o laço while que só será encerrado quando o carro chegar na posição final da rua
        while (posicaoCarro < tamanhoRua -1) {

            mostrarRua(rua);// Mostra cada posição do carro na rua enquanto não chega no destino

            Thread.sleep(200);// pausa a execução por 0,5 segundo para criar uma "Animação de movimento"

            rua[posicaoCarro] = '-';        // limpa a posição atual do carro e coloca - no lugar
            posicaoCarro++;                 // avança para a próxima posição
            rua[posicaoCarro] = 'C';        // atualiza a nova posição do Carro 
        }

        mostrarRua(rua); // Mostra o estado final da rua
        System.out.println("O Carro chegou ao destino !");
    }

    // Método mostrar rua que recebe o Array da rua e imprime cada posição com um espaço entre os caracteres
    public static void mostrarRua(char[] rua) {
        for (char c : rua) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

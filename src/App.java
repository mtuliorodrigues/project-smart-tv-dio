//Este código é um mini projeto com base nos ensinamentos do Bootcamp da DIO
//[Desenvolvimento Java com IA]
//
//O código está bem comentado, com o intuito de mostrar o ensinamento que foi aprendido
//Nos cursos: Aprendendo a sintaxe Java, Introdução e Estruturas Condicionais Java
//e Estruturas de Repetição em Java. Os comentários também visam explicar o funcionamento
//do código e a lógica implementada. 

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        //Como foi ensinado, aqui utilizamos a Classe 'Scanner', pra podermos trabalhar
        //com entradas do usuário, o argumento 'System.in' é o que faz a leitura do que
        //é digitado no teclado. 
        Scanner scanUser = new Scanner(System.in);

        //Esta é a classe que criamos para "simular" uma Smart Tv, e aqui estamos instanciando a mesma
        SmartTv smartTv = new SmartTv();

        //Logo no começo, decidi colocar um método da nossa Classe pra poder ver o status atual 
        //da Smart Tv, com o intutio do usuário, ao usar o código já fique ciente de como irá
        //mostrar o status e como está o estado atual da mesma. 
        smartTv.mostrarStatus();

        //Variável para validar a escolha que o usuário irá adicionar, como nosso menu é feito por
        //escolhas de inteiros utilizaremos o tipo 'int'.
        int escolhaUsuario;

        //Colocamos o código que interage com o usuário em uma estrutura de repetição do-while
        //pois, ele irá executar o código todo ao menos uma vez, antes de validar o prosseguimento
        //da repetição, e usamos a variável 'escolhaUsuario' para poder validar, no caso do nosso código
        //colocamos uma instrução na interação com o usuário para que, caso quiser finalizar o programa
        //digite '8'.
        do {
            System.out.println("------------------------------------");
            System.out.println(" -- Project Smart Tv --");
            System.out.println("");
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("1 - Mostrar status atual da Tv");
            System.out.println("2 - Ligar Tv");
            System.out.println("3 - Desligar Tv");
            System.out.println("4 - Aumentar volume");
            System.out.println("5 - Diminuir volume");
            System.out.println("6 - Mudar canal");
            System.out.println("7 - Mudar canal específico");
            System.out.println("8 - Finalizar programa");
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.print("Digite o número da sua escolha: ");
            //Nesta parte abaixo, estamos utilizando nossa Classe que criamos para poder receber 
            //a entrada do usuário, e dentro dela, utilizamos o método 'nextInt()', pois iremos 
            //trabalhar com inteiro para validação da escolha do usuário. 
            escolhaUsuario = scanUser.nextInt();
            System.out.println("");
            //
            switch (escolhaUsuario) {
                case 1:
                    smartTv.mostrarStatus();
                    break;
                case 2:
                    if (smartTv.ligada == true) {
                        System.out.println("Impossível, a Smart Tv já está LIGADA!! ");
                    } else {
                        smartTv.ligar();
                        smartTv.mostrarStatus();
                        break;
                    }
                    break;
                case 3:
                    if (smartTv.ligada == false) {
                        System.out.println("Impossível, a Smart Tv já está DESLIGADA!! ");
                    } else {

                        smartTv.desligar();
                        smartTv.mostrarStatus();
                    }
                    break;
                case 4:
                    if (smartTv.ligada == false) {
                        System.out.println("Impossível, a Smart Tv está DESLIGADA!! ");
                    } else {

                        smartTv.aumentarVolume();
                        smartTv.mostrarStatus();
                    }
                    break;
                case 5:
                    if (smartTv.ligada == false) {
                        System.out.println("Impossível, a Smart Tv está DESLIGADA!! ");
                    } else {

                        smartTv.diminuirVolume();
                        smartTv.mostrarStatus();
                    }
                    break;
                case 6:
                    if (smartTv.ligada == false) {
                        System.out.println("Impossível, a Smart Tv está DESLIGADA!! ");
                    } else {

                        smartTv.mudarCanal();
                        smartTv.mostrarStatus();
                    }
                    break;
                    case 7:
                    if (smartTv.ligada == false) {
                        System.out.println("Impossível, a Smart Tv está DESLIGADA!! ");
                    } else {
                        
                        System.out.println("");
                        System.out.println("Para qual canal deseja mudar?: ");
                        int canalEspecifico = scanUser.nextInt();
                        smartTv.mudarCanalEspecifico(canalEspecifico);
                        System.out.println("");
                        smartTv.mostrarStatus();
                    }
                    break;
                case 8:
                    System.out.println("");
                    System.out.println("Desligando a Smart Tv...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opção inválida.");
                    System.out.println("");
                    break;
            }

        } while (escolhaUsuario != 8);
        scanUser.close();

    }
}

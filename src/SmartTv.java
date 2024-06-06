
public class SmartTv {

    boolean ligada = false;
    int canal = 0;
    int volume = 25;

    //Métodos para ligar e desligar a Tv
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    //Métodos para alterar volume da Tv
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    //Métodos para mudar de canal
    public void mudarCanal(){
        canal++;
    }
    public void mudarCanalEspecifico(int novoCanal){
        canal = novoCanal;
    }

    //Método para mostrarmos o status atual da Tv
    public void mostrarStatus(){
        String estadoSmartTv;

        estadoSmartTv = ligada ? "A televisão está LIGADA!!" : "A televisão está DESLIGADA!!";

        System.out.println();
        System.out.println(" -- Status Smart Tv -- ");
        System.out.println("Estado(Ligada/Desligada): " + estadoSmartTv);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        System.out.println();

    }
}

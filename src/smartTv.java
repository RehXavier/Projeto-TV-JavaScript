public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume" + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume" + volume);
    }
    public void mudarCanal() {
        canal++;
    }
        public void voltarCanal() {
        canal--;
        }
        public void digitarCanal(int novoCanal) {
        canal= novoCanal;
    }
}

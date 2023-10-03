public class Usuario {
    public static void main(String[] args) throws Exception { // existe uma exeção nesse caso;

        smartTv smartTv = new smartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        System.out.println("Canal Atual :" + smartTv.canal);
        smartTv.digitarCanal(13);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);
        System.out.println("TV Ligada?" + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada :" + smartTv.ligada);

    }

}
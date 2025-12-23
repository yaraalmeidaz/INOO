public class Main {
    public static void main(String[] args){
        ArCondicionadoAutomativo ar1 = new ArCondicionadoAutomativo (1, 7500, false);
        ArCondicionadoAutomativo ar2 = new ArCondicionadoAutomativo (2, 15000, true);

        System.out.println("Ar Condiconado Automativo");
        System.out.println("---------------------------");

        ar1.mostrarDados();
        ar2.mostrarDados();

        ArCondicionadoResidencial ar3 = new ArCondicionadoResidencial (3,5000, false, "Branca", 110,false);
        ArCondicionadoResidencial ar4 = new ArCondicionadoResidencial (4,10000, false, "Preta", 220,false);

        System.out.println("\nAr Condiconado Residencial");
        System.out.println("---------------------------");
        ar3.mostrarDados();
        ar4.mostrarDados();
    }
}
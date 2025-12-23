public class ArCondicionadoResidencial extends ArCondicionado{
    String cor;
    int voltagem;
    boolean controleRemoto;


    public ArCondicionadoResidencial(int serie, int btu, boolean arQuente, String cor, int voltagem, boolean controleRemoto){
        super(serie, btu, arQuente);
        this.cor = cor;
        this.voltagem = voltagem;
        this.controleRemoto = controleRemoto;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cor: " + cor);
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Controle Remoto: " + controleRemoto);

    }
}
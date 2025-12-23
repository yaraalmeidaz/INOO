public class ArCondicionado {
    int serie;
    int btu;
    boolean arQuente;

    public ArCondicionado(int serie, int btu, boolean ArQuente){
        this.serie = serie;
        this.btu = btu;
        this.arQuente = arQuente;
    }
    public int getSerie() {
        return serie;
    }

    public int getBtu() {
        return btu;
    }

    public boolean getArQuente() {
        return arQuente;
    }


    public void mostrarDados() {
        System.out.println("Serie: " + serie);
        System.out.println("BTU: " + btu);
        System.out.println("Ar quente: " + arQuente);
    }
}

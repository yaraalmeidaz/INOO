public class Main {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("Bolinha", 12);
        Cavalo cavalo = new Cavalo("Spirit", 4);
        Preguica preguica = new Preguica("Ed", 3);

        cachorro.mostrarDados();
        cavalo.mostrarDados();
        preguica.mostrarDados();



        Veterinario exame = new Veterinario();

        exame.examinar(cachorro);
        exame.examinar(cavalo);
        exame.examinar(preguica);

    }
}

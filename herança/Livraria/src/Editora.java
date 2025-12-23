public class Editora {
    private String nome;
    private String website;
    private int numPubs;

    public Editora(String nome, String website) {
        this.nome = nome;
        this.website = website;
        this.numPubs = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getWebsite() {
        return website;
    }

    public int getNumPubs() {
        return numPubs;
    }

    public void incrementarPubs() {
        numPubs++;
    }
}

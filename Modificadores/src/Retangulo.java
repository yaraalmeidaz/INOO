public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo() {
        this.comprimento = 1;
        this.largura = 1;
    }
    public double getComprimento(){ //recupera valor
        return comprimento;
    }
    public double getLargura(){
        return largura;
    }

    public boolean setComprimento(double comprimento) {
        if (comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
            return true; // deu certo
        } else {
            return false; // inválido
        }
    }

    public boolean setLargura(double largura) {
        if (largura > 0 && largura < 20) {
            this.largura = largura;
            return true;
        } else {
            return false;
        }
    }
/*/boleani
    //set atribuin nesse caso atribui a validação correta
    //metodos modificadores deve ta em public
    public void setComprimento(double comprimento){ //double comprimento poderia ter outro nome (funcao
        if(comprimento > 0 && comprimento < 20){
            this.comprimento = comprimento; //se estiver correto armazeno
        } else{
            System.out.println("Comprimento deve ser maior que 0 e menor que 20");
        }
    }

    //validadando com set
    public void setLargura(double largura){
        if(largura > 0 && largura < 20){
            this.largura = largura;
        } else{
            System.out.println("Largura deve ser maior que 0 e menor que 20");
        }
    }
*/
    //contas --> metodos
    public double perimetro(){
            return (comprimento + largura) * 2;
    }
    public double area(){
            return comprimento * largura;
    }



}

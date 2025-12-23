import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){

        //opções da caixa:
        String entrada = JOptionPane.showInputDialog("Digite sua idade: ");

        //validar
        int idade = Integer.parseInt(entrada);

        //verifca
        if(idade >= 18){
            JOptionPane.showMessageDialog(null, "Maior de idade");
        } else{
            JOptionPane.showMessageDialog(null, "Menor de idade");

        }
    }
}
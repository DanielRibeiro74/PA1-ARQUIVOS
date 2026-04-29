import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String Cadastro =   JOptionPane.showInputDialog(null, "Cadastre a sua senha:");
        String Tentativa = JOptionPane.showInputDialog(null, "Insira a senha que você cadastrou:");
        if(Tentativa.equals(Cadastro)) {
            JOptionPane.showMessageDialog(null, "Senha correta, entrou com sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
    }
}
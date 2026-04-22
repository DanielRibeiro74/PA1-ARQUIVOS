import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double Alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura:"));
        double Peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu peso atual:"));
        double imc = Peso / (Alt*Alt);
        JOptionPane.showMessageDialog(null, "Seu imc é: " + imc);
        if(imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso");
        }
        if(imc > 18.5 & imc < 24.9) {
            JOptionPane.showMessageDialog(null, "Peso normal");
        }
        if(imc > 25 & imc < 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        }
        if(imc > 30 & imc < 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade Grau I");
        }
        if(imc > 35 & imc < 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade Grau II");
        }
        if(imc > 40){
            JOptionPane.showMessageDialog(null, "Obesidade Grau III (Mórbida)");
        }
    }
}
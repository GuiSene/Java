import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite seu sobrenome");
        String nomeCompleto = nome+" "+ sobreNome;
        JOptionPane.showMessageDialog(null, "Nome completo: "+nomeCompleto, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
}
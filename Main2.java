import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args) {
        int valorA = Integer.parseInt(JOptionPane.showInputDialog("Valor A: "));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Valor B: "));
        int resultado = valorA + valorB;
        JOptionPane.showMessageDialog(null, "Resultado final: "+resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

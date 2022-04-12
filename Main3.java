import javax.swing.JOptionPane;

public class Main3 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4,  media;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3: "));
        nota4 = Float.parseFloat(JOptionPane.showInputDialog("Nota 4: "));
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado com média: " + media, "Média", JOptionPane.INFORMATION_MESSAGE);
        } if (media < 7) {
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado com média: " + media, "Média", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

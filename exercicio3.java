import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {
        // Obter um valor inteiro do usuário
        String inputValor = JOptionPane.showInputDialog("Informe um valor inteiro:");
        
        try {
            // Converter a entrada para um valor inteiro
            int valor = Integer.parseInt(inputValor);

            // Calcular o antecessor
            int antecessor = valor - 1;

            // Exibir o antecessor
            String resultado = String.format("O antecessor de %d é %d", valor, antecessor);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor inteiro válido.");
        }
    }
}

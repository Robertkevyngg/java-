import javax.swing.JOptionPane;

public class exercicio1 {
    public static void main(String[] args) {
        // Array para armazenar os números
        double[] numeros = new double[4];

        // Loop para obter os 4 números
        for (int i = 0; i < 4; i++) {
            String input = JOptionPane.showInputDialog("Informe o número " + (i + 1) + ":");
            
            try {
                numeros[i] = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                i--; // Decrementa o índice para repetir a leitura deste número.
            }
        }

        // Calcular o quadrado de cada número e somar os quadrados
        double somaQuadrados = 0;
        for (double numero : numeros) {
            somaQuadrados += Math.pow(numero, 2);
        }

        // Exibir o resultado
        String resultado = String.format("A soma dos quadrados é: %.2f", somaQuadrados);
        JOptionPane.showMessageDialog(null, resultado);
    }
}

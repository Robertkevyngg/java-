import javax.swing.JOptionPane;

public class exercicio8 {
    public static void main(String[] args) {
        // Obter o número total de eleitores
        String inputTotalEleitores = JOptionPane.showInputDialog("Informe o número total de eleitores:");
        
        // Obter o número de votos brancos
        String inputVotosBrancos = JOptionPane.showInputDialog("Informe o número de votos brancos:");

        // Obter o número de votos nulos
        String inputVotosNulos = JOptionPane.showInputDialog("Informe o número de votos nulos:");

        // Obter o número de votos válidos
        String inputVotosValidos = JOptionPane.showInputDialog("Informe o número de votos válidos:");

        try {
            // Converter as entradas para valores inteiros
            int totalEleitores = Integer.parseInt(inputTotalEleitores);
            int votosBrancos = Integer.parseInt(inputVotosBrancos);
            int votosNulos = Integer.parseInt(inputVotosNulos);
            int votosValidos = Integer.parseInt(inputVotosValidos);

            // Calcular percentuais
            double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
            double percentualNulos = (double) votosNulos / totalEleitores * 100;
            double percentualValidos = (double) votosValidos / totalEleitores * 100;

            // Exibir os resultados
            String resultado = String.format("Percentual de votos brancos: %.2f%%\nPercentual de votos nulos: %.2f%%\nPercentual de votos válidos: %.2f%%", percentualBrancos, percentualNulos, percentualValidos);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        }
    }
}

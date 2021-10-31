import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        String x, y;

        String opcaoS = JOptionPane.showInputDialog(null, "Menu:\n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir",
                "Calculadora", JOptionPane.QUESTION_MESSAGE);

        int opcao = Integer.parseInt(opcaoS);

        if (opcao == 1) {
            x = JOptionPane.showInputDialog(null, "Digite o primeiro número a ser somado:", "Operação Soma",
                    JOptionPane.QUESTION_MESSAGE);
            y = JOptionPane.showInputDialog(null, "Digite o segundo número a ser somado:", "Operação Soma",
                    JOptionPane.QUESTION_MESSAGE);

            double a = Double.parseDouble(x);
            double b = Double.parseDouble(y);

            double resultado = a + b;

            JOptionPane.showMessageDialog(null, "O resultado de:\n" + a + "+" + b + "=" + resultado);

        } else if (opcao == 2) {

            x = JOptionPane.showInputDialog(null, "Digite o primeiro número a ser subtraido:", "Operação Subtrair",
                    JOptionPane.QUESTION_MESSAGE);
            y = JOptionPane.showInputDialog(null, "Digite o segundo número a ser subtraido:", "Operação subtrair",
                    JOptionPane.QUESTION_MESSAGE);

            double a = Double.parseDouble(x);
            double b = Double.parseDouble(y);

            double resultado = a - b;

            JOptionPane.showMessageDialog(null, "O resultado de:\n" + a + "-" + b + "=" + resultado);

        } else if (opcao == 3) {
            x = JOptionPane.showInputDialog(null, "Digite o primeiro número a ser multiplicado:",
                    "Operação Multiplicar", JOptionPane.QUESTION_MESSAGE);
            y = JOptionPane.showInputDialog(null, "Digite o segundo número a ser multiplicado:", "Operação Multiplicar",
                    JOptionPane.QUESTION_MESSAGE);

            double a = Double.parseDouble(x);
            double b = Double.parseDouble(y);

            double resultado = a * b;

            JOptionPane.showMessageDialog(null, "O resultado de:\n" + a + "x" + b + "=" + resultado);

        } else if (opcao == 4) {

            x = JOptionPane.showInputDialog(null, "Digite o primeiro número a ser dividido:", "Operação Dividir",
                    JOptionPane.QUESTION_MESSAGE);
            y = JOptionPane.showInputDialog(null, "Digite o segundo número a ser dividido:", "Operação Dividir",
                    JOptionPane.QUESTION_MESSAGE);

            double a = Double.parseDouble(x);
            double b = Double.parseDouble(y);

            double resultado = a / b;

            JOptionPane.showMessageDialog(null, "O resultado de:\n" + a + "/" + b + "=" + resultado);

        }

        else {
            JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
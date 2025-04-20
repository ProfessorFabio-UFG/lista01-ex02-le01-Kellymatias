import java.util.Scanner;

public class CadastroComVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Morador[] moradores = new Morador[100];
        int contador = 0;
        String resposta;

        do {
            System.out.println("\n--- Cadastro de Morador ---");

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.nextLine();

            System.out.print("Celular: ");
            String celular = input.nextLine();

            System.out.print("Data de Nascimento: ");
            String dataNascimento = input.nextLine();

            System.out.print("Sexo: ");
            String sexo = input.nextLine();

            System.out.print("Bloco: ");
            String bloco = input.nextLine();

            System.out.print("Apartamento: ");
            String apartamento = input.nextLine();

            System.out.print("Código de Acesso: ");
            String codigoAcesso = input.nextLine();

            Morador morador = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso);
            moradores[contador] = morador;
            contador++;

            System.out.print("\nDeseja cadastrar outro morador? (s/n): ");
            resposta = input.nextLine().toLowerCase();

        } while (resposta.equals("s"));

        System.out.println("\n=== Lista de Moradores Cadastrados ===");
        for (int i = 0; i < contador; i++) {
            moradores[i].mostrarDados();
        }

        input.close();
    }
}

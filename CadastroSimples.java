import java.util.Scanner;

public class CadastroSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
        morador.mostrarDados();

        input.close();
    }
}

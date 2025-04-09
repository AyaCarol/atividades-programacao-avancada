package exercicioEmpresaFuncionario;
public class Main {
    public static void main(String[] args) throws Exception {
        
        String nome = "Ana Carol";
        int idade = 20;
        String endereco = "Ponta Grossa";
        String cpf = "119.455.699.05";
        float salario = 12345;
        String cargo = "Analista";

        Pessoa p = new Pessoa(nome, idade, cpf, endereco);

       p.exibirInfo();

        Funcionario f = new Funcionario(nome, salario, cargo);

        System.out.println("\nSalario Funcionario " + f.nome + " com bonus: " + "R$" + f.getSalario(500));

        f.exibirInfo();



    }
}

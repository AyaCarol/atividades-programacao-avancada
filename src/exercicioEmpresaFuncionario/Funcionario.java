package exercicioEmpresaFuncionario;
public class Funcionario extends Pessoa{
    private float salario;
    private String cargo;

    public Funcionario(String nome, float salario, String cargo){
        super(nome);
        this.salario = salario;
        this.cargo = cargo;
    }

    public void setSalario(float salAlt){
        this.salario = salAlt;
    }

    public float getSalario(){
        return this.salario;
    }

    public float getSalario(float bonus){
        return this.salario + bonus;
    }

    public void setCargo(String cargoAlt){
        this.cargo = cargoAlt;
    }

    public String getCargo(){
        return this.cargo;
    }

    public void exibirInfo(){
        System.out.println(
            "\nFUNCIONARIO\n"
            + "Nome: " + this.nome
            + "\nIdade: " 
            + this.idade
            + "\nCPF: "
            + this.getCpf()
            + "\nEndereco: "
            + this.getEndereco()
            + "\nCargo: " + this.cargo
            + "\nSalario: " + this.salario
            
        );
    }

}

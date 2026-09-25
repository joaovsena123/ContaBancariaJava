public class funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public funcionario(String nome, String cargo, double salario) {
        if (nome != null && !nome.isBlank()){
            this.nome = nome;
        }else {
            this.nome = "sem nome";
        }
        if (salario > 0) {
            this.salario = salario;
        }else {
            this.salario = 0;
        }
        if (cargo != null && !cargo.isBlank()) {
            this.cargo = cargo;
        }else {
            this.cargo = "nao definido";
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
}

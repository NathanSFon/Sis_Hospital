package Pessoa;

public class funcionario extends pessoa{
    private int horarioDeTrabalho;
    private String funcao;

    public funcionario(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    public String getFuncao() {
        return funcao;
    }
    public int getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }
    public void setHorarioDeTrabalho(int horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}

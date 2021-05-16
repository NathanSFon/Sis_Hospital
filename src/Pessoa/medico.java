package Pessoa;

public class medico extends pessoa{
    private String especializacao;
    private boolean atendimento;

    public medico(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    public void consultando(){
        if (!atendimento){
            this.setAtendimento(true);
        }
    }

    public void fimConsulta(String receita, Boolean atestado){
        System.out.println("Remedio receitado: " + receita);
        System.out.println("Precisa de atestado: " + atestado);
        setAtendimento(false);
    }

    public String getEspecializacao() {
        return especializacao;
    }
    public boolean isAtendimento() {
        return atendimento;
    }
    public void setAtendimento(boolean atendimento) {
        this.atendimento = atendimento;
    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}

package Pessoa;

public class medico extends pessoa{
    private String especializacao;
    private boolean atendimento;

    public void consultando(){
        if (!atendimento){}
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

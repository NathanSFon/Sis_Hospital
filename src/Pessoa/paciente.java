package Pessoa;

public class paciente extends pessoa{
    private String sintomas;
    private boolean planoDeSaude;

    public paciente(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    public void sintomas(String sintomas){
        System.out.println("Principal sintoma do paciente: " + sintomas);
        this.setSintomas(sintomas);
    }

    public String getSintomas() {
        return sintomas;
    }
    public boolean isPlanoDeSaude() {
        return planoDeSaude;
    }
    public void setPlanoDeSaude(boolean planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}

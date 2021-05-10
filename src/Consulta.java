import Pessoa.medico;
import Pessoa.paciente;

public class Consulta {
    private medico med;
    private paciente pacien;

    public Consulta(medico medi, paciente pa){
        this.setMed(medi);
        this.setPacien(pa);
    }

    public medico getMed() {
        return med;
    }
    public paciente getPacien() {
        return pacien;
    }
    public void setMed(medico med) {
        this.med = med;
    }
    public void setPacien(paciente pacien) {
        this.pacien = pacien;
    }
}

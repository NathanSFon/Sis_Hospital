public class Consulta {
    private medico med;
    private paciente pacien;

    public Consulta(medico medi, paciente pa){
        this.setMed(medi);
        this.setPacien(pa);
        this.med.consultando();
        this.med.fimConsulta();
    }

    @Override
    public String toString() {
        return "medico(a)" + this.med.getNome() + " paciente " + this.pacien.toString;
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

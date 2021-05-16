public class Principal {
    
    public static void main(String[] args) {
        paciente[] p = new paciente();
        p[1] = new paciente("jubileu", 23, 68.9, 1.70);
        p[2] = new paciente("Celia", 26, 66.7, 1.65);

        medico[] m = new medico();
        m[1] = new medico("Paula", 25, 70.0, 1.74);
        m[1].setEspecializacao("Clinico Geral");

        Consulta nova = new Consulta(m[1], p[2]);
        nova.toString();

    }
}

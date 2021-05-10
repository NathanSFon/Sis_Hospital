package Pessoa;

public abstract class pessoa {
    protected String nome;
    protected int idade;
    protected double altura;
    protected double peso;

    public pessoa(String nome, int idade, double peso, double altura){
        this.setNome(nome);
        this.setAltura(altura);
        this.setIdade(idade);
        this.setPeso(peso);
    }

    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}

package RevisaoDos;

public class Imc {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private  double imc;


    public Imc(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura / 100;
        this.imc = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    //metodos
    public  void calcularImc(){
        System.out.println("Digite seu nome: ");
        this.imc = peso / (altura * altura);
        if(this.imc < 18.5){
            System.out.println("Você esta abaixo de seu peso ideal!! ");
        }else if(this.imc >= 25 ){
            System.out.println("Você esta acima do seu peso ideal");
        }else {
            System.out.println("Voce está com peso ideal");
        }
    }

}

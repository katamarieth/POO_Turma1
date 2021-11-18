package Aula10;

public class AssociadoHabilitado extends Associado {
    //atributos
    private double custoPiscina;
    private boolean habilitado;
    //construtor
    public AssociadoHabilitado( String numero,String nome, String atividade, double valor, double custoPiscina) {
        //valores que hereda do pai
        super(numero, nome,valor, atividade);
        this.custoPiscina = custoPiscina;
    }
    @Override
    public double custoMensal(){
        if(this.habilitado){
            return super.custoMensal() + this.custoPiscina;
        }else{
            return super.custoMensal();
        }
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}

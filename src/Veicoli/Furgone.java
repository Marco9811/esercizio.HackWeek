package Veicoli;

public class Furgone extends VeicoloMotore {
    private int capacita;

    public Furgone(String marca, int anno, int cilindrata,String alimentazione,int capaicta){
        super(marca, anno, cilindrata,alimentazione);
        this.capacita = capacita;
    }

    @Override
    public String getInfoVeicoli() {
        return super.getInfoVeicoli();
    }
}

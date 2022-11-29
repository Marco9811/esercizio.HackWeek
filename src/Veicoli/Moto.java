package Veicoli;

public class Moto extends VeicoloMotore{

    private int tempi;

    public Moto(String marca, int anno, int cilindrata,String alimentazione,int tempi){
        super(marca, anno, cilindrata,alimentazione);
        this.tempi = tempi;
    }

    @Override
    public String getInfoVeicoli() {
        return super.getInfoVeicoli();
    }
}

package Veicoli;

public class Macchina extends VeicoloMotore{
    private int porte;

    public Macchina(String marca, int anno, int cilindrata,String alimentazione,int porte){
        super(marca, anno, cilindrata,alimentazione);
        this.porte = porte;
    }

    @Override
    public String getInfoVeicoli() {
        return super.getInfoVeicoli();
    }
}

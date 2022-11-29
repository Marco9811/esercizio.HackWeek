package Veicoli;

public class VeicoloMotore {

    private String marca;
    private int anno;
    private int cilindrata;
    private String alimentazione;

    public VeicoloMotore(String marca, int anno, int cilindrata,String alimentazione){
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
        this.alimentazione = alimentazione;
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }
    public String getInfoVeicoli(){
        return " il Veicolo è: " + marca + ", dell'anno "+anno+",  con una cilindrata di "+cilindrata+" ed va a "+alimentazione;
    }
}







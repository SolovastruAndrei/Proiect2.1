package app.Classes;
public class Jocuri {
    private String nume;
    private String platforma;
    private float pret;
    public Jocuri(String nume, String platforma,float pret){
        this.nume=nume;
        this.platforma=platforma;
        this.pret=pret;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public void setPlatforma(String platforma){
        this.platforma=platforma;
    }
    public void setPret(float pret){
        this.pret=pret;
    }
    public String getNume(){
        return nume;
    }
    public String getPlatforma(){
        return platforma;
    }
    public float getPret(){
        return pret;
    }
    public String toString(){
        return nume+" "+platforma+" "+pret;
    }
}

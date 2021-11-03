package app.Classes;

import app.Classes.Jocuri;

public class PlayStation {
    private String nume;
    private float pret;
    public int contor;
    public PlayStation(String nume,float pret){
        this.nume=nume;
        this.pret=pret;
    }
    public void setNume(String nume){
        this.nume=nume;
    }

    public void setPret(float pret){
        this.pret=pret;
    }
    public String getNume(){
        return nume;
    }
    public float getPret(){
        return pret;
    }
    public int contor(int d, Jocuri[] j){
        if(j[d].getPlatforma().equals("PlayStation")){
            return   contor++;
        }
        else
            return contor;
    };
   // PlayStation plst=new PlayStation(null,0);
}
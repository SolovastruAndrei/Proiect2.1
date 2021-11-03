package app.Classes;

public class Client {
    private String nume;
    private float bani;
    public Client(String nume,float bani){
        this.nume=nume;
        this.bani=bani;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public void setBani(float bani)
    {
        this.bani=bani;
    }
    public String getNume(){
        return nume;
    }
    public float getBani(){
        return bani;
    }
    public String toString(){
        return "\n nume: "+nume+"bani :"+bani;
    }
    //Client p= new Client("Mihai",500);
}

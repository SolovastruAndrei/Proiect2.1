package app.gui;
import java.util.Scanner;
import app.Classes.Client;
import app.Classes.Desktop;
import app.Classes.Jocuri;
import app.Classes.PlayStation;
import app.gui.FirstWindow;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        FirstWindow launch= new FirstWindow();
        Scanner sc= new Scanner(System.in);
        float incasari=0.0f;
        String h="DA";
        Client p= new Client("Mihai",500);
        Desktop dskt=new Desktop(null,0);
        PlayStation plst=new PlayStation(null,0);
        Jocuri[] jocuri=new Jocuri[4];
        for(int i=0;i<4;i++)
        {   System.out.println("Dati numele jocului");
            String b=sc.next();
            System.out.println("Dati platfoma pe care ruleaza");
            String c=sc.next();
            System.out.println("Dati pretul jocului");
            float e=sc.nextFloat();
            jocuri[i]=new Jocuri(b,c,e);
        }
        System.out.println("Introduceti numele dumneavoastra");
        String a=sc.nextLine();
        if(a.equals("andrei332211"))
        {
            System.out.println("true, astazi s-au facut :"+incasari+" incasari");
        }
        else
        {
            while(!h.equals("NU")) {
                //System.out.println("false");
                System.out.println("Ce joc a-ti dori sa cumparati?");
                for (int i = 0; i < 4; i++) {
                    System.out.println(i + " " + jocuri[i].toString());
                }
                int d = sc.nextInt();
                dskt.contor(d, jocuri);
                plst.contor(d, jocuri);
                if (d == 0) {
                    incasari = incasari + jocuri[0].getPret();

                } else if (d == 1) {
                    incasari = incasari + jocuri[1].getPret();
                } else if (d == 2) {
                    incasari = incasari + jocuri[2].getPret();
                } else if (d == 3) {
                    incasari = incasari + jocuri[3].getPret();
                }
                float x = p.getBani();
                x = x - jocuri[d].getPret();
                // p.getBani()=x;
                incasari = incasari + jocuri[d].getPret();
                System.out.println("V-au mai ramas :" + x + " lei in cont, doriti sa mai cumparati ceva? DA/NU");
                h=sc.next();
            }
        }
        //System.out.println(" Astazi s-au vandut :"+dskt.contor+" Jocuri de Desktop si :"+plst.contor+"de PlayStation");

    }
}

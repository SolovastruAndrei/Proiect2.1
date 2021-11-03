package app.gui;
import app.Classes.Client;
import app.Classes.Desktop;
import app.Classes.Jocuri;
import app.Classes.PlayStation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

//import static sun.security.util.KnownOIDs.Title;

class FirstWindow implements ActionListener {
    private JFrame jfr = new JFrame("FirstWindow");
    public JLabel lb = new JLabel("Dati numele persoanei:");
    private JPanel jp = new JPanel();
    private JTextField txtf = new JTextField(5);
    private JLabel lb2 = new JLabel("Bani cash:");
    private JPanel jp2 = new JPanel();
    private JTextField txtf2 = new JTextField(5);
    private JLabel lb3 = new JLabel("Va rog scrieti ce jocuri a-ti dori sa comandati.");
    private JPanel jp3 = new JPanel();
    private JTextField txtf3 = new JTextField(5);
    private JPanel jp4 = new JPanel();
    private JButton bt = new JButton("Continue");
    FirstWindow()
    {
        bt.setFocusable(false);
        bt.addActionListener(this);
        jfr.setLayout(new GridLayout(4,3));
        jp.setLayout(new GridLayout());
        jp.add(lb);
        jp.add(txtf);
        jp2.setLayout(new GridLayout());
        jp2.add(lb2);
        jp2.add(txtf2);
        jp3.setLayout(new GridLayout());
        jp3.add(lb3);
        jp3.add(txtf3);
        jp4.add(bt);
        jfr.add(bt);
        jfr.add(jp);
        jfr.add(jp2);
        jfr.add(jp3);
        jfr.add(jp4);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setSize(300,220);
        jfr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt)
        {   JOptionPane.showMessageDialog(null, "Ati comandat "+txtf3.getText());
            if(txtf.getText().equals("")&& txtf2.getText().equals("") && txtf3.getText().equals(""))
            {
                bt.setText("The text fields are empty");
            }
            else if(txtf.getText().equals("") || txtf2.getText().equals("") || txtf3.getText().equals(""))
            {
                bt.setText("Try again!");
            }
            else
            {
                jfr.dispose();
                String nume = txtf.getText();
                float cash;
                try {
                    cash = Float.parseFloat(txtf2.getText());
                }
                catch(NumberFormatException n)
                {
                    cash=0;
                    System.out.println("Type float numbers not characters!");
                }
                Client p = new Client(nume,cash);
                System.out.println(p.toString());
                Scanner sc = new Scanner(System.in);
                System.out.println("Numarul de jocuri:");
                int nr_de_jocuri = sc.nextInt();
                System.out.println("Numarul de Jocuri Desktop:");
                int nr_de_desktop = sc.nextInt();
                PlayStation s= new PlayStation("dota",5);

            }
        }

    }
}
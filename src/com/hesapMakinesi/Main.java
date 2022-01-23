package com.hesapMakinesi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args) {

        HesapMakinesi();

    }

    public static void HesapMakinesi(){
        JFrame hesapmakinesi=new JFrame("Hesap Makinesi");
        JButton buttonArti=new JButton("+");
        JButton buttonEksi=new JButton("-");
        JButton buttonCarpi=new JButton("*");
        JButton buttonBolu=new JButton("/");
        JTextField islemYeri=new JTextField();
        JButton delete=new JButton("Delete");
        JLabel label1=new JLabel("1. Sayı:");
        JLabel label2=new JLabel("2. Sayı:");
        JLabel sonuc=new JLabel("Sonuç:");
        JTextField islemYeri2=new JTextField();
        JTextField sonucYer=new JTextField();



        delete.setBounds(20,10,120,70);
        buttonArti.setBounds(20,90,120,70);
        buttonEksi.setBounds(20,180,120,70);
        buttonCarpi.setBounds(20,270,120,70);
        buttonBolu.setBounds(20,360,120,70);
        islemYeri.setBounds(150,70,230,70);
        label1.setBounds(150,0,100,100);
        label2.setBounds(150,120,100,100);
        islemYeri2.setBounds(150,180,230,70);
        sonuc.setBounds(150,240,100,100);
        sonucYer.setBounds(150,300,230,70);

        hesapmakinesi.setSize(400,500);

        hesapmakinesi.add(buttonArti);
        hesapmakinesi.add(buttonEksi);
        hesapmakinesi.add(buttonCarpi);
        hesapmakinesi.add(buttonBolu);
        hesapmakinesi.add(islemYeri);
        hesapmakinesi.add(delete);
        hesapmakinesi.add(label1);
        hesapmakinesi.add(label2);
        hesapmakinesi.add(islemYeri2);
        hesapmakinesi.add(sonuc);
        hesapmakinesi.add(sonucYer);
        hesapmakinesi.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        hesapmakinesi.setLayout(null);
        hesapmakinesi.setVisible(true);





       buttonArti.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               int a1= Integer.parseInt(islemYeri.getText());
               int a2=Integer.parseInt(islemYeri2.getText());
               int sonuc=a1+a2;
               sonucYer.setText(String.valueOf(sonuc));
           }
       });

       buttonEksi.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               int a1= Integer.parseInt(islemYeri.getText());
               int a2=Integer.parseInt(islemYeri2.getText());
               int sonuc=a1-a2;
               sonucYer.setText(String.valueOf(sonuc));
           }
       });

       buttonCarpi.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               int a1= Integer.parseInt(islemYeri.getText());
               int a2=Integer.parseInt(islemYeri2.getText());
               int sonuc=a1*a2;
               sonucYer.setText(String.valueOf(sonuc));
           }
       });

       buttonBolu.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               double a1= Integer.parseInt(islemYeri.getText());
               double a2=Integer.parseInt(islemYeri2.getText());
               double sonuc=a1/a2;
               sonucYer.setText(String.valueOf(sonuc));
           }
       });

       delete.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               islemYeri.setText("");
               islemYeri2.setText("");
               sonucYer.setText("");

           }
       });


    }
}

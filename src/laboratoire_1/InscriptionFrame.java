/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoire_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author atdig
 */
public class InscriptionFrame extends JFrame implements ActionListener {
    //Initialize global members
    private static JButton press;
    private static JTextField nomField;
    private static JTextField naissanceField;
    private static JTextField prenomField;
    
    
    InscriptionFrame(){
           JFrame frame = new JFrame("Inscription");
           
           frame.setSize(680, 600);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
           JPanel panel_ins = new JPanel(); 
           JPanel panel_nom = new JPanel(); 
           JPanel panel_nais = new JPanel(); 
           JPanel panel_prenom = new JPanel(); 
           JPanel panel_btn = new JPanel(); 
           
           panel_ins.setLayout(null);           
           panel_nom.setLayout(null);
           panel_nais.setLayout(null);
           panel_prenom.setLayout(null);
           panel_btn.setLayout(null);
           
           panel_ins.setBackground(Color.orange);
           panel_ins.setPreferredSize(new Dimension(680, 100));
           panel_nom.setBackground(Color.magenta);
           panel_nom.setPreferredSize(new Dimension(200, 100));
           panel_nais.setBackground(Color.magenta); 
           panel_nais.setPreferredSize(new Dimension(200, 100));
           panel_prenom.setBackground(Color.magenta);  
           panel_prenom.setPreferredSize(new Dimension(200, 100));
           panel_btn.setBackground(Color.pink);  
           panel_btn.setPreferredSize(new Dimension(680, 100));
           
           //Inscription
           JLabel inscription = new JLabel("Inscription");
           inscription.setBounds(250, 30, 300, 30);
           inscription.setForeground(Color.white);
           inscription.setFont(new Font("Arial",  Font.BOLD, 30));
           panel_ins.add(inscription);                               
           
           //Nom
           JLabel nom = new JLabel("Nom");
           nom.setBounds(80, 50, 40, 20);
           nom.setForeground(Color.white);
           nom.setFont(new Font("Arial",  Font.PLAIN, 12));
           panel_nom.add(nom);
     
           nomField = new JTextField();
           nomField.setBounds(25, 80, 150, 30);
           panel_nom.add(nomField); 
           
           //Anne de naissance
           JLabel anne_naissance = new JLabel("Anne de Naissance");
           anne_naissance.setBounds(50, 50, 200, 20);
           anne_naissance.setForeground(Color.white);
           anne_naissance.setFont(new Font("Arial",  Font.PLAIN, 12));
           panel_nais.add(anne_naissance);
           
           naissanceField = new JTextField();
           naissanceField.setBounds(30, 80, 150, 30);
           panel_nais.add(naissanceField); 
           
           //Prenom
           JLabel prenom = new JLabel("Prenom");
           prenom.setBounds(80, 50, 200, 20);
           prenom.setForeground(Color.white);
           prenom.setFont(new Font("Arial",  Font.PLAIN, 12));
           panel_prenom.add(prenom);
           
           prenomField = new JTextField();
           prenomField.setBounds(30, 80, 150, 30);
           panel_prenom.add(prenomField); 
           
           //Button
           press = new JButton("PRESS");
           press.setBounds(230, 30, 200, 30);
           press.setForeground(Color.white);
           press.setBackground(Color.gray);
           press.setFont(new Font("Arial",  Font.PLAIN, 12));
           panel_btn.add(press);
           
           press.addActionListener(this);
           
           frame.setLayout(new BorderLayout(20, 20));  
          
           frame.add(panel_ins, BorderLayout.NORTH);
           frame.add(panel_nom, BorderLayout.WEST);
           frame.add(panel_nais, BorderLayout.CENTER);
           frame.add(panel_prenom, BorderLayout.EAST);          
           frame.add(panel_btn, BorderLayout.SOUTH); 
           
           
           frame.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String annenaisance = naissanceField.getText();
        int age = 2022 -  Integer.parseInt(annenaisance);
        if(e.getSource() == press){
            System.out.println("Nom : " + nomField.getText() + "; Prenom : " + prenomField.getText() + "; Age : " + age);
        }
    }
}

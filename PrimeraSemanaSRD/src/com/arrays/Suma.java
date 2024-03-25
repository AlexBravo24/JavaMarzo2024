package com.arrays;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author sebas
 */
public class Suma extends JFrame implements ActionListener, KeyListener{
    private JLabel ticket, ticket2, respuesta;
    private JTextField txt, txt2;
    private JButton btn;
    
    public Suma(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Sumas");
        
        BevelBorder border=new BevelBorder(0);
        
        ticket=new JLabel("Valor 1:");
        ticket.setBounds(10, 10, 80, 25);
        ticket.setFont(new Font("Sylfaen", 1, 12));
        add(ticket);
        
        txt=new JTextField();
        txt.setBounds(80, 10, 120, 25);
        txt.setHorizontalAlignment((int)CENTER_ALIGNMENT);
        txt.setFont(new Font("Sylfaen", 1, 12));
        txt.setBorder(border);
        txt.addKeyListener(this);
        add(txt);
        
        ticket2=new JLabel("Valor 2:");
        ticket2.setBounds(10, 45, 80, 25);
        ticket2.setFont(new Font("Sylfaen", 1, 12));
        add(ticket2);
        
        txt2=new JTextField();
        txt2.setBounds(80, 45, 120, 25);
        txt2.setHorizontalAlignment((int)CENTER_ALIGNMENT);
        txt2.setFont(new Font("Sylfaen", 1, 12));
        txt2.setBorder(border);
        txt2.addKeyListener(this);
        add(txt2);
        
        btn=new JButton("Sumar");
        btn.setBounds(10, 80, 100, 25);
        btn.setFocusPainted(false);
        btn.addActionListener(this);
        btn.setBorder(border);
        btn.setEnabled(false);
        btn.setFont(new Font("Sylfaen", 1, 12));
        add(btn);
        
        respuesta=new JLabel("Resultado:");
        respuesta.setBounds(130, 80, 80, 25);
        respuesta.setFont(new Font("Sylfaen", 1, 12));
        add(respuesta);
        
    }
    
    public void habilitarBoton(){
        String s=txt.getText().trim();
        String s2=txt2.getText().trim();
        if(s.isEmpty() | s2.isEmpty()){
            btn.setEnabled(false);
        }else{
            btn.setEnabled(true);
        }
    }
    
    public void actionPerformed(ActionEvent s){
        if(s.getSource()==btn){
            try{
                int v=Integer.parseInt(txt.getText());
                int v2=Integer.parseInt(txt2.getText());
                
                int resultado=v+v2;
                
                respuesta.setText("Resultado: "+resultado);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "No se permiten carácteres o letras", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                txt.setText("");
                txt2.setText("");
            }
        }
    }
    
    public void keyReleased(KeyEvent s){
        if(s.getSource()==txt){
            habilitarBoton();
        }else if(s.getSource()==txt2){
            habilitarBoton();
        }
    }
    
    public void keyTyped(KeyEvent s){
        
    }
    
    public void keyPressed(KeyEvent s){
        
    }
    
    public static void main(String[] args){
        Suma s=new Suma();
        s.setBounds(0, 0, 300, 200);
        s.setVisible(true);
        s.setResizable(false);
        s.setLocationRelativeTo(null);
    }
}

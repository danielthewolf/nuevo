/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapresentacion;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author bentura
 */
public class InterfazCalculadora extends JFrame {



    String nro1, nro2;                       
    private double resultado = 0.0;
    private String comp = "";private double numero = 0.0;
    double nr1,nr2;
    JPanel botonera;
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
   JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton("0");
   JButton b11 = new JButton("*");
    JButton b12 = new JButton("+");
    JButton b13 = new JButton("-");
    JButton b14 = new JButton("/");
    JButton b15 = new JButton(".");
    JButton b16 = new JButton("=");
     JTextField texto = new JTextField(10);
     
    
    JLabel etiqueta = new JLabel("CALCULADORA");
   
    
    public InterfazCalculadora() {
 super("Boca");//contructor de la ventana
        Dimension dim_pantalla = Toolkit.getDefaultToolkit().getScreenSize();//dimension de la pantalla donde se ubica las dimensiones del monitor        
        this.setBounds(new Rectangle(260,210)); //le doy un tamaño a la ventana en vez de 4 mando 2 con objeto rectangulo   
        this.setLocation((dim_pantalla.width-new Rectangle(260,210).width)/2,(dim_pantalla.height-new Rectangle(260,210).height)/2);
        
        
        
        
        
        
        
        //this.setLayout(null);
//        Container panel = this.getContentPane();
        
        
    
    //para probar
        etiqueta.setForeground(Color.yellow);
      etiqueta.setHorizontalTextPosition(0);
        texto.setForeground(Color.BLUE);
        
      
        texto.setHorizontalAlignment(JTextField.RIGHT); 
      
        texto.setMaximumSize(dim_pantalla);
        etiqueta.setBackground(Color.yellow);
        
        this.setLayout(new BorderLayout());//con esto se pone todo bien
        
        Panel numeros = new Panel(new GridLayout(4,4));
        
      //  Panel etiqcampo= new Panel();
        
        JPanel campo=new JPanel();
        campo.setBackground(Color.yellow);
        
        
        JPanel etiq=new JPanel();
         etiq.setBackground(Color.BLUE);
       JPanel contenenumero =new JPanel();
       
       contenenumero.setBackground(Color.BLUE);
//       contenenumero.setLayout(null);
     contenenumero.setBounds(new Rectangle(200,100));
//       

    this.add(campo,BorderLayout.CENTER);
    
    this.add(contenenumero,BorderLayout.SOUTH);
        this.add(etiq,BorderLayout.NORTH);
  

          
        numeros.add(b1);
        numeros.add(b2);
        numeros.add(b3);
        numeros.add(b12);
        
        numeros.add(b4);
        numeros.add(b5);
        numeros.add(b6);
        numeros.add(b13);
        
        numeros.add(b7);
        
        numeros.add(b8);
        numeros.add(b9);
       
        numeros.add(b11);
        

        numeros.add(b10);
        numeros.add(b16);
        numeros.add(b15);
        numeros.add(b14);
       
       
       contenenumero.add(numeros);
       campo.add(texto);
       
       
       
       etiq.add(etiqueta);
       

        

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"1");
            }
        });
        
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"2");
            }
        });
        
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"3");
            }
        });
        
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"4");
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"5");
            }
        });
        
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"6");
            }
        });
        
        
         b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"7");
            }
        });
        
        
         b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"8");
            }
        });
        
         b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"9");
            }
        });
        
         b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+"0");
            }
        });
        
        
        
  
        
         b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
        if(texto.getText() == ""){
            texto.setText("0");
        }
 

        comp = "*";
        nr2 = Double.parseDouble(texto.getText());
        resultado = ( nr2 );
        texto.setText("");
    }
        
        });
         
         
         
         
        
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
        if(texto.getText() == ""){
            texto.setText("0");
        }
 

        comp = "+";
        nr2 = Double.parseDouble(texto.getText());
        resultado = ( nr2 );
        texto.setText("");
    }
        
        });
        
         b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
        if(texto.getText() == ""){
            texto.setText("0");
        }
 

        comp = "-";
        nr2 = Double.parseDouble(texto.getText());
        resultado = ( nr2 );
        texto.setText("");
    }
        
        });
        
        
         
     b14.addActionListener(new ActionListener(){
             
             @Override
            public void actionPerformed(ActionEvent ae) {
        if(texto.getText() == ""){
            texto.setText("0");
        }
             
          comp = "/";
        nr2 = Double.parseDouble(texto.getText());
        resultado = ( nr2 );
        texto.setText("");
    }   
             
             
             
             });
     
     
     b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              texto.setText(texto.getText()+".");
            }
        });
     
     
     
          b16.addActionListener(new ActionListener(){
     @Override
            public void actionPerformed(ActionEvent ae) {
              nr2 = Double.parseDouble(texto.getText());
 
        if(comp == "+"){
            resultado = (resultado + nr2);
            texto.setText(""+ resultado);
        } else if(comp == "-"){
            resultado = (resultado - nr2);
            texto.setText("" + resultado);
        } else if(comp == "*"){
            resultado = (resultado * nr2);
            texto.setText("" + resultado);
        } else if (comp == "/"){
            resultado = (resultado / nr2);
            texto.setText("" + resultado);
        
        }


     }
          });


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        this.setVisible(true);
        
        
        
      
}
}
 
package proyecto1;

/**
 *
 * @author Alexander
 */ 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Registro extends JFrame implements ActionListener {
    
    private JTextField nombres;
    private JTextField apellidos;
    private JTextField especialidad;
    private JPasswordField contraseña;
    private JTextField sexo;
    private JTextField edad;
    private JTextField telefono;
    
    private JComboBox<String> comboe;
    private JComboBox<String> combe;
    
    JButton botonresgistro;
    
    public Registro(){
        JLabel titulo= new JLabel ("Registro Doctor");
        titulo.setFont(new Font("Georgia", Font.BOLD, 11));
        titulo.setBounds(200, 10, 100, 30);
        this.add(titulo);
   
        JLabel nombres3= new JLabel("Nombre");
        nombres3.setBounds(70, 50, 80, 25);
        this.add(nombres3);
        
        nombres= new JTextField();
        nombres.setBounds(130, 50, 260, 25);
        this.add(nombres);
        
        
        JLabel apellidos1= new JLabel("Apellido");
        apellidos1.setBounds(70, 90, 260, 25);
        this.add(apellidos1);
        
        apellidos= new JTextField();
        apellidos.setBounds(130, 90, 260, 25);
        this.add(apellidos);
        
        //especialidad
        JLabel especialidad1= new JLabel("Especialidad");
        especialidad1.setBounds(50, 170, 80, 25);
        this.add(especialidad1);
        
        String[] especialidad = {"Cardiologia", "Pediatra","Cirujia General","Dermatologia","Angiologia","Infectologia","Geriatria","Ofmatologi","Ortopedia","Odontologia","Psiquiatra"};
        comboe= new JComboBox<>(especialidad);
        comboe.setBounds(130, 170 , 150, 25);
        this.add(comboe);
        
        //Contraseña
       JLabel contra= new JLabel ("Contraseña");
       contra.setBounds(50, 130, 260, 25);
       this.add(contra);
       
       
       contraseña = new JPasswordField();
       contraseña.setBounds(130, 130, 260, 25);
       this.add(this.contraseña);
       //
       
        JLabel sexo1= new JLabel("Sexo");
        sexo1.setBounds(50, 200, 80, 25);
        this.add(sexo1);
        
        String[] sexo = {"Masculino", "Femenino"};
        combe= new JComboBox<>(sexo);
        combe.setBounds(130, 200 , 150, 25);
        this.add(combe);
        
        JLabel edad5= new JLabel("Edad");
        edad5.setBounds(50, 230, 260, 25);
        this.add(edad5);
        
         edad= new JTextField();
        edad.setBounds(130, 230, 260, 25);
        this.add(edad);
        
        JLabel cel= new JLabel("Telefono");
        cel.setBounds(50, 260, 260, 25);
        this.add(cel);
        
        telefono= new JTextField();
        telefono.setBounds(130, 260, 260, 25);
        this.add(telefono);
        
        botonresgistro= new JButton ("Registrate");
        botonresgistro.setBounds(180, 300, 150, 25);
        botonresgistro.setForeground(Color.red);
        botonresgistro.addActionListener(this);
        this.add(botonresgistro);
        
        
        this.setTitle("Registro");
        this.setBounds(650, 400, 500, 400);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
         /*JLabel edad= new JLabel("edad");
        edad.setBounds(70, 50, 80, 25);
        this.add(edad);*/
        
        
    
        
    
    
    
    
    
    
    
    
    }
 @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == botonresgistro){
            String nombre24= nombres.getText();
            String apellido1= apellidos.getText();
            String especial= (String)combe.getSelectedItem();
            String contra1= new String(contraseña.getPassword());
            String sexo5= (String)comboe.getSelectedItem();
            String edad1= edad.getText();
            String telefonos= telefono.getText();
            int edadD= Integer.parseInt(edad1);
            
            Proyecto1.agregarDoctor(edadD, nombre24, apellido1, edad1, edadD, contra1, especial, telefonos);
            Proyecto1.codigo1++;
            this.dispose();
            
         ModuloAdm admiventana1= new ModuloAdm();
    }
    
    }
    
}

    


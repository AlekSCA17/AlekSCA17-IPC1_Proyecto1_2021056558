
package proyecto1;

/**
 *
 * @author Alexander
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ModuloAdm extends JFrame implements ActionListener{

    JButton ventasal, ventasal2, ventasal3, elimavent, elimavent2, elimavent3, registrovent, registrovent2,registrovent3;
   
        
    public ModuloAdm()  {
        
        //Pestañas
        JTabbedPane Panel=new JTabbedPane(JTabbedPane.TOP); //.Top para que la pestaña se posicione arriba
        
        
        JPanel doctor= new JPanel(null);
        JPanel paciente= new JPanel(null);
        JPanel productos= new JPanel(null);       
        
        
        
//Crearlas
Panel.addTab("Doctores", doctor);
Panel.addTab("Pacientes", paciente);
Panel.addTab("Productos", productos);


//Botones DOCTOR
//Registro 
registrovent= new JButton("Nuevo");
registrovent.setBounds(800, 25, 180, 50);
registrovent.setBackground(new Color (173, 186, 255));
registrovent.setFont(new Font("Georgia",Font.BOLD, 15));
registrovent.setVisible(true);
registrovent.setEnabled(true);
registrovent.addActionListener(this);
doctor.add(registrovent);

//Boton Eliminar
elimavent= new JButton("Borrar");
elimavent.setBounds(900, 100, 180, 50);
elimavent.setBackground(new Color (173, 186, 255));
elimavent.setFont(new Font("Georgia",Font.BOLD, 15));
elimavent.setVisible(true);
elimavent.setEnabled(true);
elimavent.addActionListener(this);
doctor.add(elimavent);

//Boton Actualizacion
ventasal= new JButton("Actualizar");
ventasal.setBounds(1000, 25, 180, 50);
ventasal.setBackground(new Color (173, 186, 255));
ventasal.setFont(new Font("Georgia",Font.BOLD, 15));
ventasal.setVisible(true);
ventasal.setEnabled(true);
ventasal.addActionListener(this);
doctor.add(ventasal);



//Botones paciente
//Registro 
registrovent2= new JButton("Nuevo");
registrovent2.setBounds(800, 25, 180, 50);
registrovent2.setBackground(new Color (173, 186, 255));
registrovent2.setFont(new Font("Georgia",Font.BOLD, 15));
registrovent2.setVisible(true);
registrovent2.setEnabled(true);
registrovent2.addActionListener(this);
paciente.add(registrovent2);

//Boton Eliminar
elimavent2= new JButton("Borrar");
elimavent2.setBounds(900, 100, 180, 50);
elimavent2.setBackground(new Color (173, 186, 255));
elimavent2.setFont(new Font("Georgia",Font.BOLD, 15));
elimavent2.setVisible(true);
elimavent2.setEnabled(true);
elimavent2.addActionListener(this);
paciente.add(elimavent2);

//Boton Actualizacion
ventasal2= new JButton("Actualizar");
ventasal2.setBounds(1000, 25, 180, 50);
ventasal2.setBackground(new Color (173, 186, 255));
ventasal2.setFont(new Font("Georgia",Font.BOLD, 15));
ventasal2.setVisible(true);
ventasal2.setEnabled(true);
ventasal2.addActionListener(this);
paciente.add(ventasal2);

//Botones productos
//Registro 
registrovent3= new JButton("Crear producto nuevo");
registrovent3.setBounds(800, 25, 180, 50);
registrovent3.setBackground(new Color (173, 186, 255));
registrovent3.setFont(new Font("Georgia",Font.BOLD, 12));
registrovent3.setVisible(true);
registrovent3.setEnabled(true);
registrovent3.addActionListener(this);
productos.add(registrovent3);

//Boton Eliminar
elimavent3= new JButton("Borrar producto");
elimavent3.setBounds(900, 100, 180, 50);
elimavent3.setBackground(new Color (173, 186, 255));
elimavent3.setFont(new Font("Georgia",Font.BOLD, 15));
elimavent3.setVisible(true);
elimavent3.setEnabled(true);
elimavent3.addActionListener(this);
productos.add(elimavent3);

//Boton Actualizacion
ventasal3= new JButton("Actualizar producto");
ventasal3.setBounds(1000, 25, 180, 50);
ventasal3.setBackground(new Color (173, 186, 255));
ventasal3.setFont(new Font("Georgia",Font.BOLD, 12));
ventasal3.setVisible(true);
ventasal3.setEnabled(true);
ventasal3.addActionListener(this);
productos.add(ventasal3);
//Titulo

JLabel titu= new JLabel("Nómina Medica");
titu.setBounds(25, 25, 750, 50);
titu.setBorder(BorderFactory.createLineBorder(Color.black));
titu.setBackground(new Color (247, 221, 116));
titu.setOpaque(true);
titu.setVerticalAlignment(SwingConstants.CENTER);
titu.setFont(new Font("Georgia",Font.BOLD, 30));
titu.setVisible(true);

//agregar panel
doctor.add(titu);




//Contenido de de las pestañas

//Doctores
//Tabla
//Encabezado

String[] columnas={"Código","Nombre","Apellido", "Genero","Edad","Contraseña","Especialidad","Teléfono"};
      
       JTable Pane5 = new JTable(Proyecto1.ConvertirDatosDoctor(), columnas);
            
       JScrollPane tabla= new JScrollPane(Pane5);
       
       tabla.setBounds(25, 80, 750, 570);
       
       doctor.add(tabla);
       
       //pestaña paciente
       
       JLabel titulo= new JLabel("Nomina Pacientes");
       titulo.setBounds(25, 25, 750, 50);
       titulo.setBorder(BorderFactory.createLineBorder(Color.black));
       titulo.setBackground(new Color (250, 177, 82));
       titulo.setOpaque(true);
       titulo.setVerticalAlignment(SwingConstants.CENTER);
       titulo.setFont(new Font ("Georgia", Font.BOLD, 30));
       titulo.setBounds(25, 25, 750, 50);
       paciente.add(titulo);
       
      
       //pestaña producto
       
       JLabel titulo5= new JLabel("Inventario Productos");
       titulo5.setBounds(25, 25, 750, 50);
       titulo5.setBorder(BorderFactory.createLineBorder(Color.black));
       titulo5.setBackground(new Color (156, 255, 117));
       titulo5.setOpaque(true);
       titulo5.setVerticalAlignment(SwingConstants.CENTER);
       titulo5.setFont(new Font ("Georgia", Font.BOLD, 30));
       titulo5.setBounds(25, 25, 750, 50);
       productos.add(titulo5);
       
       
     
        
            getContentPane().add(Panel);
            
            //JFrame
            
                
        this.setExtendedState(MAXIMIZED_BOTH);        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
       // this.setLayout(null);
        this.setVisible(true);
        
        String[] columnas2={"Código","Nombre","Sexo","Edad","Teléfono"};
      
       JTable Pane6 = new JTable(Proyecto1.ConvertirDatosPaciente(), columnas2);
            
       JScrollPane tabla2= new JScrollPane(Pane6);
       
       tabla2.setBounds(25, 80, 750, 570);
       
       paciente.add(tabla2);
       
       
       String[] columnas3={"Código","Nombre","Cantidad","Descripcion","Precio"};
      
       JTable Pane7 = new JTable(Proyecto1.ConvertirDatosProductos(), columnas3);
            
       JScrollPane tabla3= new JScrollPane(Pane7);
       
       tabla3.setBounds(25, 80, 750, 570);
       
       productos.add(tabla3);
        

}
     
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==ventasal){
            this.dispose();
            Login ventana1_login= new Login();
            this.dispose();
        }else if (ae.getSource()== registrovent);
        
        Registro registro2= new Registro();//PENDDIENTE DE BOTON SALIR
        this.dispose();
        
        
    }
    
}




package proyecto1;

/**
 *
 * @author Alexander
 */

//libreria Swing 


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//clase principal JFrame
public class Login extends JFrame implements ActionListener{
    
    /* Lo podemos arriba para que lo podamos usar no solo en un
    constructor privado
    *privado por que solo lo queremos usar para esta ventana
    JPasswordFiel para que sea oculta la contraseña 
    */
    private JTextField usernameUsuario;
    private JPasswordField passwordUsuario;  

    public Login()  {
        
        //Titulo principal
        JLabel hola= new JLabel("BIENVENIDO");
        hola.setFont(new Font ("Georgia",Font.BOLD,13));
        hola.setBounds(200, 10, 100, 30);
        this.add(hola);


        //Cargar la imagen
        ImageIcon doctor = new ImageIcon(getClass().getResource("../imgendoctor/9193824.png"));
        
        // Ajusta el tamaño de la imagen, es decir, redimencionar
        Image imageDemension = doctor.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
        // Crear un nuevo ImageIcon con la imagen ajustada
        ImageIcon adjustedImageIcon = new ImageIcon(imageDemension);
        
        JLabel imageLabel = new JLabel(adjustedImageIcon);
        imageLabel.setBounds(190, 30, 120, 100);
        this.add(imageLabel);

        
        
        
        
        
        
       //Para que el campo de texto tenga un titulo
       
       JLabel usernameEtiqueta= new JLabel("Código:");
       usernameEtiqueta.setBounds(70, 140, 80, 20);
       this.add(usernameEtiqueta);
       
       //Contraseña
       JLabel passwordEtiqueta= new JLabel ("Contraseña:");
       passwordEtiqueta.setBounds(50, 180, 80, 25);
       this.add(passwordEtiqueta);
       
       
       passwordUsuario = new JPasswordField();
       passwordUsuario.setBounds(130, 180, 260, 25);
       this.add(this.passwordUsuario);
      
       
       //Botones (Eventos)
       
       //INICIO
       
       JButton botoninicio= new JButton("Inicio de sesion");
       botoninicio.setBounds(180, 220, 150, 25);
       botoninicio.setForeground(Color.white); //color letra
       botoninicio.setBackground(new Color(75, 20, 107)); //para color de boton
       botoninicio.addActionListener(this);
       this.add(botoninicio);
       
       //Registro
        JButton Bregistro= new JButton("Registrate");
       Bregistro.setBounds(180, 260, 150, 25);
       Bregistro.setForeground(Color.white);
       Bregistro.setBackground(new Color(50, 168, 83)); //para color de boton
       Bregistro.addActionListener(this);
       this.add(Bregistro);
       
       
       
//Campo de texto para usuario
    
      usernameUsuario = new JTextField ();
      usernameUsuario.setBounds(130, 140, 260, 25);
     //Para que se agrege el campo de texto al JFrame
     this.add(usernameUsuario);
     
      //  "VENTANA LOGIN" Se deja abajo por que primero son los componentes
      
      this.setTitle("Bienvenido");
      
      //Para el tamaño de la ventana
      this.setSize(500,350);
      
      //this.setExtendedState(MAXIMIZED_BOTH); Para que la pantalla se maximize al abrir
      
      //Para centrar pantalla (ponerlo debajo de la dimension para que funcione)
      this.setLocationRelativeTo(null);
      
      //Para que la X cierre cierre la ventana y cierre el programa
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      /*pusimos null para que cuando agregemos mas componentes 
      tengamos la libertad de escoger su posicion*/
      this.setLayout(null);
      //set.Visible para mostrar nuestra ventana      
                    this.setVisible(true);
    
   
                   
         }
//eventos boton
    @Override
    public void actionPerformed(ActionEvent EI) {
       if(EI.getActionCommand().equalsIgnoreCase("Inicio de sesion")){
           String nombre = usernameUsuario.getText();
           String contra= new String(passwordUsuario.getPassword());
           System.out.println("Usuario:"+nombre);
           System.out.println("Contraseña:"+contra);
           
           //recordar poner usuario y contraseña del pdf
           if(nombre.equals("admin") && contra.equals("proyecto1IPC1")){
                ModuloAdm ventana2Admi = new ModuloAdm();
               this.dispose();
               }
               else{
                JOptionPane.showMessageDialog(this, "Usuario incorrecto/o contraseña incorrecta.", "Error con el LOGIN", 0);
            }
               
        } else if (EI.getActionCommand().equals("Registrarse")) {
            System.out.println("Aquí debería hacerse el registro");
       
    }
        
} 
        
}   
        
        
        
        
        
   
    
    

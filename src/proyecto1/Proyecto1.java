
package proyecto1;

// Libraries


/**
 *
 * @author Alexander
 */

import com.formdev.flatlaf.FlatLightLaf;
import java.util.ArrayList;
import javax.swing.UIManager;




public class Proyecto1 {
    
    public static ArrayList<Paciente> listpace= new ArrayList<>();
    public static ArrayList<Doctor> listdoc= new ArrayList<>();
    public static ArrayList<Productos> listprodu= new ArrayList<>();
     public static int codigo1=1;
     public static void main(String[] args) {
         
         /**try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
    } catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
       }
**/
         
     

        
       Login ventana1_login= new Login();
       
       //Administrador
       //ModuloAdm ventana2Admi= new ModuloAdm();
       
     }

    
     
     Registro pestregis= new Registro();
             
             
             
     //DOCTOR
        
   public static Object[][] ConvertirDatosDoctor() {

    int filas= listdoc.size();
   
    Object[][] arreglo= new Object [filas][10];
    
    
    
    for(int i=0; i< filas; i++) {
       Doctor temp_doctor= listdoc.get(i);
        
       arreglo[i][0]= temp_doctor.getCodigo();
       arreglo[i][1]= temp_doctor.getNombre();
       arreglo[i][2]= temp_doctor.getApellido(); 
       arreglo[i][3]= temp_doctor.getGenero();
       arreglo[i][4]= temp_doctor.getEdad();
       arreglo[i][5]= temp_doctor.getContraseña();
       arreglo[i][6]= temp_doctor.getEspecialidad();
       arreglo[i][7]= temp_doctor.getTelefono();
       
    }
    return arreglo;
    
   }


        
    
//PACIENTE
 public static Object[][] ConvertirDatosPaciente() {

    int filas= listpace.size();
   
    Object[][] arreglo= new Object [filas][6];
    
    
    
    for(int i=0; i< filas; i++) {
       Paciente pace= listpace.get(i);
        
       arreglo[i][0]= pace.getCodigo();
       arreglo[i][1]= pace.getNombre();  
       arreglo[i][2]= pace.getSexo();
       arreglo[i][3]= pace.getEdad();
       arreglo[i][4]= pace.getTelefono();
       
    }
     return arreglo;

}
    

 
 //PRODUCTOS
 public static Object[][] ConvertirDatosProductos() {

    int filas= listprodu.size();
   
    Object[][] arreglo2= new Object [filas][6];
    
    
    
    for(int i=0; i< filas; i++) {
       Productos produc= listprodu.get(i);
        
       arreglo2[i][0]= produc.getCodigo();
       arreglo2[i][1]= produc.getNombre();  
       arreglo2[i][2]= produc.getCantidad();
       arreglo2[i][3]= produc.getDescripcion();
       arreglo2[i][4]= produc.getPrecio();
       
    }
     return arreglo2;

 
        
    }
 public static void agregarDoctor( int Codigo, String Nombre, String Apellido, String Genero, int Edad, String Contraseña, String Especialidad, String Telefono){
        
listdoc.add(new Doctor(Codigo, Nombre, Apellido, Contraseña, Genero, Edad, Especialidad, Telefono));
        
    }
}       
    


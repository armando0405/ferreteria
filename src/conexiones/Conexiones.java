package conexiones;
import  java.sql.Connection;
import  java.sql.DriverManager;
import  java.sql.SQLException;

public class Conexiones {
        private static final String  base = "Produccion";
        private static final String  url = "jdbc:mysql://localhost:3306/"+base;
        private static final String  user = "root";
        private static final String  pass = "";
        
        public static  Connection conectar(){
            Connection conexion = null;
            try {
                conexion = DriverManager.getConnection(url,user,pass);
            } catch (Exception e) {
                System.out.println("ERROR: en la conexion " + e);
            }
            return  conexion;
        }
        
        public static void main(String[] args) {
            Conexiones test =  new Conexiones();
            if (test != null){
                System.out.println("coneccion realizada correctamente");
            }else {
                System.out.println("error en la conexion");
            }
    }
}

import java.sql.Driver;
import java.sql.DriverAction;

public class Table {

    static String driverJDBC = "org.gjt.mm.mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/clinica";
    static String username = "root";
    static String password = "root";
    try{
        System.out.println("Carregnado drive");
        Class.forName(DriverJDBC);
        System.out.println("Driver Carregado");

    }catch(Exception e){
        System.out.println("Falha na conexão");
    }






}

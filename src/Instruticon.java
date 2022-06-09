import java.sql.*;

public class Instruticon {
    static String driverJDBC = "org.gjt.mm.mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/clinica";
    static String username = "root";
    static String password = "root";
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet result = null;
    String instrucaoSQL = "Select * from alunos";
    try{
        Class.forName(Driver.JDBC);
        conexao = DriverManager.getConnection(url,username,password);
        System.out.println("Consultando os dados");
        st = conexao.createStatement();
        result = st.executeQuery(instrucaoSQL);
        while (result.next()){
            System.out.println("---------------------");
            System.out.println("Matricula ...." + result.getInt(1));
            System.out.println("---------------------");
            System.out.println("Nome ...." + result.getString(2));
            System.out.println("---------------------");
            System.out.println("Email ...." + result.getString(3));
            System.out.println("---------------------");
            System.out.println("Idade ...." + result.getInt(4));

        }
        result.close();
        st.close();
        conexao.close();
        catch(Exception e){
            System.out.println("Erro");
            e.pritnStackTrace();

        }


    }
}

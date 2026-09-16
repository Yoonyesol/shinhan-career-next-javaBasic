package javaEX;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {

    public static Connection getDBConnecton(){
        String url = "jdbc:oracle:thin:@localhost:1521/XE";
        String username = "SYSTEM";
        String password = "qwer123";

        try {
            Connection conn =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println("DB 연결 성공!");
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        getDBConnecton();
    }
}
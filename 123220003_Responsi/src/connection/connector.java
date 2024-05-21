package connection;

import com.mysql.cj.jdbc.*;
import java.sql.Connection;
import java.sql.SQLException;

public class connector {
    static Connection con; // connection
    
    public static Connection con() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_responsi");
            data.setUser("root");
            data.setPassword("");
            
            try {
                con = data.getConnection();
                System.out.println("Koneksi Berhasil");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("Koneksi Gagal");
            }
        }
        return con;
    }
}

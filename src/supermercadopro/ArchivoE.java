package supermercadopro;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

/**
 *
 * @author Juan Pablo
 */
public class ArchivoE {
    public static void main(String [] args)throws SQLException{
        String archivo = "jdbc:h2:./baseDeDatos";
        
        ConnectionSource conexion = new JdbcConnectionSource(archivo);
        
        TableUtils.createTableIfNotExists(conexion, Empleado.class);
    }
}

package modelo.Package;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBGenerator {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:mi_base_de_datos.db"; // Cambia esta URL según tu base de datos
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos");

                // Crea una tabla en la base de datos
                String createTableSQL = "CREATE TABLE cafes (id INTEGER PRIMARY KEY, nombre TEXT, tamaño TEXT, informacion TEXT);";
                try (Statement statement = conn.createStatement()) {
                    statement.execute(createTableSQL);
                    System.out.println("Tabla 'cafes' creada con éxito");
                } catch (SQLException e) {
                    System.err.println("Error al crear la tabla: " + e.getMessage());
                }

                // Agrega registros a la tabla
                String insertRecordSQL = "INSERT INTO cafes (nombre, tamaño, informacion) VALUES ('Cafe1', 'Grande', 'Información Café 1');";
                try (Statement statement = conn.createStatement()) {
                    statement.execute(insertRecordSQL);
                    System.out.println("Registro insertado con éxito");
                } catch (SQLException e) {
                    System.err.println("Error al insertar registro: " + e.getMessage());
                }
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos: " + e.getMessage());
        }
    }
}
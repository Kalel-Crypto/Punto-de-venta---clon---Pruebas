package Tests;
import  mx.puntodeventa.dao.UsuarioDAO;
import org.junit.jupiter.api.Test;

public class Pruebas_De_Ingenieria {
        @Test
        public void TestLogin() throws Exception {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.login("juan", "123");
        }
}

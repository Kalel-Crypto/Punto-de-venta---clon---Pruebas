package Tests;
import mx.puntodeventa.dao.ProductoDAO;
import  mx.puntodeventa.dao.UsuarioDAO;
import mx.puntodeventa.entity.Proveedor;
import org.junit.jupiter.api.Test;

public class PruebasDeIngenieriaTest {
        @Test
        public void TestLogin() throws Exception {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.login("juan", "123");
        }
        /*
        @Test
        public void TestInsertarProducto() throws Exception {
            Producto p = new Producto();
            ProveedorDAO proveedorDAO = new ProveedorDAO();
            List<Proveedor> proveedores =  new ArrayList<>();
            proveedores = proveedorDAO.listar();
            p.setNombre("Juan");
            p.setId(32);
            p.setPrecio(12.50);
            p.setProveedor(proveedores.get(0));
        }
         */
        @Test
        public void TestInsertarProveedor() throws Exception {
            Proveedor p = new Proveedor();
            p.setNombre("Juan");
            p.setId(32);
            p.setMarca("pedrito");
            p.setContacto("686123912309123");
        }
        @Test
        public void TestListarProductos() throws Exception {
            ProductoDAO productoDAO = new ProductoDAO();
            productoDAO.listar();
        }
}

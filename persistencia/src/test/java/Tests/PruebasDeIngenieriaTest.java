package Tests;
import mx.puntodeventa.dao.ProductoDAO;
import mx.puntodeventa.dao.ProveedorDAO;
import  mx.puntodeventa.dao.UsuarioDAO;
import mx.puntodeventa.entity.Producto;
import mx.puntodeventa.entity.Proveedor;
import mx.puntodeventa.entity.Rol;
import mx.puntodeventa.entity.Usuario;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PruebasDeIngenieriaTest {
        @Test
        public void TestLogin() throws Exception {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.login("juan", "123");
        }
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
        @Test
        public void TestEliminarProducto() throws Exception {
            ProductoDAO productoDAO = new ProductoDAO();
            productoDAO.eliminar(32);
        }

        @Test
        public void TestRegistrarUsuario () throws Exception {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = new Usuario();
            usuario.setId(4);
            usuario.setRol(Rol.ADMINISTRADOR);
            usuario.setNombre("lolopillo");
            usuario.setPassword("123");
        }
        @Test
        public void TestModificarUsuario () throws Exception {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = new Usuario();
            usuario.setId(4);
            usuario.setRol(Rol.ADMINISTRADOR);
            usuario.setNombre("lolopija");
            usuario.setPassword("5");
            usuarioDAO.actualizar(usuario);
        }
        @Test
        public void TestEliminarUsuario () throws Exception {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.eliminar(4);
        }
}

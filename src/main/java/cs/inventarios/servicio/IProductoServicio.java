package cs.inventarios.servicio;

import cs.inventarios.modelo.Producto;
import java.util.List;

public interface IProductoServicio {
    List<Producto> listarProductos();
    Producto buscarProductoPorId(Integer idProducto);
    Producto guardarProducto(Producto producto);
    void eliminarProductoPorId(Integer idProducto);
}

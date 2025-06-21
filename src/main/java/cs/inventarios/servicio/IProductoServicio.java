package cs.inventarios.servicio;

import cs.inventarios.modelo.Producto;
import java.util.List;

public interface IProductoServicio {
    List<Producto> listarProductos();
    Producto buscarProductoPorId(Integer idProducto);
    void guardarProdcuto(Producto producto);
    void eliminarProductoPorId(Integer idProducto);
}

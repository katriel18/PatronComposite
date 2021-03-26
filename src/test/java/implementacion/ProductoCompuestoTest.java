package implementacion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoCompuestoTest {

    ProductoCompuesto productoCompuesto;

    @Before
    public void init(){
        productoCompuesto = new ProductoCompuesto();

    }

    @Test
    public void addProductoCompuestoTest(){
        productoCompuesto.addProducto(new ProductoUnitario(10,10.5,"Arroz","Abarrote"));
        productoCompuesto.addProducto(new ProductoUnitario(10,10.5,"Papa","Tuberculo"));

        ProductoCompuesto productoCompuesto1 = new ProductoCompuesto();
        productoCompuesto1.addProducto(productoCompuesto);

        assertNotNull(productoCompuesto1.getProductos());
        assertEquals(productoCompuesto,productoCompuesto1.getProductos().get(0));
        assertEquals(2,((ProductoCompuesto)productoCompuesto1.getProductos().get(0))
                .getProductos().size());
        assertEquals(productoCompuesto.getProductos().get(0),((ProductoCompuesto)productoCompuesto1.getProductos().get(0))
                .getProductos().get(0));

        System.out.println(productoCompuesto.getProductos());
        System.out.println(((ProductoCompuesto)productoCompuesto1.getProductos().get(0)).getProductos());

    }
}

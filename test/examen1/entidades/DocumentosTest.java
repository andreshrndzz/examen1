package examen1.entidades;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class DocumentosTest {

    @Test
    public void contadoAplicaImpuestoYDescuento() {

        Documento doc = new FacturaContado("FC-001", 10000);

        double total = doc.calcularTotal();

        assertEquals(10735.00, total, 0.01);
    }

    @Test
    public void notaCreditoDevuelveTotalNegativo() {

        Documento doc = new NotaCredito("NC-003", 10000);

        double total = doc.calcularTotal();

        assertEquals(-11300.00, total, 0.01);
    }
}

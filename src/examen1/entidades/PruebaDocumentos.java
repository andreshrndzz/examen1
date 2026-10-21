package examen1.entidades;

public class PruebaDocumentos {

    public static void main(String[] args) {

        Documento[] documentos = new Documento[3];
        documentos[0] = new FacturaContado("FC-001", 10000);
        documentos[1] = new FacturaContado("FCR-002", 10000);
        documentos[2] = new FacturaContado("NC-003", 10000);

        double cierre = 0;

        for (Documento doc : documentos) {
            double total = doc.calcularTotal();
            System.out.println(doc.getClass().getSimpleName() + ": " + total);
            cierre += total;
        }

        System.out.println("Cierre: " + cierre);

    }

}

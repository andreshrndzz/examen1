package examen1.colecciones;

public class DocumentoIndice implements Comparable<DocumentoIndice> {

    private String codigo;
    private double total;

    public DocumentoIndice(String codigo, double total) {
        this.codigo = codigo;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public int compareTo(DocumentoIndice otro) {
        return this.codigo.compareTo(otro.codigo);
    }
}

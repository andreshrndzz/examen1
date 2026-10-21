package examen1.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PruebaIndice {

    public static void main(String[] args) {
        List<DocumentoIndice> docs = new ArrayList<>();
        docs.add(new DocumentoIndice("FC-1007", 48500));
        docs.add(new DocumentoIndice("FCR-1003", 126000));
        docs.add(new DocumentoIndice("NC-1001", 18750));
        docs.add(new DocumentoIndice("FC-1002", 215300));

        Collections.sort(docs);
        imprimir("Orden natural", docs);

        DocumentoIndice c1007 = new DocumentoIndice("FC-1007", 0);
        System.out.println("binarySearch FC-1007 = " + Collections.binarySearch(docs, c1007));

        DocumentoIndice c1005 = new DocumentoIndice("FC-1005", 31200);
        int busqueda1005 = Collections.binarySearch(docs, c1005);
        System.out.println("binarySearch FC-1005 = " + busqueda1005);

        int posInsercion = -(busqueda1005 + 1);
        System.out.println("Posicion de insercion = " + posInsercion);

        docs.add(posInsercion, c1005);
        imprimir("Con la insercion", docs);

        // Comentario: Al ordenar previamente por el total, se alteró el ordenamiento por código.
        // Por lo tanto, se debe ejecutar Collections.sort(docs) antes de aplicar el binarySearch,
        // asegurando así que la lista recupere el orden requerido por el algoritmo de búsqueda.
        Collections.sort(docs, Comparator.comparingDouble(DocumentoIndice::getTotal).reversed());
        imprimir("Por total descendente", docs);
    }

    private static void imprimir(String prefijo, List<DocumentoIndice> lista) {
        System.out.print(prefijo + ": ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getCodigo() + (i < lista.size() - 1 ? ", " : ""));
        }
        System.out.println();
    }
}

package examen1.estructuras;

public class HistorialDocumento {

    private NodoEstado cabeza;

    public void registrar(String estado) {
        NodoEstado nuevo = new NodoEstado(estado);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoEstado actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public int contar() {
        int total = 0;
        NodoEstado actual = cabeza;
        while (actual != null) {
            total++;
            actual = actual.getSiguiente();
        }
        return total;
    }

    public String getEstadoActual() {
        if (cabeza == null) {
            return "SIN ESTADO";
        }
        NodoEstado actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual.getEstado();
    }

    public String eliminarPrimero() {
        if (cabeza == null) {
            return null;
        }
        String retirado = cabeza.getEstado();
        cabeza = cabeza.getSiguiente();
        return retirado;
    }
}

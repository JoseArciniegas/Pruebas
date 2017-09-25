//cola

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author utp
 */
public class Cola {

    Nodo inicio;
    Nodo fina;

    public Cola() {
        inicio = null;
        fina = null;
    }

    public void Insertar(Nodo dato) {
        if (inicio == null) {
            inicio = fina = dato;
        } else {
            dato.setSiguiente(fina);
            fina = dato;
        }
    }
    
    public int Buscar(int dato){
        int aux;
        if(inicio == null){
            aux = dato;
        }else{
            return 0;
        }
        return aux;
    }

    public Nodo Borrar() {
        if (inicio == null) {
            return null;
        } else {
            Nodo aux = fina;
            while (aux.getSiguiente() != inicio && aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            if (inicio == fina) {
                inicio = fina = null;
                return aux;
            } else {
                inicio = aux;
                aux = aux.getSiguiente();
                inicio.setSiguiente(null);
                return aux;
            }
        }
    }

}
//nodo
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author utp
 */
public class Nodo {

    private Nodo siguiente;
    private Nodo dato;
    private Nodo caja;

    Nodo() {
        siguiente = null;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the dato
     */
    public Nodo getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Nodo dato) {
        this.dato = dato;
    }

    /**
     * @return the caja
     */
    public Nodo getCaja() {
        return caja;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja(Nodo caja) {
        this.caja = caja;
    }

    private static class tiempo {

        public tiempo() {
        }
    }
}
//caja
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author utp
 */
public class Caja {

    private int caja1;
    private int caja2;
    private int caja3;
    private int tiempoP = 0;
    private int tiempoE = 0;
    private int tiempoN = 0;

    public void Caja() {
    }

    public void Tiempo() {
        //calcular tiempo en caja.

    }

    public void IngresaCliente() {
    }

    public void ClienteAtendido() {
    }

}

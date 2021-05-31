/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobrauliocalix;
import java.util.ArrayList;
/**
 *
 * @author Braulio
 */

public class Nodo {
    int nombre=0, Vx=0,Vy=0;
    ArrayList <Nodo> conexiones= new ArrayList();
    boolean visitado=false;
    int grado;
    public Nodo(int Nombre,int valorx,int valory) {
        this.nombre=Nombre;
        this.Vx=valorx;
        this.Vy=valory;
        grado=0;
    }

    public Nodo() {
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getVx() {
        return Vx;
    }

    public void setVx(int Vx) {
        this.Vx = Vx;
    }

    public int getVy() {
        return Vy;
    }

    public void setVy(int Vy) {
        this.Vy = Vy;
    }

    public ArrayList<Nodo> getConexiones() {
        return conexiones;
    }

    public void setConexiones(ArrayList<Nodo> conexiones) {
        this.conexiones = conexiones;
    }

    

    public boolean GetVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    @Override
    public String toString() {
        return "Nodo{" + "nombre=" + nombre + ", Vx=" + Vx + ", Vy=" + Vy + ", conexiones=" + conexiones + ", visitado=" + visitado + ", grado=" + grado + '}';
    }

    

    
    
    
}

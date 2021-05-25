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
    ArrayList <Nodo> conexiones= new ArrayList<Nodo>();
    boolean visitado=false;
    ArrayList pesos= new ArrayList();
    public Nodo(int Nombre,int valorx,int valory) {
        this.nombre=Nombre;
        this.Vx=valorx;
        this.Vy=valory;
    }

    public Nodo() {
    }

    public ArrayList getPesos() {
        return pesos;
    }

    public void setPesos(ArrayList pesos) {
        this.pesos = pesos;
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

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    
    
    
}

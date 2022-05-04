package Examen;

public class Coche implements Comparable<Coche> {

    int matricula;
    int año;
    int precio;
    String modelo;

    Coche(String modelo, int marticula, int año, int precio) {

        this.modelo = modelo;
        this.matricula = marticula;
        this.año = año;
        this.precio = precio;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nmodelo = " + getModelo() +
                "| matricula = " + getMatricula() +
                "| año = " + getAño() +
                "| precio = " + getPrecio();
    }

    @Override
    public int compareTo(Coche o) {
        return this.matricula - o.matricula;
    }

}

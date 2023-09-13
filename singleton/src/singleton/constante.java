package singleton;
public class Constante {

    private static constante Instancia;

    private String nombreConstante;
    private double valorConstante;
    //Constructor
    private Constante () {
        nombreConstante = "N/A";
        valorConstante = 0;
    }
//Metodo de acceso unico a crear la instancia
public static Constante getInstance(){
    if(Instancia == null){
        Instancia = new Constante();
        System.out.printIn("Instancia creada por primera y unica vez");
    }
    return Instancia;
}
@Override
public String toString() {
    return "Constante [nombreConstante=" + nombreConstante + ", valorConstante=" + valorConstante + "]";

}

public void setDatos(String name, double value){
    this.nombreConstante = name;
    this.valorConstante = value;
}
}




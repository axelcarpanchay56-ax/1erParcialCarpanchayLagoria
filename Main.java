public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pedrito", 250.000, 45 );
        Empleado empleado2 = new Empleado("Alonso", 5000000, 3);



        empleado1.calcularSueldoFinal();
        empleado2.calcularSueldoFinal();

        empleado1.aplicarAumento(8);
        empleado2.aplicarAumento(15);

        empleado1.mostrarDatos();
        empleado2.mostrarDatos(); 
    }

}

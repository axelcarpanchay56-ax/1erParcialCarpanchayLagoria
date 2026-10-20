public class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antiguedad;

    public Empleado(String nombre, double sueldoBasico, int antiguedad){
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;

        if(sueldoBasico < 0){
            this.sueldoBasico = 0;
        } else {
            this.sueldoBasico = sueldoBasico;
        }
        if(antiguedad < 0){
            this.antiguedad = 0;
        } else {
            this.antiguedad = antiguedad;
        }
    }

    public double calcularSueldoFinal() {
        return sueldoBasico + (sueldoBasico * 0.02* antiguedad);
    }

    public void aplicarAumento(double porcentaje){
        if (porcentaje > 0) {
            sueldoBasico = sueldoBasico + (sueldoBasico * porcentaje)/ 100;
        } else {
            System.out.println("No puede ingresar valores menores a 0");
        }
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("sueldoBasico: " + sueldoBasico);
        System.out.println("Antiguedad: " + antiguedad);
    }

}


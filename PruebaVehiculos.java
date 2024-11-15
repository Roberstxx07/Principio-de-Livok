public class PruebaVehiculos {
    public static void probarVehiculo(Vehiculo vehiculo) {
        vehiculo.mover();
        vehiculo.calcularAutonomia();
    }

    public static void main(String[] args) {
        Vehiculo coche = new Coche(10, 500);
        Vehiculo camion = new Camion(20, 400);
        Vehiculo bicicleta = new Bicicleta();

        System.out.println("Probando Coche:");
        probarVehiculo(coche);

        System.out.println("\nProbando Camion:");
        probarVehiculo(camion);

        System.out.println("\nProbando Bicicleta:");
        probarVehiculo(bicicleta);
    }
}

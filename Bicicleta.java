// Clase Bicicleta que hereda de Vehiculo
class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta se mueve.");
    }

    @Override
    public void calcularAutonomia() {
        System.out.println("La bicicleta no usa combustible. ¡Autonomía ilimitada!");
    }
}

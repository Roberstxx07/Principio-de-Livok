// Clase Coche que hereda de Vehiculo
class Coche extends Vehiculo {
    protected double combustible; // Cambiado a protected
    protected double autonomiaMax; // Cambiado a protected
    protected double kilometrosRecorridos; // Cambiado a protected

    public Coche(double combustible, double autonomiaMax) {
        this.combustible = combustible;
        this.autonomiaMax = autonomiaMax;
        this.kilometrosRecorridos = 0;
    }

    @Override
    public void mover() {
        if (combustible > 0) {
            System.out.println("El coche se mueve.");
            combustible -= 1; // Consume 1 unidad de combustible
            kilometrosRecorridos += 1;
        } else {
            System.out.println("El coche no puede moverse: sin combustible.");
        }
    }

    @Override
    public void calcularAutonomia() {
        double autonomiaRestante = combustible * (autonomiaMax / 100);
        System.out.println("Autonomía restante del coche: " + autonomiaRestante + " km.");
    }
}

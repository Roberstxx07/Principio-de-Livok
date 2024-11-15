// Clase Camion que hereda de Coche
class Camion extends Coche {
    public Camion(double combustible, double autonomiaMax) {
        super(combustible, autonomiaMax);
    }

    @Override
    public void mover() {
        if (combustible > 0) {
            System.out.println("El camión se mueve.");
            combustible -= 2; // Consume 2 unidades de combustible por km
            kilometrosRecorridos += 1;
        } else {
            System.out.println("El camión no puede moverse: sin combustible.");
        }
    }
}

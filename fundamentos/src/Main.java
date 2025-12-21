//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Vehiculo vehiculo1 = new Vehiculo("4050 ABJ",
            "VM",
            "GTI",
            "Blanco",
            100.0,
            true);

    System.out.println(vehiculo1.getTarifa());
    System.out.println(vehiculo1.getAtributos());
}

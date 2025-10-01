package repositorio_mjaller.unidad2_poo.taller10;

public class Perro extends Animal {
    private String raza;

    public Perro(String especie, String raza) {
        super(especie);
        this.raza = raza;
    }
    public String getRaza() {
        return this.raza;
    }

    public void sonidos() {
        super.sonido();
        System.out.println("\nEl " + getEspecie() + " de raza " + getRaza() + " ladra.");
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Gato");
        animal1.sonido();

        Perro perro1 = new Perro("Perro", "Labrador");
        perro1.sonido();
    }

    //No usar @Override es una mala practica porque si puede sobreescribir pero si se escribe mal el metodo no se detecta el error
    //En un contexto real es mejor usar @Override para darnos cuenta de lo que colocamos mal, ejemplo en este caso colocamos sonidos en vez de sonido
    //El metodo sonidos no genera error pero no sobreescribe el metodo de la clase padre y el programa funciona mal
}

package repositorio_mjaller.unidad2_poo.taller9;

public class PruebaSuper {
    private String color;

    public PruebaSuper(String especie,String color) {
        super(especie);
        this.color = color;
    }

    //Si no es una clase hija no se puede usar super ya que no encontrara la clase de la que se deriva
    //Solucion: Hacer que la clase PruebaSuper herede el atributo 'especie' de Animal

}

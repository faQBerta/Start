package energizapp.entidades;

public class Cliente {

    private int id, edad;
    private String nombre, objetivo;
    private double altura, peso;

    public Cliente() {
    }

    public Cliente(int id, int edad, String nombre, String objetivo, double altura, double peso) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { //SOLO SE ASIGNA VALOR AL ID SI EL ENTERO ES DE 7 DIGITOS
        if (String.valueOf(id).length() == 7) {
            this.id = id;
        } else {
            System.out.print("Valor incorrecto. No se guardo un valor.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) { //SOLO SE ASIGNA VALOR AL EDAD SI EL ENTERO ES MAYOR A 18
        if (edad > 18) {
            this.edad = edad;
        } else {
            System.out.print("Menor de edad. No se guardo un valor.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", objetivo=" + objetivo + ", altura=" + altura + ", peso=" + peso + '}';
    }

}

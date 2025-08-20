package ar.edu.unahur.obj2.wtoj.contenido;
//Singleton
public class IDRA {
    // 2- Creamos una única instancia de singleton.
    private static IDRA instance = new IDRA();
    private Double valor = 0.5;

    // 1- Ocultar Constructor, se edita de publico al privado.
    private IDRA() {
    }

    // 3- Definimos el getter como instancia.
    public static IDRA getInstance() {
        return instance;
    }

    // 4- Agregamos los getters y seters de los valores necesarios.
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}

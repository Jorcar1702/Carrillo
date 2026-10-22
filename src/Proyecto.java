public class Proyecto {
    private int Codigo;
    private String nombre;
    private String tipoProyecto;
    private float costoEstimado;
    private int prioridad;


    public Proyecto(){


    }
    public Proyecto(int codigo, String nombre, String tipoProyecto, float costoEstimado, int prioridad) {
        Codigo = codigo;
        this.nombre = nombre;
        this.tipoProyecto = tipoProyecto;
        this.costoEstimado = costoEstimado;
        this.prioridad = prioridad;
    }

    public int getCodigo() {

        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProyecto() {
        return tipoProyecto;
    }

    public void setTipoProyecto(String tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public float getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(float costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "Codigo=" + Codigo +
                " |nombre= " + nombre  + " | tipoProyecto: '" + tipoProyecto  +
                "| costoEstimado: " + costoEstimado +
                "| prioridad: " + prioridad +
                '}';
    }
}

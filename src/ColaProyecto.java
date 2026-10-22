import java.util.PriorityQueue;

public class ColaProyecto {
    private PriorityQueue<Proyecto> proyectos;

    public ColaProyecto(){
        proyectos = new PriorityQueue<Proyecto>((p1,p2)->Integer.compare(p2.getPrioridad(),
                p1.getPrioridad()));

    }

    public void encolar(Proyecto proyecto){
        proyectos.offer(proyecto);
    }

    public String mostrar(){
        String texto ="";
        PriorityQueue<Proyecto> copia = new PriorityQueue<>(proyectos);

        while (!copia.isEmpty()){
            texto+= copia.poll().toString()+"\n";
        }
        return texto;
    }
    //public boolean existecodigo(String cola){
        //for(Proyecto a: proyectos){
            //if(a.getCodigo(cola)){
                //return true;
            //}
        //}
        //return false;
    //}

}

package  logica;
import java.util.ArrayList;
import java.util.Collections;
public class GestionNotas {
    ArrayList<Double> notas;
    public GestionNotas (){
        //objeto de la clase
        notas= new ArrayList<>();
    }
    public void GuardarNota(double n){
        notas.add(n);
    }
    public double media(){
        double media = 0;
        for(double d:notas){
            media+=d;
        }
        return media/notas.size();
    }
    public int aprobados(){
        int ap = 0;
        for(double d:notas){
            if(d>=ap){
                ap++;
            }
        }

        return ap;
    }
    public Double NumMaximo(){
        return Collections.max(notas);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package metodosimplex;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Problema {
   Tabla proceso;
   boolean  accionMax; 
   ArrayList<Restriccion> restricciones = new ArrayList<Restriccion>();

   public Problema(boolean max){
       accionMax=max;
   }

    public void nuevaRestriccion(String subindicesn,String desigualdadn,String valorObjn){
        try{
        restricciones.add(new Restriccion(subindicesn, desigualdadn, valorObjn,0));
        }catch(Exception ex){System.out.println("Problema en la restriccion "+restricciones.size());}
        }

    public void setFuncionObjetivo(double[] funcObj){
         for(int i=0;i<funcObj.length;i++){
             try{
            funcObj[i] = funcObj[i] * -1;
             }catch(Exception ex){
             System.out.println("Error en Problema.setFuncionObjetivo");
             }
         }
        restricciones.add(new Restriccion(funcObj, 0, 0, 1));
    }


    public void preparar(){
        proceso=new Tabla(this);
        proceso.imprimirTabla("FASE DE PREPARACION");
    }

    public void resolverMetodoSimplex(List lista) {
        proceso.resolverMetodoSimplex(accionMax);
        //mensaje("numero de resultados . "+proceso.resultado.length);
        for(int i=0;i<proceso.resultado.length;i++){
                lista.add(" x"+(i+1)+" = "+proceso.resultado[i]);
        }
        lista.add(" z = "+proceso.z);
    }

    public void borrarTodo(){
     restricciones.clear();
     mensaje("Se ha borrado el problema");
    }

    public void imprimirTodo(){
          System.out.println("Funcion objetivo");
             System.out.println("Restricciones");
        for (int i=0;i<restricciones.size();i++){
            System.out.println("    restriccion "+(i+1));
            System.out.println("  subindices");
            for(int j=0;j<restricciones.get(i).subindices.length;j++){
              System.out.print(restricciones.get(i).subindices[j]+"  ,  ");
            }
            System.out.println("    desigualdad");
            System.out.println(restricciones.get(i).desigualdad);
            System.out.println("    valor");
            System.out.println(restricciones.get(i).solucion);
        }


    }

    private void mensaje(String msm){
        System.out.println("MÉTODO SIMPLEX " + msm);
        System.out.println("");
    }


}
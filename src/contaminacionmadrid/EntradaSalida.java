/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contaminacionmadrid;

import java.util.ArrayList;

/**
 *
 * @author luis
 */
class EntradaSalida {

    static void mostrarDatos(ArrayList<Contaminante> lista) {
        System.out.println("ESTACIÓN\tMAGNITUD\tFECHA\t"+generarHoras());
        for (int i=0; i<lista.size(); i++)
        {
           Contaminante c= lista.get(i);
           int estacion=c.getEstacion();
           int magnitud=c.getMagnitud();
           String fecha=c.getFecha();
           ArrayList<String> datos=c.getDatos_contaminacion();
            System.out.println(estacion+"\t\t"+magnitud+"\t\t"+fecha+"\t"+imprimirDatos(datos));
        }
    }

    private static String imprimirDatos(ArrayList<String> datos) {
       //String aux="12\t15\t8....";
       String aux="";
       for (int i=0; i<datos.size(); i++)
       {
           aux=aux+datos.get(i)+"\t";
       }
       return aux;
    }

    private static String generarHoras() {
        String aux="";
        //String aux="00:00-1:00\t1:00-2:00\t";
       for (int i=0; i<23; i++)
       {
           
           aux+=ponerDigito(i)+":00-"+ponerDigito(i+1)+":00\t";
       }
           return aux;
    
    
}

    private static String ponerDigito(int i) {
      if (i<10)
      {
          return "0"+i;
      }
      return i+"";
    
    }
}
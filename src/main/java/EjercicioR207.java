import java.util.ArrayList;

class EjercicioR207
{
    public String devolverEnOrden(ArrayList<String> palabras)
    {
        ArrayList<String> coleccion = (ArrayList<String>) palabras.clone();
        int posicionMasLetras = 0;
        String devolver = "";
        if (coleccion.size() > 0)
        {
            while(coleccion.size() > 0)
            {    
                String palabraMasLetras = coleccion.get(0);
                int posicion = 0; 
                while(posicion < coleccion.size()){                
                    if(coleccion.get(posicion).length() >= palabraMasLetras.length()){
                        palabraMasLetras = coleccion.get(posicion);
                        posicionMasLetras = posicion;
                    }
                    posicion++;
                }              
                devolver += palabraMasLetras +",";                
                coleccion.remove(posicionMasLetras);
            }
            devolver = devolver.substring(0,devolver.length()-1);
        }        
        return devolver;
    }
}
 
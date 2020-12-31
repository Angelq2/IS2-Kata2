package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 * Dado un array que se rellenará de valores enteros
 * realizar una aplicación de consola para el cálculo
 * del histograma, es decir la frecuencia de cada valor
 * en ese array.
 * 
 * @author angel
 */
public class main {

    public static void main(String[] args) {
        Integer[] data = {1,2,3,4,5,1,2,3,4,4,5,6,14,16,40};
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
            
    }
    
}

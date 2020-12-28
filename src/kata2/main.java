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
        int [] data = {1,2,3,4,5,1,2,3,4,4,5,6,14,16,40};
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i],1);
            }
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
            
    }
    
}

package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author angel
 */
public class Histogram {

    private final int[] data;
    
    public Histogram(int[] data){
        this.data = data;
    }
    
    public int[] get(){
        return data;
    }
    
    public Map getHistogram(){
        
        Map<Integer,Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i : data) {
            histogram.put(i, 
                           histogram.containsKey(i) ? histogram.get(i)+1 : 1); //OPERADOR CONDICIONAL TERNARIO
        }
        return histogram;
    }
}

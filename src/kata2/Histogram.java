package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author angel
 */
public class Histogram<T> {

    private final T[] data;
    
    public Histogram(T[] data){
        this.data = data;
    }
    
    public T[] get(){
        return data;
    }
    
    public Map getHistogram(){
        
        Map<T,Integer> histogram = new HashMap<T, Integer>();
        
        for (T i : data) {
            histogram.put(i, 
                           histogram.containsKey(i) ? histogram.get(i)+1 : 1); //OPERADOR CONDICIONAL TERNARIO
        }
        return histogram;
    }
}

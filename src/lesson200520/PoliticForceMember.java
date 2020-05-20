package lesson200520;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PoliticForceMember implements Comparable<PoliticForceMember>{
    String name;
    Map<LocalDate,Integer> dohid=new HashMap<>();


    int writeDohod(LocalDate data,int totalDohod){
         return  dohid.put(data,totalDohod);
    }

    @Override
    public int compareTo(PoliticForceMember o) {
        return name.compareTo(o.name);
    }

    int  dohodForPeriod(LocalDate end){
        final int[] sum={0};
        dohid.keySet().stream().filter(w->w.isBefore(end)).
                forEach(r->{
                    sum[0]=sum[0]+dohid.get(r);
                });
    return sum[0];
    }
}

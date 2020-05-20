package lesson200520;

import java.util.Set;
import java.util.TreeSet;

public class PoliticForce {
    String name;
    Set<PoliticForceMember>  spisok=new TreeSet<>();

         boolean addMember(PoliticForceMember mem){
             boolean result=false;
             result=spisok.add(mem);
             return result;
         }
         boolean removeMember(String name){
              return spisok.removeIf(w->w.name.equals(name))
         }

}

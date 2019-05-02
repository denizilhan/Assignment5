import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise3 {

    public static String ex3(String p1, String p2) {
        if (p2 == null)
            return p1;
        if (p1 == p2)
            return null;

        String returnValue = "";

        Set setp1 =new HashSet();
        for (int k=0; k<p1.length();k++){
            setp1.add(p1.charAt(k));
        }



        Set setp2 =new HashSet();
        for (int j=0;j<p2.length();j++){
            setp2.add(p2.charAt(j));
        }

        setp1.removeAll(setp2);

        Iterator iterator = setp1.iterator();

        while (iterator.hasNext()){
            returnValue+= iterator.next();
        }

        return returnValue;
    }
}
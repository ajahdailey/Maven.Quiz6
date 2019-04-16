package rocks.zipcode.io.collections;

import com.sun.corba.se.spi.ior.MakeImmutable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
   public Set<Set<TypeOfSet>> permute() {
      List<TypeOfSet> A = new ArrayList<>(originalSet);

     Double N = Math.pow(2, A.size());

     Set<Set<TypeOfSet>> result = new HashSet<>();
       for (int i = 0; i < N; i++) {
         Set<TypeOfSet>  set = new HashSet<>();
           for (int j = 0; j < A.size(); j++) {
               if((i & (1<< j)) != 0)
                   set.add(A.get(j));

           }
   result.add(set);

       }
    return result;







    }


    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}

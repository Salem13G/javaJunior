package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils{
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList <Integer> result = new ArrayList<>();
        for (Integer num:a){
            if (!b.contains(num)){ //если б не содержит такое-то число
                result.add(num);


            }
        }
        for (Integer num:b){
            if (!a.contains(num)){ //если a не содержит такое-то число
                result.add(num);


            }
        }
        return result;
    }
}

package cad;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Assembly implements Part{

    List<Part> aParts = new LinkedList<>();

    public Assembly(){}

    /**
     * Create an assembly with a collection of parts
     * @param pParts
     */
    public Assembly(Collection<Part> pParts){
        aParts.addAll(pParts);
    }

    /**
     * Create an assembly with several parts
     * @param pParts
     */
    public Assembly(Part... pParts){
        aParts.addAll(Arrays.asList(pParts));
    }

    @Override
    public void move(int px, int py) {
        for (Part p : aParts) {
            p.move(px, py);
        }
    }

    public void addPart(Part part){
        aParts.add(part);
    }
}

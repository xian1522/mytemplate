package wj.template.runtime;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class TempForIterator implements Iterator<Object> {
    protected final Iterator<?> iterator;
    protected final int size;
    protected int index;

    public TempForIterator(Object items) {
        if(items instanceof Map) {
            iterator = ((Map)items).entrySet().iterator();
            size = ((Map)items).size();
        }else {
            iterator = Collections.singleton(items).iterator();
            size = 1;
        }
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        index++;
        return iterator.next();
    }

    public int getIndex() {
        return index;
    }
}

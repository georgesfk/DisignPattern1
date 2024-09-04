package сomposite.menu;

import com.Usine.iterator.basic_iterator.Iterator;

public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }


}

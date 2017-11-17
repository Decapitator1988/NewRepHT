package HometaskNumber21;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  MyCollection {
    Object[] container;
    static int counter = 0;

    public MyCollection(int _CAPACITY) {
        container = new Object[_CAPACITY];
    }

    public boolean isEmpty() {
        for (int i = 0; i < container.length; i++) {
            if (container[i] != null) return false;
        }
        return true;
    }

    public boolean contains(Object object) {
        for (int i = 0; i < container.length - 1; i++) {
            if (container[i] == object) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object object) {
        for (int i = 0; i < container.length; i++) {
            if (container[i] == null) {
                container[i] = object;
                counter++;
                break;

            }
        }
        return false;
    }

    public boolean remove(Object object) {
        for (int i = 0; i < container.length - 1; i++) {
            if (container[i] == object) {
                container[i] = null;
                counter--;
            }
        }
        return true;
    }
    //Sadly, with changing the capacity :-(
    public boolean addAll(MyCollection collection) {
        List<Object> sourceList = new ArrayList<>(Arrays.asList(this.container));
        List<Object> incomingCollection = new ArrayList<>(Arrays.asList(collection.container));
        sourceList.addAll(incomingCollection);
        this.container = sourceList.toArray();
        return true;
    }


    public void clear() {
        for (int i = 0; i < container.length; i++) {
            container[i] = null;
        }
    }


    public boolean retainAll(MyCollection _collection) {
        for (int i = 0; i < this.container.length; i++) {
            for (int j = 0; j < _collection.container.length; j++) {
                if (_collection.container[j] == this.container[i] ) continue;
                if (_collection.container[_collection.container.length-1]!=this.container[i]){
                    this.container[i]=null;
                }
            }

        }return false;
    }

    public boolean removeAll(MyCollection _collection) {
        for (int i = 0; i < this.container.length; i++) {
            for (int j = 0; j < _collection.container.length; j++) {
                if (this.container[i] == _collection.container[j]) {
                    this.container[i] = null;
                }
            }
        }
        return false;
    }

    public boolean containsAll(MyCollection _collection){
        int ctr=0;
        boolean status = false;
        for (int i = 0; i <this.container.length ; i++) {
            for (int j = 0; j <_collection.container.length ; j++) {
                if(this.container[i]==(_collection.container[j])){
                  ctr++;
                  }
                if((_collection.container.length)==ctr){
                    status =  true;
                }else if (ctr!=_collection.container.length)status = false;
            }

        }
       return status;
    }
}







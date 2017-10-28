//package HometaskNumber21;
//
//import sun.security.mscapi.KeyStore;
//
//public class MyCollection {
//    private int SIZE;
//    private MyCollection []array;
//
//    public boolean isEmpty(){
//        if(array[0].equals(null)){
//            return true;
//        }
//        return false;
//    }
//
//    public boolean contains(Object object){
//        for (MyCollection e:array) {
//            e.equals(object);
//        }
//        return false;
//    }
//    public void add(Object object){
//        for (int i = 0; i <SIZE ; i++) {
//            array[i] = (MyCollection) object;
//        }
//    }
//    public void remove(Object object){
//        for (int i = 0; i < SIZE; i++) {
//            if(array[i].equals(object)){
//                array[i] = null;
//            }
//
//        }
//    }
//    public boolean addAll(MyCollection collection);
//    public void clear(){
//        for (MyCollection e : array) {
//            e = null;
//        }
//    }
//    public boolean retainAll(MyCollection collection);
//    public boolean removeAll(MyCollection collection);
//    public boolean containsAll(MyCollection collection);
//
//
//}

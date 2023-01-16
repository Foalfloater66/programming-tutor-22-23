public class CustomArrayList<T>{
    public T[] array; // For the sake of this test, make this public.

    public CustomArrayList(){
        this.array = null;
    }

    public CustomArrayList(T[] array){ // Not tested. Optional.
        this.array = null;
    }

    public void add(T element){}

    public void addAll(CustomArrayList<T> list){} // Challenge!

    public T get(int index){
        return null;
    }

    public void remove(T element){}

    public void remove(int index){}

    public boolean contains(T element){
        return false;
    }

    public int indexOf(T element){
        return -1;
    }

    public int size(){
        return -1;
    }

}

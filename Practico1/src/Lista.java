public interface Lista<T extends Comparable<T>> {
    public void add(T value);
    public void remove(int position);
    public T get(int position);
}

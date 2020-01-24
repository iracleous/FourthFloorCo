package gr.codehub.shop.f6;

public interface ICrudable<T>  {
    void addNewElement(T tau);
    T read(int index);
    void update(int index, T newT);
    void delete(int index);
}

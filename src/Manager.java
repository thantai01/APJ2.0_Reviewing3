public interface Manager <T>{
    void add(T t);
    void print();
    int findIndex(String id);
    void edit(String id,T t );
    void delete(String id);
}

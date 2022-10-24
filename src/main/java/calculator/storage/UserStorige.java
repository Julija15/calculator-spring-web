package calculator.storage;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Storige <T,E>  {

    List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }
   public abstract Optional<T> findByUsername (String parameter);


    public void save(T user) {
    }
}
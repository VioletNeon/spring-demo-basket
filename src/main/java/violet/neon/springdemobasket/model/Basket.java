package violet.neon.springdemobasket.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope()
public class Basket {
    private final List<Integer> orders;

    public Basket() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Integer id) {
        this.orders.add(id);
    }

    public List<Integer> getAll() {
        return this.orders;
    }
}

package violet.neon.springdemobasket.service;

import org.springframework.stereotype.Service;
import violet.neon.springdemobasket.model.Basket;

import java.util.Collections;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    private final Basket basket;

    public PurchaseServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addOrder(List<Integer> ids) {
        ids.forEach(basket::addOrder);
    }

    @Override
    public List<Integer> findAll() {
        return Collections.unmodifiableList(basket.getAll());
    }
}
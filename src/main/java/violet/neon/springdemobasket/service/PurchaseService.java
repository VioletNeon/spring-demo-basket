package violet.neon.springdemobasket.service;

import java.util.List;

public interface PurchaseService {
    void addOrder(List<Integer> ids);

    List<Integer> findAll();
}

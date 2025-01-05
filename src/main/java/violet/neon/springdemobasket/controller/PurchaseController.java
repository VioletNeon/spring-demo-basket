package violet.neon.springdemobasket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import violet.neon.springdemobasket.service.PurchaseService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class PurchaseController {
    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam List<Integer> ids) {
        purchaseService.addOrder(ids);
    }

    @GetMapping(path = "/get")
    public List<Integer> getOrders() {
        return purchaseService.findAll();
    }
}

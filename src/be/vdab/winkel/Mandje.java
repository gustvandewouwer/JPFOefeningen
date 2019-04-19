package be.vdab.winkel;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mandje {
    private final Map<Product, Integer> mandje = new LinkedHashMap<>();
    public Map<Product, Integer> getMandje() {
        return mandje;
    }
    public void add(Product product, int aantal) {
        controleerProduct(product);
        controleerAantal(aantal);
        if (!mandje.containsKey(product)) {
            mandje.put(product, aantal);
        } else {
            set(product, aantal);
        }
    }
    private void controleerProduct(Product product) {
        if (product == null) {
            throw new NullPointerException("product moet ingevuld worden");
        }
    }
    private void controleerAantal(int aantal) {
        if (aantal <= 0) {
            throw new IllegalArgumentException("aantal moet positief zijn");
        }
    }
    public void set(Product product, int aantal) {
        controleerProduct(product);
        controleerAantal(aantal);
        controleerProductZitInMandje(product);
        int oudeAantal = mandje.get(product);
        mandje.put(product, oudeAantal + aantal);
    }
    private void controleerProductZitInMandje(Product product) {
        if (! mandje.containsKey(product)) {
            throw new IllegalArgumentException("product komt niet voor in mandje");
        }
    }
    public void remove(Product product) {
        controleerProduct(product);
        controleerProductZitInMandje(product);
        mandje.remove(product);
    }
    public void clear() {
        mandje.clear();
    }
    public BigDecimal getTotalePrijs() {
        BigDecimal totalePrijs=BigDecimal.ZERO;
        for (Map.Entry<Product,Integer> entry : mandje.entrySet()) {
            totalePrijs = totalePrijs.add(entry.getKey().
                    getPrijs().multiply(BigDecimal.valueOf(entry.getValue())));
        }
        return totalePrijs;
    }
    @Override
    public String toString() {
        return mandje.toString();
    }
}

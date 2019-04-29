package be.vdab.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

class RechthoekKO {
    private final int lengte;
    private final int breedte;

    public RechthoekKO(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public int getOppervlakte() {
        return lengte * breedte;
    }

    @Override
    public String toString() {
        return lengte + " op " + breedte;
    }
}

class KleinsteOppervlakte {
    public static void main(String[] args) {
        List<RechthoekKO> rechthoeken = Arrays.asList(
                new RechthoekKO(3, 2), new RechthoekKO(4, 5), new RechthoekKO(2, 3));

        OptionalInt kleinsteOppervlakte = rechthoeken.stream()
                .mapToInt(rechthoek -> rechthoek.getOppervlakte())
                .min();

        kleinsteOppervlakte.ifPresent(oppervlakte -> {
            System.out.println(oppervlakte);
            rechthoeken.stream()
                    .filter(rechthoek -> rechthoek.getOppervlakte() == oppervlakte)
                    .forEach(rechthoek -> System.out.println(rechthoek));
        });
    }
}
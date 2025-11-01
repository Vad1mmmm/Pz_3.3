package pz_pet_animal.sorter;
import pz_pet_animal.pet_animal.*;
import java.util.Comparator;

public class AnymalByAgeComparator implements Comparator<PetAnimal> {
    private Order order;
    public AnymalByAgeComparator(Order order) {
        this.order = order;
    }
    @Override
    public int compare(PetAnimal o1, PetAnimal o2) {
        if (o1 == o2) return 0;
        if (o1 == null) return (order == order.ASCENDING) ? -1 : 1;
        if (o2 == null) return (order == order.ASCENDING) ? -1 : 1;

        int cmp = Integer.compare(o1.getAge(), o2.getAge());
        return (order == order.ASCENDING) ? cmp : -cmp;
    }
}

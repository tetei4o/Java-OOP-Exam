package aquarium.entities.aquariums;

public class FreshwaterAquarium extends BaseAquarium {
    private static final int CAPACITY = 25;

    public FreshwaterAquarium(String name) {
        super(name, CAPACITY);
    }
}

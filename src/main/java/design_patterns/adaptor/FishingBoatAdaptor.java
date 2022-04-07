package design_patterns.adaptor;

public class FishingBoatAdaptor implements RowingBoat{

    private final FishingBoat fishingBoat;

    public FishingBoatAdaptor() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}

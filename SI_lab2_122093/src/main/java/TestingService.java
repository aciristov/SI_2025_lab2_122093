public class TestingService {

    public boolean testingDiscount(Item item){
        return item.getDiscount() > 0;
    }

    public boolean testingThreeCombination(Item item) {
        return item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10;
    }
}

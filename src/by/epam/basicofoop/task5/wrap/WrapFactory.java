package by.epam.basicofoop.task5.wrap;

public class WrapFactory {
    public Wrap createWrap(WrapType wrapType, String msg, String material) {
        switch (wrapType) {
            case BOX:
                return new Box(msg, material);
            case BASKET:
                return new Basket(msg, material);
            default:
                System.out.println("Error");
                return null;
        }
    }
}

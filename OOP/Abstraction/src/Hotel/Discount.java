package Hotel;

public enum Discount {
    VIP(0.20),
    SECOND_VISIT(0.10),
    NONE(0.00);

    private double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}

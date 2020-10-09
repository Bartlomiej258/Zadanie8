public class Main {
    public static void main(String[] args) {

        TV tv1 = new TV("Philips", 55, true);
        TV tv2 = new TV("Samsung", 65, false);

        System.out.println(tv1.brand + " " + tv1.inchSize + " " + tv1.smartTV);
        System.out.println(tv2.brand + " " + tv2.inchSize + " " + tv2.smartTV);
    }
}

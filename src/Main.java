public class Main {
    public static void main(String[] args) {

        TV tv1 = new TV();
        tv1.brand = "Philips";
        tv1.inchSize = 55;
        tv1.smartTV = true;

        TV tv2 = new TV();
        tv2.brand = "Samsung";
        tv2.inchSize = 65;
        tv2.smartTV = false;

        System.out.println(tv1.brand + " " + tv1.inchSize + " " + tv1.smartTV);
        System.out.println(tv2.brand + " " + tv2.inchSize + " " + tv2.smartTV);
    }
}

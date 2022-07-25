class Loop2 {

    public static void main(String[] args) {
        int x;
        for (x = 1; x <= 100; x++) {
            if (x % 3 == 0 && x % 6 == 0 && x != 30 && x != 60 && x != 90) {
                System.out.println("output" + x);
            }
        }
    }
}

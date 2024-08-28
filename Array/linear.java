public class linear {

    public static int linerSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = { "Paratha", "chole bhature", "Samosa", "alubanda", "Snacks" };
        String key = "Samosa";

        int index = linerSearch(menu, key);

        if (index == -1) {
            System.out.println("Not Found");

        } else {

            System.out.println("found at index " + index);
        }

    }

}

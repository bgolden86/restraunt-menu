package restaurant;

public class Restaurant {

    public static void main (String[] args) {
       MenuItem item1 = new MenuItem("Salad", "Delicious Greens", 7.50, "Healthy", true);
        MenuItem item2 = new MenuItem("Salad", "Delicious Greens", 7.50, "Healthy", true);
        MenuItem item3 = new MenuItem("Cake", "Delicious desserts", 7.50, "UnHealthy", true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);

        //System.out.println(myMenu.toString());
        System.out.println(item1.toString());
    }
}

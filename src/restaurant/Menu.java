package restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

    //class variables

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    //constructors

    public Menu() {
        this.lastUpdated = new Date();
    }

    //methods

    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }

    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return this.lastUpdated; }

    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }

    //Other Methods
    public void addMenuItem(MenuItem item) {

        this.menuItems.add(item);

        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {

        this.menuItems.remove(item);

        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        for(MenuItem item: this.menuItems) {
        returnString += item.toString() + "\n\n";
        }

        return returnString;
    }
}

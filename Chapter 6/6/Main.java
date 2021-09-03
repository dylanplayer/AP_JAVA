

class Main{

    public static void main(String[] args){

        

        ItemCatagory jackets = new ItemCatagory(1, "Jackets");
        ItemCatagory pants = new ItemCatagory(2, "Pants");
        ItemCatagory hats = new ItemCatagory(3, "Hats");

        RetailItem item1 = new RetailItem(1, "Leather Jacket", "Designer Leather Jacket", 20, 120.00);
        jackets.add(item1);

        RetailItem item2 = new RetailItem(2, "Basic Jacket", 26, 50.00);
        jackets.add(item2);

        RetailItem item3 = new RetailItem(3, "Leather Pants", "Designer Leather Pants", 14, 90.00);
        pants.add(item3);

        RetailItem item4 = new RetailItem(4, "Basic Pants", 32, 40.00);
        pants.add(item4);

        RetailItem item5 = new RetailItem(5, "Hats", "Dad Hat", 25, 20.00);
        hats.add(item5);


        
        
        System.out.println();
        
        jackets.printItems();
        pants.printItems();
        hats.printItems();
        
        System.out.println();

        String[] hatColors = {"Grey, White, Black"};
        item5.addColor(hatColors);
        item5.printColors();
        


    }



}
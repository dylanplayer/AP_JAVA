import java.util.ArrayList;

public class RetailItem {

    private int ID;
    private String NAME;
    private String DESCRIPTION;
    private int QUANTITY_ON_HAND;
    private double PRICE;
    private double SALE_PERCENTAGE;
    private int NUMBER_OF_COLORS;
    private ArrayList<String> COLOR_LIST = new ArrayList<String>();


    /**
     * Creates instance of the RetailItem class
     * 
     * @param id
     * @param name
     * @param description
     * @param qty
     * @param price
     * 
     */

    public RetailItem(int id, String name, String description, int qty, double price){

        ID = id;
        NAME = name;
        DESCRIPTION = description;
        QUANTITY_ON_HAND = qty;
        PRICE = price;
        SALE_PERCENTAGE = 0;
        NUMBER_OF_COLORS = 0;


    }

    /**
     * Creates instance of the RetailItem class
     * 
     * @param id
     * @param name
     * @param qty
     * @param price
     * 
     */

    public RetailItem(int id, String name, int qty, double price){

        ID = id;
        NAME = name;
        DESCRIPTION = "N/A";
        QUANTITY_ON_HAND = qty;
        PRICE = price;
        SALE_PERCENTAGE = 0;
        NUMBER_OF_COLORS = 0;


    }

    //Setters

    /**
     * Sets item ID
     * 
     * @param id
     * 
     */
    public void setID(int id){

        ID = id;

    }

    /**
     * Sets item name
     * 
     * @param name
     * 
     */
    public void setName(String name){

        NAME = name;

    }

    /**
     * Sets item description
     * 
     * @param description
     * 
     */
    public void setDescription(String description){

        DESCRIPTION = description;

    }

    /**
     * Sets item quantity on hand
     * 
     * @param qty
     * 
     */
    public void setQty(int qty){

        QUANTITY_ON_HAND = qty;

    }

    /**
     * Sets item price
     * 
     * @param price
     * 
     */
    public void setPrice(double price){

        PRICE = price;

    }

    /**
     * 
     * Sets item's sale percentage
     * 
     * @param salePercentage
     */
    public void setSalePercentage(double salePercentage){

        SALE_PERCENTAGE = salePercentage;
        
    }







    //Getters

    /**
     * Gets item id
     * 
     * @return id
     * 
     */
    public int getId(){

        return ID;

    }

    /**
     * Gets item name
     * 
     * @return name
     * 
     */
    public String getName(){

        return NAME;

    }

    /**
     * Gets item description
     * 
     * @return description
     * 
     */
    public String getDescription(){

        return DESCRIPTION;

    }

    /**
     * Gets item Quantity On Hand
     * 
     * @return qty
     * 
     */
    public int getQty(){

        return QUANTITY_ON_HAND;

    }

    /**
     * Gets item price
     * 
     * @return price
     * 
     */
    public double getPrice(){

        return PRICE;

    }

    /**
     * Gets item's sale percentage
     * 
     * @return salePercentage
     * 
     */
    public double getSalePercentage(){

        return SALE_PERCENTAGE;

    }



    //Other Methods

    /**
     * 
     * Prints item's ID, NAME, DESCRIPTION, QUANTITY_ON_HAND, PRICE to the console
     * 
     */
    public void printItem(){


        System.out.printf("|%d|%s|%s|%d|$%.2f|\n", ID, NAME, DESCRIPTION, QUANTITY_ON_HAND, PRICE);


    }

    /**
     * Add color to item's color list
     * @param color
     */
    public void addColor(String color){

        COLOR_LIST.add(color);
        NUMBER_OF_COLORS++;

    }

    /**
     * Add multiple colors to item's color list
     * @param colors
     */

    public void addColor(String[] colors){

        for(int i = 0; i < colors.length; i++){

            addColor(colors[i]);

        }

    }

    /**
     * Remove color from item's color list
     * @param color
     */
    public void removeColor(String color){

        COLOR_LIST.remove(color);
        NUMBER_OF_COLORS--;

    }

    public void printColors(){

        if(NUMBER_OF_COLORS > 0){

            System.out.printf("Item: %s\n", NAME);
            System.out.print("Colors:");
            for(int i = 0; i < NUMBER_OF_COLORS; i++){

                System.out.print(" " + COLOR_LIST.get(i) + ",");

            }
            System.out.println();
        }else{

            System.out.printf("No Colors In %s's Color List\n", NAME);

        }

    }




    
}

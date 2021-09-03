import java.util.ArrayList;

public class ItemCatagory {

    private String NAME;
    private int ID;
    private String DESCRIPTION;
    private int NUMBER_OF_ITEMS;
    private ArrayList<RetailItem> ITEM_LIST = new ArrayList<RetailItem>();

    //Constructors
    
    /**
     * Creates an instance of an item catagory
     * @param name
     * @param id
     */

    public ItemCatagory(int id, String name){

        ID = id;
        NAME = name;
        DESCRIPTION = "N/A";
        NUMBER_OF_ITEMS = 0;

    }

    /**
     * Creates an instance of an item catagory
     * @param name
     * @param id
     */

    public ItemCatagory(int id, String name, String description){

        ID = id;
        NAME = name;
        DESCRIPTION = description;
        NUMBER_OF_ITEMS = 0;

    }

    //Setters

    /**
     * Sets catagory name
     * @param name
     */
    public void setName(String name){

        NAME = name;

    }

    /**
     * Sets catagory id
     * @param id
     */
    public void setId(int id){

        ID = id;

    }

     /**
     * Sets catagory description
     * 
     * @param description
     * 
     */
    public void setDescription(String description){

        DESCRIPTION = description;

    }





    //Getters

    /**
     * Gets catagory name
     * @return name
     */
    public String getName(){

        return NAME;

    }

    /**
     * Gets catagory id
     * @return id
     */
    public int getId(){

        return ID;

    }

     /**
     * Gets catagory description
     * 
     * @return description
     * 
     */
    public String getDescription(){

        return DESCRIPTION;

    }

    /**
     * Gets number of items in catagory
     * @return number of items
     */
    public int getNumberOfItems(){

        return NUMBER_OF_ITEMS;

    }




    //Other

    /**
     * Adds item to catagory's list of items
     * 
     * @param retailItem
     * 
     */
    public void add(RetailItem retailItem){

        ITEM_LIST.add(retailItem);
        NUMBER_OF_ITEMS++;

    }

    /**
     * Removes item from catagory's list of items
     * 
     * @param retailItem
     * 
     */
    public void remove(RetailItem retailItem){

        ITEM_LIST.remove(retailItem);
        NUMBER_OF_ITEMS--;

    }

    /**
     * Prints all items in the catagory
     */
    public void printItems(){

        if(NUMBER_OF_ITEMS > 0){

            System.out.printf("Catagory: %s\n", NAME);
            for(int i = 0; i < NUMBER_OF_ITEMS; i++){

                ITEM_LIST.get(i).printItem();

            }
            System.out.println();
        }else{

            System.out.printf("No Items In %s's List\n", NAME);

        }

    }

    





}

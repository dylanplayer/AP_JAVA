public class Book {


    private String TITLE;
    private String AUTHOR;
    private String PUBLISHER;
    private int COPIES_SOLD;

    /**
     * Creates an instance of the book class
     * 
     * @param title
     * @param author
     * @param publisher
     * @param copiesSold
     * 
     */
    public Book(String title, String author, String publisher, int copiesSold){

        TITLE = title;
        AUTHOR = author;
        PUBLISHER = publisher;
        COPIES_SOLD = copiesSold;

    }

    /**
     * Creates an instance of the book class
     * 
     * @param title
     * @param author
     * @param publisher
     * 
     */
    public Book(String title, String author, String publisher){

        TITLE = title;
        AUTHOR = author;
        PUBLISHER = publisher;
        COPIES_SOLD = 0;

    }

    //Setters

    /**
     * Sets book title
     * @param title
     */
    public void setTitle(String title){

        TITLE = title;

    }

    /**
     * Sets book author
     * @param author
     */
    public void setAuthor(String author){

        AUTHOR = author;

    }

    /**
     * Sets book publisher
     * @param publisher
     */
    public void setPublisher(String publisher){

        PUBLISHER = publisher;

    }

    /**
     * Sets book copies sold
     * @param copiesSold
     */
    public void setCopiesSold(int copiesSold){

        COPIES_SOLD = copiesSold;

    }

    //Getters

    /**
     * Returns book title
     * @return title
     */
    public String getTitle(){

        return TITLE;

    }

    /**
     * Returns book author
     * @return author
     */
    public String getAuthor(){

        return AUTHOR;

    }

    /**
     * Returns book publisher
     * @return publisher
     */
    public String getPublisher(){

        return PUBLISHER;

    }

    /**
     * Returns copies sold
     * @return copiesSold
     */
    public int getCopiesSold(){

        return COPIES_SOLD;

    }


    /**
     * Prints all book data
     */
    public void printData(){

        System.out.printf("|%s|%s|%s|%d|", TITLE, AUTHOR, PUBLISHER, COPIES_SOLD);

    }

    
    
}

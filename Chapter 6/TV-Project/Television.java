

public class Television {

    //This class is to model a television
    //Dylan 2/8/2020
 
    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;

    /**
     * Creates instance of the television class with the power set to false, volume set to 20, and the channel set to 2
     * @param manufacturer
     * @param screenSize
     */
    public Television(String manufacturer, int screenSize){

        MANUFACTURER = manufacturer;
        SCREEN_SIZE = screenSize;
        powerOn = false;
        volume = 20;
        channel = 2;

    }


    //Getters

    /**
     * Gets the volume of the object
     * @return volume
     */
    public int getVolume(){
        
        return volume;

    }

    /**
     * Gets the channel of the object
     * @return channel
     */
    public int getChannel(){
        
        return channel;

    }

    /**
     * Gets the screen size of the object
     * @return screen size
     */
    public int getScreenSize(){
        
        return SCREEN_SIZE;

    }

    /**
     * Gets the Manufacturer of the object
     * @return Manufacturer
     */
    public String getManufacturer(){
        
        return MANUFACTURER;

    }


    //Setters

    /**
     * Sets the object's channel
     * @param newChannel
     */
    public void setChannel(int newChannel){

        channel = newChannel;

    }


    /**
     * Power changes the power state of the object
     */
    public void power(){

        powerOn = !powerOn;

    }

    /**
     * increments object's volume
     */
    public void increaseVolume(){

        if(volume < 100){
            volume++;
        }

    }

    /**
     * decrements object's volume
     */
    public void decreaseVolume(){

        if(volume > 0){
            volume--;
        }
    }

}

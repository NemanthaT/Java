public class Room {
    private int number;
    private boolean available;

    public Room(int number) {
        this.number = number;
        this.available = true;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setAvailable(){
        this.available = false;
    }
    public void unsetAvailable(){
        this.available = true;
    }

    public int getNumber(){
        return this.number;
    }
    public boolean isAvailable(){
        return this.available;
    }
}

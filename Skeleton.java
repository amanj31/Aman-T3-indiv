public abstract class Skeleton {
    String text;

    public Skeleton(String text) {
        this.text = text;
    }

    public abstract void run();

    @Override
    public String toString() {
        return text;
    }


    
}

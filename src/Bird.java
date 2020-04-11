public class Bird<T> {

    private T name;

    public Bird(T name) {
        this.name = name;
    }


    public Bird() {

    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}

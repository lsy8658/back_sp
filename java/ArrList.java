class Box<T> {
    T data;
    public void setData (T data) {
        this.data = data;
    }
}

public class GenericC {
    public GenericC() {
        Box<Integer> iBox = new Box<>();
        iBox.setData(3);

        Box<String> sBox = new Box<>();
        sBox.setData("안녕"); 
    }
}

interface Box {
    public void getName (String name);
}

public class InterF implements Box {
    String name;
    public void getName (String name) {
        this.name = name;
    }
}
interface Box2 {
    public void getName (String name);
}



package pl.tr0k.javabrains;

/**
 * Created by tr0k on 2014-07-16.
 */
public class Triangle {

    private String type;

    private int height;

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void draw() {
        System.out.println(getType() + " Triangle drawn of height " + getHeight());
    }

}


package login;

/**
 *
 * @author drake
 */
public class Rect {
    
    private int height;
    private int width;
    private int x;
    private int y;
    
    public Rect(int x, int y, int w, int h) {
        height = h;
        width = w;
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
}

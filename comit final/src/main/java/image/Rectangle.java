package image;

import java.awt.*;

public class Rectangle implements Shape {
    int x,y;
    int width,height;
    Color color;

    public Rectangle(int x, int y, int width, int height, Color color){
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean contains(Point point) {
        return this.x < point.x && point.x <= this.x+width && this.y < point.y && point.y <= this.y+height;
    }

    @Override
    public Color getColor() {
        return color;
    }
}

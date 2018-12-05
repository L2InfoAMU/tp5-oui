package image;

import image.Image;
import javafx.scene.paint.Color;
import util.Matrices;

import java.util.Objects;

public class BruteRasterImage extends RasterImage {
    Color[][] Colors;

    public BruteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        createRepresentation();
        for(int i = 0;i<width;i++){
            for(int j=0;i<height;j++){
                this.Colors[i][j] = color;
            }
        }
    }
    public BruteRasterImage(Color[][] colors){
        Matrices matrice;
        this.width = colors.length;
        this.height = colors[0].length;
        this.Colors = colors;
    }
    public void createRepresentation(){
        this.Colors = new Color[width][height];
    }
    public void setPixelColor(Color color, int x, int y){
        this.Colors[x][y] = color;
    }
    public Color getPixelColor(int x, int y){
        return this.Colors[x][y];
    }
    private void setPixelsColor(Color[][] pixels){
        this.Colors = pixels;
    }
    private void setPixelsColor(Color color){
        for(int i=0;i<this.width;i++){
            for(int j=0;i<this.height;j++){
                this.Colors[i][j] = color;
            }
        }
    }
    protected void setWidth(int width){
    }
    protected void setHeight(int height) {
    }
}  

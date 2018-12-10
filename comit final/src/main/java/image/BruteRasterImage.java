package image;

import image.Image;
import javafx.scene.paint.Color;
import util.Matrices;

import java.awt.*;
import java.util.Objects;

public class BruteRasterImage extends RasterImage {
    Color[][] colors;


    public BruteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors){
        Matrices matrice;
        this.width = colors.length;
        this.height = colors[0].length;
        setPixelsColor(colors);
    }

    public void createRepresentation(){
        this.colors = new Color[width][height];
    }

    public void setPixelColor(Color color, int x, int y){
        this.colors[x][y] = color;
    }

    public Color getPixelColor(int x, int y){
        return this.colors[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        this.colors = pixels;
    }

    private void setPixelsColor(Color color){
        for(int i=0;i<this.width;i++){
            for(int j=0;j<this.height;j++){
                setPixelColor(color,i,j);
            }
        }
    }

    protected void setWidth(int width){
        Color[][] matrice = new Color[width][this.height];
        for(int i=0;i<this.width;i++){
            for(int j=0;j<this.height;j++){
                matrice[i][j]=colors[i][j];
            }
        }
        this.colors = matrice;
        this.width = width ;
    }

    protected void setHeight(int height) {
        Color[][] matrice = new Color[this.width][height];
        for(int i=0;i<this.width;i++){
            for(int j=0;j<this.height;j++){
                matrice[i][j]=colors[i][j];
            }
        }
        this.colors = matrice;
        this.height = height;
    }
}  

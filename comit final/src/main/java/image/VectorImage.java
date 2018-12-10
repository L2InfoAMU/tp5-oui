package image;

import java.awt.*;
import java.util.ListIterator;

public class VectorImage implements Image {
    List<Shape> shapes;
    int width,height;

    public VectorImage(List<Shape> shapes, int width, int height){
        this.width = width;
        this.height = height;
        this.shapes = shapes;
    }
    /*:construisant une image de la taille spécifiée et avec les formes données en paramètre.*/

    public Color getPixelColor(int x, int y){
        ListIterator<Color> shapesit = this.shapes.listIterator();
        for
    }
    /* : retourne la couleur d’un pixel.*/

    public int getWidth(){
        return this.width;
    }
    /* : retourne la largeur de l’image.*/

    public int getHeight(){
        return this.height;
    }
    /*: retourne la hauteur de l’image.*/

    protected void setWidth(int width){
        this.width = width ;
    }
    /*: fixe la largeur de l’image.*/

    protected void setHeight(int height){
        this.height = height ;
    }
    /*: fixe la hauteur de l’image.*/
}

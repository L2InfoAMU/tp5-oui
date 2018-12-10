package image;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage {
    Map<Point,Color> map;
    int width;
    int height;

    public SparseRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }
/*: construisant une image de la taille spécifiée et dont tous les pixels sont de la couleur spécifiée .*/

    public SparseRasterImage(Color[][] pixels){
        this.width = pixels.length;
        this.height = pixels[0].length;
        createRepresentation();
        setPixelsColor(pixels);
    }
/* construisant une image à partir de la matrice donnée en paramètre. Le premier indice correspondant à la coordonnée en xet le deuxième indice correspondant à la coordonnée en y*/

    public void createRepresentation(){
    this.map = new HashMap(width*height);
}
/*: crée le dictionnaire HashMap<Point,Color> pour stocker l’association entre points et couleurs.*/

    public void setPixelColor(Color color, int x, int y){
        map.put(new Point(x,y),color);
    }
/*: fixe la couleur d’un pixel (en associant le point de coordonnée(x, y)à la couleur).—*/

    public Color getPixelColor(int x, int y){
        return map.get(new Point(x,y));
    }
/*: retourne la couleur d’un pixel.*/

    private void setPixelsColor(Color[][] pixels){
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                setPixelColor(pixels[i][j],i,j);
            }
        }
    }

/*: met à jour les valeurs de couleurs de l’image en utilisant les valeurs de la matrice donnée en paramètre. —*/

    private void setPixelsColor(Color color){
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                setPixelColor(color,i,j);
            }
        }
    }
/*: change les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre.*/

    public int getWidth(){
        return this.width;
    }
/*: retourne la largeur de l’image.*/

    public int getHeight(){
        return this.height;
    }
/*: retourne la hauteur de l’image.*/

    protected void setWidth(int width){
        HashMap<Point,Color> map= new HashMap(width*height);
        for(int i=0;i<this.width;i++){
            for(int j=0;j<height;j++){
                map.put(new Point(i,j),getPixelColor(i,j));
            }
        }
        this.map = map;
        this.width = width;
    }
/*: fixe la largeur de l’image.*/

    protected void setHeight(int height){
        HashMap<Point,Color> map= new HashMap(width*height);
        for(int i=0;i<width;i++){
            for(int j=0;j<this.height;j++){
                map.put(new Point(i,j),getPixelColor(i,j));
            }
        }
        this.map = map;
        this.height = height;
    }
/*: fixe la hauteur de l’image.*/
}

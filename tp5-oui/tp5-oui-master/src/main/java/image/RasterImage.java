package image;

public abstract class RasterImage implements Image {
   int width;
   int height;
    /*retourne la largeur de l’image.*/
    public int getWidth(){
        return this.width;
    }
    /* retourne la hauteur de l’image.*/
    public int getHeight(){
        return this.height;
    }
}

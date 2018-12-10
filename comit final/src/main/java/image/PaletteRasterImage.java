package image;

import javafx.scene.paint.Color;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage{

	List<Color> palette;
	int[][] indexesOfColors;

	public PaletteRasterImage(Color color, int width, int height) {
		this.width = width;
		this.height = height;
		createRepresentation();
		setPixelsColor(color);
	}

	public PaletteRasterImage(Color[][] pixels) {
		this.width = pixels.length;
		this.height = pixels[0].length;
		createRepresentation();
		setPixelsColor(pixels);
        }

    /*: alloue la liste pour stocker la palette et la matrice représentant l’image (à utiliser dans le constructeur).*/

    public void createRepresentation() {
		this.indexesOfColors = new int[width][height];
		this.palette = new ArrayList<>();
	}

	/*fixe la couleur d’un pixel (en ajoutant la couleur à la palette si elle n’était pas dans la palette).*/

    public void setPixelColor(Color color, int x, int y){
		if(x>width || y>height) return;
        if(palette.indexOf(color) == -1) {
			palette.add(color);
		}
			this.indexesOfColors[x][y]= this.palette.indexOf(color);
	}

	/*retourne la couleur d’un pixel*/

    public Color getPixelColor(int x, int y){
		return palette.get(this.indexesOfColors[x][y]);
	}

	/*met à jour les valeurs de couleurs de l’image en utilisant les valeurs de la matrice donnée en paramètre.*/

    public void setPixelsColor(Color[][] pixels){
		for(int i = 0;i<width;i++){
            for(int j=0;i<height;j++){
            	setPixelColor(pixels[i][j],i,j);
            }
		}
	}

	/*change les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre.*/

    public void setPixelsColor(Color color){
        for(int i = 0;i<width;i++){
            for(int j=0;j<height;j++){
            	setPixelColor(color,i,j);
            }
		}
	}

	/*fixe la largeur de l’image.*/

    protected void setWidth(int width){
		int[][] matrice = new int[width][this.height];
		for(int i=0;i<this.width;i++){
			for(int j=0;j<this.height;j++){
				matrice[i][j] = this.indexesOfColors[i][j];
			}
		}
		this.indexesOfColors = matrice;
		this.width = width ;
	}

	/*fixe la hauteur de l’image.*/

    protected void setHeight(int height){
		int[][] matrice = new int[this.width][height];
		for(int i=0;i<this.width;i++){
			for(int j=0;j<this.height;j++){
				matrice[i][j]=indexesOfColors[i][j];
			}
		}
		this.indexesOfColors = matrice;
		this.height = height;
	}
}

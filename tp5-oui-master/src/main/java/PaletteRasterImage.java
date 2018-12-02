
public class PaletteRasterImage implements image{
	List<Color> palette;
	int[][] indexesOfColors;
	int width;
	int height;
	int listsize;
	public PaletteRasterImage(Color color, int width, int height) {
		this.palette.add(1,color);
		this.width = width;
		this.height = height;
		this.listsize = 1;
		int [][] t = new int[width][height];
		for(int i = 0;i<width;i++){
            for(int j=0;i<height;j++){
                t[i][j]=1;
            }
        }
		this.indexesOfColors = t;
	}
	public PaletteRasterImage(Color[][] pixels) {
		this.width = pixels.length;
		this.height = pixels[0].length;
		this.palette.add(pixels[0][0]);
		int [][] t = new int[width][height];
		this.indexesOfColors = t;
		int listsize=1;
		for(int i = 0;i<width;i++){
            for(int j=0;i<height;j++){
                if(palette.contains(pixels[i][j])) {
                	this.indexesOfColors[i][j]=palette.indexOf(pixels[i][j]);
                }
                else {
                	palette.add(listsize,pixels[i][j]);
                	this.indexesOfColors[i][j]=listsize;
                	listsize++ ;
                }
            }
        }
		this.listsize=listsize;	
	}
	/*: alloue la liste pour stocker la palette et la matrice repré- sentant l’image (à utiliser dans le constructeur).*/
	public void createRepresentation() {}
	/*fixe la couleur d’un pixel (en ajoutant la couleur à la palette si elle n’était pas dans la palette).*/
	public void setPixelColor(Color color, int x, int y){
		if(palette.indexOf(color)== -1) {
			this.listsize++;
			palette.add(listsize,color);
			this.indexesOfColors[x][y]=this.listsize;
		}
		else {
			this.indexesOfColors[x][y]=palette.indexOf(color);
		}
	}
	/*retourne la couleur d’un pixel*/
	public Color getPixelColor(int x, int y){
		return palette.get(this.indexesOfColors[x][y]);
	}
	/*met à jour les valeurs de couleurs de l’image en utilisant les valeurs de la matrice donnée en paramètre.*/
	public void setPixelsColor(Color[][] pixels){}
	/*change les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre.*/
	private void setPixelsColor(Color color){}
	/*retourne la largeur de l’image.*/
	public int getWidth(){}
	/* retourne la hauteur de l’image.*/
	public int getHeight(){}
	/*fixe la largeur de l’image.*/
	protected void setWidth(int width){}
	/*fixe la hauteur de l’image.*/
	protected void setHeight(int height){}
	
}

import image.Image;

public class BruteRasterImage implements Image {
    Color[][] Colors;
    int Width;
    int Height;

    public BruteRasterImage(Color color, int width, int height){
        this.Width = width;
        this.Height = height;
        this.Colors = Color[width][height];
        for(int i = 0;i<width;i++){
            for(int j=0;i<height;j++){
                this.Colors[i][j] = color;
            }
        }
    }
    public BruteRasterImage(Color[][] colors){
        requiresNonNull(colors);
        this.Width = colors.length;
        this.Height = colors[0].length;
        this.Colors = colors;
    }
    public void createRepresentation(){ }
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
        for(int i=0;i<this.Width;i++){
            for(int j=0;i<this.Height;j++){
                this.Colors[i][j] = color;
            }
        }
    }
    public int getWidth(){
        return this.Width;
    }
    public int getHeight(){
        return this.Height;
    }
    protected void setWidth(int width){
        this.Width=width;
    }
    protected void setHeight(int height){
        this.Height=height;
    }
}  

import image.Image;

public class BruteRasterImage implements Image {
    Color[][] Colors;
    int Whidth;
    int Height;

    public BruteRasterImage(Color color, int width, int height){
        this.Whidth = width;
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
        this.Whidth=
    }
    public void createRepresentation(){ }
    public void setPixelColor(Color color, int x, int y){ }
    public Color getPixelColor(int x, int y){}
    private void setPixelsColor(Color[][] pixels){}
    private void setPixelsColor(Color color){}
    public int getWidth(){}
    public int getHeight(){}
    protected void setWidth(int width){}
    protected void setHeight(int height){}
}

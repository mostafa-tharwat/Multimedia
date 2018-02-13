package multimedia;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Multimedia 
{
   public static void main(String[] args) throws IOException
    {
        
        File input = new File ("C:\\Users\\mosta\\Desktop\\1.jpg");// الكلاس الي اسمها فايل هي المسئول ان هي تدخلي اي حاجه من بره زي الصور 
        BufferedImage Image = ImageIO.read(input);
        int width=Image.getWidth();
        int height=Image.getHeight();
        System.out.print("("+width+","+height+")");
     int count=0;
        for(int i=0;i<height;i++)
        {    
        for (int j=0;j<width;j++)
        {
            count ++;
            Color c=new Color(Image.getRGB(j,i));
            System.out.println("NO :"+count+"\n R :"+c.getRed()+"\n G :"+c.getGreen()+"\n B :"+c.getBlue());
        }
        }
        
        
    }
    
}

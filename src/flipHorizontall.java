import java.awt.image.BufferedImage;
import java.io.*;
import acm.program.*;
import acm.graphics.*;

public class flipHorizontall extends GraphicsProgram{
	

	public void run() {
		GImage rose = new GImage("flipImage.jpg");
		
		add(flipImage(rose));
	}
		
		public static GImage flipImage(GImage rose) {
			
			int [][] pixelArray= rose.getPixelArray();
			int width = pixelArray[0].length;
			
		for(int i = 0; i < pixelArray.length; i++) {
			for(int j = width-1; j>= width/2; j--) {
				int temp = pixelArray[i][(width-j)-1];
				pixelArray[i][(width-j)-1] = pixelArray[i][j];
				pixelArray[i][j] = temp;
		
		
}
}
		return new GImage(pixelArray);
		}
}
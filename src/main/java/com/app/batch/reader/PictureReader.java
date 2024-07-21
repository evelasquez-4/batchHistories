package com.app.batch.reader;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import net.sourceforge.tess4j.ITessAPI;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.TessAPI;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.Word;
import net.sourceforge.tess4j.util.ImageIOHelper;


public class PictureReader {
	
	public static void main(String[] args) {
		
	
		//File img = new File("/Users/raven/Documents/workspace-spring-tool-suite-4-4.19.0.RELEASE/batcher/src/main/resources/images/IMG_1928.PNG");
		File img = new File("/Users/raven/Documents/workspace-spring-tool-suite-4-4.19.0.RELEASE/batcher/src/main/resources/images/IMG2.JPEG");
		Tesseract instance = new Tesseract();  // JNA Interface Mapping
		ITesseract tes =  new Tesseract();
		tes.setLanguage("eng");
		tes.setDatapath("/Users/raven/Documents/workspace-spring-tool-suite-4-4.19.0.RELEASE/batcher/src/main/resources/Tess4J/tessdata"); // replace with your tessdata path
		
		instance.setLanguage("eng");
		instance.setDatapath("/Users/raven/Documents/workspace-spring-tool-suite-4-4.19.0.RELEASE/batcher/src/main/resources/Tess4J/tessdata"); // replace with your tessdata path
		
		try {
				if(!img.exists()) {
					System.out.println("file does not exist !!!");
					return;
				}
				Image i = ImageIO.read(img);
				System.out.println(i.getHeight(null));
				System.out.println(i.getWidth(null));
				
				
				List<Word> words = instance.getWords(ImageIO.read(img),2);
				System.out.println(words.size());
				for (int j = 0; j < words.size(); j++) {
					System.out.println("-------------"+j+"-------");
					System.out.println( words.get(j).getText());
					System.out.println("--------------------");
				}
				//String result = tes.doOCR(img);
				//System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//try {
			
//			tesseract.setDatapath("/Users/raven/Documents/workspace-spring-tool-suite-4-4.19.0.RELEASE/batcher/src/main/resources/Tess4J/tessdata"); 
//			
//			String result = tesseract.doOCR(new File("/Users/raven/Documents/workspace-spring-tool-suite-4-4.19.0.RELEASE/batcher/src/main/resources/images/IMG_1928.PNG"));
//            System.out.println(result);
//			
//		} catch (TesseractException e) {
//			// TODO: handle exception
//			System.out.println("exception!!!!");
//			e.printStackTrace();
//		}
	}

}

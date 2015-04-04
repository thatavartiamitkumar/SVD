package ua.edu.svd;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String [] args){
		try {
			
			FileOutputStream fw = new FileOutputStream("D:\\Akron\\Academics\\Advanced_Algos\\Projects\\SVD_PCA\\Test.txt");
			
			DataOutputStream dos = new DataOutputStream(fw);
			
			FileWriter fw1 = new FileWriter("D:\\Akron\\Academics\\Advanced_Algos\\Projects\\SVD_PCA\\Test.txt");
			BufferedWriter bw = new BufferedWriter(fw1);
			
			BufferedOutputStream bos = new BufferedOutputStream(fw);
			byte [] byteArray;
			
			String string = String.valueOf(140);
			byteArray = string.getBytes();
			//bos.write(byteArray);
			//dos.write(140);
			//dos.writeDouble(0.087);
			dos.write(-130);
			/*
			
			PrintWriter pw = new PrintWriter(fw1);
			
			for(int i=125,j=0;i<256;i++,j++){
				StringBuilder sb = new StringBuilder();
				sb.append(Character.forDigit(i, 2));
				//pw.print(String.valueOf((char)i));
				//dos.writeBytes(sb.toString());
				//dos.writeUTF(sb.toString());
				byteArray[j] = (byte)i;
			}
			
			*/
			/*bw.write(in);
			bw.close();*/
			//pw.close();
			dos.close();
			bos.close();
			bw.close();
			
			File file = new File("D:\\Akron\\Academics\\Advanced_Algos\\Projects\\SVD_PCA\\Test.txt");
			FileInputStream fis = new FileInputStream(file);
			FileReader fr = new FileReader("D:\\Akron\\Academics\\Advanced_Algos\\Projects\\SVD_PCA\\Test.txt");
			BufferedReader br = new BufferedReader(fr);
			DataInputStream dis = new DataInputStream(fis);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			 /*byte[] result = new byte[(int)file.length()];
			 int totalBytesRead = 0;
			 while(totalBytesRead < result.length){
		          int bytesRemaining = result.length - totalBytesRead;
		          //input.read() returns -1, 0, or more :
		          int bytesRead = bis.read(result, totalBytesRead, bytesRemaining); 
		          if (bytesRead > 0){
		            totalBytesRead = totalBytesRead + bytesRead;
		            System.out.println(bytesRead);
		          }
		        }*/
			 
			 //long character = dis.readUnsignedShort();
			 int intChar = dis.read();
			 System.out.println(intChar);
		/*	bis.read(b, off, len)
			
			String input = br.readLine();
			//byte input = dis.readByte();
			for(int i=0;i<input.length();i++){
				
				int number = (int)input.charAt(i);
				System.out.println(number);	
			}
		*/	
			dis.close();
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

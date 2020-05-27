package com.ict.edu08;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io11.txt";
		File file = new File(pathname);
		String savepath = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io12.txt";
		File file1 = new File(savepath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
System.out.println("이 름\t총 점\t평 균\t학 점");
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			fw = new FileWriter(file1);
			bw = new BufferedWriter(fw);

			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();
			for (VO k : list) {
				System.out.print(k.getName()+"\t"+k.getSum()+"\t"+k.getAvg()+"\t"+k.getHak());
				System.out.println();
				bw.write(k.getName() + "\t" + k.getSum() + "\t" + k.getAvg() + "\t" + k.getHak()+"\n");
			}
			bw.flush();

		} catch (Exception e) {
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
				
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}

	}
}

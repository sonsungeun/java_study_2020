package com.ict.edu03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream 과 DataOutputStream
// 기본자료형을 주고받을때 사용
// ** 반드시 입력순서와 출력순서를 맞춰야 한다.
// 기본생성자가 없어서 BufferedInputStream과 BufferedOutputStream처럼 
// 혼자서는 사용 못하고 보통 FileInputStream, FileOutputStream을 활용한다.


public class Ex01 {
	public static void main(String[] args) {
		
	
	String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io04.txt";
	File file = new File(pathname);
	
	FileOutputStream fos = null;
	DataOutputStream dos = null;
	
	FileInputStream fis = null;
	DataInputStream dis = null;
	
	try {
	fos = new FileOutputStream(file);
	dos = new DataOutputStream(fos);
	
	fis = new FileInputStream(file);
	dis = new DataInputStream(fis);
	
	//쓰기 : writeXXX(); XXX란 기본 자료형을 말한다.
	dos.writeByte(126);
	dos.writeShort(5422);
	dos.writeInt(124);
	dos.writeLong(123L);
	dos.writeFloat(34.14f);
	dos.writeDouble(57.1);
	dos.writeBoolean(true);
	dos.writeChar('f');
	dos.flush();
	
	//읽기 : readXXX();
	System.out.println(dis.readByte());
	System.out.println(dis.readShort());
	System.out.println(dis.readInt());
	System.out.println(dis.readLong());
	System.out.println(dis.readFloat());
	System.out.println(dis.readDouble());
	System.out.println(dis.readBoolean());
	System.out.println(dis.readChar());
	
	} catch (Exception e) {
	}finally {
		try {
			if(dos!=null)dos.close();
			if(fos!=null)fos.close();
			if(dis!=null)dis.close();
			if(fis!=null)fis.close();
		} catch (Exception e2) {
		}
	}
	
	
	}
}

package day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream2 {
	public static void main(String[] args) {
		MakeFile m = new MakeFile();
//		m.make("c:\\");
//		m.delete("c:\\");
		/* m.putText("c:\\myText.txt"); */
		//m.readText("c:\\myText.txt");
	}
}

class MakeFile{
	public int make(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 파일 이름을 입력하세요(확장자까지)>>>");
		String fileName = sc.next();
		File MakeFile = new File(path + fileName);
		
		try {
			MakeFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 생성에 실패했습니다");
			return -1;
		}
		if(MakeFile.exists()) {
			System.out.println("파일 생성 완료");
		}
		return 1;
	}
	public int delete(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 파일 이름을 입력하세요(확장자까지)>>>");
		String fileName = sc.next();
		File file = new File(path + fileName);
		if(file.delete()) {
			System.out.println("삭제성공");
			return 1;
		}else {
			System.out.println("삭제 실패");
			return -1;
		}
	}
	
	// 파일 내용 입력하기(OutputStream)
	public void putText(String file){
		FileOutputStream f = null;
		try {
			f = new FileOutputStream(file, true);
			Scanner sc = new Scanner(System.in);
			System.out.println("입력할 내용>>>");
			String msg = sc.nextLine()+"\n";
			
			byte[] byteArray = msg.getBytes();
			
			f.write(byteArray);
			System.out.println("입력 완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("입력 불가");
		}finally {
			// try나 catch 후에 실행될 문장
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void readText(String file) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			InputStreamReader i = new InputStreamReader(fin, "UTF-8");
			BufferedReader b = new BufferedReader(i);
			String msg = null;
			while ((msg = b.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (Exception e) {
				e.printStackTrace();
				System.out.println("파일 읽기 실패");
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
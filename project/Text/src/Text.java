import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

public class Text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		Date date = new Date();
//		
//		System.out.println(date.toString());
//
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss");  
//
//		String s = formatter.format(date);
//		System.out.println(s);  
//		
//		StringBuilder a = new StringBuilder("liufeli");
//		String b = a.toString();
//		System.out.println(b);
		
		//		PrintWriter stdout = new PrintWriter(System.out);
		//		String a= "����";
		//		stdout.println(a);
		//		stdout.flush();
		//		Runtime.getRuntime().exec("cmd /c start cls ");	
//		int code = -1;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("��������Ҫ��Ĳ�Ʒ�ı��(������0�������)��");
//		
//		do {
//			
//			try {
//				code = Integer.parseInt(sc.nextLine());
//				break;
//			}catch(NumberFormatException nfe) {
//				System.out.println("������Ĳ�Ʒ��ŵĸ�ʽ���ԣ�����������");
//			}
//		}while(true);
//		for(int i=0;i<20;i++) {
//		System.out.printf("     %-11d\n", i);
//		}
//		try {
//			FileReader reader = new FileReader("menu.dat");
//		}catch(FileNotFoundException e) {
//			System.out.println("nin");
//		}
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		int four= 0;
		System.out.print("��������Ҫ�趨����������������");
		while(true) {
			try {
				four = Integer.parseInt(stdIn.readLine());
				if(four <= 0) {
					throw new NumberFormatException();
				}
				break;
			}catch(NumberFormatException nfe) {
				System.out.println("������������ĸ�ʽ�������������룺");
			}
		}
		
		
}}


	
	


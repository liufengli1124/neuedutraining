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
		//		String a= "肌肉";
		//		stdout.println(a);
		//		stdout.flush();
		//		Runtime.getRuntime().exec("cmd /c start cls ");	
//		int code = -1;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("请输入你要点的菜品的编号(以输入0结束点菜)：");
//		
//		do {
//			
//			try {
//				code = Integer.parseInt(sc.nextLine());
//				break;
//			}catch(NumberFormatException nfe) {
//				System.out.println("您输入的菜品编号的格式不对，请重新输入");
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
		System.out.print("请输入您要设定的四人桌的数量：");
		while(true) {
			try {
				four = Integer.parseInt(stdIn.readLine());
				if(four <= 0) {
					throw new NumberFormatException();
				}
				break;
			}catch(NumberFormatException nfe) {
				System.out.println("桌子数量输入的格式有误，请重新输入：");
			}
		}
		
		
}}


	
	


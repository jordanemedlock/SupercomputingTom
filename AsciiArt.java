import java.util.Scanner;
public class AsciiArt {
	public static void main (String[] args){
		letterA();
		letterB();
		letterC();
		letterD();
		letterE();
		letterF();
		letterG();
		letterH();
		letterI();
		letterJ();
		letterK();
		letterL();
		letterP();
		letterN();
		letterQ();
		letterR();
		letterS();
		letterU();
		letterV();
		letterW();
		letterX();
		letterY();
		letterZ();
		letterT();
		letterO();
		letterM();
		Scanner scan = new Scanner(System.in);
		String str = "";
		while (scan.hasNext()) {
			if (str.equals("quit")) {
				return;
			} else {
			str = scan.nextLine();

				for (int chars = 0; chars < str.length(); chars++){

					char c = str.charAt(chars);
					switch(c) {
						case 'a': 
						case 'A': 
						letterA();
						break;
						case 'b': 
						case 'B': 
						letterB();
						break;
						case 'c': 
						case 'C': 
						letterC();
						break;
						case 'd': 
						case 'D': 
						letterD();
						break;
						case 'e': 
						case 'E': 
						letterE();
						break;
						case 'f': 
						case 'F': 
						letterF();
						break;
						case 'g': 
						case 'G': 
						letterG();
						break;
						case 'h': 
						case 'H': 
						letterH();
						break;
						case 'i': 
						case 'I': 
						letterI();
						break;
						case 'j': 
						case 'J': 
						letterJ();
						break;
						case 'k': 
						case 'K': 
						letterK();
						break;
						case 'l': 
						case 'L': 
						letterL();
						break;
						case 'n': 
						case 'N': 
						letterN();
						break;
						case 'p': 
						case 'P': 
						letterP();
						break;
						case 'q': 
						case 'Q': 
						letterQ();
						break;
						case 'r': 
						case 'R': 
						letterR();
						break;
						case 'S': 
						case 's': 
						letterS();
						break;
						case 't': 
						case 'T': 
						letterT();
						break;
						case 'u': 
						case 'U': 
						letterU();
						break;
						case 'v': 
						case 'V': 
						letterV();
						break;
						case 'W': 
						case 'w': 
						letterW();
						break;
						case 'X': 
						case 'x': 
						letterX();
						break;
						case 'y': 
						case 'Y': 
						letterY();
						break;
						case 'z': 
						case 'Z': 
						letterZ();
						break;

						case 'o':
						case 'O': 
						letterO();
						break;

						case 'm':
						case 'M': 
						letterM();
						break;

					}
				}
			}
		}
	}

	public static void letterA(){
		System.out.println("....#....");
		System.out.println("...#.#...");
		System.out.println("..#####..");
		System.out.println(".#.....#.");
		System.out.println("#.......#");
	}
	public static void letterB(){
		System.out.println("..#####..");
		System.out.println("..#....#.");
		System.out.println("..#####..");
		System.out.println("..#....#.");
		System.out.println("..#####..");
	}
	public static void letterC(){
		System.out.println("...####..");
		System.out.println("..#......");
		System.out.println("..#......");
		System.out.println("..#......");
		System.out.println("...####..");
	}
	public static void letterD(){
		System.out.println("..####...");
		System.out.println("..#...#..");
		System.out.println("..#...#..");
		System.out.println("..#...#..");
		System.out.println("..####...");
	}
	public static void letterE(){
		System.out.println("..#####..");
		System.out.println("..#......");
		System.out.println("..####...");
		System.out.println("..#......");
		System.out.println("..#####..");
	}
	public static void letterF(){
		System.out.println("..#####..");
		System.out.println("..#......");
		System.out.println("..####...");
		System.out.println("..#......");
		System.out.println("..#......");
	}
	public static void letterG(){
		System.out.println("...####..");
		System.out.println("..#......");
		System.out.println("..#..###.");
		System.out.println("..#....#.");
		System.out.println("...####..");
	}
	public static void letterH(){
		System.out.println("..#....#.");
		System.out.println("..#....#.");
		System.out.println("..######.");
		System.out.println("..#....#.");
		System.out.println("..#....#.");
	}
	public static void letterI(){
		System.out.println(".#######.");
		System.out.println("....#....");
		System.out.println("....#....");
		System.out.println("....#....");
		System.out.println(".#######.");
	}
	public static void letterJ(){
		System.out.println(".#######.");
		System.out.println(".....#...");
		System.out.println(".....#...");
		System.out.println(".#...#...");
		System.out.println("..###....");
	}
	public static void letterK(){
		System.out.println("..#...#..");
		System.out.println("..#..#...");
		System.out.println("..###....");
		System.out.println("..#..#...");
		System.out.println("..#...#..");
	}
	public static void letterL(){
		System.out.println("..#......");
		System.out.println("..#......");
		System.out.println("..#......");
		System.out.println("..#......");
		System.out.println("..######.");
	}
	public static void letterM(){
		System.out.println(".#....#..");
		System.out.println(".##..##..");
		System.out.println(".#.##.#..");
		System.out.println(".#....#..");
		System.out.println(".#....#..");
	}
	public static void letterN(){
		System.out.println(".#....#..");
		System.out.println(".##...#..");
		System.out.println(".#.#..#..");
		System.out.println(".#..#.#..");
		System.out.println(".#...##..");
	}
	public static void letterO(){
		System.out.println("..####...");
		System.out.println(".#....#..");
		System.out.println(".#....#..");
		System.out.println(".#....#..");
		System.out.println("..####...");
	}
	public static void letterP(){
		System.out.println("..####...");
		System.out.println(".#....#..");
		System.out.println(".#####...");
		System.out.println(".#.......");
		System.out.println(".#.......");
	}
	public static void letterQ(){
		System.out.println("..####...");
		System.out.println(".#....#..");
		System.out.println(".#....#..");
		System.out.println(".#..#.#..");
		System.out.println("..####...");
	}
	public static void letterR(){
		System.out.println(".#####...");
		System.out.println(".#....#..");
		System.out.println(".#####...");
		System.out.println(".#...#...");
		System.out.println(".#....#..");
	}
	public static void letterS(){
		System.out.println("..#####..");
		System.out.println(".#.......");
		System.out.println(".######..");
		System.out.println("......#..");
		System.out.println(".#####...");
	}
	public static void letterT(){
		System.out.println(".#######.");
		System.out.println("....#....");
		System.out.println("....#....");
		System.out.println("....#....");
		System.out.println("....#....");
	}
	public static void letterU(){
		System.out.println(".#....#..");
		System.out.println(".#....#..");
		System.out.println(".#....#..");
		System.out.println(".#....#..");
		System.out.println("..####...");
	}
	public static void letterV(){
		System.out.println(".#....#..");
		System.out.println(".#....#..");
		System.out.println(".#....#..");
		System.out.println("..#..#...");
		System.out.println("...##....");
	}
	public static void letterW(){
		System.out.println(".#....#..");
		System.out.println(".#....#..");
		System.out.println(".#.##.#..");
		System.out.println(".##..##..");
		System.out.println(".#....#..");
	}
	public static void letterX(){
		System.out.println(".#....#..");
		System.out.println("..#..#...");
		System.out.println("...##....");
		System.out.println("..#..#...");
		System.out.println(".#....#..");
	}
	public static void letterY(){
		System.out.println(".#....#..");
		System.out.println("..#..#...");
		System.out.println("....#....");
		System.out.println("....#....");
		System.out.println("....#....");
	}
	public static void letterZ(){
		System.out.println(".######..");
		System.out.println(".....#...");
		System.out.println("....#....");
		System.out.println("...#.....");
		System.out.println(".######..");
	}
}

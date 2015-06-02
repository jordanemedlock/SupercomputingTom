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
			str = scan.nextLine();
			if (str.equals("quit")) {
				return;
			} else {

				for (int chars = 0; chars < str.length(); chars++){

					char c = str.charAt(chars);
					String letterString = "";
					switch(c) {
						case 'a': 
						case 'A': 
							letterString = letterA();
							break;
						case 'b': 
						case 'B': 
							letterString = letterB();
							break;
						case 'c': 
						case 'C': 
							letterString = letterC();
							break;
						case 'd': 
						case 'D': 
							letterString = letterD();
							break;
						case 'e': 
						case 'E': 
							letterString = letterE();
							break;
						case 'f': 
						case 'F': 
							letterString = letterF();
							break;
						case 'g': 
						case 'G': 
							letterString = letterG();
							break;
						case 'h': 
						case 'H': 
							letterString = letterH();
							break;
						case 'i': 
						case 'I': 
							letterString = letterI();
							break;
						case 'j': 
						case 'J': 
							letterString = letterJ();
							break;
						case 'k': 
						case 'K': 
							letterString = letterK();
							break;
						case 'l': 
						case 'L': 
							letterString = letterL();
							break;
						case 'n': 
						case 'N': 
							letterString = letterN();
							break;
						case 'p': 
						case 'P': 
							letterString = letterP();
							break;
						case 'q': 
						case 'Q': 
							letterString = letterQ();
							break;
						case 'r': 
						case 'R': 
							letterString = letterR();
							break;
						case 'S': 
						case 's': 
							letterString = letterS();
							break;
						case 't': 
						case 'T': 
							letterString = letterT();
							break;
						case 'u': 
						case 'U': 
							letterString = letterU();
							break;
						case 'v': 
						case 'V': 
							letterString = letterV();
							break;
						case 'W': 
						case 'w': 
							letterString = letterW();
							break;
						case 'X': 
						case 'x': 
							letterString = letterX();
							break;
						case 'y': 
						case 'Y': 
							letterString = letterY();
							break;
						case 'z': 
						case 'Z': 
							letterString = letterZ();
							break;

						case 'o':
						case 'O': 
							letterString = letterO();
							break;

						case 'm':
						case 'M': 
							letterString = letterM();
							break;

					}
					System.out.println(letterString);
				}
			}
		}
	}

	public static String letterA(){
		return "\n....#....\n...#.#...\n..#####..\n.#.....#.\n#.......#";
	}

	public static String letterB(){
		return "\n..#####..\n..#....#.\n..#####..\n..#....#.\n..#####..";
	}

	public static String letterC(){
		return "\n...####..\n..#......\n..#......\n..#......\n...####..";
	}

	public static String letterD(){
		return "\n..####...\n..#...#..\n..#...#..\n..#...#..\n..####...";
	}

	public static String letterE(){
		return "\n..#####..\n..#......\n..####...\n..#......\n..#####..";
	}

	public static String letterF(){
		return "\n..#####..\n..#......\n..####...\n..#......\n..#......";
	}

	public static String letterG(){
		return "\n...####..\n..#......\n..#..###.\n..#....#.\n...####..";
	}

	public static String letterH(){
		return "\n..#....#.\n..#....#.\n..######.\n..#....#.\n..#....#.";
	}

	public static String letterI(){
		return "\n.#######.\n....#....\n....#....\n....#....\n.#######.";
	}

	public static String letterJ(){
		return "\n.#######.\n.....#...\n.....#...\n.#...#...\n..###....";
	}

	public static String letterK(){ 
		return "\n..#...#..\n..#..#...\n..###....\n..#..#...\n..#...#..";
	}

	public static String letterL(){
		return "\n..#......\n..#......\n..#......\n..#......\n..######.";
	}

	public static String letterM(){
		return "\n.#....#..\n.##..##..\n.#.##.#..\n.#....#..\n.#....#..";
	}

	public static String letterN(){
		return "\n.#....#..\n.##...#..\n.#.#..#..\n.#..#.#..\n.#...##..";
	}

	public static String letterO(){
		return "\n..####...\n.#....#..\n.#....#..\n.#....#..\n..####...";
	}

	public static String letterP(){
		return "\n..####...\n.#....#..\n.#####...\n.#.......\n.#.......";
	}

	public static String letterQ(){
		return "\n..####...\n.#....#..\n.#....#..\n.#..#.#..\n..####...";
	}

	public static String letterR(){
		return "\n.#####...\n.#....#..\n.#####...\n.#...#...\n.#....#..";
	}

	public static String letterS(){
		return "\n..#####..\n.#.......\n.######..\n......#..\n.#####...";
	}

	public static String letterT(){
		return "\n.#######.\n....#....\n....#....\n....#....\n....#....";
	}

	public static String letterU(){
		return "\n.#....#..\n.#....#..\n.#....#..\n.#....#..\n..####...";
	}

	public static String letterV(){
		return "\n.#....#..\n.#....#..\n.#....#..\n..#..#...\n...##....";
	}

	public static String letterW(){
		return "\n.#....#..\n.#....#..\n.#.##.#..\n.##..##..\n.#....#..";
	}

	public static String letterX(){
		return "\n.#....#..\n..#..#...\n...##....\n..#..#...\n.#....#..";
	}

	public static String letterY(){
		return "\n.#....#..\n..#..#...\n....#....\n....#....\n....#....";
	}

	public static String letterZ(){
		return "\n.######..\n.....#...\n....#....\n...#.....\n.######..";
	}

}

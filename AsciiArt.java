 import java.io.FileOutputStream;
 import java.io.OutputStreamWriter;
 import java.io.File;
 import java.io.BufferedWriter;
 import java.util.Scanner;
 public class AsciiArt {
 	public static void main (String[] args){
		File fout = new File("out.txt");

 		Scanner scan = new Scanner(System.in);
 		String str = "";
 		BufferedWriter bw = null;
 		try {
			FileOutputStream fos = new FileOutputStream(fout);

			bw = new BufferedWriter(new OutputStreamWriter(fos));
		
	 		while (scan.hasNext()) {
	 			str = scan.nextLine();
	 			if (str.equals("quit")) {

	 				break;
	 			} else {
 					bw.write(stringToAsciiArt(str));
	 			}
	 		}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}


 	public static String stringToAsciiArt(String s) {

 		String ret = "";

 		for (int chars = 0; chars < s.length(); chars++){

 			char c = s.charAt(chars);
 			int n = charToNum (c);
 			String en = nthLetter(n);

 			ret += en;
/*
					//public static void writeFile1() throws IOException {
						//File fout = new File("out.txt");
						//FileOutputStream fos = new FileOutputStream(fout);
						
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
						
						while (scan.hasNext()) {
							bw.write(en);
							bw.newLine();

						}
						
						bw.close(); 
					}
*/
					// System.out.println(en);
				}
				return ret;
			}

			public static int charToNum(char c) {
				if (Character.isLowerCase(c)) {
					return c - 97;
				} else {
					return c - 65;
				}
			}

			public static String nthLetter(int n) {
				return (letters).substring(n*50, n*50 +50); 
			}

			static String letters = "\n....#....\n...#.#...\n..#####..\n.#.....#.\n#.......#\n..#####..\n..#....#.\n..#####..\n..#....#.\n..#####..\n...####..\n..#......\n..#......\n..#......\n...####..\n..####...\n..#...#..\n..#...#..\n..#...#..\n..####...\n..#####..\n..#......\n..####...\n..#......\n..#####..\n..#####..\n..#......\n..####...\n..#......\n..#......\n...####..\n..#......\n..#..###.\n..#....#.\n...####..\n..#....#.\n..#....#.\n..######.\n..#....#.\n..#....#.\n.#######.\n....#....\n....#....\n....#....\n.#######.\n.#######.\n.....#...\n.....#...\n.#...#...\n..###....\n..#...#..\n..#..#...\n..###....\n..#..#...\n..#...#..\n..#......\n..#......\n..#......\n..#......\n..######.\n.#....#..\n.##..##..\n.#.##.#..\n.#....#..\n.#....#..\n.#....#..\n.##...#..\n.#.#..#..\n.#..#.#..\n.#...##..\n..####...\n.#....#..\n.#....#..\n.#....#..\n..####...\n..####...\n.#....#..\n.#####...\n.#.......\n.#.......\n..####...\n.#....#..\n.#....#..\n.#..#.#..\n..####...\n.#####...\n.#....#..\n.#####...\n.#...#...\n.#....#..\n..#####..\n.#.......\n.######..\n......#..\n.#####...\n.#######.\n....#....\n....#....\n....#....\n....#....\n.#....#..\n.#....#..\n.#....#..\n.#....#..\n..####...\n.#....#..\n.#....#..\n.#....#..\n..#..#...\n...##....\n.#....#..\n.#....#..\n.#.##.#..\n.##..##..\n.#....#..\n.#....#..\n..#..#...\n...##....\n..#..#...\n.#....#..\n.#....#..\n..#..#...\n....#....\n....#....\n....#....\n.######..\n.....#...\n....#....\n...#.....\n.######..";

		}

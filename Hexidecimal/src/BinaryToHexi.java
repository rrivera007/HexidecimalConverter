import java.util.Scanner;

public class BinaryToHexi 
{

	public static void main(String[] args) 
	{
		String Binary = Intro();
		String hexi = BinToHex(Binary);
		System.out.println("Hexidecimal form: " + hexi + "h\n");
		String Back = HexToBin(hexi);
		System.out.println("Back to Binary Form: " + Back);

	}
	
	
	public static String HexToBin(String hexi)
	{
		StringBuilder str = new StringBuilder();
		int mid = hexi.length()/2;
		String[] Half = {hexi.substring(0, mid),hexi.substring(mid)};
		
		for (int i = 0; i<2;i++)
		{
			switch (Half[i])
			{
				case "0":
				{
					str.append("0000");
					break;
				}
				case "1":
				{
					str.append("0001");
					break;
				}
				case "2":
				{
					str.append("0010");
					break;
				}
				case "3":
				{
					str.append("0011");
					break;
				}
				case "4":
				{
					str.append("0100");
					break;
				}
				case "5":
				{
					str.append("0101");
					break;
				}
				case "6":
				{
					str.append("0110");
					break;
				}
				case "7":
				{
					str.append("0111");
					break;
				}
				case "8":
				{
					str.append("1000");
					break;
				}
				case "9":
				{
					str.append("1001");
					break;
				}
				case "A":
				{
					str.append("1010");
					break;
				}
				case "B":
				{
					str.append("1011");
					break;
				}
				case "C":
				{
					str.append("1100");
					break;
				}
				case "D":
				{
					str.append("1101");
					break;
				}
				case "E":
				{
					str.append("1110");
					break;
				}
				case "F":
				{
					str.append("1111");
					break;
				}
				default:
				{
					System.out.println("ERROR, try again");
				}
			
			}
		}
			
			String Final = str.toString();
			return Final;
		
	}
	
	
	public static String BinToHex(String Binary)  
	{
		
		StringBuilder str = new StringBuilder();
		int mid = Binary.length()/2;
		String[] Half = {Binary.substring(0, mid),Binary.substring(mid)};

		for (int i = 0; i<2;i++) 
		{
			switch (Half[i])
			{
				case "0000":
				{
					str.append("0");
					break;
				}
				case "0001":
				{
					str.append("1");
					break;
				}
				case "0010":
				{
					str.append("2");
					break;
				}
				case "0011":
				{
					str.append("3");
					break;
				}
				case "0100":
				{
					str.append("4");
					break;
				}
				case "0101":
				{
					str.append("5");
					break;
				}
				case "0110":
				{
					str.append("6");
					break;
				}
				case "0111":
				{
					str.append("7");
					break;
				}
				case "1000":
				{
					str.append("8");
					break;
				}
				case "1001":
				{
					str.append("9");
					break;
				}
				case "1010":
				{
					str.append("A");
					break;
				}
				case "1011":
				{
					str.append("B");
					break;
				}
				case "1100":
				{
					str.append("C");
					break;
				}
				case "1101":
				{
					str.append("D");
					break;
				}
				case "1110":
				{
					str.append("E");
					break;
				}
				case "1111":
				{
					str.append("F");
					break;
				}
				default:
				{
					System.out.println("ERROR, try again");
				}
			
			}
		}
			
			String Final = str.toString();
			return Final;
				
	}
	
	
	public static String Intro ()
	{
		System.out.println("This program will convert Binary to Hexidecimal and back");
		System.out.println("please enter a 8-bit Binary Number (no spaces): ");
		Scanner in = new Scanner(System.in);
		String Binary = in.nextLine();
		return Binary;
	}

}

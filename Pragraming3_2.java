
public class Pragraming3_2 
{
	public static void main(String[] args)
	 {
		String s = "Pradeep Ramayanam F00445315";
		for(int i=0; i<= s.length()-1; i++)
		{
			char alpha = s.charAt(i);
			if(!((alpha == 'a')||(alpha == 'e')||(alpha == 'i')||(alpha == 'o')||(alpha == 'u')||
				(alpha == 'A')||(alpha == 'E')||(alpha == 'I')||(alpha == 'O')||(alpha == 'U')||(alpha == ' ')||(alpha == '0')||(alpha == '1')||(alpha == '2')||(alpha == '3')||(alpha == '4')||
				(alpha == '5')||(alpha == '6')||(alpha == '7')||(alpha == '8')||(alpha == '9')))
				System.out.println(s.charAt(i));
		}
		
		}
	
}

import java.util.Scanner;
class vowel_consonent
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch[]={'a','e','i','s','g','m','o','t','u'};
		int vowel=0;
		int consonent=0;
		
		for(char c:ch)
		{
			System.out.println(c);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				vowel++;
			}
			else
			{
				consonent++;
			}
		}
		System.out.println("vowel:"+vowel);
		System.out.println("consonent:"+consonent);
		
		if(ch=='a')
		{
			System.out.println(vowel);
		}
		else
		{
			System.out.println(consonent);
		}
	}
}
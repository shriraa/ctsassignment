package com.cts.strinng;

public class StringComparison {
	public Boolean isSame(String first,String second)
	{
		boolean flag=true;
		int len_first=first.length();
		int len_second=second.length();
		if(len_first==len_second)
		{
			char f_chara = first.charAt(0);
			char s_chara = second.charAt(0);
			if(f_chara==s_chara)
			{
				for(int i=1;i<len_first;i++)
				{
					char f_letter = first.charAt(i);
					char s_letter = second.charAt(i);
					if(f_letter==s_letter)
					{
						flag=true;
					}
				}
			}
		}
		else
		{
			flag= false;
		}
		return flag;
	}


}

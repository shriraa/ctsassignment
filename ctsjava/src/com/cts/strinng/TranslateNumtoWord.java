package com.cts.strinng;

public class TranslateNumtoWord {

	public String displayTranslate(int num)
		{
			TranslateInttoWord tiw1 = new TranslateInttoWord();
			
			String T="";
			String w = Integer.toString(num);
			String str[]= w.split("");
			
			String c[] = {" ","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			String d[] = {"Twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
			String e[] = {"Thousand","hundred"};
			
			int i,k=0;
			int len= (int)(Math.log10(num)+1);
			
			for(i=len;i>k;--i)
			{	
				if(i==4)
				{
					T=T + tiw1.toTranslateToWord(Integer.parseInt(str[0]))+c[0];
					T=T+e[0]+c[0];
				}
				else if(i==3)
				{
					T=T + tiw1.toTranslateToWord(Integer.parseInt(str[1]))+c[0];
					T=T+e[1]+c[0];
				}
				else if(i==2)
				{
					int s=Integer.parseInt(str[2]);
					if(s!=1)
					{
						switch(s)
						{
						case 2: T=T+d[0]+c[0];break;
						case 3: T=T+d[1]+c[0];break;
						case 4: T=T+d[2]+c[0];break;
						case 5: T=T+d[3]+c[0];break;
						case 6: T=T+d[4]+c[0];break;
						case 7: T=T+d[5]+c[0];break;
						case 8: T=T+d[6]+c[0];break;
						case 9: T=T+d[7]+c[0];break;
						}
					}
					else
					{
						int q=Integer.parseInt(str[3]);
						switch(q)
						{
						case 0: T=T+c[1];break;
						case 1: T=T+c[2];break;
						case 2: T=T+c[3];break;
						case 3: T=T+c[4];break;
						case 4: T=T+c[5];break;
						case 5: T=T+c[6];break;
						case 6: T=T+c[7];break;
						case 7: T=T+c[8];break;
						case 8: T=T+c[9];break;
						case 9: T=T+c[10];break;
						}
						return T;
					}
				}
				else if(i==1)
				{
					T=T + tiw1.toTranslateToWord(Integer.parseInt(str[3]))+c[0];
				}
			}
			return T;
		}


	}



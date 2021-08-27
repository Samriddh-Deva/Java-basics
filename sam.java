
public class sam
{
void main(String str)
{
    
  int l,i;
  char ch,ch1;
str=str.trim();
  str=str+" ";l=str.length();
  for(i=0;i<l-1;i++)
  {
    ch=str.charAt(i);
    ch1=str.charAt(i+1);
    if(ch!=ch1)
    System.out.print(ch);
    }
}}
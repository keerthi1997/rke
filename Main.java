import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args)throws IOException
{
char n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=(char)br.read();
if(n=='a' || n=='e' ||n=='i' || n=='o' ||n=='u')
System.out.println(n+" is vowel");
else
System.out.println(n+" is consonent");

}
}

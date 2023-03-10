import java.util.Scanner;

public class Equations
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        String equone = sc.next();
        String equtwo = sc.next();
        String onex="",oney="",onecons="",twox="",twoy="",twocons="";
        String temp = "";
        int oneindex = -1, twoindex = -1;
        for(int i=0; i<equone.length(); i++)
        {
        	char ch = equone.charAt(i);
            if(ch>='0' && ch<='9' || ch=='+' || ch=='-')
              temp = temp+ch;
           if(ch=='x')
           { 
               onex = temp;
               temp = "";
           }
           else if(ch=='y')
           {
                oney = temp;
                temp = "";
            }
           else if(ch=='=')
          {
               oneindex = i;
               break;
          }
        }
        for(int i=oneindex+1; i<equone.length(); i++)
             onecons = onecons + equone.charAt(i);
        int xone = Integer.parseInt(onex);
        int yone = Integer.parseInt(oney);
        int consone = Integer.parseInt(onecons);
        temp = "";
        for(int i=0; i<equtwo.length(); i++)
        {
           char ch = equtwo.charAt(i);
           if(ch>='0' && ch<='9' || ch=='+' || ch=='-')
            temp = temp + ch;
           if(ch=='x')
           {
             twox = temp;
               temp = "";
           }
           else if(ch=='y')
          {
             twoy = temp;
             temp = "";
          }
           else if(ch=='=')
          {
               twoindex = i;
               break;
            }
        }

        for(int i=twoindex+1; i<equtwo.length(); i++)
            twocons = twocons + equtwo.charAt(i);
        
          int xtwo = Integer.parseInt(twox);
          int ytwo = Integer.parseInt(twoy);
          int constwo = Integer.parseInt(twocons);
          
          int mulonex = xone*xtwo;
          int muloney = yone*xtwo;
          int mulonecon = consone*xtwo;

          int multwox = xtwo*xone;
          int multwoy = ytwo*xone;
          int multwocon = constwo*xone;
          
           if(mulonex == multwox)
           {
               multwoy = -1*multwoy;
                multwocon = -1*multwocon;
           }
           
           int coeffofy = muloney+multwoy;
           int coeffofcons = mulonecon + multwocon;
           int finaly = coeffofcons/coeffofy;
           
           int firsty = finaly*yone;
           int firstcons = consone -firsty;
           int finalx = firstcons/xone;
           
            System.out.println("The value of x is "+finalx);
            System.out.println("The value of y is "+finaly);

	}

}

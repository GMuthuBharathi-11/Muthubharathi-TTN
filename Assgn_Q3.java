import java.util.Scanner;
public class Assgn_Q3
{
        static void area(int r)
        {
            double res=3.14*r*r;
            System.out.println(res);
        }
        static void circum(int r)
        {
            double res=2*3.14*r;
            System.out.println(res);
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Radius:");
            int r=sc.nextInt();
            int c;
            do
            {
                System.out.println("*******Menu*******\n" +
                        "1. Calculate Area of Circle\n" +
                        "2. Calculate Circumference of a Circle\n" +
                        "3. Exit.\n");
                c=sc.nextInt();
                switch (c)
                {
                    case 1:
                        area(r);
                        break;
                    case 2:
                        circum(r);
                        break;
                    case 3:
                        System.out.println("Exiting now");
                        System.exit(4);
                }
            } while(c>=1&&c<3);
        }

    }

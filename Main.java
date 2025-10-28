import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = scan.nextInt();
      uprightNumberTriangle(num);
      
      starTree();
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String letter = word.substring(i, i+1);
      for (int j = 0; j < N; j++)
      {
        System.out.print(letter);
      }
      System.out.println();
    }
  }

  public static void printNums()
  {
    for (int i = 10; i > 0; i--)
    {
       for (int j = i; j > 0; j--)
        {
          System.out.print(i);

        }
         System.out.println();
    } 
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int row = 1; row <= N+1; row++)
      {
        for (int count = 1; count < row; count++)
        System.out.print(count + " ");
        System.out.print("\n");
      }
  }

  public static void starTree()
  {
    String space = " ";
    for (int i = 9; i >=1; i--)
      {
        for (int j = i; j >= 1; j--)
          {
            for (int controller = 10; controller < 10; controller--)
            {
              space += " ";
            }
            System.out.print(space +"*" + " ");
          }

            System.out.print("\n");
      }
  }

  public static void multTable()
  {
    // code solution here
  }
}

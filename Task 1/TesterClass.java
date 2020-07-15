import java.util.Scanner;
public class TesterClass
{
    public static void main(String[]args)
    {
        Scanner key=new Scanner(System.in);
        BookRecord br1=new BookRecord();
        for(String option="Y";option.equals("Y");)
        {
            System.out.println("Enter 1 to Add a Record");
            System.out.println("Enter 2 to Print the Records");
            System.out.println("Enter 3 to Delete a Record");
            System.out.println("Enter 4 to Edit a Record");
            int answer=key.nextInt();
            System.out.println("");
            switch(answer)
            {
                case 1:
                    System.out.println("Please enter the name of the book");
                    String bugFix1=key.nextLine();
                    String name=key.nextLine();
                    System.out.println("Please enter the ID of the book");
                    int Id=key.nextInt();
                    System.out.println("Please enter the name of the author of the book "+name);
                    String bugFix3=key.nextLine();
                    String author=key.nextLine();
                    System.out.println("Please enter the name of the publisher of the book "+name);
                    String publisher=key.nextLine();
                    br1.AddRecord(name,Id,author,publisher);
                    break;
                case 2:
                    br1.PrintRecord();
                    break;
                case 3:
                    System.out.println("Please enter the ID of the book that you want to delete");
                    int id=key.nextInt();
                    br1.DeleteRecord(id);
                    break;
                case 4:
                    System.out.println("Please enter the ID of the book that you want to edit");
                    int i=key.nextInt();
                    System.out.println("Please enter The fields that you want to change or else type \"NO\"\nBOOK'S NAME:");
                    String bugFix5=key.nextLine();
                    String n=key.nextLine();
                    System.out.println("AUTHOR'S NAME:");
                    String a=key.nextLine();
                    System.out.println("PUBLISHER'S NAME:");
                    String p=key.nextLine();
                    br1.EditRecord(i,n,a,p);
                    break;
                default:
                    break;
            }
            System.out.println("If you want to continue the program type y/Y");
            option=(key.next()).toUpperCase();
        }
    }
}
import java.io.*;
public class TesterClass
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr=new FileReader("Book.txt");
            BufferedReader br=new BufferedReader(fr);
            PrintWriter pw=new PrintWriter("Object.txt");
            Book []BookArray=new Book[0];
            String bookInfo;
            while((bookInfo=br.readLine())!=null){
                String []info=bookInfo.split(" ");
                BookArray=resizeArray(BookArray);
                BookArray[BookArray.length-1] =new Book(Integer.parseInt(info[0]),info[1],info[2],info[3]);
            }
            for(int i=0;i<BookArray.length;i++)
            {
                pw.println(BookArray[i].Id+" "+BookArray[i].Name+" "+BookArray[i].Author+" "+BookArray[i].Publisher);
            }
            pw.close();
        }
        catch(FileNotFoundException fnf)
        {
            System.out.println("File not found");
        }
        catch(IOException io)
        {
            System.out.println(io);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static Book []resizeArray(Book []BookArray)
    {
        Book []BA=new Book[BookArray.length+1];
        for(int i=0;i<BookArray.length;i++)
        {
            BA[i]=BookArray[i];
        }
        BookArray=BA;
        return BookArray;
    }
}

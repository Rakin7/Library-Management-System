public class Book
{
    public String Name,Author,Publisher;
    public int Id;
    public Book(String n,int id,String a,String p)
    {
        Name=n;
        Id=id;
        Author=a;
        Publisher=p;
    }
    public String toString()
    {
        return "Book Name: "+Name+", ID: "+Id+", Author: "+Author+", Publisher: "+Publisher+"\n";
    }
}
    
public class BookRecord
{
    int size=0;
    Book []BookArray=new Book[0];
    public void AddRecord(String n,int Id,String a,String p)
    {
        if(size==BookArray.length)
        {
            Book []BA=new Book[BookArray.length+1];
            for(int i=0;i<BookArray.length;i++)
            {
                BA[i]=BookArray[i];
            }
            BookArray=BA;
        }
        BookArray[size]=new Book(n,Id,a,p);
        size++;
    }
    public void PrintRecord()
    {
        for(int i=0;i<size-1;i++)
        {
            int minPos=i;
            Book temp;
            for(int j=i+1;j<size;j++)
            {
                if(((BookArray[i].Name).compareTo(BookArray[j].Name))>0)
                {
                    minPos=j;
                }
                else if(((BookArray[i].Name).compareTo(BookArray[j].Name))==0)
                {
                    if(BookArray[i].Id>BookArray[j].Id)
                    {
                        minPos=j;
                    }
                }
                temp=BookArray[i];
                BookArray[i]=BookArray[minPos];
                BookArray[minPos]=temp;
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(BookArray[i]);
        }
        System.out.println("**************************");
    }
    public void DeleteRecord(int Id)
    {
        int check=0,start=0;
        for(int i=0;i<size;i++)
        {
            if((BookArray[i].Id)-Id==0)
            {
                check++;
                start=i;
                break;
            }
        }
        if(check==0)
        {
            System.out.println("ID:"+Id+" does not exist");
        }
        else
        {
            System.out.println("ID "+Id+" is deleted.");
            for(;start<size-1;start++)
            {
                BookArray[start]=BookArray[start+1];
            }
            BookArray[size-1]=null;
            size--;
        }
    }
    public void EditRecord(int Id,String n,String a,String p)
    {
        int check=0;
        int change=0;
        for(int i=0;i<size;i++)
        {
            if((BookArray[i].Id)-Id==0)
            {
                check++;
                change=i;
                break;
            }
        }
        if(check==0)
        {
            System.out.println("ID:"+Id+" does not exist");
        }
        else
        {
            if((n.toUpperCase()).equals("NO"))
            {
            }
            else
            {
                BookArray[change].Name=n;
            }
            if((a.toUpperCase()).equals("NO"))
            {
            }
            else
            {
            BookArray[change].Author=a;
            }
            if((p.toUpperCase()).equals("NO"))
            {
            }
            else
            {
            BookArray[change].Publisher=p;
            }
        }
    }
}

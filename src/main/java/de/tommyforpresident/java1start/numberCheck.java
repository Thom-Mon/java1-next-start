package de.tommyforpresident.java1start;

public class numberCheck
{
    public void checkTheNumber(Counter counter)
    {
        if (counter.getCounter()%5==0 && counter.getCounter()%7==0)
        {
            System.out.println("FitzQuark");
        }
        else if (counter.getCounter()%5==0)
        {
            System.out.println("Fitz");
        }
        else if (counter.getCounter()%7==0)
        {
            System.out.println("Quark");
        }
        else
        {
            System.out.println(counter.getCounter());
        }
    }
}

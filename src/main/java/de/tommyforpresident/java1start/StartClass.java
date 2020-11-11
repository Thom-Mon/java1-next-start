package de.tommyforpresident.java1start;

public class StartClass {

        public static void main(String[] args)
        {
            Counter counter = new Counter();
            numberCheck number = new numberCheck();

            while (counter.getCounter()<=100)
            {
                number.checkTheNumber(counter);
                counter.IncreaseCounter();
            }


        }
}

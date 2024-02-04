public class EvenOdd {
    public void evenOdd() // method to separate even and odd numbers from input data
    {
        int i; // iteration variable
        Input input = new Input(); // creating an instance of the Input class to get input data
        int[] d = input.inputData(); // data stored in array d
        int s = d.length; // length of data
        int[] evenArray = new int[s]; // array to store even numbers
        int[] oddArray = new int[s]; // array to store odd numbers
        int evencount=0, oddcount = 0, flag = 0; // necessary counters and flag
        for(i=0;i<s;i++)
        {
            if(d[i]%2==0 && d[i]!=0) // condition for even number and to avoid 0 in  even array
            {
                evenArray[evencount] = d[i];
                evencount++;
            }
            else if(d[i]==0) // if 0 present flag == 1
            {
                flag = 1;
            }
            else // condition for odd numbers. no need to code as even numbers and 0 is taken care of.
            {
                oddArray[oddcount] = d[i];
                oddcount++;
            }
        }
        System.out.println("Elements of even array :"); // printing even numbers
        for(i=0;i<evencount;i++)
        {
            System.out.print(evenArray[i]+" ");
        }
        System.out.println(); // to get next output in next line
        System.out.println("Elements of odd array :"); // printing odd numbers
        for(i=0;i<oddcount;i++)
        {
            System.out.print(oddArray[i]+" ");
        }
        if(flag == 1) // if 0 present then only print the below
        {
            System.out.println(); // to get next output in next line
            System.out.println("0 is neither odd nor even.");
        }
    }
}

public class factorial // class to find factorial
{
    public int fact(int num) // method to find factorial
    {
        int result = 1;
        for(int i=num; i>=1; i--)
            result = result * i;
        return result; // returns the factorial of the number
    }

}

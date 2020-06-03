/**
 * "abcd"
 * a concat reverse(bcd)
 *  b concat reverse(cd)
 *   c concat reverse(d)
 *    d  ==> c
 *  dc  ==> dcb
 * dcb ==> a
 * 
 * dcba
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestRecursion
{
    public TestRecursion()
    {
        String x = reverse("abcd");
        System.out.println(x);
        System.out.println("nth fib value: " + fib(50));
    }
    
    public long fib(int n)
    {
        if(n <= 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    public String reverse(String s)
    {
        String result = "";
        
        if(s.length() == 1) {
            result = s;
        }
        else {
            String firstCharacter = s.substring(0,1);
            String allButFirst = s.substring(1);
            result = reverse(allButFirst) + firstCharacter;
        }
        
        return result;
    }
}
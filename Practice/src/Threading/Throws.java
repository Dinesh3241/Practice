public class Throws{
    int i = 10;
    int res = i/0;

    public void Error() throws Exception{
        System.out.println(res);
        throw new Exception("Zero can't be in denominator");
    } 
}
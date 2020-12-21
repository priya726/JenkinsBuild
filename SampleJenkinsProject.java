public class SampleJenkinsProject
{
public static void main(String[] args)
{     SampleJenkinsProject sjp=new SampleJenkinsProject();
      String result=sjp.getData();
      System.out.println("The result is"+result);
      System.out.println("Hello world");
}
public String getData()
{
   return "Hello World From GetData";
}
}
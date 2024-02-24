class VivekException extends Exception{
    public VivekException(String string)
    {
        super(string);
    }
}
public class throw_keyword {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new VivekException("I dont want to print zero");
                // throw new ArithmeticException("I dont want to print zero");
            }
        }catch(VivekException e){
            j=18/1;
            System.out.println("that's the default output"+e);
        }
        
        catch(Exception e)
        {
           j=18/1;
           System.out.println(j);
        }
        System.out.println("bye");
    }
}

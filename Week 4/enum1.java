enum Status{
    //Status is nothing but class
    Running,Failed,Pending,Success; //this is all objects

}

public class enum1{
    public static void main(String[] args) {
        Status[] s=Status.values();//get the first object of Enum i.e.,Running
        for(Status ss:s){
            System.out.println(ss + ":"+ss.ordinal()); //printing name and its position in Enum
        } 
    }
}

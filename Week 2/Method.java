class Store{
    public void PlayMusic()
    {
        System.out.println("Play Music");
    }
    public String getMePen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";
    }
}
public class Method {
    public static void main(String[] args) {
        Store st = new Store();
        st.PlayMusic();
        String S=st.getMePen(11);
        System.out.println(S);        
    }
}

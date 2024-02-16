enum Status {
    Running, Failed, Pending, Success;
}

public class enum2 {
    public static void main(String[] args) {
        Status s = Status.Success;
        switch (s) {
            case Running:
                System.out.println("The program is running");
                break;
            case Failed:
                System.out.println("The program is Failed");
                break;
            case Pending:
                System.out.println("The program is Pending");
                break;
                default:
                System.out.println("The program is Successfully work");
                break;
        }

        // if (s == Status.Running)
        // System.out.println("Program is running");
        // else if (s == Status.Failed)
        // System.out.println("Try Again");
        // else if (s == Status.Pending)
        // System.out.print("Please Wait");
        // else
        // System.out.println("Completed Successfully");
    }
}

public class Pattern {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.pattern10(5);

    }

    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for(int j=1; j <= n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
    //      *    
    //     ***
    //    *****
    //   *******
    //  *********
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern8(int n){
    // *********
    //  *******
    //   *****
    //    ***
    //     *
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern9(int n){
    //      *    
    //     ***   
    //    *****  
    //   ******* 
    //  *********
    // ***********
    //  *********
    //   ******* 
    //    *****  
    //     ***   
    //      *    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    for (int i = n - 2; i >= 0; i--) {
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }   
    }

    public void pattern10(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    

}

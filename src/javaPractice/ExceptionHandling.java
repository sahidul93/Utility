package javaPractice;

public class ExceptionHandling {

    public static void main(String[] args) {
//Array --[] index starts from 0
        String[] name = {"Mr X", "Mr Y", "Mr Z", "Mr A"};

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
//try -- keyword (-- try block starts
// body of the try blocks
// } -- try block ends catch -- keyword( exceptions name which we are trying to catch e --
// body of the catch block
//}-- catch block ends

//if
        try {
            System.out.println(name[4]); // a way to debug from the bottom - up/ to figure out the exceptions from the last value to the first
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception occured");
            //ex.printStackTrace(); // how we got the exception / what exactly happened from java's piont of view

            // }
            //finally { // finally command will always get executed last / mostly used for database connectivity closing


            //}}
        }
    }
}


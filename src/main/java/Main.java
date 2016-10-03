import java.io.IOException;

// Run Main to run the application
public class Main {
    public static void main(String[] args) {
    	
    	// Take a file that contains the query as an input argument
        if(args.length < 1) {
            System.out.println("Give the file with the Query as an input argument");
            System.exit(-1);
        }

        // Call the execute function to generate the output for the query
        try {
           XQExec.executeFromFile(args[0]);
        }catch (IOException e) {
            e.printStackTrace();
        }     
    }

}


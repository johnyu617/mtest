package jun.yu.code.coverage.code.review;

import java.io.*;

class FileOutputDemo 
{   


        public static void main(String[] args) throws IOException
        {              
                FileOutputStream out; // declare a file output object
                PrintStream p; // declare a print stream object

                try
                {
                        // Create a new file output stream
                        // connected to "myfile.txt"
                        out = new FileOutputStream("myfile.txt");

                        // Connect print stream to the output stream
                        p = new PrintStream( out );
        
                        p.println ("This is written to a file");

                        p.close();
                }
                catch (Exception e)
                {
                    //throw new IOException(e);
                }
        }
}

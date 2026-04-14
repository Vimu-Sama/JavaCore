import java.io.File ;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args){

        //path name should have the file name alongwith the full relative directory
        File file = new File("./newFile.txt") ;
        if(file.exists()){      //checks if file exists
            System.out.println("File already exists! Aborting creation") ;
        } else {
            System.out.println("File absent, initiating creation") ;
            try{
                file.createNewFile() ;
            } catch(IOException e){
                System.out.println("Exception-> " + e) ;
            }
        }

        //Some important functions-> 

        System.out.println("File name-> " + file.getName());
        System.out.println("File Relative path to the current folder-> " + file.getPath()) ; // relative path
        System.out.println("File Absolute path-> " + file.getAbsolutePath()) ;

        //you can also create directory- just dont write any file
        File directory = new File("./TrialFolder") ;
        try{
            directory.mkdir() ;
        } catch(Exception e){
            System.out.println("Exception caught-> " + e);
        }

        //get list of files' names inside a directory
        String[] fileNames= directory.list() ;


        //get list of files' as objects inside a directory
        File[] files = directory.listFiles() ;

        //delete the file-> 
        file.delete() ;
    }    
}

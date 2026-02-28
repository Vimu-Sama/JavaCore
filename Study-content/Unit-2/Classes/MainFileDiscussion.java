// Limitations of static methods:
// No access to instance members directly i.e. a static method cannot call a non-static method
public class MainFileDiscussion{
    public static void main(String[] args){
        for(String s: args){
            System.out.println(s) ;
        }
    }
}
//first click play button on right (it will automatically change your working directory to current directory)
//type this in terminal - javac MainFileDiscussion.java
//now run this command- java MainFileDiscusson "hello world!"
//you will see this as output->
//hello
//world!
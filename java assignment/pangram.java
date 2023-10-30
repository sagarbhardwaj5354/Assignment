import java.util.Scanner;

public class pangram {
    public static void allletter(String str){
        //str=str.toLowerCase();
        boolean allletterpres=true;
        for(char p='a';p<='z';p++){
            if(!str.contains(String.valueOf(p))){
                allletterpres=false;
                break;
            }
        }
        if(allletterpres){
            System.out.println("IT is Pangram number");
        }
            else{
                System.out.println("The number is not pangram");

            }
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any Pangram list");
        String str=sc.nextLine();
        allletter(str);
        
    }
    
}

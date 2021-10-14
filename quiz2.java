import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input2 = sc.nextLine();
        String[] arrayOfSocks = input2.split(" ");
        sc.close();
        int moves=0;

        Deque<Integer> originalPile =new ArrayDeque<Integer>();
        originalPile.push(-1);
        for(int i=0; i<arrayOfSocks.length; i++){
            if(originalPile.peek()==Integer.parseInt(arrayOfSocks[i])){
                originalPile.poll();
                moves++;
            }
            else{
                originalPile.push(Integer.parseInt(arrayOfSocks[i]));
                moves++;
            }
        }
        if(originalPile.peek()==-1){
            System.out.println(moves);
        }
        else {
            System.out.println("impossible");
        }
    }
}
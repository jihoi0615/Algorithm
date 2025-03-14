import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size_of_people = Integer.parseInt(st.nextToken());
        int flag = Integer.parseInt(st.nextToken());
        List<Integer> final_order = new ArrayList<Integer>();
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i= 0; i<size_of_people; i++){
            queue.offer(i+1);
        }

        while(true){
            if(queue.isEmpty()){
                break;
            }
            else if(queue.size()<flag) {
                for(int i= 0; i< flag-1; i++){
                    int tmp = queue.poll();
                    queue.offer(tmp);
                }
                final_order.add(queue.poll());
            }
            else {
                int[] tmp = new int[flag];
                for(int i =0; i<flag-1; i++){
                    tmp[i] = queue.poll();
                }
                final_order.add(queue.poll());
                for(int i =0; i<flag-1; i++){
                    queue.offer(tmp[i]);
                }
            }
        }
        System.out.print("<");
        for(int i =0; i<final_order.size()-1; i++){
            System.out.printf("%d, ", final_order.get(i));
        }
        System.out.printf("%d", final_order.get(size_of_people-1));
        System.out.println(">");
    }
}
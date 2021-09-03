package begin1;
import java.util.LinkedList;

public class Cola1 {

	public static void main(String[] args) {
		
		LinkedList<String> cola = new LinkedList<>();
		
		//para las colas offer para las pilas push
		/*
		 * for(int i = 0; i < 11 ; i++) {
		 * 
		 * cola.offer(i); }
		 */
		
		cola.offer("way");
		cola.offer("run");
		cola.offer("bye");
		cola.offer("six");
		cola.offer("one");
		cola.add(3,"unique"); // method of pattern class abstract_list
		//cola.clear();         // method of pattern class abstract_list
		
		cola.get(1).equals(cola.get(3)); //compare two elements
		int x = cola.indexOf("run");  // return 1 if run exits on cola
		cola.remove(1);
		cola.set(0, "track");
		
		while (cola.peek()!= null) {
			
			System.out.println(cola.poll());
		}
		
				cola.iterator();
		 
		
	}

}

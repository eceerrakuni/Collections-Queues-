import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDriver {
	
	static int size = 0;
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		ArrayList <Order> list = new ArrayList();
		System.out.println("-----------MENU-----------");
		System.out.println("Hamburger             6min");
		System.out.println("Chicken               5min");
		System.out.println("Smoothie              3min");
		System.out.println("Hot Dog               4min");
		Queue <Order> line = new LinkedList <Order>();
		Order a = new Order(); a.setName("Julia"); a.setFood("Hamburger"); a.setTime(6); line.add(a);
		Order b = new Order(); b.setName("Michael"); b.setFood("Hot Dog"); b.setTime(4); line.add(b);
		Order c = new Order(); c.setName("James"); c.setFood("Chicken"); c.setTime(5); line.add(c);
		Order d = new Order(); d.setName("Lauren"); d.setFood("Smoothie"); d.setTime(3); line.add(d);
		size = 4;
		
		while (line.peek() != null) {
				Order temp = line.peek();
				if (temp.getTime() - 1 == 0) {
					line.remove();
					if (line.peek() == null) {
						System.out.println("");
					} else {
					System.out.println(line.peek().getName() + "        " + line.peek().getTime() + "min");
					}
				} else {
					temp.setTime(temp.getTime() - 1);
					System.out.println(temp.getName() + "        " + temp.getTime() + "min");
				}

		}
	}

}

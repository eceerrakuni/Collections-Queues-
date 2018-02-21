
public class Order {

	String name = "Unknown";
	String food = "None";
	int waitTime = 0;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public void setTime(int time) {
		waitTime = time;
	}
	
	public int getTime() {
		return waitTime;
	}
}

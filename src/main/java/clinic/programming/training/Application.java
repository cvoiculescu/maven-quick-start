package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
    
	private void greet(){
		System.out.println("Hello");
	}
	
    public Application() {
        System.out.println ("Inside Application");
		List<String> list = new ArrayList<>();
		list.stream().forEach(System.out::println);
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		
    }
}
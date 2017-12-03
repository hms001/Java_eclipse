import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ConsoleInput {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Enter a number : ");
		String response = console.readLine();
		
		System.out.println("You have keyed in " + response);

	}

}

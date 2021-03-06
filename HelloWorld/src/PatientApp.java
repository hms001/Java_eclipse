/*
 * Patient record
 */

import java.util.*;
import java.io.*;

public class PatientApp {
	
	//declare an ArrayList to store patient info
	private static ArrayList<Patient> patList;	
	public static void main(String[] args)		
		throws FileNotFoundException{
			//create the ArrayList to store Patient objects		
			patList = new ArrayList<Patient>();
			loadPatientData();
			displayPatientData();
			searchPatient();
		}
		
		private static void loadPatientData()
			throws FileNotFoundException{
				System.out.println("Loading Patient data");
				Scanner myScanner = new Scanner(new File("Patient.dat"));
				
				String patLine;
				while(myScanner.hasNextLine()) {
					patLine = myScanner.nextLine();
					String[] patData = patLine.split(";");
					String name = patData[0];
					double height = Double.parseDouble(patData[1]);
					double weight = Double.parseDouble(patData[2]);
					//add to ArrayList patList
					patList.add(new Patient(name,height,weight));
				}
				myScanner.close();
			}
		
		private static void displayPatientData() {
			for(Patient pat:patList)
				System.out.printf("%s\t%3.1f\t%3.1f\t%.4f\n",
						pat.getName(), pat.getHeight(),
						pat.getWeight(),pat.calculateBMI());
		}
		
		//search and return a Patient object
		private static Patient searchPatientByName(String name) {
			Patient pat = null; //initialize - not pointing to any object
			for(Patient p: patList) {
				if(name.equalsIgnoreCase(p.getName())) {
					pat = p;
					break;
				}
			}
			//return object reference
			return pat;
		}
		
		private static void searchPatient() {
			while(true) {
				Scanner myScanner = new Scanner(System.in);
				System.out.print("Enter patient name to search (or q to quit)");
				String name = myScanner.nextLine();
				if(name.equalsIgnoreCase("q"))
					break;
				Patient pat=searchPatientByName(name);
				if(pat==null)
					//record not found
					System.out.println("No such patient!");
				else
					//record found
					System.out.println(pat);
			}//end of loop
		}
			
}
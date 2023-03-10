import demo.*;
import demo.IMT2021019.*;
import demo.IMT2021028.*;
import demo.IMT2021058.*;
import java.util.*;
import java.io.*;

public class PlatformMain {

	public static void main(String[] args) {

		//the platform object
		EcommPlatform pf = new EcommPlatform();
		Scanner sc = new Scanner(System.in);

		//Initialising sellers and products
		//-------------------------------------------------------------------------------------------------------------------
		IMT2021058_seller srini = new IMT2021058_seller("Srini");
		Book srini_book1 = new Book("Invisible_Man", "Srini-Invisible_Man", 350, 25);
		Book srini_book2 = new Book("Othello", "Srini-Othello", 500, 20);
		Mobile srini_mobile1 = new Mobile("M21", "Srini-M21", 15000, 10);
		srini.AddProd(srini_mobile1);
		srini.AddProd(srini_book1);
		srini.AddProd(srini_book2);

		IMT2021019_seller siddharth = new IMT2021019_seller("Siddharth");
		Book sid_book1 = new Book("Spiders_Web", "Siddharth-Spiders_Web", 400, 17);
		Book sid_book2 = new Book("Hamlet", "Siddharth-Hamlet", 500, 10);
		Mobile sid_mobile1 = new Mobile("A71", "Siddharth-A71", 27000, 5);
		Mobile sid_mobile2 = new Mobile("M21", "Siddharth-M21", 14999, 28);
		siddharth.AddProd(sid_mobile2);
		siddharth.AddProd(sid_mobile1);
		siddharth.AddProd(sid_book1);
		siddharth.AddProd(sid_book2);

		IMT2021028_seller sankalp = new IMT2021028_seller("Sankalp");
		Book sank_book1 = new Book("Macbeth", "Sankalp-Macbeth", 500, 15);
		Mobile sank_Mobile1 = new Mobile("iPhone13", "Sankalp-iPhone13", 100000, 10);
		Book sank_book2 = new Book("Ikigai", "Sankalp-Ikigai", 400, 26);
		Book sank_book3 = new Book("NCERT_Chem", "Sankalp-NCRET_Chem", 180, 50);
		sankalp.AddProd(sank_Mobile1);
		sankalp.AddProd(sank_book1);
		sankalp.AddProd(sank_book2);
		sankalp.AddProd(sank_book3);
		//----------------------------------------------------------------------------------------------------------------------------
		//adding them to the platform
		sankalp.addPlatform(pf);
		siddharth.addPlatform(pf);
		srini.addPlatform(pf);

		while (true){
			String s = sc.next();
			if (s.equals("Check")){
				//if check is called, we process the requests and then remove from the file
				pf.processRequests();
				clearFile();
			}else if (s.equals("End")){
				//otherwise we exit the program
				break;
			}
		}

		sc.close();
		// replace with appropriate derived class
		
		// create a number of sellers (of different sub-types of Seller)
		// Assign a name (sellerID) to each of them.
		
		// replace each of the XYZ below with the derived class name of one of the
		// team members.
		
		/*
		Seller s1 = new DemoSeller1("Seller1"); 
		s1.addPlatform(pf);

		Seller s2 = new SellerXYZ("Seller2");
		s1.addPlatform(pf);
		
		Seller s3 = new SellerXYZ2("Seller3");
		s1.addPlatform(pf);
 		*/
		
		/*
		// keep reading from System.in
		// If "Check" typed in
		// invoke 
			pf.processRequests();
		*/
	}

	//to clear of all the requests, as now we they have been processed
	public static void clearFile(){
		File file = new File("./demo/PortalToPlatform.txt");
		try {
			//to clear the file, we just open the file in overwrite mode, and then write an empty string 
			PrintWriter write = new PrintWriter(file);
			write.print("");
			write.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	

}

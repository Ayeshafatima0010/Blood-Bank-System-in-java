
class UsingMain{
	public static void main(String[] args) {
		
		//................................Create Patient Objects.................
		Patient p=new Patient();
		Patient p1=new Patient("34601..","ahmed","abvsvxsvxsx","male","8-aug-2000","191400105","0302647412","Normal");
		Patient p2=new Patient("34601..","ahmed","abvsvxsvxsx","male","8-aug-2000","191400105","0302647412","hahshhh");
		Patient p3=new Patient("34601..","ahmed","abvsvxsvxsx","male","8-aug-2000","191400105","0302647412","Normal");

		p.addPatient(p1);
		p.addPatient(p2);
		p.addPatient(p3);

		p.displayPPP();
			//.................................Update Method..........................................
		p2.updatePateint("34601..","Harooon","abvsvxsvxsx","male","10-aug-2000","1915","0302","N");
		//.....................................Remove Method...........................................
		p.removePateint(p3);
		//....................................Display Pateint DATA....................................
		p.displayPPP();




		//.................................Create Blood pouchs Objects............................... 
		Blood_pouch b1=new Blood_pouch(191400105,"A+","tem1",1015,"16-oct-2020");
		Blood_pouch b2=new Blood_pouch(191400106,"A","tem2",101,"15-oct-2020");
		Blood_pouch b3=new Blood_pouch(191400107,"Ab+","tem3",10155,"14-oct-2020");
		Blood_pouch b4=new Blood_pouch(191400105,"B+","tem4",105,"18-oct-2020");

		//.............................Updatee Blood Pouchs DAta.........................
		b3.updateBloodpouch(191400,"B+","HAHAHAHHA",1011055,"21-oct-2020");
	
		//.................................remove blood pouchs...........................
		Blood_pouch.removebloodpouchs(b4);
	 	//....................................add Blood pouchs in Bank......................
	 	Blood_Bank b=new Blood_Bank();
	 	Blood_Bank bb=new Blood_Bank("AHMED Blood Bank",191400105);
		Blood_Bank bbb=new Blood_Bank("Haroon Blood Bank",191400102);
		b.addBloodpuhsininBank(b1);
		b.addBloodpuhsininBank(b2);
		b.addBloodpuhsininBank(b3);
		b.addBloodpuhsininBank(b4);
		
		//...................................Sorting Blood Pouchs.............................
		System.out.println(".............After Sorting Data.................");
		b.sort();
		//...................................Display Blood Pouchs Data....................
		b.displayBloodPouchs();



	 //.......................................Create Blood Donor Objects.............................
	 	Blood_Donor bd=new Blood_Donor();
		Blood_Donor bd1=new Blood_Donor("34601","ahmedrajpoot","daska","male","8aug2000","abc@","03026474122","A+");
		Blood_Donor bd2=new Blood_Donor("34601","ahmedrajpoot","daska","male","8aug2000","abc@","03026474122","A+");
		Blood_Donor bd3=new Blood_Donor("34601","ahmedrajpoot","daska","male","8aug2000","abc@","03026474122","A+");


	 //.................................Add Bank in Donor class...................................

	 bd.rejisterBank(bb);
	 bd.rejisterBank(bbb);
	 //.................................Display Bank rejister in Donor..............................
	 bd.displayBanks();

	//........................................Adding Blood Donor In bLOoOD bank...........................
	b.addBloodFromDonorIndbank(bd1);
	b.addBloodFromDonorIndbank(bd2);
	b.addBloodFromDonorIndbank(bd3);
	//............................................Update Blood Donor Data.....................................
	bd2.updateDonor("34601-9183622-5","AHMED BASHIR","Daska SIALKOT","Male","8-Aug-2000","191400105@gift.edu.pk","0302-6474122","A+");

	//.......................................Display Blood Donor Data.......................................
	b.displaydonorblood();

	//......................................Create Other Bloood Bank objects................................
	Other_Bank o=new Other_Bank();
	Other_Bank o1=new Other_Bank(100015,"Young BLood Foundation","ABCD","XYZ","Tem","03026474122","A+");
	Other_Bank o2=new Other_Bank(100015,"Young BLood Foundation","ABCD","XYZ","Tem","03026474122","b+");
	Other_Bank o3=new Other_Bank(100015,"Young BLood Foundation","ABCD","XYZ","Tem","03026474122","c+");

	//.......................................Adding Blood Donoor IN Bank..........................................
	b.addfromOtherBloodBank(o1);
	b.addfromOtherBloodBank(o2);
	b.addfromOtherBloodBank(o3);
	//......................................update Other Blood Bank.......................................
	o2.updateotherBank(100015,"A BLood Bank","ABCDcde","XYZzzzzz","Harooon","03026474122","AB+");

	//.......................................Remove Blood Bank.........................................
	o.removeOtherBank(o3);

	//......................................Display Other bLOOd BANK Data.......................................
	b.displayOtherBloodBank();
	//.......................................searching Blood Type.......................................

	System.out.println(".......................Bloood searching.........................................");	
	if ( b.isFound("A")) {
	 		System.out.println(".......This type of blood found in bank .....");
	 }
	 else
	 {
	 	System.out.println("......This type of blood not found in Bank.......");
	 }

	//.....................................End...........................................................

		




	}
}
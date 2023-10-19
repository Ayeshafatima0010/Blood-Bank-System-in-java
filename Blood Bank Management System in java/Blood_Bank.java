class Blood_Bank{
	
	private String name;
	private int id;

	private Blood_pouch[] bloodp;
	private int bloodpouchs;
	private int donors;
	private Blood_Donor[] donor;
	private Other_Bank[] other_bank;
	private int otherbank;
	private Patient[] patient;
	//......................................Default constructor.........................................
	Blood_Bank(){
		this.bloodp=new Blood_pouch[20];
		this.donors=0;
		this.donor=new Blood_Donor[20];
		this.bloodpouchs=0;
		this.other_bank=new Other_Bank[20];
		this.otherbank=0;
	}
	//.......................................Overloaded Constrcutor...................................
	Blood_Bank(String name,int id){
		setId(id);
		setName(name);
	}

	//.................................................setters......................................
	void setId(int id ){this.id=id;}
	void setName(String name){this.name=name;}

	//.................................................getters......................................
	int getId(){return id;}
	String getName(){return name;}



	///..........................add bLOOD pOUCHS IN BANK...........................
	
	public void addBloodpuhsininBank(Blood_pouch c){

			this.bloodp[bloodpouchs]=c;
			bloodpouchs++;
	}
		//..........................Dispaly BoOOd PUCHS DATA ......................
	void displayBloodPouchs(){
		System.out.println("...............Blood Pouch Data ...................");
		for (int i=0;i<bloodpouchs ;i++ ) {

			if (bloodp[i].getId()!=0) {

			System.out.println("Id is :"+bloodp[i].getId());
			System.out.println("Blood type is :"+bloodp[i].getBlood_type());
			System.out.println("Location is :"+bloodp[i].getLocation());
			System.out.println("Cholestrol level is :"+bloodp[i].getCholestrrol_level());
			System.out.println("Expiration date is :"+bloodp[i].getExpiredate());
			System.out.println("________________________________________________________");

				}
			
		}

	}
	//..............................Sorting bLOod Pouchs By earliest Expire Date....................................
		public void sort(){
		for(int i=0; i<bloodpouchs;i++)
		{
			for(int j=i+1;j<bloodpouchs;j++)

			{	//.......................check if expire date is null.....................
				if (bloodp[i].getExpiredate()!=null && bloodp[j].getExpiredate()!=null) {
					
				
				if(bloodp[i].getExpiredate().compareToIgnoreCase(bloodp[j].getExpiredate())>0 )
				{
					Blood_pouch temp = bloodp[i];
					bloodp[i] = bloodp[j];
					bloodp[j] = temp;

				}
			}
			}
		}
	}



	//.......................................Add Blood FRom Donor in Bank.............................

	public void addBloodFromDonorIndbank(Blood_Donor bd){
		this.donor[donors]=bd;
		donors++;

	}

	// .................................Display Bood Donor Data........................
	void displaydonorblood(){

		System.out.println("....................Blood Donor DATA .................. ");
		for (int i=0;i<donors ;i++ ) {
			if (donor[i].getCnic()!=null) {
					System.out.println("cini is :"+donor[i].getCnic());
			System.out.println("Name is :"+donor[i].getName());
			System.out.println("address is :"+donor[i].getAddress());
			System.out.println("gender is :"+donor[i].getGender());
			System.out.println("DOB is :"+donor[i].getDob());
			System.out.println("phone Number is :"+donor[i].getPhone());
			System.out.println("Blood type is : :"+donor[i].getBloodtype());
			System.out.println("_____________________________________________");
			}
			
		}

	}

	//...............................Add Blood From others Blood BAnks.........................
	void addfromOtherBloodBank(Other_Bank o){

		this.other_bank[otherbank]=o;
		otherbank++;
	}

	//.............................display Other Banks Dat...................................
	void displayOtherBloodBank(){
		System.out.println("............Other Blood Bank Data ......................");
		for (int i=0;i<otherbank ;i++ ) {

			if (other_bank[i].getName()!=null) {
				System.out.println("Blood Bank ID is"+other_bank[i].getId());
				System.out.println("BlooD Bank Name is :"+other_bank[i].getName());
				System.out.println("BlooD Bank adress :"+other_bank[i].getAdress());
				System.out.println("Focal_person :"+other_bank[i].getFocal_person());
				System.out.println("contact :"+other_bank[i].getConatact());
				System.out.println("Location :"+other_bank[i].getLocation());
				System.out.println("Blood Type is :"+other_bank[i].getType());
				System.out.println("_____________________________________________");
			}
				

		}
	}
	//.....................................toString Method.....................................
	public String toString(){
		return "Bank name is :"+getName()+"\nBank id is :"+getId();
	}
	//.........................................Linaer searching.................................................
	boolean isFound(String key){
		
		for (int i=0;i<otherbank ;i++ ) {
			if (other_bank[i].getType()!=null && other_bank[i].getType()==key) {
				
			return true;
			
			}
			
		}
		return false;
		
	}


	//.................................IsEqaul Method....................................................
	boolean isEqual(Blood_Bank b){
		if (this.getId()==b.getId()) {
			return true;
		}
		return false;
	}

	//.....................................End...........................................................

}

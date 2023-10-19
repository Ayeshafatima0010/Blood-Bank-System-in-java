class Blood_Donor extends Person{
	private String bloodType;
	private Blood_Bank[] blood_bank;
	private int tem;
	//......................................Default constructor.................................
	Blood_Donor(){
		super();
		bloodType=null;
		this.blood_bank=new Blood_Bank[30];
		this.tem=0;
	}
	//....................................overoaded Constructor..................................
	Blood_Donor(String cnic,String name,String address,String gender,String dob,String email,String phone,String bloodType){
		super(cnic,name,address,gender,dob,email,phone);
		setBloodtype(bloodType);
		this.blood_bank=new Blood_Bank[30];
		this.tem=0;
	}

	//......................................setters.................................................

	void setBloodtype(String bloodType){this.bloodType=bloodType;}
	
	//.......................................getters..............................................
	String getBloodtype(){return bloodType;}
	//.....................................upadete Blood Donor Data..............................
	void updateDonor(String cnic,String name,String address,String gender,String dob,String email,String phone,String bloodType){
			super.setCnic(cnic);
			super.setName(name);
			super.setAddress(address);
			super.setGender(gender);
			super.setDob(dob);
			super.setEmail(email);
			super.setPhone(phone);
			setBloodtype(bloodType);

	}
	//.....................................rejister Bank in Donor Class..........................
	void rejisterBank(Blood_Bank b){
		this.blood_bank[tem]=b;
		tem++;
	}

	//..................................display Banks rejister in donor Class .......................
 	
	void displayBanks(){
		System.out.println(".............<<<RejisterBank>>>................");
		for (int i=0;i<tem ;i++ ) {

			System.out.println("Bank name is :"+blood_bank[i].getName());
			System.out.println("Bank Id is:"+blood_bank[i].getId());
			System.out.println("_____________________________________");
		}
	}


	//......................................Override Methods....................................
	@Override
	public String toString(){
		return "Cnic is "+super.getCnic()+"\nName is :"+super.getName()+"\nAddress is :"+super.getAddress()+"\nGender is :"+super.getGender()+"\nDOB IS :"+super.getDob()+"\nEmail is :"+super.getEmail()+"\nPhone is :"+getPhone()+"\nBlood_Donor is :"+getBloodtype();
	}
	@Override
	public Boolean isEqual(Object c){

		Blood_Donor tem=(Blood_Donor)c;

		if (this.getBloodtype()==tem.getBloodtype() ) {
		return true;	
		}
		return false;
	}
	//.....................................End...........................................................
}
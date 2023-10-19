class Patient extends Person{
	private String hiv_Status;
	private Patient[] patient;
	private int pt;
	//...................................Defaults Constructor..........................................
	
	Patient(){
		super();
		hiv_Status=null;
		this.patient=new Patient[30];
	}
	//....................................overloaded Constructor..........................................
	
	Patient(String cnic,String name,String address,String gender,String dob,String email,String phone,String hiv_Status){
		super(cnic,name,address,gender,dob,email,phone);
		setHiv_Status(hiv_Status);
		this.patient=new Patient[30];
	}
	
	//.....................................Setters........................................................
	void setHiv_Status(String hiv_Status){this.hiv_Status=hiv_Status;}


	//.....................................getters........................................................
	String getHiv_Status(){return hiv_Status;}
	public void addPatient(Patient p){
		this.patient[pt]=p;
		pt++;
	}
	
	//.....................................Upadte Pateint Data........................................

	void updatePateint(String cnic,String name,String address,String gender,String dob,String email,String phone,String hiv_Status){
		super.setCnic(cnic);
		super.setName(name);
		super.setAddress(address);
		super.setGender(gender);
		super.setDob(dob);
		super.setEmail(email);
		super.setPhone(phone);
		setHiv_Status(hiv_Status);
	}

	//................................Display display pateint Data.......................................

	public void displayPPP(){
		System.out.println(".................<Pateint Data>...............");
		for (int i=0;i<pt ;i++ ) {
			if (patient[i].getName()!=null) {
				System.out.println("Patient cnic is:"+patient[i].getCnic());
			System.out.println("Patient Name is :"+patient[i].getName());
			System.out.println("Patient address is :"+patient[i].getAddress());
			System.out.println("Patient gender is :"+patient[i].getGender());
			System.out.println("patient DOB is :"+patient[i].getDob());
			System.out.println("Patient email is :"+patient[i].getEmail());
			System.out.println("Patient phone numb is :"+patient[i].getPhone());
			System.out.println("Patient getHiv_Status is :"+patient[i].getHiv_Status());
			System.out.println("______________________________________________________");
				
			}
			
		}
	}
	//.................................remove Pateint.....................................
		public void removePateint(Patient bp){

		bp.setCnic(null);
		bp.setName(null);
		bp.setAddress(null);
		bp.setGender(null);
		bp.setDob(null);
		bp.setEmail(null);
		bp.setPhone(null);
		bp.setHiv_Status(null);
	
	}
	//................................Methods override...............................
	@Override
	public  String toString(){
		return "Cnic is "+super.getCnic()+"\nName is :"+super.getName()+"\nAddress is :"+super.getAddress()+"\nGender is :"+super.getGender()+"\nDOB IS :"+super.getDob()+"\nEmail is :"+super.getEmail()+"\nPhone is :"+getPhone()+"\nhiv_Status is :"+getHiv_Status();
	}
	@Override
	public Boolean isEqual(Object c){

		Patient tem=(Patient)c;

		if (this.getHiv_Status()==tem.getHiv_Status()) {
			return true;
		}

			return false;
	}
	//.....................................End...........................................................
}
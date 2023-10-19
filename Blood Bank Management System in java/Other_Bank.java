class Other_Bank{
	private int id;
	private String name;
	private String adress;
	private String location;
	private String focal_person;
	private String contact;
	private String type;
	//....................................Default constructor......................................
	Other_Bank(){
		id=0;
		name=null;
		adress=null;
		location=null;
		focal_person=null;
		contact=null;
		type=null;
	}
	//...................................overloaded Constructor...................................
	Other_Bank(int id,String name,String adress,String location,String focal_person,String contact,String type){
			setId(id);
			setName(name);
			setAdress(adress);
			setLocation(location);
			setFocal_Person(focal_person);
			setConatct(contact);
			setType(type);
	}
	//.....................................setters..........................................
	void setId(int id){this.id=id;}
	void setName(String name){this.name=name;}
	void setAdress(String adress){this.adress=adress;}
	void setFocal_Person(String focal_person){this.focal_person=focal_person;}
	void setConatct(String contact){this.contact=contact;}
	void setLocation(String location){this.location=location;}
	void setType(String type){this.type=type;}



	//..........................................getters............................................
	int getId(){return id;}
	String getName(){return name;}
	String getAdress(){return adress;}
	String getFocal_person(){return focal_person;}
	String getConatact(){return contact;}
	String getLocation(){return location;}
	String getType(){return type;}


	//........................................Update Other Banks Data...........................

	void updateotherBank(int id,String name,String adress,String location,String focal_person,String contact,String type){
			setId(id);
			setName(name);
			setAdress(adress);
			setLocation(location);
			setFocal_Person(focal_person);
			setConatct(contact);
			setType(type);
	
	}
	//.......................................remove Banks...............................................
	void removeOtherBank(Other_Bank o){
			o.setId(0);
			o.setName(null);
			o.setAdress(null);
			o.setLocation(null);
			o.setFocal_Person(null);
			o.setConatct(null);
			o.setType(null);

	}
	
	//..................................isEQUALS METHOD..................................................
	Boolean isEqual(Other_Bank o){
		if (this.getConatact()==o.getConatact()) {
			return true;
		}
		return false;
	}
	//...................................tOString.......................................................
	public String toString(){
		return "Id is:"+getId()+"\nName is :"+getName()+"\nAdress is :"+getAdress()+"\nFocal_person is:"+this.getFocal_person()+"\nContact is :"+getConatact()+"\nLocation is :"+getLocation();
	}

	//.....................................End...........................................................
}
class Human {
	
	//Fields
	private int age;
	private String name;

	//Setters
	public void setName (String newName) {
		
		name = newName;
	}

	public void setAge (int newAge) {

		if (newAge < 0) {

			age = 0;
		}

		else {

			age = newAge;
		} 
	}

	//Getters
	public String getName () {
		return name;
	}

	public int getAge () {
		return age;
	}

	//Construct
	Human () {

		age = 0;
		name = "no name";
	}

	Human (String newName, int newAge) {
		
		//age = newAge;
		//name = newName;
		setName(newName);
		setAge(newAge);
	}
}
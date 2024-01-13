import java.util.Scanner;

interface Choices {
	void introduction();
    void choices();
    void outro();
    void Hard();
}


abstract class HeroInfo implements Choices {
    abstract void name();
    abstract void height();
    abstract void gender(); 
    abstract void country();
    abstract void characterRole();
    abstract void bodyType();
    abstract void voiceType();
    abstract void expressions();
    abstract void skinColor();
    abstract void hairType();
    abstract void hairColor();
    abstract void eyeColor();
    abstract void lipColor();
    abstract void facialHair();
    abstract void tattoos();
    abstract void piercing();
    abstract void outfit();
    abstract void footwear();
    abstract void accessories();
    abstract void posture();
    abstract void weapon();
    abstract void attributes();
}

 class HeroDesign extends HeroInfo{
	 	private String name;
	    private String gender;
	    private double height;
	 
	 	private String country;
	    private String characterRole;
	    private String bodyType;
	    private String voiceType;
	    private String expressions;
	    private String skinColor;
	    private String hairType;
	    private String hairColor;
	    private String eyeColor;
	    private String lipColor;
	    private String facialHair;
	    private String tattoos;
	    private String piercing;
	    private String outfit;
	    private String footwear;
	    private String accessories;
	    private String posture;
	    private String weapon;
	    private String attributes;
		private boolean mode;

    
	    public HeroDesign(String name, String gender, double height) {
	    
            this.name = name;
	    	this.gender = gender;
	    	this.height = height;
	    }
	    public HeroDesign(String country, String characterRole, String bodyType, String voiceType, String expressions, String skinColor, String hairType, String hairColor, String eyeColor, String lipColor, String facialHair, String tattoos, String piercing, String outfit, String footwear, String accessories,  String posture, String weapon, String attributes){
	
            this.country = country;       
	        this.characterRole = characterRole;
	        this.bodyType = bodyType;
	        this.voiceType = voiceType;
	        this.expressions = expressions;
	        this.skinColor = skinColor;
	        this.hairType = hairType;
	        this.hairColor = hairColor;
	        this.eyeColor = eyeColor;
	        this.lipColor = lipColor;
	        this.facialHair = facialHair;
	        this.tattoos = tattoos;
	        this.piercing = piercing;
	        this.outfit = outfit;
	        this.footwear = footwear;
	        this.accessories = accessories;
	        this.posture = posture;
	        this.weapon = weapon;
	        this.attributes = attributes;
	    }
	    
	    public HeroDesign(boolean mode) {
	    	this.mode = mode;
		}
	    
	    public HeroDesign() {
	    	
	    }

		void NumOfChoices(String two) {
		System.out.println("Select Either 1 and 2 only:");
		}
		
		void NumOfChoices(String four, String por) {
		System.out.println("Select from (1-4) choose one only:");
		}
		
		void NumOfChoices() {
		System.out.println("Select from (1-5) choose one only:");
		}
		
		void NumOfChoices(boolean ans) {
		System.out.println("Enter true or false only:");
		}
	    
	    @Override
		public void introduction() {
	    	System.out.println("--------------------------------------------------------\n");
			System.out.println("\tWelcome to Character Customization!\n");
			System.out.println("--------------------------------------------------------\n");
		}
	    
		@Override
		public void choices() {
			System.out.println("\n--------------------------------------------------------");
			System.out.println("\tSelect Choices on every Question:");
			System.out.println("--------------------------------------------------------\n");
		}

		@Override
		public void outro() {
			System.out.println("\n----------------------------------------------------------------\n");
			System.out.println("\tWelcome to the GAME! Lets finish this Adventure!");
			System.out.println("\n----------------------------------------------------------------\n");
		}
		
		@Override
		public void Hard() {
		        	if (this.mode == true) {
		        	System.out.println("\n------------------------------------------------------------------------------------------------------------------------\n");
		        	System.out.println("=+= Hard Mode! =+=\n");
                    System.out.println("Hey there, brave hero. The empire needs you again, but this time it's tougher.\nYour journey won't be easy expect tricky enemies who are smarter and won't let you through easily.\nThe mighty stone is still your goal, but now it's guarded by magical creatures and really tough challenges.\nOur people are counting on you, so make sure you come back a winner. Get ready for a big adventure full of danger,\nwhere only the bravest and smartest can win. Good luck, and may you succeed with lots of courage");
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------------\n");
                    } else {
                    	 System.out.println("\n------------------------------------------------------------------------------------------------------------------------\n");
                    	 System.out.println("=+= Normal Mode! =+=\n");
                    	 System.out.println("Chosen one. You have been selected by the empire to defend our pride and castle.\nThroughout your quest, you will confront various adversaries, each posing a barrier to your smooth adventure.\nYour ultimate goal is to secure the mighty stone, a key to making our empire unbeatable and granting us endless life and power.\nEnsure you return triumphant, for the fate of our people rests on your shoulders. May your journey be filled with valor and success.");
                         System.out.println("\n------------------------------------------------------------------------------------------------------------------------\n");
                    }
		}
	    
		@Override
		void name() {
			System.out.println("Name: " + getName());
		}

	    @Override
		void gender() {
			System.out.println("Gender: " + getGender());
		}
	    
		@Override
		void height() {
			System.out.println("Height: " + getHeight());
		}
		
		@Override
		void country() {
			System.out.println("Country: " + getCountry());
		}
		
		@Override
		void characterRole() {
			System.out.println("Character Role: " + getCharacterRole());
		}
		
		@Override
		void bodyType(){
	        System.out.println("Body Type: " + getBodyType());
	    }
	    
		@Override
		void voiceType(){
	        System.out.println("Voice Type: " + getVoiceType());
	    }
		
		@Override
	    void expressions(){
	        System.out.println("Expressions: " + getExpressions());
	    }
	    
		@Override
	    void skinColor(){
	        System.out.println("Skin Color: " + getSkinColor());
	    }
	    
		@Override
	    void hairType(){
	        System.out.println("Hair Type: " + getHairType());
	    }
	    
		@Override
	    void hairColor(){
	        System.out.println("Hair Color: " + getHairColor());
	    }
	    
		@Override
	    void eyeColor(){
	        System.out.println("Eye Color: " + getEyeColor());
	    }
	    
		@Override
	    void lipColor(){
	        System.out.println("Lip Color: " + getLipColor());
	    }
	    
		@Override
	    void facialHair(){
	        System.out.println("Facial Hair: " + getFacialHair());
	    }
	    
		@Override
	    void tattoos(){
	        System.out.println("Tattoo: " + getTattoos());
	    }
	    
		@Override
	    void piercing(){
	        System.out.println("Piercing: " + getPiercing());
	    }
		
		@Override
	    void outfit(){
	        System.out.println("Outfit: " + getOutfit());
	    }
	    
		@Override
	    void footwear(){
	        System.out.println("Footwear: " + getFootwear());
	    }
		
		@Override
	    void accessories(){
	        System.out.println("Accessories: " + getAccessories());
	    }
	    
		@Override
	    void posture(){
	        System.out.println("Posture: " + getPosture());
	    }
	    
		@Override
	    void weapon(){
	        System.out.println("Weapon: " + getWeapon());
	    }
	    
		@Override
	    void attributes(){
	        System.out.println("Attributes: " + getAttributes());
	    }
		

		public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	    public double getHeight() {
	        return height;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    public String getCharacterRole() {
	        return characterRole;
	    }

	    public void setCharacterRole(String characterRole) {
	        this.characterRole = characterRole;
	    }

	    public String getBodyType() {
	        return bodyType;
	    }

	    public void setBodyType(String bodyType) {
	        this.bodyType = bodyType;
	    }

	    public String getVoiceType() {
	        return voiceType;
	    }

	    public void setVoiceType(String voiceType) {
	        this.voiceType = voiceType;
	    }

	    public String getExpressions() {
	        return expressions;
	    }

	    public void setExpressions(String expressions) {
	        this.expressions = expressions;
	    }
	    
	    public String getSkinColor() {
	        return skinColor;
	    }

	    public void setSkinColor(String skinColor) {
	        this.skinColor = skinColor;
	    }
	    
	    public String getHairType() {
	        return hairType;
	    }

	    public void setHairType(String hairType) {
	        this.hairType = hairType;
	    }

	    public String getHairColor() {
	        return hairColor;
	    }

	    public void setHairColor(String hairColor) {
	        this.hairColor = hairColor;
	    }

	    public String getEyeColor() {
	        return eyeColor;
	    }

	    public void setEyeColor(String eyeColor) {
	        this.eyeColor = eyeColor;
	    }

	    public String getLipColor() {
	        return lipColor;
	    }

	    public void setLipColor(String lipColor) {
	        this.lipColor = lipColor;
	    }
	    
	    public String getFacialHair() {
	        return facialHair;
	    }

	    public void setFacialHair(String facialHair) {
	        this.facialHair = facialHair;
	    }
	       
	    public String getTattoos() {
	        return tattoos;
	    }

	    public void setTattoos(String tattoos) {
	        this.tattoos = tattoos;
	    } 

	    public String getPiercing() {
	        return piercing;
	    }

	    public void setPiercing(String piercing) {
	        this.piercing = piercing;
	    }

	    public String getOutfit() {
	        return outfit;
	    }

	    public void setOutfit(String outfit) {
	        this.outfit = outfit;
	    }
	    
	    public String getFootwear() {
	        return footwear;
	    }

	    public void setFootwear(String footwear) {
	        this.footwear = footwear;
	    }

	    public String getAccessories() {
	        return accessories;
	    }

	    public void setAccessories(String accessories) {
	        this.accessories = accessories;
	    }

	    public String getPosture() {
	        return posture;
	    }

	    public void setPosture(String posture) {
	        this.posture = posture;
	    }

	    public String getWeapon() {
	        return weapon;
	    }

	    public void setWeapon(String weapon) {
	        this.weapon = weapon;
	    }


	    public String getAttributes() {
	        return attributes;
	    }

	    public void setAttributes(String attributes) {
	        this.attributes = attributes;
	    }
}
 

public class OOPFINAL1 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	HeroDesign DefaultConstruct = new HeroDesign();
    	DefaultConstruct.introduction();
    	
    	System.out.print("Please Enter Character Name: ");
    	String name = scan.nextLine();
    	
    	DefaultConstruct.choices();

    	DefaultConstruct.NumOfChoices("Two");

    	String gender = "";
         while(true){

         System.out.print("Please Select Character Gender (1. Male, 2. Female): ");
         try { 
         int choice = scan.nextInt(); 
         if(choice == 1){
         gender = "Male";
         break;
         }else if(choice == 2){
             gender = "Female";
             break;
         }else{
            System.out.println("invalid input of choice please try again");
             }
         }catch(Exception e) {
        	 System.out.println("invalid input variable please try again");
        	 scan.nextLine();
         }
         }
    	
         DefaultConstruct.NumOfChoices("Four", "Por");
         double height;
         while (true){
         System.out.print("Select Character Height: (1. 40%, 2. 70%, 3. 100%, 4. 120%): ");
         try{
         int choice = scan.nextInt();
         if(choice == 1){
             height = 0.4;
             break;
         }else if (choice == 2){
             height = 0.7;
             break;
         }else if (choice == 3){
             height = 1;
             break;
         }else if (choice == 4){
             height = 1.2;
             break;
         }else{
             System.out.println("Invalid Input of choice please try again");
              }
         }catch(Exception e) {
        	 System.out.println("invalid input variable please try again");
        	 scan.nextLine();
         }
         }
    	
        DefaultConstruct.NumOfChoices();
        String facialHair = "";
        while (true) {
            System.out.print("Select Facial Hair: (1. Beard, 2. Mustache, 3. Goatee, 4. Goatee and Mustache, 5. None): ");
            try{
            int choice = scan.nextInt();  
            if(choice == 1){
            facialHair = "Beard";
            break;
            }else if(choice == 2){
            facialHair = "Mustache";
            break;
            }else if(choice == 3){
            facialHair = "Goatee";
            break;
            }else if(choice == 4){
            facialHair = "Goatee and Mustache";
            break;
            }else if(choice == 5){
            facialHair = "None";
            break;
            }else{
                System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        		System.out.println("invalid input variable please try again");
       	 scan.nextLine();
            }
        }
        
        DefaultConstruct.NumOfChoices();
        String country="";
        while (true) {
        System.out.print("Select Country: (1. UK, 2. USA, 3. Philippines, 4. Brazil, 5. Canada): ");        
        try {
        int choice = scan.nextInt();  
        
        if(choice == 1){
            country = "UK";
            break;
        }else if(choice == 2){
            country = "USA";
            break;
        }else if(choice ==3){
            country = "Philippines";
            break;
        }else if(choice == 4){
            country = "Brazil";
            break;
        }else if(choice == 5){
            country = "Canada";
            break;
        }else{
        	System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
            }
        }
        
        DefaultConstruct.NumOfChoices();
        String characterRole = "";  
        while(true){  
        System.out.print("Select Character Role: (1. Kid, 2. Teen, 3. Young Adult, 4. Adult, 5. Elder): ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    characterRole = "Kid";
                    break;
                }else if(choice == 2){
                    characterRole = "Teen";
                    break;
                }else if(choice ==3){
                    characterRole = "Young Adult";
                    break;
                }else if(choice == 4){
                    characterRole = "Adult";
                    break;
                }else if(choice == 5){
                    characterRole = "Elder";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        			System.out.println("invalid input variable please try again");
       	 scan.nextLine();
            } 
        }
        
        DefaultConstruct.NumOfChoices();
        String bodyType = "";
        while (true) {       
        System.out.print("Select Body Type: (1. Thin, 2. Average, 3. Fat, 4. Muscular, 5. Athletic): ");
        try {
        int choice = scan.nextInt();
        if(choice == 1){
                    bodyType = "Thin";
                    break;
                }else if(choice == 2){
                    bodyType = "Average";
                    break;
                }else if(choice ==3){
                    bodyType = "Fat";
                    break;
                }else if(choice == 4){
                    bodyType = "Muscular";
                    break;
                }else if(choice == 5){
                    bodyType = "Athlethic";
                    break;
                }else{
                System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        		System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       	 	}
        } 
    
        DefaultConstruct.NumOfChoices();
        String voiceType = "";
        while (true) {
        System.out.print("Enter Voice Type: (1. Deep, 2. High pitch, 3. Gruff, 4. Smooth, 5. Eccentric): ");
        try {
        int choice = scan.nextInt();
        if(choice == 1){
                    voiceType = "Deep";
                    break;
                }else if(choice == 2){
                    voiceType = "High Pitch";
                    break;
                }else if(choice ==3){
                    voiceType = "Gruff";
                    break;
                }else if(choice == 4){
                    voiceType = "Smooth";
                    break;
                }else if(choice == 5){
                    voiceType = "Eccentric";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        		System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String expressions = "";
        while(true){
        System.out.print("Enter Expression: (1. Sad, 2. Angry, 3. Surprise, 4. Happy, 5. Fierce): ");
        try {
        int choice = scan.nextInt();
        if(choice == 1){
                    expressions = "Sad";
                    break;
                }else if(choice == 2){
                    expressions = "High Angry";
                    break;
                }else if(choice ==3){
                    expressions = "Surprise";
                    break;
                }else if(choice == 4){
                    expressions = "Happy";
                    break;
                }else if(choice == 5){
                    expressions = "Fierce";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String skinColor = "";
        while (true) {
        System.out.print("Select Skin Color: (1. Pale, 2. Fair, 3. Medium, 4. Naturally Brown,  5. Dark brown): ");
        try {
        int choice = scan.nextInt();
        if(choice == 1){
                    skinColor = "Pale";
                    break;
                }else if(choice == 2){
                    skinColor = "Fair";
                    break;
                }else if(choice ==3){
                    skinColor = "Medium";
                    break;
                }else if(choice == 4){
                    skinColor = "Naturally Brown";
                    break;
                }else if(choice == 5){
                    skinColor = "Dark Brown";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String hairType = "";
        while (true) {
        System.out.print("Select Hair Type: (1. Wavy, 2. Curly, 3. Straight, 4. Pony Tail, 5. Bald): ");
        try {
        int choice = scan.nextInt();
        if(choice == 1){
                    hairType = "Wavy";
                    break;
                }else if(choice == 2){
                    hairType = "Curly";
                    break;
                }else if(choice ==3){
                    hairType = "Straight";
                    break;
                }else if(choice == 4){
                    hairType = "Pony Tail";
                    break;
                }else if(choice == 5){
                    hairType = "Bald";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        }
    
        DefaultConstruct.NumOfChoices();
        String hairColor = "";
        while(true){
        System.out.print("Select Hair Color: (1. Blonde, 2. Red, 3. Green, 4. Black, 5. Brown): ");
        try {
        int choice = scan.nextInt();
        if(choice == 1){
                    hairColor = "Blonde";
                    break;
                }else if(choice == 2){
                    hairColor = "Red";
                    break;
                }else if(choice ==3){
                    hairColor = "Green";
                    break;
                }else if(choice == 4){
                    hairColor = "Black";
                    break;
                }else if(choice == 5){
                    hairColor = "Brown";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
    
        DefaultConstruct.NumOfChoices();
        String eyeColor = "";
        while(true){
        System.out.print("Select Eye Color: (1. Blue, 2. Black, 3. Green, 4. Gray, 5. Brown): ");
        try {
        int choice = scan.nextInt();
        if(choice == 1){
                    eyeColor = "Blue";
                    break;
                }else if(choice == 2){
                    eyeColor = "Black";
                    break;
                }else if(choice ==3){
                    eyeColor = "Green";
                    break;
                }else if(choice == 4){
                    eyeColor = "Gray";
                    break;
                }else if(choice == 5){
                    eyeColor = "Brown";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
    
        DefaultConstruct.NumOfChoices();
        String lipColor = "";
        while(true){
        System.out.print("Select Lip Color: (1. Red, 2. Black, 3. Violet, 4. Orange, 5. Pink): ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    lipColor = "Red";
                    break;
                }else if(choice == 2){
                    lipColor = "Black";
                    break;
                }else if(choice ==3){
                    lipColor = "Violet";
                    break;
                }else if(choice == 4){
                    lipColor = "Orange";
                    break;
                }else if(choice == 5){
                    lipColor = "Pink";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String tattoos = "";
        while(true){
        System.out.print("Select Tattoo: (1. Facial, 2. Leg, 3. Arm, 4. Neck, 5. None):  ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    tattoos = "Facial Tattoo";
                    break;
                }else if(choice == 2){
                    tattoos = "Leg Tattoo";
                    break;
                }else if(choice ==3){
                    tattoos = "Arm Tattoo";
                    break;
                }else if(choice == 4){
                    tattoos = "Neck Tattoo";
                    break;
                }else if(choice == 5){
                    tattoos = "None";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String piercing = "";
        while(true){
        System.out.print("Select Piercing: (1. Nose, 2. Lip, 3. Ear, 4. Eyebrow, 5. None):  ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    piercing = "Nose";
                    break;
                }else if(choice == 2){
                    piercing = "Lip";
                    break;
                }else if(choice ==3){
                    piercing = "Ear";
                    break;
                }else if(choice == 4){
                    piercing = "Eyebrow";
                    break;
                }else if(choice == 5){
                    piercing = "None";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String outfit = "";
        while(true){
        System.out.print("Choose an Outfit: (1. Formal, 2. Semi Formal, 3. Fighting Gear, 4. Casual, 5. Sporty): ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    outfit = "Formal";
                    break;
                }else if(choice == 2){
                    outfit = "Semi Formal";
                    break;
                }else if(choice ==3){
                    outfit = "Fighting Gear";
                    break;
                }else if(choice == 4){
                    outfit = "Casual";
                    break;
                }else if(choice == 5){
                    outfit = "Sporty";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
    
        DefaultConstruct.NumOfChoices();
        String footwear = "";
        while(true){
        System.out.print("Choose an Footwear: (1. Sneakers, 2. Slippers, 3. Sandals, 4. High Heels, 5. Formal Shoes): ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    footwear = "Sneakers";
                    break;
                }else if(choice == 2){
                    footwear = "Slippers";
                    break;
                }else if(choice ==3){
                    footwear = "Sandals";
                    break;
                }else if(choice == 4){
                    footwear = "High Heels";
                    break;
                }else if(choice == 5){
                    footwear = "Formal Shoes";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String accessories = "";
        while(true){
        System.out.print("Select Accessories: (1. Gloves, 2. Rings, 3. Watches, 4. Bracelets, 5. None): ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    accessories = "Gloves";
                    break;
                }else if(choice == 2){
                    accessories = "Rings";
                    break;
                }else if(choice ==3){
                    accessories = "Watches";
                    break;
                }else if(choice == 4){
                    accessories = "Bracelets";
                    break;
                }else if(choice == 5){
                    accessories = "None";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String posture = "";
        while(true){
        System.out.print("Select Posture: (1. Confident, 2. Relax, 3. Intimidating, 4. Shy, 5. Tired): ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    posture = "Confident";
                    break;
                }else if(choice == 2){
                    posture = "Relax";
                    break;
                }else if(choice ==3){
                    posture = "Intimidating";
                    break;
                }else if(choice == 4){
                    posture = "Shy";
                    break;
                }else if(choice == 5){
                    posture = "Tired";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String weapon = "";
        while(true){
        System.out.print("Choose a Weapon: (1. Bow and Arrow, 2. Sword, 3. Spear, 4. Wand, 5. Gun): ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    weapon = "Bow and Arrow";
                    break;
                }else if(choice == 2){
                    weapon = "Sword";
                    break;
                }else if(choice ==3){
                    weapon = "Spear";
                    break;
                }else if(choice == 4){
                    weapon = "Wand";
                    break;
                }else if(choice == 5){
                    weapon = "Gun";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        } 
        
        DefaultConstruct.NumOfChoices();
        String attributes = "";
        while (true){
        System.out.print("Select Attributes: (1. Body, 2. Reflexes, 3. Technical Ability, 4. Intelligence, 5. Cool): ");
        try { 
        int choice = scan.nextInt();
        if(choice == 1){
                    attributes = "Body";
                    break;
                }else if(choice == 2){
                    attributes = "Reflexes";
                    break;
                }else if(choice ==3){
                    attributes = "Technical Ability";
                    break;
                }else if(choice == 4){
                    attributes = "Intelligence";
                    break;
                }else if(choice == 5){
                    attributes = "Cool";
                    break;
                }else{
                    System.out.println("Invalid Input of choice please try again");
                }
        }catch(Exception e) {
        	System.out.println("invalid input variable please try again");
       	 scan.nextLine();
       		}
        }

        System.out.println("\n----------------------------------------------------------------\n");
 
        boolean mode;
        while (true) {
        System.out.println("\n");
        DefaultConstruct.NumOfChoices(true);
        System.out.print("\nDo you want to play in Hard Mode? (true/false): ");
        String choicemode = scan.nextLine();
        if (choicemode.equalsIgnoreCase("true") || choicemode.equalsIgnoreCase("false")) {
         mode = Boolean.parseBoolean(choicemode);
        	break;
        }
        }
        
        HeroDesign HeroInformation = new HeroDesign(name, gender,height);
        HeroInformation.name();
        HeroInformation.gender();
        HeroInformation.height();
        
        HeroDesign HeroDesign1 = new HeroDesign(country, characterRole, bodyType, voiceType, expressions, skinColor, hairType, hairColor, eyeColor, lipColor, facialHair, tattoos, piercing, outfit, footwear, accessories, posture, weapon, attributes);
        HeroDesign1.facialHair();
        HeroDesign1.country();
        HeroDesign1.characterRole();
        HeroDesign1.bodyType();
        HeroDesign1.voiceType();
        HeroDesign1.expressions();
        HeroDesign1.hairType();
        HeroDesign1.hairColor();
        HeroDesign1.eyeColor();
        HeroDesign1.lipColor();
        HeroDesign1.tattoos();
        HeroDesign1.piercing();
        HeroDesign1.outfit();
        HeroDesign1.footwear();
        HeroDesign1.accessories();
        HeroDesign1.posture();
        HeroDesign1.weapon();
        HeroDesign1.attributes();
        
        HeroDesign BooleanConstruct = new HeroDesign(mode);
        BooleanConstruct.Hard();
        
        DefaultConstruct.outro();     
    }
}
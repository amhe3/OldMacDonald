class Pig implements Animal 
{     
    private String myType;
    private String mySound;
    public Pig(String type, String sound)
    {
    	myType = type;
    	mySound = sound;
    }
    public Pig()
    {
    	myType = "Pig";
    	mySound = "Oink!";
    }
    public String getType()
    {
    	return myType;
    }
    public String getSound()
    {
    	return mySound;
    }
}
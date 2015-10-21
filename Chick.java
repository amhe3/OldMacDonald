class Chick implements Animal 
{     
    private String myType;
    private String mySound;
    private int num;
    public Chick(String type, String sound)
    {
    	myType = type;
    	mySound = sound;
    	num = (int) (Math.random()*3);
    }
    public Chick()
    {
    	myType = "Chick";
    	if(num == 0)
    	{
    		mySound = "Cluck!";
    	}
    	if(num == 1)
    	{
    		mySound = "Cheep!";
    	}
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
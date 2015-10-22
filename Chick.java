class Chick implements Animal 
{     
    private String myType;
    private String mySound;
    private String mySound2;
    private int num;
    public Chick(String type, String sound, String sound2)
    {
    	myType = type;
    	mySound = sound;
    	mySound2 = sound2;
    	num = (int) (Math.random()*3);
    }
    public Chick()
    {
    	myType = "Chick";
    	mySound = "Cluck!";
    	mySound2 = "Cheep!";
    }
    public String getType()
    {
    	return myType;
    }
    public String getSound()
    {
    	if(num == 0)
    	{
    		return mySound;
    	} else
    	return mySound2;
    }
}
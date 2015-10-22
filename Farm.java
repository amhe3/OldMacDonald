class Farm 
{     
   private Animal[] aBunchOfAnimals = new Animal[3];
   public Farm()
   {
   		aBunchOfAnimals[0] = new NamedCow("Cow", "Moo!", "Elsie");
   		aBunchOfAnimals[1] = new Chick("Chick", "Cluck!", "Cheep!");
   		aBunchOfAnimals[2] = new Pig("Pig", "Oink!");
   }
   public void animalSounds()
   {
   	for(int i = 0; i < aBunchOfAnimals.length; i++)
   	{
   		System.out.println(aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
   	}
   	System.out.println("The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() + ".");
   }
}

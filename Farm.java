class Farm 
{     
   private Animal[] what = new Animal[3];
   public Farm(){
   		what[0] = new NamedCow("cow","moo","Francesca");
   		what[1] = new Pig ("pig","oink");
   		what[2] = new Chick("chick","cheep","squawk");
   }
   public void makeSounds(){
   		for(int a = 0; a < what.length; a ++){
   			System.out.println(a == 0? what[a].getName() + " the " + what[a].getType() + " says " what[a].getSound() : what[a].getType() + " says " what[a].getSound());
   		}
   }
}

class Chick implements Animal 
{     
     private String type, sound;
     public Chick(String t, String s1,String s2){
     	type = t;
     	sound = Math.random() < 0.5? s1:s2;
     } 
     public String getSound(){return sound;}
     public String getType(){return type;}
}

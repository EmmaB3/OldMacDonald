class Cow implements Animal 
{     
     private String type, sound;
     public Cow(String t, String s){
     	type = t;
     	sound = s;
     } 
     public String getSound(){return sound;}
     public String getType(){return type;}
}

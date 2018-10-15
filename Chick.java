class Chick implements Animal 
{     
     private String type, sound1,sound2;
     public Chick(String t, String s1,String s2){
     	type = t;
     	sound1 = s1;
     	sound2 = s2;
     } 
     public String getSound(){return Math.random() * 2 < 0.5? sound1:sound2;}
     public String getType(){return type;}
}

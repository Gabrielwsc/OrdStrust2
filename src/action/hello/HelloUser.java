/**
 *
 * HelloUser.java class
 *   at silver8250.hello package 
 *   in HelloStruts2 project
 * 2009/1/4 «Ø¥ß
 * @author Silver8250
 */
package action.hello;


public class HelloUser{
   private String name;
   private String password;
   
   
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
   
   public String getPassword(){
	   return password;
   }
   public void setPassword(String password){
	   this.password = password;
   }
   
   public String execute(){
	   
	   if(password.equalsIgnoreCase("123")){
		   this.setName("Hello~"+this.getName());
		   return "success";
	   }
	   return "login";
   }
}
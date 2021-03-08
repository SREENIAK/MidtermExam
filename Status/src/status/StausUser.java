/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * March 8th
 * @author srinivsi
 */
public class StausUser 
{
   public void statusDetail(int code)
{
if (code == 0) {
  System.out.println("REJECTED");
}
else if(code == 1) {
  System.out.println("PENDING");
}
else if (code == 3) {
  System.out.println("APPROVED");
}
else {
  System.out.println("NOT VALID CODE");
}

}
}

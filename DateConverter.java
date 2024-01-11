package Exam;
import java.util.Scanner;
public class DateConverter {
    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    String date;
    System.out.print("Enter Date(YYYY-MM-dd) : ");date = cin.next();
    String[] arrDate = date.split("-");
    switch(arrDate[1]) {
      case "01" :
        arrDate[1]="January";
        break;
      case "02":
        arrDate[1]="Febuary";
        break;
      case "03":
        arrDate[1]="March";
        break;
      case "04":
        arrDate[1]="April";
        break;
      case "05":
        arrDate[1]="May";
        break;
      case "06":
        arrDate[1]="June";
        break;
      case "07":
        arrDate[1]="July";
        break;
      case "08":
        arrDate[1]="August";
        break;
      case "09":
        arrDate[1]="September";
        break;
      case "10":
        arrDate[1]="October";
        break;
      case "11":
        arrDate[1]="November";
        break;
      case "12":
        arrDate[1]="December";
        break;
      default:
        System.out.println("Invalid Input!...");   
    }
    System.out.println("Output : " + arrDate[1]+" "+arrDate[2]+","+arrDate[0]);
    
  }
}
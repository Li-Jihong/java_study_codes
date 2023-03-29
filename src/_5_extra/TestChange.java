package _5_extra;

public class TestChange {

	public static void main(String[] args) {
	   Animal x=new Tiger();
	   System.out.println("(1):x.news is "+x.news);
	   System.out.println("(2):((Tiger)x).news is "+((Tiger)x).news);
	   System.out.println("(3):x.smile() is "+x.smile());
	   System.out.println("(4):((Tiger)x).smile() is "+((Tiger)x).smile());
	   System.out.println("(5):x.getNews() is "+((Animal)x).getNews());
	   System.out.println("(6):x.getNews() is "+x.getNews());
	   System.out.println("(7):x.getMessage() is "+x.getMessage());
	   System.out.println("(8):((Tiger)x).eat() is "+((Tiger)x).eat());
	}	
}


class Animal{
  public String news="Animal's  news";
  public String message="Animal's message";
  
  public static String smile(){
  	return "smile from Animal";
  }
  
  public String getNews(){
  	return news;
  }
  
  public String getMessage(){
  	return message;
  }
}


class Tiger extends Animal{
  public String news="Tiger's  news";
  public String message="Tiger's message";
  
  public static String smile(){
  	return "smile from Tiger";
  }
  
  public String getNews(){
  	return news;
  }
  
  //�����ķ���
  public  String eat(){
  	return "need eat meat";
  }
}

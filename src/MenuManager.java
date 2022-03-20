import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int num = 5;
		int exit = 0;
	    while (num != 6) {
	    	System.out.println("---- your favorite music----");
	    	System.out.println("1. Add music");
	    	System.out.println("2. Delete music");
	    	System.out.println("3. Edit music");
	    	System.out.println("4. View music");
	    	System.out.println("5. Exit");
	    	System.out.println("6. show a menu");
	    	num = a.nextInt();
		
	        switch(num%10) {
	        case 1:
	    	    addmusic();
	    	    break;
		    case 2:
			    deletemusic();
			    break;
		    case 3:
			    editmusic();
			    break;
		    case 4:
			    viewmusic();
			    break;
		    case 5:
		    	exit = -1;
		    	System.out.println("메뉴를 끝냅니다");
		    	break;
		    case 6:
		    	showmenu();
		    	break;	
		    default :
		       System.out.println("번호가 잘못되었습니다");    
		    }
	        
	        if(exit == -1) {
	        	break;
	        }
	    }

	}
	       
	public static void addmusic() {
		Scanner a = new Scanner(System.in);
		System.out.println("musictitle");
		String musictitle = a.nextLine();
		System.out.println("songwriter");
		String songwriter = a.nextLine();
		System.out.println("musictime");
		String musictime = a.nextLine();
	}
	public static void deletemusic() {
		Scanner a = new Scanner(System.in);
		System.out.println("musictitle");
		String musictitle = a.nextLine();
	}
	public static void editmusic() {
		Scanner a = new Scanner(System.in);
		System.out.println("musictitle");
		String musictitle = a.nextLine();
	}
	public static void viewmusic() {
	    Scanner a = new Scanner(System.in);
	    System.out.println("musictitle");
	    String musictitle = a.nextLine();
	}	
	public static void showmenu() {
		System.out.println("메뉴로 돌아갑니다");
	}
}

           

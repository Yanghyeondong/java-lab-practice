
public class LabPrac3 {
	
	public static class Book {
		
		boolean Borrowed;
		//true when Borrowed
		//false when Returned
	}

	public static class Library {
		
		Book[] books;
		
		Library(){
			books = new Book[10];
			for(int i=0;i<10;i++) {
				books[i] = new Book();
				books[i].Borrowed = false;
			}
		}
	
		void borrowBook(int n) {
			if(books[n].Borrowed == true) {
				System.out.println ("Error_borrowed_book");
			}
			else {books[n].Borrowed = true;}
			
		}
		
		void returnBook(int n) {
			if(books[n].Borrowed == false) {
				System.out.println ("Error_aready_returned");
			}
			else {books[n].Borrowed = false;}
			
		}

	}
	
	public static void main(String[] args) {
		

	      

		
	}
}


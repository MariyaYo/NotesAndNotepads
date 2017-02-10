
public class SecuredNotepad extends SimpleNotepad implements INotepad {

	private String pass;

	SecuredNotepad(int numOfPages, String pass){  
		super(numOfPages);
		if (pass != null && !pass.isEmpty() && isSecured(pass)) {
			this.pass = pass;
		} else {
			System.out.println("You didn't enter a password. SecuredNotepad can't be ceated.");
			//don't know... won't google
		}
	}
	public void addText(int pageNum, String text) {}
	public void addText(int pageNum, String text, String pass) {
		if(checkPass(pass)){
			super.addText(pageNum, text);
		}
	}

	public void addTitle(int pageNum, String title) {}
	public void addTitle(int pageNum, String title, String pass) {
		if(checkPass(pass)){
			super.addTitle(pageNum, title);
		}
	}
	public void addTextandTitle(int pageNum, String title, String text) {}
	public void addTextandTitle(int pageNum, String title, String text, String pass) {
		if(checkPass(pass)){
			super.addTextandTitle(pageNum, title, text);
		}
	}
	public void replaceText(int pageNum, String text) {}
	public void replaceText(int pageNum, String text, String pass) {
		if(checkPass(pass)){
			super.replaceText(pageNum, text);
		}
	}
	public void replaceTitle(int pageNum, String title) {}
	public void replaceTitle(int pageNum, String title, String pass) {
		if(checkPass(pass)){
			super.replaceTitle(pageNum, title);
		}
	}
	public void deleteText(int pageNum) {}
	public void deleteText(int pageNum, String pass) {
		if(checkPass(pass)){
			super.deleteText(pageNum);
		}
	}
	public void deleteTitle(int pageNum) {}
	public void deleteTitle(int pageNum, String pass) {
		if(checkPass(pass)){
			super.deleteTitle(pageNum);
		}
	}
	public void deleteAll(int pageNum) {}
	public void deleteAll(int pageNum, String pass) {
		if(checkPass(pass)){
			super.deleteAll(pageNum);
		}
	}
	public void printText() {}
	public void printText(String pass) {
		if(checkPass(pass)){
			super.printText();
		}
	}
	private boolean checkPass(String pass){
		if(this.pass.equals(pass)){
			return true;
		}else{
			return false;
		}
	}
	public boolean searchWord(String word) {
		return false;
	}
	public boolean searchWord(String word, String pass){
		if(checkPass(pass)){
			super.searchWord(word);
		}
		return false;
	}
	
	public void printAllPagesWithDigits(){}
	public void printAllPagesWithDigits(String pass){
		if(checkPass(pass)){
			super.printAllPagesWithDigits();
		}
	}
	boolean isSecured(String pass){
		//has 5 symbols
		if(pass.length() > 4){
			//contains numbers
			if(pass.matches(".*\\d.*")){
				//has upper- and lowercase letters
				for (int i = 0; i<pass.length(); i++){
					if((pass.charAt(i)>= 65 && pass.charAt(i)<=90) ||
					(pass.charAt(i)>= 97 && pass.charAt(i)<=122)){
						//i can just google the regex solution tho~
						return true;
						
					}
				}
				
			}
		}
		return false;
	}
}

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {

	private boolean isOn;
	
	ElectronicSecuredNotepad(int numOfPages, String pass) {
		super(numOfPages, pass);
	}
	public void start() {
		this.isOn = true;	
	}
	public void stop() {
		this.isOn = false;	
	}
	public boolean isStarted() {
		if(this.isOn){
			return true;
		}else{
			return false;
		}
	}
	public void addText(int pageNum, String text, String pass) {
		if(this.isStarted()){
			super.addText(pageNum, text, pass);
		}
	}
	public void addTitle(int pageNum, String title, String pass) {
		if(this.isStarted()){
				super.addTitle(pageNum, title, pass);
			}
		}
	public void addTextandTitle(int pageNum, String title, String text, String pass) {
		if(this.isStarted()){
			super.addTextandTitle(pageNum, title, text, pass);
		}
	}
	public void replaceText(int pageNum, String text, String pass) {
		if(this.isStarted()){
			super.replaceText(pageNum, text, pass);
		}
	}
	public void replaceTitle(int pageNum, String title, String pass) {
		if(this.isStarted()){
			super.replaceTitle(pageNum, title, pass);
		}
	}

	public void deleteText(int pageNum, String pass) {
		if(this.isStarted()){
			super.deleteText(pageNum, pass);
		}
	}

	public void deleteTitle(int pageNum, String pass) {
		if(this.isStarted()){
			super.deleteTitle(pageNum, pass);
		}
	}
	public void deleteAll(int pageNum, String pass) {
		if(this.isStarted()){
			super.deleteAll(pageNum, pass);
		}
	}

	public void printText(String pass) {
		if(this.isStarted()){
			super.printText(pass);
		}
	}

	public boolean searchWord(String word, String pass){
		if(this.isStarted()){
			super.searchWord(word, pass);
		}
		return false;
	}
	
	public void printAllPagesWithDigits(String pass){
		if(this.isStarted()){
			super.printAllPagesWithDigits(pass);
		}
	}
}

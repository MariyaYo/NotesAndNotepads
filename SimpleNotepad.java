
public class SimpleNotepad implements INotepad{
	
	private Page[] pages;
	private int numOfPages;

	SimpleNotepad (int numOfPages){
		if(numOfPages > 9){
			this.numOfPages = numOfPages;
			pages = new Page[this.numOfPages];
		}else{
			pages = new Page[10];
		}	
		for(int i = 0; i<pages.length; i++){
			pages[i] = new Page();
		}
	}
		//if you want to add text only... no restraint
	public void addText(int pageNum, String text) {
		if(pageNum <pages.length){
			this.pages[pageNum-1].addText(text);
		}else{
			showError();
		}
	}
	//if u want to add title... only if it's a empty title....
	public void addTitle(int pageNum, String title) {
		if(pageNum <pages.length){
			this.pages[pageNum-1].addTitle(title);
		}else{
			showError();
		}
	}
	//if you want to add text and title.. this will happen only in a blank page
	public void addTextandTitle(int pageNum, String title, String text) {
		if(pageNum <pages.length){
			if(this.pages[pageNum-1].getTitle() == null && this.pages[pageNum-1].getText() == null)
			this.pages[pageNum-1].addText(text);
			this.pages[pageNum-1].addTitle(title);
		}else{
			showError();
		}
	}
	//cleans the text in this page and start from scratch
	public void replaceText(int pageNum, String text) {
		if(pageNum <pages.length){
			this.pages[pageNum].setText(text);
		}else{
			showError();
		}
	}
	//cleans the title and replace it with new one
	public void replaceTitle(int pageNum, String title){
		if(pageNum <pages.length){
			this.pages[pageNum].setTitle(title);
		}else{
			showError();
		}
	}
	//delete text only 
	public void deleteText(int pageNum) {
		if(pageNum <pages.length){
			if(pages[pageNum-1].getText() == null){
				System.out.println("So, you want to delete this already empty page?");
				System.out.println("OK.");
			}
			pages[pageNum-1].deleteText();
		}else{
			showError();
		}
	}
	//delete only the title
	public void deleteTitle(int pageNum) {
		if(pageNum <pages.length){
			if(pages[pageNum-1].getTitle() == null){
				System.out.println("So, you want to delete this already empty title?");
				System.out.println("OK.");
			}
			pages[pageNum-1].deleteTitle();
		}else{
			showError();
		}
	}
	//well deletes all
	public void deleteAll(int pageNum) {
		if(pageNum <pages.length){
			if(pages[pageNum-1].getText() == null){
				System.out.println("So, you want to delete this already empty page?");
				System.out.println("OK.");
			}
			pages[pageNum-1].deleteText();
			pages[pageNum-1].deleteTitle();
		}else{
			showError();
		}
	}
	//prints everything that's not null
	public void printText() {
		for(int i = 0; i<pages.length; i++){
			if(this.pages[i].getText() != null){
				pages[i].printText();
			}
			if(this.pages[i].getTitle() != null){
				pages[i].printTitle();
			}
		}
	}
	
	private void showError(){
		System.out.println("In this notepad there are only " + pages.length + "number of pages.");
		System.out.println("Please choose a valid page.");
	}
	
	public Page[] getPages() {
		return pages;
	}
	public int getNumOfPages() {
		return numOfPages;
	}
	
	public boolean searchWord(String word){
		for(int i = 0; i<pages.length; i++){
			if(this.pages[i].getText()!= null){
				return this.pages[i].searchWord(word);
			}
		}
		return false;
	}
	
	public void printAllPagesWithDigits(){
		for(int i = 0; i<pages.length; i++){
			if(this.pages[i].getText()!= null){
				if(this.pages[i].containsDigits()){
					this.pages[i].printText();
				}else{
					continue;
				}
			}
		}
		
	}
}

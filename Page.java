
public class Page {
	private String title;
	private String text;
	
	Page(){}
	
	public void addTitle(String title){
		if(this.title != null){
			System.out.println("This page allready has a name.");
			System.out.println("Try to replace the old one with new.");
		}else{
			this.title = title;
		}
	}
	public void addText(String text){
		if(this.text != null){
			String text1 = this.text;
			this.text = text1 + text;	
		}else{
			this.text = text;
		}
	}
	
	public void deleteText(){
		this.text = null;	
	}	
	
	public void deleteTitle(){	
		this.title = null;
	}
	
	public void printTitle(){
		System.out.println(this.getTitle());
		System.out.println(this.getText());
		
	}
	public void printText(){
		System.out.println(this.getText());
		
	}

	public String getTitle() {
		return title;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setTitle(String title) {
		if(!title.contains(".") && title.isEmpty() && title != null){
			this.title = title;
		}else{
			this.title = "Page";
		}
	}
	
	public boolean searchWord(String word){
		if(word.contains(this.getText())){
			return true;
		}else{
			return false;
		}
	}
	public boolean containsDigits(){
		if(this.text.matches(".*\\d.*")){
			return true;
		}else{
			return false;
		}
	}
	
}
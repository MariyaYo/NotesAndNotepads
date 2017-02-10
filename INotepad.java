
public interface INotepad {
	
	void addText(int pageNum, String text);
	void addTitle(int pageNum, String title);
	void addTextandTitle(int pageNum, String title, String text);
    void replaceText(int pageNum, String text);
    void replaceTitle(int pageNum, String text);
    void deleteText(int pageNum);
    void deleteTitle(int pageNum);
    void deleteAll(int pageNum);
	void printText();
	
	boolean searchWord(String word);
	void printAllPagesWithDigits() ;
    
}

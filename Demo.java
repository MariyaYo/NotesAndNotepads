public class Demo {
	public static void main(String[] args){
		
	SimpleNotepad note = new SimpleNotepad(16);
	System.out.println(note.getNumOfPages());
	note.addTextandTitle(1, "Hello", "hello text");
	note.addTextandTitle(2, "page2", "dfghjk");
	note.addTextandTitle(3, "fgh", "tehdsadas");
	note.addTextandTitle(4, "dsafff", "dasfasfa");
	note.deleteText(3);
	note.printText();

	SecuredNotepad note2 = new SecuredNotepad(16, "aA9aa");
	note2.addText(1, "hello there", "aA9aa");
	note2.printText("aA9aa");

	
	
	ElectronicSecuredNotepad tablet = new ElectronicSecuredNotepad(20, "bB8bb");
	
	tablet.addTextandTitle(1, "Bye", "Bye text", "bB8bb");
	tablet.addTextandTitle(2, "page3", "page3", "bB8bb");
	tablet.start();
	tablet.addTextandTitle(3, "Bye", "page", "bB8bb");
	tablet.addTextandTitle(4, "Bye", "Homework 20", "bB8bb");
	tablet.deleteText(3, "bB8bb");
	tablet.printText("bB8bb");
	System.out.println();
	tablet.printAllPagesWithDigits("bB8bb");
	}
}
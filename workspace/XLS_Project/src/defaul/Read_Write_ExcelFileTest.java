package defaul;

public class Read_Write_ExcelFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader d = new Xls_Reader("C:\\Users\\AZIZ\\Documents\\seleniumjar\\nikul sir files\\NikulTest.xlsx");
		
		
		
		System.out.println(d.getCellData("Data1", "name", 2));
       System.out.println(d.getCellData("Data1", 1, 2));
       
       String correctEmail = d.getCellData("Data1", 1, 2);
       System.out.println(correctEmail);
       
       System.out.println(d.getRowCount("Data1"));
       
       d.setCellData("Data1", "Name", 11, "testing");
       System.out.println(d.getRowCount("Data1"));
       
       d.addColumn("Data1", "Nikul");
       
       
       
       
	}
	

}

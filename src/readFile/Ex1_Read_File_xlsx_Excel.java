package readFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex1_Read_File_xlsx_Excel {
	public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(new File("D:\\workspace\\JavaPractice\\readFile\\excelTest.xlsx"));
            
            // Khởi tạo workbook cho tệp xlsx 
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            
            // Lấy worksheet đầu tiên trong workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            
            // Duyệt qua từng row
            Iterator<Row> rowIterator = sheet.iterator();
            
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                // Duyệt qua từng cell
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();                
                    switch (cell.getCellType()) {
                        case STRING :
                            System.out.print(cell.getStringCellValue() + "\t\t\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t\t\t");
                            break;
					default:
						break;
                    }
                }
                System.out.println("");
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
	
}

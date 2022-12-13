package readFile;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class Ex1_Read_File_xls_Excel {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(
					new File("D:\\workspace\\JavaPractice\\readFile\\excelTest.xls"));

			// Khởi tạo workbook cho tệp xls
			HSSFWorkbook workbook = new HSSFWorkbook(file);

			// Lấy worksheet đầu tiên trong workbook
			HSSFSheet sheet = workbook.getSheetAt(0);

			FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();

			// Duyệt qua từng row
			for (Row row : sheet) {
				//Duyệt qua từng cell
				for (Cell cell : row) {
					switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
					case STRING:
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

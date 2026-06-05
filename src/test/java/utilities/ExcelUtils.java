package utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String excelPath) throws IOException {

        FileInputStream fis = new FileInputStream(excelPath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet("Employees");

    }
    public int getRowCount() {

        return sheet.getPhysicalNumberOfRows();
    }

    public String getCellData(int row, int col) {

        return sheet.getRow(row)
                .getCell(col)
                .toString();
    }
}

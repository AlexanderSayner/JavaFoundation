package org.sayner.sandbox.example.springboot.allspringboot.util

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.sayner.sandbox.example.springboot.allspringboot.model.Ruler
import org.springframework.web.multipart.MultipartFile
import java.io.InputStream

const val TYPEx = "xlsx"
const val TYPE = "xls"

fun getFormat(file: MultipartFile): String {
    val filename = file.originalFilename ?: ""
    val reversed = filename.reversed()
    var format = ""
    for (c in reversed) {
        if (c == '.') break
        format = format.plus(c)
    }
    return format.reversed()
}

fun hasXlsxFormat(file: MultipartFile) =
        getFormat(file).equals(TYPEx, true)


fun hasXlsFormat(file: MultipartFile) =
        getFormat(file).equals(TYPE, true)


fun xlsxToModel(inputStream: InputStream) =
        excelToModel(XSSFWorkbook(inputStream))

fun xlsToModel(inputStream: InputStream) =
        excelToModel(HSSFWorkbook(inputStream))


fun excelToModel(workBook: Workbook): List<Ruler> {
    val list = mutableListOf<Ruler>()
    val sheetIterator = workBook.sheetIterator()
    while (sheetIterator.hasNext()) {
        val sheet = sheetIterator.next()
        val rowIterator = sheet.iterator()
        if (rowIterator.hasNext())
            rowIterator.next() // Skipping header
        while (rowIterator.hasNext()) {
            val row = rowIterator.next()
            val cellIterator = row.iterator()
            var index = 0
            var plu = 0.0
            var description = ""
            var horizontal = ""
            var vertical = ""
            while (cellIterator.hasNext()) {
                val cell = cellIterator.next()
                when (index++ % 4) {
                    0 -> plu = cell.numericCellValue
                    1 -> description = cell.stringCellValue
                    2 -> horizontal = cell.stringCellValue
                    3 -> vertical = cell.stringCellValue
                    else -> {
                        println("Something wrong")
                    }
                }
            }
            val ruler = Ruler(plu.toInt(), description, horizontal, vertical)
            list.add(ruler)
        }
    }
    return list
}

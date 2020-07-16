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

fun hasXlsxFormat(file: MultipartFile): Boolean {
    if (getFormat(file).equals(TYPEx, true))
        return true
    return false
}

fun hasXlsFormat(file: MultipartFile): Boolean {
    if (getFormat(file).equals(TYPE, true))
        return true
    return false
}

fun xlsxToModel(inputStream: InputStream): List<Ruler> {
    val workBook = XSSFWorkbook(inputStream)
    return excelToModel(workBook)
}

fun xlsToModel(inputStream: InputStream): List<Ruler> {
    val workBook = HSSFWorkbook(inputStream)
    return excelToModel(workBook)
}

fun excelToModel(workBook: Workbook): List<Ruler> {
    val list = mutableListOf<Ruler>()
    val sheetIterator = workBook.sheetIterator()
    while (sheetIterator.hasNext()) {
        val sheet = sheetIterator.next()
        val iterator = sheet.iterator()
        if (iterator.hasNext())
            iterator.next() // Skipping header
        while (iterator.hasNext()) {
            val row = iterator.next()
            val rowIterator = row.iterator()
            var index = 0
            var plu = 0.0
            var description = ""
            var horizontal = ""
            var vertical = ""
            while (rowIterator.hasNext()) {
                val cell = rowIterator.next()
                when (index % 4) {
                    0 -> plu = cell.numericCellValue
                    1 -> description = cell.stringCellValue
                    2 -> horizontal = cell.stringCellValue
                    3 -> vertical = cell.stringCellValue
                    else -> {
                        println("Something wrong")
                    }
                }
                index++
            }
            val ruler = Ruler(plu.toInt(), description, horizontal, vertical)
            list.add(ruler)
        }
    }
    return list
}

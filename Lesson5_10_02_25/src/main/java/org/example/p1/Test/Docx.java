package org.example.p1.Test;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Docx {

 try (XWPFDocument document = new XWPFDocument()) {
        // Yangi paragraf qo'shish
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText("Bu oddiy DOCX faylga yozilgan birinchi paragraf.");

        // Faylni saqlash
        try (FileOutputStream out = new FileOutputStream("example.docx")) {
            document.write(out);
        }
        System.out.println("DOCX fayl muvaffaqiyatli yaratildi!");
    } catch (IOException e) {
        e.printStackTrace();
    }




}

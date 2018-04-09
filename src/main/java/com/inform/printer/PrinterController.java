package com.inform.printer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/printer")
@SuppressWarnings({"WeakerAccess","unused"})
public class PrinterController {

    @PostMapping(path="")
    @ResponseBody
    public String print(@RequestBody FormCollection formCollection) {

        Printer printer = new Printer();

        printer.setFormCollection(formCollection);

        return  printer.print();
    }
}
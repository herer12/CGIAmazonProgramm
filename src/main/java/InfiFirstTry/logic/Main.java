package InfiFirstTry.logic;

import InfiFirstTry.webapp.CgiParameterController;
import InfiFirstTry.webapp.HtmlTemplateHandler;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Content-Type: text/html; charset=UTF-8");
        System.out.println();

        //Im Moment noch zum Test

        CgiParameterController cgi = new CgiParameterController();

        String user = cgi.getParam("USER");
        String message = cgi.getParam("MESSAGE");

        if (user == null) user = "Gast";
        if (message == null) message = "(keine Nachricht)";

        HtmlTemplateHandler tpl = new HtmlTemplateHandler("index.html");

        tpl.replace("USER", user);
        tpl.replace("MESSAGE", message);
        tpl.replace("DATUM", LocalDateTime.now().toString());
        tpl.printHtml();






    }



}

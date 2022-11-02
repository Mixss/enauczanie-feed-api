package esovisco.enauczaniefeed.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String test(){
        return "API is working";
    }

    @RequestMapping(value = "/style")
    public String style(){
        return ".message-body {\n" +
                "    -webkit-box-shadow: 5px 5px 15px 5px #00000060;\n" +
                "    box-shadow: 2px 2px 5px 2px #00000060;\n" +
                "    border-radius: 5px;\n" +
                "    padding-top: 10px;\n" +
                "    padding-bottom: 10px;\n" +
                "    margin: 15px;\n" +
                "}\n" +
                "\n" +
                ".message-text {\n" +
                "    font-size: 2rem;\n" +
                "    margin-left:10px;\n" +
                "}\n" +
                "\n" +
                ".message-author {\n" +
                "    font-size: 17px;\n" +
                "    margin-left: 15px;\n" +
                "}\n" +
                "\n" +
                ".message-date {\n" +
                "    float: right;\n" +
                "    margin-right: 15px;\n" +
                "}\n" +
                "\n" +
                ".message-image {\n" +
                "    max-width: 500px;\n" +
                "    max-height: 400px;\n" +
                "    margin: 5px;\n" +
                "    display: block;\n" +
                "    margin-left: auto;\n" +
                "    margin-right: auto;\n" +
                "    border: 1px solid black;\n" +
                "}\n" +
                "\n" +
                ".message-image-div {\n" +
                "    padding-bottom: 20px;\n" +
                "    border-bottom: 1px solid gray;\n" +
                "}\n" +
                "\n" +
                "#feed-section {\n" +
                "\n" +
                "}\n" +
                "\n" +
                ".tab-wrapper {\n" +
                "    overflow: hidden;\n" +
                "    border: 1px solid #ccc;\n" +
                "    background-color: #f1f1f1;\n" +
                "    display: flex;\n" +
                "    align-items: flex-start;\n" +
                "    flex-direction: row;\n" +
                "}\n" +
                "\n" +
                "/* Style the buttons that are used to open the tab content */\n" +
                ".tab-wrapper button {\n" +
                "    background-color: inherit;\n" +
                "    float: left;\n" +
                "    border: none;\n" +
                "    outline: none;\n" +
                "    cursor: pointer;\n" +
                "    padding: 14px 16px;\n" +
                "    transition: 0.3s;\n" +
                "  }\n" +
                "\n" +
                "  /* Change background color of buttons on hover */\n" +
                "  .tab-wrapper button:hover {\n" +
                "    background-color: #ddd;\n" +
                "  }\n" +
                "\n" +
                "  /* Create an active/current tablink class */\n" +
                "  .tab-wrapper button.active {\n" +
                "    background-color: #ccc;\n" +
                "  }\n" +
                "\n" +
                "  /* Style the tab content */\n" +
                "  .tabcontent {\n" +
                "    display: none;\n" +
                "    padding: 6px 12px;\n" +
                "    border: 1px solid #ccc;\n" +
                "    border-top: none;\n" +
                "  }\n" +
                "\n" +
                "  #message-form{\n" +
                "    font-size: 18px;\n" +
                "  }\n" +
                "\n" +
                "  #input-message, #input-image {\n" +
                "    font-size: 20px;\n" +
                "    width: 100%;\n" +
                "  }\n" +
                "\n" +
                "  #message-form button {\n" +
                "    margin: 10px;\n" +
                "    margin-left: 2px;\n" +
                "    width: 100%;\n" +
                "    background-color: #cfcfcf;\n" +
                "  }\n" +
                "\n" +
                "  #nickname {\n" +
                "    display: none;\n" +
                "  }\n" +
                "\n" +
                ".refresh-button {\n" +
                "  align-self: baseline;\n" +
                "}";
    }
}

package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String homeMethod () {

        return "<h1>Skills Tracker</h1>" +
                "<p>We have a few skills we would like to learn...</p>" +
                "<h2>Skills</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>TypeScript</li>" +
                "</ol>" +
                "<a href='form'>Go to Form</a>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        // https://www.w3schools.com/tags/tag_select.asp
        // this is a template
        return  "<h1>Order your languages by favorite</h1>" +
                "<form action='results'>" +
                    "<label for='name'>My Name: </label>" +
                    "<input type='text' id='name' name=name>" +
                    "<br>" +
                    "<label for='fi'>My favorite language: </label>" +
                    "<select id='fi' name='fi'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='TypeScript'>TypeScript</option>" +
                    "</select>" +
                    "<br>" +
                    "<label for='se'>My second favorite language: </label>" +
                    "<select id='se' name='se'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='TypeScript'>TypeScript</option>" +
                    "</select>" +
                    "<br>" +
                    "<label for='th'>My third favorite language: </label>" +
                    "<select id='th' name='th'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='TypeScript'>TypeScript</option>" +
                    "</select>" +
                    "<br><br>" +
                    "<input type='submit' value='Submit'>" +
                "</form>";
    }

    @RequestMapping(value="results", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String formResults(@RequestParam String name, String fi, String se, String th){

        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + fi + "</li>" +
                "<li>" + se + "</li>" +
                "<li>" + th + "</li>";
    }
}

package com.star.recoder;

import org.bson.Document;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jiaxin CHEN
 * @version 1.0
 * @since 2018-12-14 16:17
 */
@RestController
public class addQsController {

    @RequestMapping(value = "/allQs", method = RequestMethod.GET)
    public String getAllQs() {
        List<Document> all = getAllQsModel.getAllQs();
        StringBuilder sb = new StringBuilder();
        for (Document document : all) {
            sb.append(document);
        }
        return sb.toString();
    }


}

package com.star.recoder;

import org.bson.Document;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jiaxin CHEN
 * @version 1.0
 * @since 2018-12-14 15:31
 */
@RestController
public class GetAllQsController {

    private GetAllQsModel getAllQsModel;

    public GetAllQsController() {
        getAllQsModel = new GetAllQsModel();
    }

    @RequestMapping(value = "/allQs", method = RequestMethod.GET)
    public String getAllQs() {
        List<Document> all = getAllQsModel.getAllQs();
        StringBuilder sb = new StringBuilder();
        for (Document document : all) {
            sb.append(document);
        }
        return sb.toString();
    }

    @RequestMapping(value = "/allQsByTag", method = RequestMethod.GET)
    public String getAllQsByTag(@RequestParam("tag") String tag) {
        List<Document> all = getAllQsModel.getQsByTag(tag);
        StringBuilder sb = new StringBuilder();
        for (Document document : all) {
            sb.append(document);
        }
        return sb.toString();
    }


    @RequestMapping(value = "/allQsByTag", method = RequestMethod.GET)
    public String getAllQsByTag(@RequestParam("tag") String tag) {
        List<Document> all = getAllQsModel.getQsByTag(tag);
        StringBuilder sb = new StringBuilder();
        for (Document document : all) {
            sb.append(document);
        }
        return sb.toString();
    }
    
}

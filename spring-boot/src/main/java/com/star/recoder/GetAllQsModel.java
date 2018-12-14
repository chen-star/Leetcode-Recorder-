package com.star.recoder;


import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiaxin CHEN
 * @version 1.0
 * @since 2018-12-14 15:41
 */
public class GetAllQsModel {

    // Standard URI format: mongodb://[dbuser:dbpassword@]host:port/dbname
    private MongoClientURI uri = new MongoClientURI("mongodb://admin:LLQupSPbxCjrLq4@ds117250.mlab.com:17250/leetcode");
    private MongoClient client = new MongoClient(uri);
    private MongoDatabase db = client.getDatabase(uri.getDatabase());
    MongoCollection<Document> qs = db.getCollection("allqs");

    public List<Document> getAllQs() {

        List<Document> result = new ArrayList<>();

        Document orderBy = new Document("number", 1);
        Document orderBy1 = new Document("date", 1);

        MongoCursor<Document> cursor = qs.find().sort(orderBy1).sort(orderBy).iterator();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                result.add(doc);
            }
        } finally {
            cursor.close();
        }

        return result;
    }

    public List<Document> getQsByTag(String tag) {
        tag = tag.toLowerCase();

        List<Document> allQs = getAllQs();
        List<Document> result = new ArrayList<>();

        for (Document doc : allQs) {
            List<String> tags = (ArrayList<String>) doc.get("tags");
            if (tags.contains(tag)) {
                result.add(doc);
            }
        }

        return result;
    }


}

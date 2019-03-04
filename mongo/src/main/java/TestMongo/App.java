package TestMongo;

import java.util.List;
import java.util.Set;

import org.bson.Document;

import com.entity.RiceEntity;
import com.entity.RicecoverEntity;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		String dbURI = "mongodb+srv://test:test@testmongo-sir7t.azure.mongodb.net/test?retryWrites=true";
    		MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI)); 
            List<String> databases = mongoClient.getDatabaseNames();
             
            for (String dbName : databases) {
                System.out.println("- Database: " + dbName); 
                DB db = mongoClient.getDB(dbName); 
                Set<String> collections = db.getCollectionNames();
                for (String colName : collections) {
                    System.out.println("\t + Collection: " + colName);
                }
            }
            
            //Insertion to collection
            DB db = mongoClient.getDB("SSRW"); 
            DBCollection table = db.getCollection("stock");
            BasicDBObject document = new BasicDBObject();
            document.put("Name", "Dharam");
            document.put("lastNQuantity", "4");
            table.insert(document);
            
            MongoDatabase database = mongoClient.getDatabase("SSRW");
            // populate pojo
            RiceEntity rice = new RiceEntity();
            RicecoverEntity rcover = new RicecoverEntity();
            rcover.setName("thick rice cover");
            rcover.setType("thick");
            rice.setRcover(rcover);
            rice.setName("Aus");
            rice.setType("Non boiled");
           

            // convert pojo to json using Gson and parse using Document.parse()
            Gson gson = new Gson();
            MongoCollection<Document> collection =  database.getCollection("stock");
            Document document1 = Document.parse(gson.toJson(rice));
            collection.insertOne(document1);
            
            DBCollection db1= db.getCollection("stock");
            BasicDBObject searchQuery = new BasicDBObject();
            //searchQuery.put("Name", "Dharmendra");
            DBCursor cursor = db1.find();
            while (cursor.hasNext()) {
            System.out.println(cursor.next());
            }
             
            mongoClient.close();
             
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

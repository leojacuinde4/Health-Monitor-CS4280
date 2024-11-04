package healthMonitor;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import redis.clients.jedis.*;
import java.util.*;
import org.json.*;

@Path("/")
public class health {

	private final String serverIP = "34.82.13.250";
    private final String password = "RT#cn0Rzpo";
		
    private Jedis getConn() {
        Jedis db = new Jedis(serverIP, 6379);
        db.auth(password);
        return db;
	}

    private String getJSONData(ArrayList<List<String>> arrayOfValues) {

        JSONWriter jstr = new JSONStringer();
        jstr.object();

        // key
        jstr.key("employee");

        // value (array of employee data)
        jstr.array();
        for (List<String> values: arrayOfValues) {
            // get employee information
            //String first = values.get(0);
            //String last = values.get(1);
            //String role = values.get(2);
            //String department = values.get(3);

            // create an object
            jstr.object();
            //jstr.key("first").value(first);
            //jstr.key("last").value(last);
            //jstr.key("role").value(role);
            //jstr.key("department").value(department);
            //jstr.endObject();
        }
        jstr.endArray();

        jstr.endObject();
        return jstr.toString();
    }

public String UserCarbs {
	
}

public String UserBP {
	
}

public String UserGlucose {
	
}

public String UserCal {
	
}
    
    
}

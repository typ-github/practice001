
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class thread001 {

    Map map = new HashMap<String, String>();

    List<String> list = Collections.synchronizedList(new ArrayList<>());

    Map m = new ConcurrentHashMap();


}

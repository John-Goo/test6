

import java.util.List;

import javax.jws.WebService;

import com.alibaba.fastjson.JSONArray;

@WebService(endpointInterface="org.demo.cxf.IRemoteService") //endpointInterface这个不能写错�?
public class RemoteServiceImpl implements IRemoteService {
     
    public String showRemoteMessage(String message) {
        return "You message is "+ message;
    }
 
    public String addOrder(List<Order> orders) {
        return JSONArray.toJSONString(orders,true);
    }
     
}

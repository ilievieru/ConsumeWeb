package consume;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;
import service.PosTaggerRoWSPortBindingStub;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * Created by v3790149 on 5/19/2016.
 */
public class Consume {
    URL url = null;
    PosTaggerRoWSPortBindingStub p = null;

    public Consume() {
        try {
            url = new URL("http://nlptools.info.uaic.ro:80/WebPosRo/PosTaggerRoWS");
            p = new PosTaggerRoWSPortBindingStub(url, new Service());
        } catch (MalformedURLException e) {

            e.printStackTrace();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();

        }

    }

    public String Use(String msg) {
        String result = "";
        try {

            String s = p.parseText_TXT(msg);
            result = s;
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();

        }
        return result;
    }
}

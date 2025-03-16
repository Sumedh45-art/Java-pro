abstract class Telephone {  
    abstract void call();  
    abstract void lift();  
    abstract void disconnect();  
}  
  
class SmartTelephone extends Telephone {  
    @Override
    void call() {  
        System.out.println("Called");  
    }  
     
    @Override
    void lift() {  
        System.out.println("Lifted");  
    }  
     
    @Override
    void disconnect() {  
        System.out.println("Disconnected");  
    }  
  
    void browseInternet() {  
        System.out.println("Browsing");  
    }  
}  
  
public class Telephones {  
    public static void main(String[] args) {  
        Telephone s = new SmartTelephone();   
        s.call();  
        s.lift();  
        s.disconnect();  
         
        SmartTelephone t = new SmartTelephone();  
        t.browseInternet();  
    }
}
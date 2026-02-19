import java.text.SimpleDateFormat;
import java.util.*;

class LogService extends Thread {
    private String serviceName;
    private int sleepTime;
    private StringBuffer buffer;
    private int count = 0;

    LogService(String name, int sleepTime, StringBuffer buffer) {
        this.serviceName = name;
        this.sleepTime = sleepTime;
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            String log = "[" + time + "] [" + serviceName + "] [INFO] Log " + i + "\n";
            synchronized (buffer) {
                buffer.append(log);
            }
            count++;
            try { Thread.sleep(sleepTime); } catch (Exception e) {}
        }
    }

    public int getCount() {
        return count;
    }
}

public class LogAggregator {
    public static void main(String[] args) throws Exception {
        StringBuffer buffer = new StringBuffer();

        LogService web = new LogService("WebServer",100,buffer);
        LogService db = new LogService("Database",150,buffer);
        LogService cache = new LogService("Cache",80,buffer);
        LogService api = new LogService("API",120,buffer);

        web.start();
        db.start();
        cache.start();
        api.start();

        web.join();
        db.join();
        cache.join();
        api.join();

        System.out.println(buffer.toString());
        System.out.println("Web logs: " + web.getCount());
        System.out.println("Database logs: " + db.getCount());
        System.out.println("Cache logs: " + cache.getCount());
        System.out.println("API logs: " + api.getCount());
        System.out.println("Total characters: " + buffer.length());
    }
}

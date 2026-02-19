import java.text.SimpleDateFormat;
import java.util.*;

class ChatUser extends Thread {
    private String name;
    private StringBuffer buffer;
    private List<String> messages;

    ChatUser(String name, StringBuffer buffer, List<String> messages) {
        this.name = name;
        this.buffer = buffer;
        this.messages = messages;
    }

    public void run() {
        for (String msg : messages) {
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            String formatted = formatMessage(msg);
            synchronized (buffer) {
                buffer.append("[" + time + "] " + name + ": " + formatted + "\n");
            }
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }

    private String formatMessage(String msg) {
        StringTokenizer st = new StringTokenizer(msg);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (word.startsWith("@")) sb.append("**").append(word).append("** ");
            else if (word.startsWith("#")) sb.append("*").append(word).append("* ");
            else if (word.startsWith("/")) sb.append("[CMD: ").append(word.substring(1)).append("] ");
            else sb.append(word).append(" ");
        }
        return sb.toString();
    }
}

public class ChatApp {
    public static void main(String[] args) throws Exception {
        StringBuffer buffer = new StringBuffer();

        List<String> msgs = Arrays.asList(
                "Hello @John",
                "Let's discuss #Java",
                "/help",
                "How are you @Alice",
                "Learning #Programming"
        );

        ChatUser u1 = new ChatUser("Alice",buffer,msgs);
        ChatUser u2 = new ChatUser("Bob",buffer,msgs);
        ChatUser u3 = new ChatUser("Charlie",buffer,msgs);

        u1.start();
        u2.start();
        u3.start();

        u1.join();
        u2.join();
        u3.join();

        System.out.println(buffer.toString());
        System.out.println("Total Characters: " + buffer.length());
    }
}

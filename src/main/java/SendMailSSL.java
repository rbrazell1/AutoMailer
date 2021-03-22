import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SendMailSSL {

  public static void main(String[] args) {
    //from,password,to,subject,message
    int counter = 0;
    while (counter < 1) {
      ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
      executorService.scheduleAtFixedRate(new Runnable() {
        @Override
        public void run() {
          Mailer.send("brazellrussell@gmail.com", "010406161SoniX!23", "brazellrussell@gmail.com",
              "hello javatpoint", "How r u?");
        }
      }, 1, 38, TimeUnit.MINUTES);
      counter++;
    }
    //change from, password and to
  }
}

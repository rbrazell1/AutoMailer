import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class SendMailSSL {

  public static void main(String[] args) {
    //from,password,to,subject,message
    int counter = 0;
    AtomicReference<Integer> messageCount = new AtomicReference<>(counter);
    String message = "\n"
        + "  My name is Russell Brazell, I am requesting the next available appointment to discuss my UI claim. I believe I filled out one check box wrong on one of the forms that I submitted. I am available any time for any appointment weather on the phone, video call, or in person if needed. Thank you in advance for your time and your assistance! \n"
        + "\n"
        + " \n"
        + "\n"
        + "Russell E. Brazell\n"
        + "\n"
        + "UI calumet ID 2000156449\n \n"
        + "Best Regards,\n"
        + "\n"
        + " \n"
        + "\n"
        + "Russell Brazell\n"
        + "\n"
        + "brazellrussell@gmail.com\n"
        + "\n"
        + "(505)264-4984" ;
      ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    executorService.scheduleAtFixedRate(() -> Mailer.send("brazellrussell@gmail.com",
        "010406161SoniX!23",
        "ui.claims@state.nm.us",
        "I would like to set up an appointment please",
        message),
        1,
        38,
        TimeUnit.MINUTES);
    }
    //change from, password and to
  }


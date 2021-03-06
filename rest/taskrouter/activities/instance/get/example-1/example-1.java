// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.TwilioTaskRouterClient;
import com.twilio.sdk.resource.instance.taskrouter.Activity;
import com.twilio.sdk.resource.instance.taskrouter.Workspace;

public class Example { 

  // Find your Account Sid and Token at twilio.com/user/account
  private static final String ACCOUNT_SID = "{{ account_sid }}";
  private static final String AUTH_TOKEN = "{{ auth_token }}";
  private static final String WORKSPACE_SID = "{{ workspace_sid }}";
  private static final String ACTIVITY_SID = "{{ activity_sid }}";

  public static void main(String[] args) throws TwilioRestException {
    TwilioTaskRouterClient client = new TwilioTaskRouterClient(ACCOUNT_SID, AUTH_TOKEN);

    Activity activity = client.getActivity(WORKSPACE_SID, ACTIVITY_SID);
    System.out.println(activity.getFriendlyName());

    //alternatively
    Workspace workspace = client.getWorkspace(WORKSPACE_SID);
    activity = workspace.getActivity(ACTIVITY_SID);
    System.out.println(activity.getFriendlyName());
  }
}
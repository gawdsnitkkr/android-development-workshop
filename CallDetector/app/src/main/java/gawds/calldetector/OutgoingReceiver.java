package gawds.calldetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by varun on 7/11/16.
 */
public class OutgoingReceiver extends BroadcastReceiver {
    OutgoingReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String mobile = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        System.out.println(mobile);
        Toast.makeText(context, "Calling: " + mobile, Toast.LENGTH_LONG).show();
    }
}

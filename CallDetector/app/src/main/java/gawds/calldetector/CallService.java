package gawds.calldetector;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.widget.Toast;

public class CallService extends Service {
    OutgoingReceiver outgoingReceiver;
    public CallService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "callService created", Toast.LENGTH_LONG).show();
        outgoingReceiver = new OutgoingReceiver();
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_NEW_OUTGOING_CALL);
        this.registerReceiver(outgoingReceiver, intentFilter);
    }

    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "callService destroyed", Toast.LENGTH_LONG).show();
        this.unregisterReceiver(outgoingReceiver);
    }
}

package cafe.adriel.androidaudioconverter.sample;

import android.app.Activity;
import android.content.pm.PackageManager;
// pgw 27-mar-2023
// import android.support.v4.app.ActivityCompat;
import androidx.core.app.ActivityCompat;

// pgw 27-mar-2023
// import android.support.v4.content.ContextCompat;
import androidx.core.content.ContextCompat;

public class Util {

    public static void requestPermission(Activity activity, String permission) {
        if (ContextCompat.checkSelfPermission(activity, permission)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, new String[]{permission}, 0);
        }
    }

}
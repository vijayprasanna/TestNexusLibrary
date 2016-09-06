package mii.pearsoned.com.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * @author vijay
 */
public class ShowToast {
    private static ShowToast ourInstance = new ShowToast();

    public static ShowToast getInstance() {
        return ourInstance;
    }

    private ShowToast() {
    }

    public void toast(Context context, String data) {
        Toast.makeText(context, data, Toast.LENGTH_SHORT).show();
    }
}

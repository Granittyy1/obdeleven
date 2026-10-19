package O4;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f4854b;

    public b(HashMap map) {
        this.f4854b = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap map = this.f4854b;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String string = builderBuildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    new StringBuilder(String.valueOf(string).length() + 65);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e10) {
            e = e10;
            String message = e.getMessage();
            new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
        } catch (IndexOutOfBoundsException e11) {
            String message2 = e11.getMessage();
            new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
        } catch (RuntimeException e12) {
            e = e12;
            String message3 = e.getMessage();
            new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
        } catch (Throwable th) {
            throw th;
        }
    }
}

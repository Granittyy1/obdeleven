package p093h4;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FileDownloadTask.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AsyncTask<String, Void, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f36155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f36156c;

    /* JADX INFO: compiled from: FileDownloadTask.kt */
    public interface a {
        void a(File file);
    }

    public g(String uriStr, File file, a aVar) {
        i.e(uriStr, "uriStr");
        this.f36154a = uriStr;
        this.f36155b = file;
        this.f36156c = aVar;
    }

    @Override // android.os.AsyncTask
    public final Boolean doInBackground(String[] strArr) {
        String[] args = strArr;
        i.e(args, "args");
        try {
            URL url = new URL(this.f36154a);
            int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
            DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
            byte[] bArr = new byte[contentLength];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f36155b));
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
            dataOutputStream.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            this.f36156c.a(this.f36155b);
        }
    }
}

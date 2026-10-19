package Z3;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: GraphRequestAsyncTask.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v extends AsyncTask<Void, Void, List<? extends x>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f7895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Exception f7896b;

    public v(w requests) {
        kotlin.jvm.internal.i.e(requests, "requests");
        this.f7895a = requests;
    }

    @Override // android.os.AsyncTask
    public final List<? extends x> doInBackground(Void[] voidArr) {
        Void[] params = voidArr;
        kotlin.jvm.internal.i.e(params, "params");
        w wVar = this.f7895a;
        try {
            wVar.getClass();
            String str = r.j;
            return r.c.c(wVar);
        } catch (Exception e10) {
            this.f7896b = e10;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(List<? extends x> list) {
        List<? extends x> result = list;
        kotlin.jvm.internal.i.e(result, "result");
        super.onPostExecute(result);
        Exception exc = this.f7896b;
        if (exc != null) {
            String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
            q qVar = q.f7852a;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
        q qVar = q.f7852a;
        w wVar = this.f7895a;
        if (wVar.f7898b == null) {
            wVar.f7898b = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: null, requests: " + this.f7895a + "}";
        kotlin.jvm.internal.i.d(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}

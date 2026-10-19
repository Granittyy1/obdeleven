package p030c4;

import H3.c;
import Z3.q;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ViewIndexer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f22325e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f22326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Activity> f22327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Timer f22328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22329d;

    /* JADX INFO: compiled from: ViewIndexer.kt */
    public static final class a implements Callable<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<View> f22330b;

        public a(View view) {
            this.f22330b = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            View view = this.f22330b.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            i.d(strEncodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    /* JADX INFO: compiled from: ViewIndexer.kt */
    public static final class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            try {
                Activity activity = fVar.f22327b.get();
                View viewH = c.h(activity);
                if (activity != null && viewH != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (p030c4.b.f22305f.get()) {
                        String str = "";
                        if (i.a(null, Boolean.TRUE)) {
                            p043d4.b.a("CaptureViewHierarchy", "");
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new a(viewH));
                        fVar.f22326a.post(futureTask);
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e10) {
                            Log.e(f.f22325e, "Failed to take screenshot.", e10);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(p043d4.c.c(viewH));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(f.f22325e, "Failed to create JSONObject");
                        }
                        String string = jSONObject.toString();
                        i.d(string, "viewTree.toString()");
                        q.c().execute(new L9.b(string, 1, fVar));
                    }
                }
            } catch (Exception e11) {
                Log.e(f.f22325e, "UI Component tree indexing failure!", e11);
            }
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f22325e = canonicalName;
    }

    public f(Activity activity) {
        i.e(activity, "activity");
        this.f22327b = new WeakReference<>(activity);
        this.f22329d = null;
        this.f22326a = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        try {
            q.c().execute(new L9.a(this, 2, new b()));
        } catch (RejectedExecutionException e10) {
            Log.e(f22325e, "Error scheduling indexing job", e10);
        }
    }
}

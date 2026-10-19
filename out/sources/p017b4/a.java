package p017b4;

import P3.d;
import Z3.q;
import android.app.Activity;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FetchedAppSettingsManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p093h4.e;
import p143l4.c;
import p165n4.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20548b;

    public /* synthetic */ a(int i10) {
        this.f20548b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        switch (this.f20548b) {
            case 0:
                p165n4.a aVarA = p165n4.a.C0509a.a(q.a());
                if (aVarA == null || !aVarA.f44871e) {
                    b.f20549a.getClass();
                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
                    j jVarF = FetchedAppSettingsManager.f(q.b(), false);
                    if (jVarF != null && (str = jVarF.j) != null) {
                        try {
                            c.f20551d.clear();
                            c.a.a(new JSONObject(str));
                            break;
                        } catch (JSONException unused) {
                        }
                    }
                    b.f20550b = true;
                }
                break;
            default:
                AtomicBoolean atomicBoolean = c.f44360a;
                if (!atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    try {
                        FetchedAppSettingsManager fetchedAppSettingsManager2 = FetchedAppSettingsManager.f25006a;
                        j jVarF2 = FetchedAppSettingsManager.f(q.b(), false);
                        if (jVarF2 != null && (str2 = jVarF2.f44904k) != null) {
                            c.a(str2);
                            if (!c.f44361b.isEmpty() || !c.f44362c.isEmpty()) {
                                ConcurrentHashMap concurrentHashMap = ModelManager.f24945a;
                                ModelManager.a aVar = (ModelManager.a) ModelManager.f24945a.get(ModelManager.Task.f24949c.b());
                                File file = aVar == null ? null : aVar.f24956f;
                                if (file != null) {
                                    d.m(file);
                                    WeakReference<Activity> weakReference = e.f36147l;
                                    Activity activity = weakReference != null ? weakReference.get() : null;
                                    if (activity != null) {
                                        c.b(activity);
                                    }
                                }
                            }
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                    break;
                }
                break;
        }
    }
}

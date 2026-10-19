package p143l4;

import H3.c;
import X5.C;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ViewObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f44363e = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Activity> f44364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f44365c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f44366d = new AtomicBoolean(false);

    /* JADX INFO: compiled from: ViewObserver.kt */
    public static final class a {
        public static void a(Activity activity) {
            View viewH;
            i.e(activity, "activity");
            int iHashCode = activity.hashCode();
            HashMap map = d.f44363e;
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object dVar = map.get(numValueOf);
            if (dVar == null) {
                dVar = new d(activity);
                map.put(numValueOf, dVar);
            }
            d dVar2 = (d) dVar;
            if (dVar2.f44366d.getAndSet(true) || (viewH = c.h(dVar2.f44364b.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewH.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(dVar2);
                C c10 = new C(4, dVar2);
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    c10.run();
                } else {
                    dVar2.f44365c.post(c10);
                }
            }
        }

        public static void b(Activity activity) {
            View viewH;
            i.e(activity, "activity");
            d dVar = (d) d.f44363e.remove(Integer.valueOf(activity.hashCode()));
            if (dVar == null || !dVar.f44366d.getAndSet(false) || (viewH = c.h(dVar.f44364b.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewH.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(dVar);
            }
        }
    }

    public d(Activity activity) {
        this.f44364b = new WeakReference<>(activity);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C c10 = new C(4, this);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c10.run();
        } else {
            this.f44365c.post(c10);
        }
    }
}

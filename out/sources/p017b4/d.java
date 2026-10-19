package p017b4;

import H3.c;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.m;
import kotlin.text.n;

/* JADX INFO: compiled from: MetadataViewObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f20555f = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<Activity> f20558d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f20556b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f20557c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f20559e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: MetadataViewObserver.kt */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:21:0x0050  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static final void a(HashMap map, String str, String str2) {
            HashMap map2 = d.f20555f;
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        str2 = (m.I(str2, "m", false) || m.I(str2, "b", false) || m.I(str2, "ge", false)) ? "m" : "f";
                    }
                    map.put(str, str2);
                    return;
                case 3586:
                    if (str.equals("r4")) {
                        str2 = new Regex("[^a-z]+").f("", str2);
                    }
                    map.put(str, str2);
                    return;
                case 3587:
                    if (str.equals("r5")) {
                        str2 = new Regex("[^a-z]+").f("", str2);
                    }
                    map.put(str, str2);
                    return;
                case 3588:
                    if (str.equals("r6") && n.J(str2, "-", false)) {
                        Object[] array = new Regex("-").h(str2, 0).toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        str2 = ((String[]) array)[0];
                    }
                    map.put(str, str2);
                    return;
                default:
                    map.put(str, str2);
                    return;
            }
        }

        public static void b(Activity activity) {
            View viewH;
            i.e(activity, "activity");
            int iHashCode = activity.hashCode();
            HashMap map = d.f20555f;
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object dVar = map.get(numValueOf);
            if (dVar == null) {
                dVar = new d(activity);
                map.put(numValueOf, dVar);
            }
            d dVar2 = (d) dVar;
            if (dVar2.f20559e.getAndSet(true) || (viewH = c.h(dVar2.f20558d.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewH.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(dVar2);
            }
        }
    }

    public d(Activity activity) {
        this.f20558d = new WeakReference<>(activity);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        Handler handler = this.f20557c;
        if (view != null) {
            I4.c cVar = new I4.c(view, 1, this);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                cVar.run();
            } else {
                handler.post(cVar);
            }
        }
        if (view2 != null) {
            I4.c cVar2 = new I4.c(view2, 1, this);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                cVar2.run();
            } else {
                handler.post(cVar2);
            }
        }
    }
}

package p030c4;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.i;
import p043d4.c;

/* JADX INFO: compiled from: RCTCodelessLoggingEventListener.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventBinding f22320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<View> f22321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<View> f22322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View.OnTouchListener f22323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22324f = true;

    public d(EventBinding eventBinding, View view, View view2) {
        this.f22320b = eventBinding;
        this.f22321c = new WeakReference<>(view2);
        this.f22322d = new WeakReference<>(view);
        this.f22323e = c.f(view2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i.e(view, "view");
        i.e(motionEvent, "motionEvent");
        View view2 = this.f22322d.get();
        View view3 = this.f22321c.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            a.a(this.f22320b, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.f22323e;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}

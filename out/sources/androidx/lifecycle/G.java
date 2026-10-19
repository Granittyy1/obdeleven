package androidx.lifecycle;

import android.app.Activity;
import android.os.Handler;

/* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC1376t {
    public static final G j = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17730c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f17733f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17731d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17732e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1378v f17734g = new C1378v(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F f17735h = new F(0, this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f17736i = new b();

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    public static final class a {
        public static final void a(Activity activity, H.a aVar) {
            kotlin.jvm.internal.i.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(aVar);
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    public static final class b {
        public b() {
        }
    }

    public final void a() {
        int i10 = this.f17730c + 1;
        this.f17730c = i10;
        if (i10 == 1) {
            if (this.f17731d) {
                this.f17734g.f(Lifecycle.Event.ON_RESUME);
                this.f17731d = false;
            } else {
                Handler handler = this.f17733f;
                kotlin.jvm.internal.i.b(handler);
                handler.removeCallbacks(this.f17735h);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC1376t
    public final Lifecycle getLifecycle() {
        return this.f17734g;
    }
}

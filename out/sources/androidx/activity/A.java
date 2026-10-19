package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ia.l<C0845b, p293xa.r> f8166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ia.l<C0845b, p293xa.r> f8167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.a<p293xa.r> f8168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ia.a<p293xa.r> f8169d;

    /* JADX WARN: Multi-variable type inference failed */
    public A(Ia.l<? super C0845b, p293xa.r> lVar, Ia.l<? super C0845b, p293xa.r> lVar2, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2) {
        this.f8166a = lVar;
        this.f8167b = lVar2;
        this.f8168c = aVar;
        this.f8169d = aVar2;
    }

    public final void onBackCancelled() {
        this.f8169d.invoke();
    }

    public final void onBackInvoked() {
        this.f8168c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f8167b.invoke(new C0845b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f8166a.invoke(new C0845b(backEvent));
    }
}

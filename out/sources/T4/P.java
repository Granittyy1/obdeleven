package T4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class P implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f5885c;

    public P(T t8, int i10) {
        this.f5885c = t8;
        this.f5884b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5885c.h(this.f5884b);
    }
}

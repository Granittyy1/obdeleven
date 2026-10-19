package T4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class N implements ComponentCallbacks2C0769b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0771d f5882a;

    public N(C0771d c0771d) {
        this.f5882a = c0771d;
    }

    @Override // T4.ComponentCallbacks2C0769b.a
    public final void a(boolean z10) {
        e5.h hVar = this.f5882a.f5941n;
        hVar.sendMessage(hVar.obtainMessage(1, Boolean.valueOf(z10)));
    }
}

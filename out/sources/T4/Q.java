package T4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f5886b;

    public Q(S s10) {
        this.f5886b = s10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.a.e eVar = ((T) this.f5886b.f5887b).f5889d;
        eVar.d(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

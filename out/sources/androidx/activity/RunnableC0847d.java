package androidx.activity;

/* JADX INFO: renamed from: androidx.activity.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0847d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8226c;

    public /* synthetic */ RunnableC0847d(int i10, Object obj) {
        this.f8225b = i10;
        this.f8226c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8225b) {
            case 0:
                ((ComponentActivity) this.f8226c).invalidateMenu();
                break;
            default:
                ((p128k2.j) this.f8226c).k();
                break;
        }
    }
}

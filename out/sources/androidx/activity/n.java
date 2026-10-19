package androidx.activity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8246d;

    public /* synthetic */ n(Object obj, int i10, Object obj2) {
        this.f8244b = i10;
        this.f8245c = obj;
        this.f8246d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8244b) {
            case 0:
                ((ComponentActivity) this.f8245c).addObserverForBackInvoker((OnBackPressedDispatcher) this.f8246d);
                break;
            default:
                p191p5.h hVar = (p191p5.h) this.f8246d;
                com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f8245c;
                xVar.getClass();
                try {
                    hVar.b(xVar.b());
                } catch (Exception e10) {
                    hVar.a(e10);
                }
                break;
        }
    }
}

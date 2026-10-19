package p057e6;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p191p5.h f34746b;

    public h() {
        this.f34746b = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            p191p5.h hVar = this.f34746b;
            if (hVar != null) {
                hVar.c(e10);
            }
        }
    }

    public h(p191p5.h hVar) {
        this.f34746b = hVar;
    }
}

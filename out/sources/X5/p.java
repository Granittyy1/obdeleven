package X5;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements p183oa.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7260b;

    public /* synthetic */ p(Object obj) {
        this.f7260b = obj;
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        boolean z10 = th instanceof Exception;
        p191p5.h hVar = (p191p5.h) this.f7260b;
        if (z10) {
            hVar.a((Exception) th);
        } else {
            hVar.a(new RuntimeException(th));
        }
        return io.reactivex.internal.operators.maybe.b.f40795b;
    }
}

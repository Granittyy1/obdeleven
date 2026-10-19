package rb;

import java.io.IOException;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f46593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f46594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f46595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, d dVar, int i10, int i11) {
        super(str, true);
        this.f46593e = dVar;
        this.f46594f = i10;
        this.f46595g = i11;
    }

    @Override // p184ob.a
    public final long a() {
        int i10 = this.f46594f;
        int i11 = this.f46595g;
        d dVar = this.f46593e;
        dVar.getClass();
        try {
            dVar.f46570x.W(i10, i11, true);
            return -1L;
        } catch (IOException e10) {
            dVar.c(e10);
            return -1L;
        }
    }
}

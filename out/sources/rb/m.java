package rb;

import java.io.IOException;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f46610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, d dVar) {
        super(str, true);
        this.f46610e = dVar;
    }

    @Override // p184ob.a
    public final long a() {
        d dVar = this.f46610e;
        dVar.getClass();
        try {
            dVar.f46570x.W(2, 0, false);
            return -1L;
        } catch (IOException e10) {
            dVar.c(e10);
            return -1L;
        }
    }
}

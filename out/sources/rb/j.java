package rb;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f46602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f46603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f46604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, d dVar, int i10, List list, boolean z10) {
        super(str, true);
        this.f46602e = dVar;
        this.f46603f = i10;
        this.f46604g = list;
    }

    @Override // p184ob.a
    public final long a() {
        s sVar = this.f46602e.f46558l;
        List responseHeaders = this.f46604g;
        sVar.getClass();
        kotlin.jvm.internal.i.e(responseHeaders, "responseHeaders");
        try {
            this.f46602e.f46570x.j(this.f46603f, ErrorCode.CANCEL);
            synchronized (this.f46602e) {
                this.f46602e.f46572z.remove(Integer.valueOf(this.f46603f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}

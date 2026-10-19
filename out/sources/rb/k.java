package rb;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f46605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f46606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f46607g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, d dVar, int i10, List list) {
        super(str, true);
        this.f46605e = dVar;
        this.f46606f = i10;
        this.f46607g = list;
    }

    @Override // p184ob.a
    public final long a() {
        s sVar = this.f46605e.f46558l;
        List requestHeaders = this.f46607g;
        sVar.getClass();
        kotlin.jvm.internal.i.e(requestHeaders, "requestHeaders");
        try {
            this.f46605e.f46570x.j(this.f46606f, ErrorCode.CANCEL);
            synchronized (this.f46605e) {
                this.f46605e.f46572z.remove(Integer.valueOf(this.f46606f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}

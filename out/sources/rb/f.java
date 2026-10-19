package rb;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f46591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f46592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, d dVar, p pVar) {
        super(str, true);
        this.f46591e = dVar;
        this.f46592f = pVar;
    }

    @Override // p184ob.a
    public final long a() {
        try {
            this.f46591e.f46549b.b(this.f46592f);
            return -1L;
        } catch (IOException e10) {
            p244tb.h hVar = p244tb.h.f47384a;
            p244tb.h hVar2 = p244tb.h.f47384a;
            String str = "Http2Connection.Listener failure for " + this.f46591e.f46551d;
            hVar2.getClass();
            p244tb.h.i(4, str, e10);
            try {
                this.f46592f.c(ErrorCode.PROTOCOL_ERROR, e10);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}

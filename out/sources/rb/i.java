package rb;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import p318zb.C2839f;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f46598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f46599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2839f f46600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f46601h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, d dVar, int i10, C2839f c2839f, int i11, boolean z10) {
        super(str, true);
        this.f46598e = dVar;
        this.f46599f = i10;
        this.f46600g = c2839f;
        this.f46601h = i11;
    }

    @Override // p184ob.a
    public final long a() {
        try {
            s sVar = this.f46598e.f46558l;
            C2839f c2839f = this.f46600g;
            int i10 = this.f46601h;
            sVar.getClass();
            c2839f.skip(i10);
            this.f46598e.f46570x.j(this.f46599f, ErrorCode.CANCEL);
            synchronized (this.f46598e) {
                this.f46598e.f46572z.remove(Integer.valueOf(this.f46599f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}

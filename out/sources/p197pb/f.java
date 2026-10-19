package p197pb;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.e;
import okhttp3.q;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f45943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f45944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f45946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f45947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45951i;

    public f(e call, ArrayList arrayList, int i10, c cVar, u request, int i11, int i12, int i13) {
        i.e(call, "call");
        i.e(request, "request");
        this.f45943a = call;
        this.f45944b = arrayList;
        this.f45945c = i10;
        this.f45946d = cVar;
        this.f45947e = request;
        this.f45948f = i11;
        this.f45949g = i12;
        this.f45950h = i13;
    }

    public static f b(f fVar, int i10, c cVar, u uVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = fVar.f45945c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            cVar = fVar.f45946d;
        }
        c cVar2 = cVar;
        if ((i11 & 4) != 0) {
            uVar = fVar.f45947e;
        }
        u request = uVar;
        int i13 = fVar.f45948f;
        int i14 = fVar.f45949g;
        int i15 = fVar.f45950h;
        fVar.getClass();
        i.e(request, "request");
        return new f(fVar.f45943a, fVar.f45944b, i12, cVar2, request, i13, i14, i15);
    }

    @Override // okhttp3.q.a
    public final z a(u request) throws IOException {
        i.e(request, "request");
        ArrayList arrayList = this.f45944b;
        int size = arrayList.size();
        int i10 = this.f45945c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f45951i++;
        c cVar = this.f45946d;
        if (cVar != null) {
            if (!cVar.f45452c.b(request.f45661a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f45951i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        f fVarB = b(this, i11, null, request, 58);
        q qVar = (q) arrayList.get(i10);
        z zVarIntercept = qVar.intercept(fVarB);
        if (zVarIntercept == null) {
            throw new NullPointerException("interceptor " + qVar + " returned null");
        }
        if (cVar != null && i11 < arrayList.size() && fVarB.f45951i != 1) {
            throw new IllegalStateException(("network interceptor " + qVar + " must call proceed() exactly once").toString());
        }
        if (zVarIntercept.f45686h != null) {
            return zVarIntercept;
        }
        throw new IllegalStateException(("interceptor " + qVar + " returned a response with no body").toString());
    }

    @Override // okhttp3.q.a
    public final u request() {
        return this.f45947e;
    }
}

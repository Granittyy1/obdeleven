package okhttp3;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p318zb.C2839f;
import p318zb.InterfaceC2840g;

/* JADX INFO: compiled from: FormBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f45562c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f45563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f45564b;

    /* JADX INFO: compiled from: FormBody.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Charset f45565a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f45566b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f45567c = new ArrayList();
    }

    static {
        Pattern pattern = r.f45588d;
        f45562c = r.a.a("application/x-www-form-urlencoded");
    }

    public n(ArrayList encodedNames, ArrayList encodedValues) {
        kotlin.jvm.internal.i.e(encodedNames, "encodedNames");
        kotlin.jvm.internal.i.e(encodedValues, "encodedValues");
        this.f45563a = p172nb.b.x(encodedNames);
        this.f45564b = p172nb.b.x(encodedValues);
    }

    public final long a(InterfaceC2840g interfaceC2840g, boolean z10) throws EOFException {
        C2839f c2839fF;
        if (z10) {
            c2839fF = new C2839f();
        } else {
            kotlin.jvm.internal.i.b(interfaceC2840g);
            c2839fF = interfaceC2840g.f();
        }
        List<String> list = this.f45563a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                c2839fF.Z0(38);
            }
            c2839fF.f1(list.get(i10));
            c2839fF.Z0(61);
            c2839fF.f1(this.f45564b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long j = c2839fF.f49074c;
        c2839fF.b();
        return j;
    }

    @Override // okhttp3.y
    public final long contentLength() {
        return a(null, true);
    }

    @Override // okhttp3.y
    public final r contentType() {
        return f45562c;
    }

    @Override // okhttp3.y
    public final void writeTo(InterfaceC2840g sink) throws IOException {
        kotlin.jvm.internal.i.e(sink, "sink");
        a(sink, false);
    }
}

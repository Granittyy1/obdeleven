package retrofit2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p318zb.InterfaceC2840g;

/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f46772l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f46773m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okhttp3.p f46775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public okhttp3.p.a f46777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final okhttp3.u.a f46778e = new okhttp3.u.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final okhttp3.o.a f46779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public okhttp3.r f46780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final okhttp3.s.a f46782i;
    public final okhttp3.n.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public okhttp3.y f46783k;

    /* JADX INFO: compiled from: RequestBuilder.java */
    public static class a extends okhttp3.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final okhttp3.y f46784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final okhttp3.r f46785b;

        public a(okhttp3.y yVar, okhttp3.r rVar) {
            this.f46784a = yVar;
            this.f46785b = rVar;
        }

        @Override // okhttp3.y
        public final long contentLength() throws IOException {
            return this.f46784a.contentLength();
        }

        @Override // okhttp3.y
        public final okhttp3.r contentType() {
            return this.f46785b;
        }

        @Override // okhttp3.y
        public final void writeTo(InterfaceC2840g interfaceC2840g) throws IOException {
            this.f46784a.writeTo(interfaceC2840g);
        }
    }

    public t(String str, okhttp3.p pVar, String str2, okhttp3.o oVar, okhttp3.r rVar, boolean z10, boolean z11, boolean z12) {
        this.f46774a = str;
        this.f46775b = pVar;
        this.f46776c = str2;
        this.f46780g = rVar;
        this.f46781h = z10;
        if (oVar != null) {
            this.f46779f = oVar.q();
        } else {
            this.f46779f = new okhttp3.o.a();
        }
        if (z11) {
            this.j = new okhttp3.n.a();
            return;
        }
        if (z12) {
            okhttp3.s.a aVar = new okhttp3.s.a();
            this.f46782i = aVar;
            okhttp3.r type = okhttp3.s.f45594f;
            kotlin.jvm.internal.i.e(type, "type");
            if (type.f45591b.equals("multipart")) {
                aVar.f45603b = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    public final void a(String name, String str, boolean z10) {
        okhttp3.n.a aVar = this.j;
        if (z10) {
            aVar.getClass();
            kotlin.jvm.internal.i.e(name, "name");
            aVar.f45566b.add(okhttp3.p.b.a(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f45565a, 83));
            aVar.f45567c.add(okhttp3.p.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f45565a, 83));
            return;
        }
        aVar.getClass();
        kotlin.jvm.internal.i.e(name, "name");
        aVar.f45566b.add(okhttp3.p.b.a(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f45565a, 91));
        aVar.f45567c.add(okhttp3.p.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f45565a, 91));
    }

    public final void b(String str, String str2, boolean z10) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = okhttp3.r.f45588d;
                this.f46780g = okhttp3.r.a.a(str2);
                return;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(B7.b.c("Malformed content type: ", str2), e10);
            }
        }
        okhttp3.o.a aVar = this.f46779f;
        if (z10) {
            aVar.d(str, str2);
        } else {
            aVar.a(str, str2);
        }
    }

    public final void c(okhttp3.o oVar, okhttp3.y body) {
        okhttp3.s.a aVar = this.f46782i;
        aVar.getClass();
        kotlin.jvm.internal.i.e(body, "body");
        if (oVar.e("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (oVar.e("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        aVar.f45604c.add(new okhttp3.s.c(oVar, body));
    }

    public final void d(String name, String str, boolean z10) {
        String str2 = this.f46776c;
        if (str2 != null) {
            okhttp3.p pVar = this.f46775b;
            okhttp3.p.a aVarG = pVar.g(str2);
            this.f46777d = aVarG;
            if (aVarG == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + pVar + ", Relative: " + this.f46776c);
            }
            this.f46776c = null;
        }
        if (z10) {
            okhttp3.p.a aVar = this.f46777d;
            aVar.getClass();
            kotlin.jvm.internal.i.e(name, "encodedName");
            if (aVar.f45586g == null) {
                aVar.f45586g = new ArrayList();
            }
            ArrayList arrayList = aVar.f45586g;
            kotlin.jvm.internal.i.b(arrayList);
            arrayList.add(okhttp3.p.b.a(name, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            ArrayList arrayList2 = aVar.f45586g;
            kotlin.jvm.internal.i.b(arrayList2);
            arrayList2.add(str != null ? okhttp3.p.b.a(str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211) : null);
            return;
        }
        okhttp3.p.a aVar2 = this.f46777d;
        aVar2.getClass();
        kotlin.jvm.internal.i.e(name, "name");
        if (aVar2.f45586g == null) {
            aVar2.f45586g = new ArrayList();
        }
        ArrayList arrayList3 = aVar2.f45586g;
        kotlin.jvm.internal.i.b(arrayList3);
        arrayList3.add(okhttp3.p.b.a(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        ArrayList arrayList4 = aVar2.f45586g;
        kotlin.jvm.internal.i.b(arrayList4);
        arrayList4.add(str != null ? okhttp3.p.b.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219) : null);
    }
}

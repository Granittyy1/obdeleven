package io.ktor.http;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* JADX INFO: compiled from: URLBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final B f40515k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A f40516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f40521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f40522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<String> f40523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f40524i;
    public C j;

    static {
        x xVar = new x(null);
        z.b(xVar, "http://localhost");
        f40515k = xVar.b();
    }

    public x() {
        this(null);
    }

    public final void a() {
        if (this.f40517b.length() <= 0 && !kotlin.jvm.internal.i.a(this.f40516a.f40445a, "file")) {
            B b10 = f40515k;
            this.f40517b = b10.f40448b;
            A a10 = this.f40516a;
            A a11 = A.f40443c;
            if (kotlin.jvm.internal.i.a(a10, A.f40443c)) {
                this.f40516a = b10.f40447a;
            }
            if (this.f40518c == 0) {
                this.f40518c = b10.f40449c;
            }
        }
    }

    public final B b() {
        a();
        A a10 = this.f40516a;
        String str = this.f40517b;
        int i10 = this.f40518c;
        List<String> list = this.f40523h;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.d((String) it.next()));
        }
        r rVarH = kotlinx.coroutines.C.h(this.j.f40456a);
        String strE = CodecsKt.e(this.f40522g, 0, 0, false, 15);
        String str2 = this.f40520e;
        String strD = str2 != null ? CodecsKt.d(str2) : null;
        String str3 = this.f40521f;
        String strD2 = str3 != null ? CodecsKt.d(str3) : null;
        a();
        StringBuilder sb2 = new StringBuilder(256);
        y.a(this, sb2);
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "appendTo(StringBuilder(256)).toString()");
        return new B(a10, str, i10, arrayList, rVarH, strE, strD, strD2, string);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        y.a(this, sb2);
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:30:0x0110  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    public x(Object obj) {
        int i10;
        int i11;
        int i12;
        A protocol = A.f40443c;
        EmptyList<??> pathSegments = EmptyList.f42983b;
        r.f40513b.getClass();
        C2478c c2478c = C2478c.f40473c;
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(pathSegments, "pathSegments");
        this.f40516a = protocol;
        this.f40517b = "";
        final boolean z10 = false;
        this.f40518c = 0;
        this.f40519d = false;
        this.f40520e = null;
        this.f40521f = null;
        Set<Byte> set = CodecsKt.f40457a;
        Charset charset = kotlin.text.a.f43120b;
        kotlin.jvm.internal.i.e(charset, "charset");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        kotlin.jvm.internal.i.d(charsetEncoderNewEncoder, "charset.newEncoder()");
        CodecsKt.g(S4.o.f(charsetEncoderNewEncoder, "", 0, "".length()), new Ia.l<Byte, p293xa.r>() { // from class: io.ktor.http.CodecsKt$encodeURLQueryComponent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Byte b10) {
                byte bByteValue = b10.byteValue();
                if (bByteValue == 32) {
                    if (z10) {
                        sb2.append('+');
                    } else {
                        sb2.append("%20");
                    }
                } else if (CodecsKt.f40457a.contains(Byte.valueOf(bByteValue)) || (!z10 && CodecsKt.f40460d.contains(Byte.valueOf(bByteValue)))) {
                    sb2.append((char) bByteValue);
                } else {
                    sb2.append(CodecsKt.a(bByteValue));
                }
                return p293xa.r.f47939a;
            }
        });
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f40522g = string;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(pathSegments, 10));
        for (?? r10 : pathSegments) {
            kotlin.jvm.internal.i.e(r10, "<this>");
            final StringBuilder sb3 = new StringBuilder();
            Charset charset2 = kotlin.text.a.f43120b;
            ?? r13 = z10;
            while (r13 < r10.length()) {
                char cCharAt = r10.charAt(r13);
                if (CodecsKt.f40458b.contains(Character.valueOf(cCharAt))) {
                    sb3.append(cCharAt);
                    i10 = r13 + 1;
                } else if (CodecsKt.f40461e.contains(Character.valueOf(cCharAt))) {
                    sb3.append(cCharAt);
                    i10 = r13 + 1;
                } else if (cCharAt != '%' || (i12 = r13 + 2) >= r10.length()) {
                    if (55296 <= cCharAt || cCharAt >= 57344) {
                        i11 = 1;
                    } else {
                        i11 = 2;
                    }
                    CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                    kotlin.jvm.internal.i.d(charsetEncoderNewEncoder2, "charset.newEncoder()");
                    int i13 = i11 + r13;
                    CodecsKt.g(S4.o.f(charsetEncoderNewEncoder2, r10, r13, i13), new Ia.l<Byte, p293xa.r>() { // from class: io.ktor.http.CodecsKt$encodeURLPath$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(Byte b10) {
                            sb3.append(CodecsKt.a(b10.byteValue()));
                            return p293xa.r.f47939a;
                        }
                    });
                    i10 = i13;
                } else {
                    int i14 = r13 + 1;
                    Character chValueOf = Character.valueOf(r10.charAt(i14));
                    Set<Character> set2 = CodecsKt.f40459c;
                    if (set2.contains(chValueOf) && set2.contains(Character.valueOf(r10.charAt(i12)))) {
                        sb3.append(cCharAt);
                        sb3.append(r10.charAt(i14));
                        sb3.append(r10.charAt(i12));
                        i10 = r13 + 3;
                    } else {
                        if (55296 <= cCharAt) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                        }
                        CharsetEncoder charsetEncoderNewEncoder3 = charset2.newEncoder();
                        kotlin.jvm.internal.i.d(charsetEncoderNewEncoder3, "charset.newEncoder()");
                        int i15 = i11 + r13;
                        CodecsKt.g(S4.o.f(charsetEncoderNewEncoder3, r10, r13, i15), new Ia.l<Byte, p293xa.r>() { // from class: io.ktor.http.CodecsKt$encodeURLPath$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(Byte b10) {
                                sb3.append(CodecsKt.a(b10.byteValue()));
                                return p293xa.r.f47939a;
                            }
                        });
                        i10 = i15;
                    }
                }
                r13 = i10;
            }
            String string2 = sb3.toString();
            kotlin.jvm.internal.i.d(string2, "StringBuilder().apply(builderAction).toString()");
            arrayList.add(string2);
            z10 = false;
        }
        this.f40523h = arrayList;
        t tVarA = v.a();
        for (String name : EmptySet.f42985b) {
            c2478c.getClass();
            kotlin.jvm.internal.i.e(name, "name");
            EmptyList<String> emptyList = EmptyList.f42983b;
            String strF = CodecsKt.f(name, false);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(emptyList, 10));
            for (String str : emptyList) {
                kotlin.jvm.internal.i.e(str, "<this>");
                arrayList2.add(CodecsKt.f(str, true));
            }
            tVarA.b(strF, arrayList2);
        }
        this.f40524i = tVarA;
        this.j = new C(tVarA);
    }
}

package com.google.gson.internal.bind;

import com.google.gson.Strictness;
import com.google.gson.e;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.j;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: JsonTreeReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends M7.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0287a f28948u = new C0287a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f28949v = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f28950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String[] f28952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f28953t;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JsonTreeReader.java */
    public class C0287a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public a(g gVar) {
        super(f28948u);
        this.f28950q = new Object[32];
        this.f28951r = 0;
        this.f28952s = new String[32];
        this.f28953t = new int[32];
        i1(gVar);
    }

    @Override // M7.a
    public final String B() {
        return d1(true);
    }

    @Override // M7.a
    public final boolean C() throws IOException {
        JsonToken jsonTokenY0 = y0();
        return (jsonTokenY0 == JsonToken.f28990e || jsonTokenY0 == JsonToken.f28988c || jsonTokenY0 == JsonToken.f28995k) ? false : true;
    }

    @Override // M7.a
    public final boolean R() throws IOException {
        c1(JsonToken.f28994i);
        boolean zK = ((j) h1()).k();
        int i10 = this.f28951r;
        if (i10 > 0) {
            int[] iArr = this.f28953t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zK;
    }

    @Override // M7.a
    public final double S() throws IOException {
        JsonToken jsonTokenY0 = y0();
        JsonToken jsonToken = JsonToken.f28993h;
        if (jsonTokenY0 != jsonToken && jsonTokenY0 != JsonToken.f28992g) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenY0 + e1());
        }
        double dQ = ((j) g1()).q();
        if (this.f4589c != Strictness.f28812b && (Double.isNaN(dQ) || Double.isInfinite(dQ))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dQ);
        }
        h1();
        int i10 = this.f28951r;
        if (i10 > 0) {
            int[] iArr = this.f28953t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dQ;
    }

    @Override // M7.a
    public final int U() throws IOException {
        JsonToken jsonTokenY0 = y0();
        JsonToken jsonToken = JsonToken.f28993h;
        if (jsonTokenY0 != jsonToken && jsonTokenY0 != JsonToken.f28992g) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenY0 + e1());
        }
        j jVar = (j) g1();
        int iIntValue = jVar.f28986b instanceof Number ? jVar.s().intValue() : Integer.parseInt(jVar.e());
        h1();
        int i10 = this.f28951r;
        if (i10 > 0) {
            int[] iArr = this.f28953t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iIntValue;
    }

    @Override // M7.a
    public final void Z0() throws IOException {
        int iOrdinal = y0().ordinal();
        if (iOrdinal == 1) {
            j();
            return;
        }
        if (iOrdinal != 9) {
            if (iOrdinal == 3) {
                k();
                return;
            }
            if (iOrdinal == 4) {
                f1(true);
                return;
            }
            h1();
            int i10 = this.f28951r;
            if (i10 > 0) {
                int[] iArr = this.f28953t;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
        }
    }

    @Override // M7.a
    public final void b() throws IOException {
        c1(JsonToken.f28987b);
        i1(((e) g1()).f28824b.iterator());
        this.f28953t[this.f28951r - 1] = 0;
    }

    @Override // M7.a
    public final void c() throws IOException {
        c1(JsonToken.f28989d);
        i1(((LinkedTreeMap.b) ((i) g1()).f28826b.entrySet()).iterator());
    }

    public final void c1(JsonToken jsonToken) throws IOException {
        if (y0() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + y0() + e1());
    }

    @Override // M7.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f28950q = new Object[]{f28949v};
        this.f28951r = 1;
    }

    public final String d1(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f28951r;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f28950q;
            Object obj = objArr[i10];
            if (obj instanceof e) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f28953t[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof i) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f28952s[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    public final String e1() {
        return " at path " + d1(false);
    }

    @Override // M7.a
    public final long f0() throws IOException {
        JsonToken jsonTokenY0 = y0();
        JsonToken jsonToken = JsonToken.f28993h;
        if (jsonTokenY0 != jsonToken && jsonTokenY0 != JsonToken.f28992g) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenY0 + e1());
        }
        j jVar = (j) g1();
        long jLongValue = jVar.f28986b instanceof Number ? jVar.s().longValue() : Long.parseLong(jVar.e());
        h1();
        int i10 = this.f28951r;
        if (i10 > 0) {
            int[] iArr = this.f28953t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jLongValue;
    }

    public final String f1(boolean z10) throws IOException {
        c1(JsonToken.f28991f);
        Map.Entry entry = (Map.Entry) ((Iterator) g1()).next();
        String str = (String) entry.getKey();
        this.f28952s[this.f28951r - 1] = z10 ? "<skipped>" : str;
        i1(entry.getValue());
        return str;
    }

    public final Object g1() {
        return this.f28950q[this.f28951r - 1];
    }

    public final Object h1() {
        Object[] objArr = this.f28950q;
        int i10 = this.f28951r - 1;
        this.f28951r = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void i1(Object obj) {
        int i10 = this.f28951r;
        Object[] objArr = this.f28950q;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f28950q = Arrays.copyOf(objArr, i11);
            this.f28953t = Arrays.copyOf(this.f28953t, i11);
            this.f28952s = (String[]) Arrays.copyOf(this.f28952s, i11);
        }
        Object[] objArr2 = this.f28950q;
        int i12 = this.f28951r;
        this.f28951r = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // M7.a
    public final void j() throws IOException {
        c1(JsonToken.f28988c);
        h1();
        h1();
        int i10 = this.f28951r;
        if (i10 > 0) {
            int[] iArr = this.f28953t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // M7.a
    public final String j0() throws IOException {
        return f1(false);
    }

    @Override // M7.a
    public final void k() throws IOException {
        c1(JsonToken.f28990e);
        this.f28952s[this.f28951r - 1] = null;
        h1();
        h1();
        int i10 = this.f28951r;
        if (i10 > 0) {
            int[] iArr = this.f28953t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // M7.a
    public final void n0() throws IOException {
        c1(JsonToken.j);
        h1();
        int i10 = this.f28951r;
        if (i10 > 0) {
            int[] iArr = this.f28953t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // M7.a
    public final String r0() throws IOException {
        JsonToken jsonTokenY0 = y0();
        JsonToken jsonToken = JsonToken.f28992g;
        if (jsonTokenY0 != jsonToken && jsonTokenY0 != JsonToken.f28993h) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenY0 + e1());
        }
        String strE = ((j) h1()).e();
        int i10 = this.f28951r;
        if (i10 > 0) {
            int[] iArr = this.f28953t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return strE;
    }

    @Override // M7.a
    public final String s() {
        return d1(false);
    }

    @Override // M7.a
    public final String toString() {
        return a.class.getSimpleName() + e1();
    }

    @Override // M7.a
    public final JsonToken y0() throws IOException {
        if (this.f28951r == 0) {
            return JsonToken.f28995k;
        }
        Object objG1 = g1();
        if (objG1 instanceof Iterator) {
            boolean z10 = this.f28950q[this.f28951r - 2] instanceof i;
            Iterator it = (Iterator) objG1;
            if (!it.hasNext()) {
                return z10 ? JsonToken.f28990e : JsonToken.f28988c;
            }
            if (z10) {
                return JsonToken.f28991f;
            }
            i1(it.next());
            return y0();
        }
        if (objG1 instanceof i) {
            return JsonToken.f28989d;
        }
        if (objG1 instanceof e) {
            return JsonToken.f28987b;
        }
        if (objG1 instanceof j) {
            Serializable serializable = ((j) objG1).f28986b;
            if (serializable instanceof String) {
                return JsonToken.f28992g;
            }
            if (serializable instanceof Boolean) {
                return JsonToken.f28994i;
            }
            if (serializable instanceof Number) {
                return JsonToken.f28993h;
            }
            throw new AssertionError();
        }
        if (objG1 instanceof h) {
            return JsonToken.j;
        }
        if (objG1 == f28949v) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objG1.getClass().getName() + " is not supported");
    }
}

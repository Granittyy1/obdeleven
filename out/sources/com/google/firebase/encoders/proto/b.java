package com.google.firebase.encoders.proto;

import L6.d;
import L6.e;
import O6.c;
import O6.f;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: ProtobufDataEncoderContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f28114f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f28115g = new L6.b("key", C4.b.h(C4.a.i(Protobuf.class, new a(1))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f28116h = new L6.b("value", C4.b.h(C4.a.i(Protobuf.class, new a(2))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f28117i = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f28118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f28119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f28120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O6.d f28121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f28122e = new f(this);

    public b(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, O6.d dVar) {
        this.f28118a = byteArrayOutputStream;
        this.f28119b = map;
        this.f28120c = map2;
        this.f28121d = dVar;
    }

    public static int j(L6.b bVar) {
        Protobuf protobuf = (Protobuf) ((Annotation) bVar.f4468b.get(Protobuf.class));
        if (protobuf != null) {
            return ((a) protobuf).f28113a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // L6.d
    public final d a(L6.b bVar, Object obj) throws IOException {
        h(bVar, obj, true);
        return this;
    }

    @Override // L6.d
    public final d b(L6.b bVar, double d10) throws IOException {
        f(bVar, d10, true);
        return this;
    }

    @Override // L6.d
    public final d c(L6.b bVar, int i10) throws IOException {
        g(bVar, i10, true);
        return this;
    }

    @Override // L6.d
    public final d d(L6.b bVar, long j) throws IOException {
        if (j != 0) {
            Protobuf protobuf = (Protobuf) ((Annotation) bVar.f4468b.get(Protobuf.class));
            if (protobuf == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            k(((a) protobuf).f28113a << 3);
            l(j);
        }
        return this;
    }

    @Override // L6.d
    public final d e(L6.b bVar, boolean z10) throws IOException {
        g(bVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void f(L6.b bVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return;
        }
        k((j(bVar) << 3) | 1);
        this.f28118a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    public final void g(L6.b bVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) bVar.f4468b.get(Protobuf.class));
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        k(((a) protobuf).f28113a << 3);
        k(i10);
    }

    public final void h(L6.b bVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            k((j(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f28114f);
            k(bytes.length);
            this.f28118a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(bVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f28117i, bVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            f(bVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z10 && fFloatValue == 0.0f) {
                return;
            }
            k((j(bVar) << 3) | 5);
            this.f28118a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z10 && jLongValue == 0) {
                return;
            }
            Protobuf protobuf = (Protobuf) ((Annotation) bVar.f4468b.get(Protobuf.class));
            if (protobuf == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            k(((a) protobuf).f28113a << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            g(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            k((j(bVar) << 3) | 2);
            k(bArr.length);
            this.f28118a.write(bArr);
            return;
        }
        L6.c cVar = (L6.c) this.f28119b.get(obj.getClass());
        if (cVar != null) {
            i(cVar, bVar, obj, z10);
            return;
        }
        e eVar = (e) this.f28120c.get(obj.getClass());
        if (eVar != null) {
            f fVar = this.f28122e;
            fVar.f4867a = false;
            fVar.f4869c = bVar;
            fVar.f4868b = z10;
            eVar.a(obj, fVar);
            return;
        }
        if (obj instanceof O6.b) {
            g(bVar, ((O6.b) obj).a(), true);
        } else if (obj instanceof Enum) {
            g(bVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f28121d, bVar, obj, z10);
        }
    }

    public final void i(L6.c cVar, L6.b bVar, Object obj, boolean z10) throws IOException {
        O6.a aVar = new O6.a();
        aVar.f4862b = 0L;
        try {
            OutputStream outputStream = this.f28118a;
            this.f28118a = aVar;
            try {
                cVar.a(obj, this);
                this.f28118a = outputStream;
                long j = aVar.f4862b;
                aVar.close();
                if (z10 && j == 0) {
                    return;
                }
                k((j(bVar) << 3) | 2);
                l(j);
                cVar.a(obj, this);
            } catch (Throwable th) {
                this.f28118a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f28118a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f28118a.write(i10 & 127);
    }

    public final void l(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f28118a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f28118a.write(((int) j) & 127);
    }
}

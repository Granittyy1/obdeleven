package kotlinx.serialization.json.internal;

import io.intercom.android.sdk.models.AttributeType;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import p037cb.AbstractC1515b;
import p037cb.E;
import p037cb.Y;
import p050db.AbstractC2184a;
import p050db.C2185b;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2728a extends Y implements p050db.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2184a f43974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p050db.f f43976f;

    public AbstractC2728a(AbstractC2184a abstractC2184a, p050db.h hVar, String str) {
        this.f43974d = abstractC2184a;
        this.f43975e = str;
        this.f43976f = abstractC2184a.f34642a;
    }

    @Override // p037cb.Y
    public final int I(Object obj, p011ab.e enumDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(enumDescriptor, "enumDescriptor");
        p050db.h hVarT = T(tag);
        String strA = enumDescriptor.a();
        if (hVarT instanceof p050db.B) {
            return m.c(enumDescriptor, this.f43974d, ((p050db.B) hVarT).e(), "");
        }
        throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of " + strA + " at element: " + W(tag), hVarT.toString(), -1);
    }

    @Override // p037cb.Y
    public final float J(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        p050db.h hVarT = T(tag);
        if (!(hVarT instanceof p050db.B)) {
            throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of float at element: " + W(tag), hVarT.toString(), -1);
        }
        p050db.B b10 = (p050db.B) hVarT;
        try {
            E e10 = p050db.i.f34682a;
            kotlin.jvm.internal.i.e(b10, "<this>");
            float f10 = Float.parseFloat(b10.e());
            if (this.f43974d.f34642a.f34676k || !(Float.isInfinite(f10) || Float.isNaN(f10))) {
                return f10;
            }
            throw O.e.b(Float.valueOf(f10), tag, U().toString());
        } catch (IllegalArgumentException unused) {
            X(b10, AttributeType.FLOAT, tag);
            throw null;
        }
    }

    @Override // p037cb.Y
    public final p024bb.c K(Object obj, p011ab.e inlineDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(inlineDescriptor, "inlineDescriptor");
        if (!y.a(inlineDescriptor)) {
            this.f22590b.add(tag);
            return this;
        }
        p050db.h hVarT = T(tag);
        String strA = inlineDescriptor.a();
        if (hVarT instanceof p050db.B) {
            String strE = ((p050db.B) hVarT).e();
            AbstractC2184a abstractC2184a = this.f43974d;
            return new k(O3.d.j(abstractC2184a, strE), abstractC2184a);
        }
        throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of " + strA + " at element: " + W(tag), hVarT.toString(), -1);
    }

    @Override // p037cb.Y
    public final int L(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        p050db.h hVarT = T(tag);
        if (hVarT instanceof p050db.B) {
            p050db.B b10 = (p050db.B) hVarT;
            try {
                return p050db.i.a(b10);
            } catch (IllegalArgumentException unused) {
                X(b10, "int", tag);
                throw null;
            }
        }
        throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of int at element: " + W(tag), hVarT.toString(), -1);
    }

    @Override // p037cb.Y
    public final long M(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        p050db.h hVarT = T(tag);
        if (!(hVarT instanceof p050db.B)) {
            throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of long at element: " + W(tag), hVarT.toString(), -1);
        }
        p050db.B b10 = (p050db.B) hVarT;
        try {
            E e10 = p050db.i.f34682a;
            kotlin.jvm.internal.i.e(b10, "<this>");
            try {
                return new z(b10.e()).h();
            } catch (JsonDecodingException e11) {
                throw new NumberFormatException(e11.getMessage());
            }
        } catch (IllegalArgumentException unused) {
            X(b10, "long", tag);
            throw null;
        }
    }

    @Override // p037cb.Y
    public final short N(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        p050db.h hVarT = T(tag);
        if (!(hVarT instanceof p050db.B)) {
            throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of short at element: " + W(tag), hVarT.toString(), -1);
        }
        p050db.B b10 = (p050db.B) hVarT;
        try {
            int iA = p050db.i.a(b10);
            Short shValueOf = (-32768 > iA || iA > 32767) ? null : Short.valueOf((short) iA);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(b10, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(b10, "short", tag);
            throw null;
        }
    }

    @Override // p037cb.Y
    public final String O(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        p050db.h hVarT = T(tag);
        if (!(hVarT instanceof p050db.B)) {
            throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of string at element: " + W(tag), hVarT.toString(), -1);
        }
        p050db.B b10 = (p050db.B) hVarT;
        if (!(b10 instanceof p050db.t)) {
            StringBuilder sbA = C7.g.a("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbA.append(W(tag));
            throw O.e.g(sbA.toString(), U().toString(), -1);
        }
        p050db.t tVar = (p050db.t) b10;
        if (tVar.f34690b || this.f43974d.f34642a.f34669c) {
            return tVar.f34692d;
        }
        StringBuilder sbA2 = C7.g.a("String literal for key '", tag, "' should be quoted at element: ");
        sbA2.append(W(tag));
        sbA2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw O.e.g(sbA2.toString(), U().toString(), -1);
    }

    public abstract p050db.h T(String str);

    public final p050db.h U() {
        p050db.h hVarT;
        String str = (String) kotlin.collections.q.W(this.f22590b);
        return (str == null || (hVarT = T(str)) == null) ? V() : hVarT;
    }

    public abstract p050db.h V();

    public final String W(String currentTag) {
        kotlin.jvm.internal.i.e(currentTag, "currentTag");
        return S() + '.' + currentTag;
    }

    public final void X(p050db.B b10, String str, String str2) {
        throw O.e.g("Failed to parse literal '" + b10 + "' as " + (kotlin.text.m.I(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + W(str2), U().toString(), -1);
    }

    @Override // p024bb.c
    public p024bb.a a(p011ab.e descriptor) {
        p024bb.a sVar;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        p050db.h hVarU = U();
        p011ab.m mVarE = descriptor.e();
        boolean zA = kotlin.jvm.internal.i.a(mVarE, ab.n.b.f8125a);
        AbstractC2184a abstractC2184a = this.f43974d;
        if (zA || (mVarE instanceof p011ab.c)) {
            String strA = descriptor.a();
            if (!(hVarU instanceof C2185b)) {
                throw O.e.g("Expected " + kotlin.jvm.internal.l.a(C2185b.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarU.getClass()).a() + " as the serialized body of " + strA + " at element: " + S(), hVarU.toString(), -1);
            }
            sVar = new s(abstractC2184a, (C2185b) hVarU);
        } else if (kotlin.jvm.internal.i.a(mVarE, ab.n.c.f8126a)) {
            p011ab.e eVarA = C.a(descriptor.i(0), abstractC2184a.f34643b);
            p011ab.m mVarE2 = eVarA.e();
            if ((mVarE2 instanceof p011ab.d) || kotlin.jvm.internal.i.a(mVarE2, ab.m.b.f8123a)) {
                String strA2 = descriptor.a();
                if (!(hVarU instanceof p050db.z)) {
                    throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.z.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarU.getClass()).a() + " as the serialized body of " + strA2 + " at element: " + S(), hVarU.toString(), -1);
                }
                sVar = new t(abstractC2184a, (p050db.z) hVarU);
            } else {
                if (!abstractC2184a.f34642a.f34670d) {
                    throw O.e.e(eVarA);
                }
                String strA3 = descriptor.a();
                if (!(hVarU instanceof C2185b)) {
                    throw O.e.g("Expected " + kotlin.jvm.internal.l.a(C2185b.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarU.getClass()).a() + " as the serialized body of " + strA3 + " at element: " + S(), hVarU.toString(), -1);
                }
                sVar = new s(abstractC2184a, (C2185b) hVarU);
            }
        } else {
            String strA4 = descriptor.a();
            if (!(hVarU instanceof p050db.z)) {
                throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.z.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarU.getClass()).a() + " as the serialized body of " + strA4 + " at element: " + S(), hVarU.toString(), -1);
            }
            sVar = new r(abstractC2184a, (p050db.z) hVarU, this.f43975e, 8);
        }
        return sVar;
    }

    @Override // p024bb.a
    public final C.g b() {
        return this.f43974d.f34643b;
    }

    @Override // p024bb.a
    public void c(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
    }

    @Override // p050db.g
    public final p050db.h i() {
        return U();
    }

    @Override // p037cb.Y, p024bb.c
    public final <T> T m(Ya.a<? extends T> deserializer) {
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        if (deserializer instanceof AbstractC1515b) {
            AbstractC2184a abstractC2184a = this.f43974d;
            if (!abstractC2184a.f34642a.f34675i) {
                AbstractC1515b abstractC1515b = (AbstractC1515b) deserializer;
                String strA = v.a(abstractC1515b.getDescriptor(), abstractC2184a);
                p050db.h hVarU = U();
                String strA2 = abstractC1515b.getDescriptor().a();
                if (!(hVarU instanceof p050db.z)) {
                    throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.z.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarU.getClass()).a() + " as the serialized body of " + strA2 + " at element: " + S(), hVarU.toString(), -1);
                }
                p050db.z zVar = (p050db.z) hVarU;
                p050db.h hVar = (p050db.h) zVar.get(strA);
                String strE = null;
                if (hVar != null) {
                    p050db.B b10 = p050db.i.b(hVar);
                    if (!(b10 instanceof p050db.w)) {
                        strE = b10.e();
                    }
                }
                try {
                    return (T) S4.o.o(abstractC2184a, strA, zVar, F8.a.d((AbstractC1515b) deserializer, this, strE));
                } catch (SerializationException e10) {
                    String message = e10.getMessage();
                    kotlin.jvm.internal.i.b(message);
                    throw O.e.g(message, zVar.toString(), -1);
                }
            }
        }
        return deserializer.deserialize(this);
    }

    @Override // p037cb.Y
    public final boolean p(Object obj) {
        Boolean bool;
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        p050db.h hVarT = T(tag);
        if (!(hVarT instanceof p050db.B)) {
            throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of boolean at element: " + W(tag), hVarT.toString(), -1);
        }
        p050db.B b10 = (p050db.B) hVarT;
        try {
            E e10 = p050db.i.f34682a;
            kotlin.jvm.internal.i.e(b10, "<this>");
            String strE = b10.e();
            String[] strArr = B.f43964a;
            kotlin.jvm.internal.i.e(strE, "<this>");
            if (strE.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = strE.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            X(b10, "boolean", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(b10, "boolean", tag);
            throw null;
        }
    }

    @Override // p037cb.Y
    public final byte q(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        p050db.h hVarT = T(tag);
        if (!(hVarT instanceof p050db.B)) {
            throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of byte at element: " + W(tag), hVarT.toString(), -1);
        }
        p050db.B b10 = (p050db.B) hVarT;
        try {
            int iA = p050db.i.a(b10);
            Byte bValueOf = (-128 > iA || iA > 127) ? null : Byte.valueOf((byte) iA);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(b10, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(b10, "byte", tag);
            throw null;
        }
    }

    @Override // p037cb.Y, p024bb.c
    public final p024bb.c r(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        if (kotlin.collections.q.W(this.f22590b) != null) {
            return super.r(descriptor);
        }
        return new o(this.f43974d, V(), this.f43975e).r(descriptor);
    }

    @Override // p024bb.c
    public boolean t() {
        return !(U() instanceof p050db.w);
    }

    @Override // p037cb.Y
    public final char y(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        p050db.h hVarT = T(tag);
        if (!(hVarT instanceof p050db.B)) {
            throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of char at element: " + W(tag), hVarT.toString(), -1);
        }
        p050db.B b10 = (p050db.B) hVarT;
        try {
            String strE = b10.e();
            kotlin.jvm.internal.i.e(strE, "<this>");
            int length = strE.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strE.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(b10, "char", tag);
            throw null;
        }
    }

    @Override // p037cb.Y
    public final double z(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.i.e(tag, "tag");
        p050db.h hVarT = T(tag);
        if (!(hVarT instanceof p050db.B)) {
            throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.B.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarT.getClass()).a() + " as the serialized body of double at element: " + W(tag), hVarT.toString(), -1);
        }
        p050db.B b10 = (p050db.B) hVarT;
        try {
            E e10 = p050db.i.f34682a;
            kotlin.jvm.internal.i.e(b10, "<this>");
            double d10 = Double.parseDouble(b10.e());
            if (this.f43974d.f34642a.f34676k || !(Double.isInfinite(d10) || Double.isNaN(d10))) {
                return d10;
            }
            throw O.e.b(Double.valueOf(d10), tag, U().toString());
        } catch (IllegalArgumentException unused) {
            X(b10, "double", tag);
            throw null;
        }
    }
}

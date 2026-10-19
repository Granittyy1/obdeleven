package com.google.gson.internal.bind;

import A8.f;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.e;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeAdapters {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final m f28911A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final m f28912B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f28913a = new AnonymousClass29(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Class read(M7.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }
    }.nullSafe());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f28914b = new AnonymousClass29(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        @Override // com.google.gson.TypeAdapter
        public final BitSet read(M7.a aVar) throws IOException {
            boolean zR;
            BitSet bitSet = new BitSet();
            aVar.b();
            JsonToken jsonTokenY0 = aVar.y0();
            int i10 = 0;
            while (jsonTokenY0 != JsonToken.f28988c) {
                int iOrdinal = jsonTokenY0.ordinal();
                if (iOrdinal == 5 || iOrdinal == 6) {
                    int iU = aVar.U();
                    if (iU == 0) {
                        zR = false;
                    } else {
                        if (iU != 1) {
                            StringBuilder sbE = f.e(iU, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            sbE.append(aVar.B());
                            throw new JsonSyntaxException(sbE.toString());
                        }
                        zR = true;
                    }
                } else {
                    if (iOrdinal != 7) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenY0 + "; at path " + aVar.s());
                    }
                    zR = aVar.R();
                }
                if (zR) {
                    bitSet.set(i10);
                }
                i10++;
                jsonTokenY0 = aVar.y0();
            }
            aVar.j();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(M7.b bVar, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            bVar.c();
            int length = bitSet2.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.S(bitSet2.get(i10) ? 1L : 0L);
            }
            bVar.j();
        }
    }.nullSafe());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f28915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f28916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f28917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f28918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f28919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f28920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f28921i;
    public static final m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TypeAdapter<Number> f28922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m f28923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeAdapter<BigDecimal> f28924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypeAdapter<BigInteger> f28925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TypeAdapter<LazilyParsedNumber> f28926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m f28927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m f28928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f28929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f28930s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f28931t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m f28932u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m f28933v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m f28934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final m f28935x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final m f28936y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final TypeAdapter<g> f28937z;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$28, reason: invalid class name */
    class AnonymousClass28 implements m {
        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            aVar.equals(null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$29, reason: invalid class name */
    public class AnonymousClass29 implements m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f28938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f28939c;

        public AnonymousClass29(Class cls, TypeAdapter typeAdapter) {
            this.f28938b = cls;
            this.f28939c = typeAdapter;
        }

        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            if (aVar.getRawType() == this.f28938b) {
                return this.f28939c;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f28938b.getName() + ",adapter=" + this.f28939c + "]";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$30, reason: invalid class name */
    public class AnonymousClass30 implements m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f28940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f28941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f28942d;

        public AnonymousClass30(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f28940b = cls;
            this.f28941c = cls2;
            this.f28942d = typeAdapter;
        }

        @Override // com.google.gson.m
        public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f28940b || rawType == this.f28941c) {
                return this.f28942d;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f28941c.getName() + "+" + this.f28940b.getName() + ",adapter=" + this.f28942d + "]";
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(M7.a aVar) throws IOException {
                JsonToken jsonTokenY0 = aVar.y0();
                if (jsonTokenY0 != JsonToken.j) {
                    return jsonTokenY0 == JsonToken.f28992g ? Boolean.valueOf(Boolean.parseBoolean(aVar.r0())) : Boolean.valueOf(aVar.R());
                }
                aVar.n0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Boolean bool) throws IOException {
                bVar.U(bool);
            }
        };
        f28915c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(M7.a aVar) throws IOException {
                if (aVar.y0() != JsonToken.j) {
                    return Boolean.valueOf(aVar.r0());
                }
                aVar.n0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                bVar.j0(bool2 == null ? "null" : bool2.toString());
            }
        };
        f28916d = new AnonymousClass30(Boolean.TYPE, Boolean.class, typeAdapter);
        f28917e = new AnonymousClass30(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Number read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                try {
                    int iU = aVar.U();
                    if (iU <= 255 && iU >= -128) {
                        return Byte.valueOf((byte) iU);
                    }
                    StringBuilder sbE = f.e(iU, "Lossy conversion from ", " to byte; at path ");
                    sbE.append(aVar.B());
                    throw new JsonSyntaxException(sbE.toString());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    bVar.x();
                } else {
                    bVar.S(number2.byteValue());
                }
            }
        });
        f28918f = new AnonymousClass30(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Number read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                try {
                    int iU = aVar.U();
                    if (iU <= 65535 && iU >= -32768) {
                        return Short.valueOf((short) iU);
                    }
                    StringBuilder sbE = f.e(iU, "Lossy conversion from ", " to short; at path ");
                    sbE.append(aVar.B());
                    throw new JsonSyntaxException(sbE.toString());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    bVar.x();
                } else {
                    bVar.S(number2.shortValue());
                }
            }
        });
        f28919g = new AnonymousClass30(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Number read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.U());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    bVar.x();
                } else {
                    bVar.S(number2.intValue());
                }
            }
        });
        f28920h = new AnonymousClass29(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final AtomicInteger read(M7.a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.U());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, AtomicInteger atomicInteger) throws IOException {
                bVar.S(atomicInteger.get());
            }
        }.nullSafe());
        f28921i = new AnonymousClass29(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final AtomicBoolean read(M7.a aVar) throws IOException {
                return new AtomicBoolean(aVar.R());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, AtomicBoolean atomicBoolean) throws IOException {
                bVar.m0(atomicBoolean.get());
            }
        }.nullSafe());
        j = new AnonymousClass29(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final AtomicIntegerArray read(M7.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.C()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.U()));
                    } catch (NumberFormatException e10) {
                        throw new JsonSyntaxException(e10);
                    }
                }
                aVar.j();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
                bVar.c();
                int length = atomicIntegerArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    bVar.S(atomicIntegerArray2.get(i10));
                }
                bVar.j();
            }
        }.nullSafe());
        f28922k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Number read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.f0());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    bVar.x();
                } else {
                    bVar.S(number2.longValue());
                }
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public final Number read(M7.a aVar) throws IOException {
                if (aVar.y0() != JsonToken.j) {
                    return Float.valueOf((float) aVar.S());
                }
                aVar.n0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Number number) throws IOException {
                Number numberValueOf = number;
                if (numberValueOf == null) {
                    bVar.x();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                bVar.f0(numberValueOf);
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public final Number read(M7.a aVar) throws IOException {
                if (aVar.y0() != JsonToken.j) {
                    return Double.valueOf(aVar.S());
                }
                aVar.n0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    bVar.x();
                } else {
                    bVar.R(number2.doubleValue());
                }
            }
        };
        f28923l = new AnonymousClass30(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Character read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                String strR0 = aVar.r0();
                if (strR0.length() == 1) {
                    return Character.valueOf(strR0.charAt(0));
                }
                StringBuilder sbA = C7.g.a("Expecting character, got: ", strR0, "; at ");
                sbA.append(aVar.B());
                throw new JsonSyntaxException(sbA.toString());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Character ch) throws IOException {
                Character ch2 = ch;
                bVar.j0(ch2 == null ? null : String.valueOf(ch2));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final String read(M7.a aVar) throws IOException {
                JsonToken jsonTokenY0 = aVar.y0();
                if (jsonTokenY0 != JsonToken.j) {
                    return jsonTokenY0 == JsonToken.f28994i ? Boolean.toString(aVar.R()) : aVar.r0();
                }
                aVar.n0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, String str) throws IOException {
                bVar.j0(str);
            }
        };
        f28924m = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final BigDecimal read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                String strR0 = aVar.r0();
                try {
                    return e.b(strR0);
                } catch (NumberFormatException e10) {
                    StringBuilder sbA = C7.g.a("Failed parsing '", strR0, "' as BigDecimal; at path ");
                    sbA.append(aVar.B());
                    throw new JsonSyntaxException(sbA.toString(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, BigDecimal bigDecimal) throws IOException {
                bVar.f0(bigDecimal);
            }
        };
        f28925n = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final BigInteger read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                String strR0 = aVar.r0();
                try {
                    e.a(strR0);
                    return new BigInteger(strR0);
                } catch (NumberFormatException e10) {
                    StringBuilder sbA = C7.g.a("Failed parsing '", strR0, "' as BigInteger; at path ");
                    sbA.append(aVar.B());
                    throw new JsonSyntaxException(sbA.toString(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, BigInteger bigInteger) throws IOException {
                bVar.f0(bigInteger);
            }
        };
        f28926o = new TypeAdapter<LazilyParsedNumber>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final LazilyParsedNumber read(M7.a aVar) throws IOException {
                if (aVar.y0() != JsonToken.j) {
                    return new LazilyParsedNumber(aVar.r0());
                }
                aVar.n0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, LazilyParsedNumber lazilyParsedNumber) throws IOException {
                bVar.f0(lazilyParsedNumber);
            }
        };
        f28927p = new AnonymousClass29(String.class, typeAdapter2);
        f28928q = new AnonymousClass29(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final StringBuilder read(M7.a aVar) throws IOException {
                if (aVar.y0() != JsonToken.j) {
                    return new StringBuilder(aVar.r0());
                }
                aVar.n0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, StringBuilder sb2) throws IOException {
                StringBuilder sb3 = sb2;
                bVar.j0(sb3 == null ? null : sb3.toString());
            }
        });
        f28929r = new AnonymousClass29(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final StringBuffer read(M7.a aVar) throws IOException {
                if (aVar.y0() != JsonToken.j) {
                    return new StringBuffer(aVar.r0());
                }
                aVar.n0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                bVar.j0(stringBuffer2 == null ? null : stringBuffer2.toString());
            }
        });
        f28930s = new AnonymousClass29(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final URL read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                String strR0 = aVar.r0();
                if (strR0.equals("null")) {
                    return null;
                }
                return new URL(strR0);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, URL url) throws IOException {
                URL url2 = url;
                bVar.j0(url2 == null ? null : url2.toExternalForm());
            }
        });
        f28931t = new AnonymousClass29(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final URI read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                try {
                    String strR0 = aVar.r0();
                    if (strR0.equals("null")) {
                        return null;
                    }
                    return new URI(strR0);
                } catch (URISyntaxException e10) {
                    throw new JsonIOException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, URI uri) throws IOException {
                URI uri2 = uri;
                bVar.j0(uri2 == null ? null : uri2.toASCIIString());
            }
        });
        final TypeAdapter<InetAddress> typeAdapter3 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final InetAddress read(M7.a aVar) throws IOException {
                if (aVar.y0() != JsonToken.j) {
                    return InetAddress.getByName(aVar.r0());
                }
                aVar.n0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                bVar.j0(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f28932u = new m() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.m
            public final <T2> TypeAdapter<T2> create(Gson gson, L7.a<T2> aVar) {
                final Class<? super T2> rawType = aVar.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.32.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object read(M7.a aVar2) throws IOException {
                            Object obj = typeAdapter3.read(aVar2);
                            if (obj != null) {
                                Class cls2 = rawType;
                                if (!cls2.isInstance(obj)) {
                                    throw new JsonSyntaxException("Expected a " + cls2.getName() + " but was " + obj.getClass().getName() + "; at path " + aVar2.B());
                                }
                            }
                            return obj;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void write(M7.b bVar, Object obj) throws IOException {
                            typeAdapter3.write(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter3 + "]";
            }
        };
        f28933v = new AnonymousClass29(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final UUID read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                String strR0 = aVar.r0();
                try {
                    return UUID.fromString(strR0);
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbA = C7.g.a("Failed parsing '", strR0, "' as UUID; at path ");
                    sbA.append(aVar.B());
                    throw new JsonSyntaxException(sbA.toString(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                bVar.j0(uuid2 == null ? null : uuid2.toString());
            }
        });
        f28934w = new AnonymousClass29(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Currency read(M7.a aVar) throws IOException {
                String strR0 = aVar.r0();
                try {
                    return Currency.getInstance(strR0);
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbA = C7.g.a("Failed parsing '", strR0, "' as Currency; at path ");
                    sbA.append(aVar.B());
                    throw new JsonSyntaxException(sbA.toString(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Currency currency) throws IOException {
                bVar.j0(currency.getCurrencyCode());
            }
        }.nullSafe());
        final TypeAdapter<Calendar> typeAdapter4 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            public final Calendar read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                aVar.c();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.y0() != JsonToken.f28990e) {
                    String strJ0 = aVar.j0();
                    int iU = aVar.U();
                    strJ0.getClass();
                    switch (strJ0) {
                        case "dayOfMonth":
                            i12 = iU;
                            break;
                        case "minute":
                            i14 = iU;
                            break;
                        case "second":
                            i15 = iU;
                            break;
                        case "year":
                            i10 = iU;
                            break;
                        case "month":
                            i11 = iU;
                            break;
                        case "hourOfDay":
                            i13 = iU;
                            break;
                    }
                }
                aVar.k();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Calendar calendar) throws IOException {
                Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    bVar.x();
                    return;
                }
                bVar.h();
                bVar.p("year");
                bVar.S(calendar2.get(1));
                bVar.p("month");
                bVar.S(calendar2.get(2));
                bVar.p("dayOfMonth");
                bVar.S(calendar2.get(5));
                bVar.p("hourOfDay");
                bVar.S(calendar2.get(11));
                bVar.p("minute");
                bVar.S(calendar2.get(12));
                bVar.p("second");
                bVar.S(calendar2.get(13));
                bVar.k();
            }
        };
        f28935x = new m() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.m
            public final <T> TypeAdapter<T> create(Gson gson, L7.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return typeAdapter4;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + typeAdapter4 + "]";
            }
        };
        f28936y = new AnonymousClass29(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Locale read(M7.a aVar) throws IOException {
                if (aVar.y0() == JsonToken.j) {
                    aVar.n0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.r0(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(M7.b bVar, Locale locale) throws IOException {
                Locale locale2 = locale;
                bVar.j0(locale2 == null ? null : locale2.toString());
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.f28871a;
        f28937z = jsonElementTypeAdapter;
        final Class<g> cls2 = g.class;
        f28911A = new m() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.m
            public final <T2> TypeAdapter<T2> create(Gson gson, L7.a<T2> aVar) {
                final Class rawType = aVar.getRawType();
                if (cls2.isAssignableFrom(rawType)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.32.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object read(M7.a aVar2) throws IOException {
                            Object obj = jsonElementTypeAdapter.read(aVar2);
                            if (obj != null) {
                                Class cls3 = rawType;
                                if (!cls3.isInstance(obj)) {
                                    throw new JsonSyntaxException("Expected a " + cls3.getName() + " but was " + obj.getClass().getName() + "; at path " + aVar2.B());
                                }
                            }
                            return obj;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void write(M7.b bVar, Object obj) throws IOException {
                            jsonElementTypeAdapter.write(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + jsonElementTypeAdapter + "]";
            }
        };
        f28912B = EnumTypeAdapter.f28863d;
    }

    public static <TT> m a(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new AnonymousClass29(cls, typeAdapter);
    }

    public static <TT> m b(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new AnonymousClass30(cls, cls2, typeAdapter);
    }
}

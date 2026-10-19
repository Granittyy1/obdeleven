package p033c7;

import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.S;
import com.google.protobuf.W;
import com.google.protobuf.WireFormat$FieldType;

/* JADX INFO: compiled from: RateLimitProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Z extends GeneratedMessageLite<Z, a> implements K {
    private static final Z DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile S<Z> PARSER;
    private MapFieldLite<String, Y> limits_ = MapFieldLite.f29077b;

    /* JADX INFO: compiled from: RateLimitProto.java */
    public static final class a extends GeneratedMessageLite.a<Z, a> implements K {
        public a() {
            super(Z.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: RateLimitProto.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D<String, Y> f22418a = new D<>(WireFormat$FieldType.f29099c, WireFormat$FieldType.f29101e, Y.K());
    }

    static {
        Z z10 = new Z();
        DEFAULT_INSTANCE = z10;
        GeneratedMessageLite.F(Z.class, z10);
    }

    public static MapFieldLite H(Z z10) {
        if (!z10.limits_.c()) {
            z10.limits_ = z10.limits_.f();
        }
        return z10.limits_;
    }

    public static Z I() {
        return DEFAULT_INSTANCE;
    }

    public static a K(Z z10) {
        a aVarV = DEFAULT_INSTANCE.v();
        aVarV.s(z10);
        return aVarV;
    }

    public static S<Z> L() {
        return DEFAULT_INSTANCE.y();
    }

    public final Y J(String str, Y y10) {
        str.getClass();
        MapFieldLite<String, Y> mapFieldLite = this.limits_;
        return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : y10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", b.f22418a});
            case 3:
                return new Z();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<Z> bVar = PARSER;
                if (bVar == null) {
                    synchronized (Z.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

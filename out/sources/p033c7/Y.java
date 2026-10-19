package p033c7;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: RateLimitProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Y extends GeneratedMessageLite<Y, a> implements K {
    private static final Y DEFAULT_INSTANCE;
    private static volatile S<Y> PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    /* JADX INFO: compiled from: RateLimitProto.java */
    public static final class a extends GeneratedMessageLite.a<Y, a> implements K {
        public a() {
            super(Y.DEFAULT_INSTANCE);
        }
    }

    static {
        Y y10 = new Y();
        DEFAULT_INSTANCE = y10;
        GeneratedMessageLite.F(Y.class, y10);
    }

    public static void H(Y y10, long j) {
        y10.value_ = j;
    }

    public static void I(Y y10) {
        y10.value_ = 0L;
    }

    public static void J(Y y10, long j) {
        y10.startTimeEpoch_ = j;
    }

    public static Y K() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return DEFAULT_INSTANCE.v();
    }

    public static a O(Y y10) {
        a aVarV = DEFAULT_INSTANCE.v();
        aVarV.s(y10);
        return aVarV;
    }

    public final long L() {
        return this.startTimeEpoch_;
    }

    public final long M() {
        return this.value_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 3:
                return new Y();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<Y> bVar = PARSER;
                if (bVar == null) {
                    synchronized (Y.class) {
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

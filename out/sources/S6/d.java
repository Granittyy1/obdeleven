package S6;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: CommonTypesProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends GeneratedMessageLite<d, a> implements K {
    private static final d DEFAULT_INSTANCE;
    private static volatile S<d> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* JADX INFO: compiled from: CommonTypesProto.java */
    public static final class a extends GeneratedMessageLite.a<d, a> implements K {
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.F(d.class, dVar);
    }

    public static d G() {
        return DEFAULT_INSTANCE;
    }

    public final int H() {
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
                return new W(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 3:
                return new d();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<d> bVar = PARSER;
                if (bVar == null) {
                    synchronized (d.class) {
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

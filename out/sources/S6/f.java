package S6;

import com.google.firebase.inappmessaging.CommonTypesProto$Trigger;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: CommonTypesProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends GeneratedMessageLite<f, a> implements K {
    private static final f DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile S<f> PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    /* JADX INFO: compiled from: CommonTypesProto.java */
    public static final class a extends GeneratedMessageLite.a<f, a> implements K {
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.F(f.class, fVar);
    }

    public final c G() {
        return this.conditionCase_ == 2 ? (c) this.condition_ : c.G();
    }

    public final CommonTypesProto$Trigger H() {
        int i10 = this.conditionCase_;
        CommonTypesProto$Trigger commonTypesProto$Trigger = CommonTypesProto$Trigger.UNKNOWN_TRIGGER;
        if (i10 != 1) {
            return commonTypesProto$Trigger;
        }
        int iIntValue = ((Integer) this.condition_).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                commonTypesProto$Trigger = iIntValue != 2 ? null : CommonTypesProto$Trigger.ON_FOREGROUND;
            } else {
                commonTypesProto$Trigger = CommonTypesProto$Trigger.APP_LAUNCH;
            }
        }
        return commonTypesProto$Trigger == null ? CommonTypesProto$Trigger.UNRECOGNIZED : commonTypesProto$Trigger;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", c.class});
            case 3:
                return new f();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<f> bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
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

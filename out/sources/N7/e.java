package N7;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.protobuf.C2078u;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.V;
import com.google.protobuf.W;

/* JADX INFO: compiled from: FetchEligibleCampaignsResponse.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends GeneratedMessageLite<e, a> implements K {
    private static final e DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile S<e> PARSER;
    private long expirationEpochTimestampMillis_;
    private C2078u.d<CampaignProto$ThickContent> messages_ = V.f29091e;

    /* JADX INFO: compiled from: FetchEligibleCampaignsResponse.java */
    public static final class a extends GeneratedMessageLite.a<e, a> implements K {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        GeneratedMessageLite.F(e.class, eVar);
    }

    public static void H(e eVar, long j) {
        eVar.expirationEpochTimestampMillis_ = j;
    }

    public static e I() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
        return DEFAULT_INSTANCE.v();
    }

    public static S<e> M() {
        return DEFAULT_INSTANCE.y();
    }

    public final long J() {
        return this.expirationEpochTimestampMillis_;
    }

    public final C2078u.d K() {
        return this.messages_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", CampaignProto$ThickContent.class, "expirationEpochTimestampMillis_"});
            case 3:
                return new e();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<e> bVar = PARSER;
                if (bVar == null) {
                    synchronized (e.class) {
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

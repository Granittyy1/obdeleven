package N7;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: CampaignImpression.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends GeneratedMessageLite<a, C0070a> implements K {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    private static volatile S<a> PARSER;
    private String campaignId_ = "";
    private long impressionTimestampMillis_;

    /* JADX INFO: renamed from: N7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CampaignImpression.java */
    public static final class C0070a extends GeneratedMessageLite.a<a, C0070a> implements K {
        public C0070a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.F(a.class, aVar);
    }

    public static void H(a aVar, String str) {
        aVar.getClass();
        aVar.campaignId_ = str;
    }

    public static void I(a aVar, long j) {
        aVar.impressionTimestampMillis_ = j;
    }

    public static C0070a K() {
        return DEFAULT_INSTANCE.v();
    }

    public final String J() {
        return this.campaignId_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"campaignId_", "impressionTimestampMillis_"});
            case 3:
                return new a();
            case 4:
                return new C0070a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<a> bVar = PARSER;
                if (bVar == null) {
                    synchronized (a.class) {
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

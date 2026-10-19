package com.google.internal.firebase.inappmessaging.v1;

import S6.h;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: CampaignProto.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends GeneratedMessageLite<a, C0290a> implements K {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final a DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
    private static volatile S<a> PARSER;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private h experimentPayload_;

    /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CampaignProto.java */
    public static final class C0290a extends GeneratedMessageLite.a<a, C0290a> implements K {
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.F(a.class, aVar);
    }

    public static a K() {
        return DEFAULT_INSTANCE;
    }

    public final long G() {
        return this.campaignEndTimeMillis_;
    }

    public final String H() {
        return this.campaignId_;
    }

    public final String I() {
        return this.campaignName_;
    }

    public final long J() {
        return this.campaignStartTimeMillis_;
    }

    public final h L() {
        h hVar = this.experimentPayload_;
        return hVar == null ? h.G() : hVar;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 3:
                return new a();
            case 4:
                return new C0290a(DEFAULT_INSTANCE);
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

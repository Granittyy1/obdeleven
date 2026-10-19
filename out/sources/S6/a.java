package S6;

import com.google.firebase.inappmessaging.DismissType;
import com.google.firebase.inappmessaging.EventType;
import com.google.firebase.inappmessaging.FetchErrorReason;
import com.google.firebase.inappmessaging.RenderErrorReason;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: CampaignAnalytics.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends GeneratedMessageLite<a, C0079a> implements K {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final a DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile S<a> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private b clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    /* JADX INFO: renamed from: S6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CampaignAnalytics.java */
    public static final class C0079a extends GeneratedMessageLite.a<a, C0079a> implements K {
        public C0079a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.F(a.class, aVar);
    }

    public static void H(a aVar, long j) {
        aVar.bitField0_ |= 8;
        aVar.clientTimestampMillis_ = j;
    }

    public static void I(a aVar, EventType eventType) {
        aVar.getClass();
        aVar.event_ = Integer.valueOf(eventType.a());
        aVar.eventCase_ = 5;
    }

    public static void J(a aVar, DismissType dismissType) {
        aVar.getClass();
        aVar.event_ = Integer.valueOf(dismissType.a());
        aVar.eventCase_ = 6;
    }

    public static void K(a aVar, RenderErrorReason renderErrorReason) {
        aVar.getClass();
        aVar.event_ = Integer.valueOf(renderErrorReason.a());
        aVar.eventCase_ = 7;
    }

    public static void L(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        aVar.bitField0_ |= 1;
        aVar.projectNumber_ = str;
    }

    public static void M(a aVar) {
        aVar.getClass();
        aVar.bitField0_ |= 256;
        aVar.fiamSdkVersion_ = "20.4.1";
    }

    public static void N(a aVar, String str) {
        aVar.getClass();
        aVar.bitField0_ |= 2;
        aVar.campaignId_ = str;
    }

    public static void O(a aVar, b bVar) {
        aVar.getClass();
        aVar.clientApp_ = bVar;
        aVar.bitField0_ |= 4;
    }

    public static C0079a P() {
        return DEFAULT_INSTANCE.v();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဿ\u0000\u0006ဿ\u0000\u0007ဿ\u0000\bဿ\u0000\tဈ\b\nင\t", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", EventType.a.f28146a, DismissType.a.f28141a, RenderErrorReason.a.f28174a, FetchErrorReason.a.f28152a, "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 3:
                return new a();
            case 4:
                return new C0079a();
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

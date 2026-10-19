package com.google.internal.firebase.inappmessaging.v1;

import S6.d;
import S6.f;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.protobuf.C2078u;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.S;
import com.google.protobuf.V;
import com.google.protobuf.W;
import com.google.protobuf.WireFormat$FieldType;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CampaignProto$ThickContent extends GeneratedMessageLite<CampaignProto$ThickContent, a> implements K {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final CampaignProto$ThickContent DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile S<CampaignProto$ThickContent> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private MessagesProto$Content content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private d priority_;
    private int payloadCase_ = 0;
    private MapFieldLite<String, String> dataBundle_ = MapFieldLite.f29077b;
    private C2078u.d<f> triggeringConditions_ = V.f29091e;

    public enum PayloadCase {
        VANILLA_PAYLOAD(1),
        EXPERIMENTAL_PAYLOAD(2),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i10) {
            this.value = i10;
        }
    }

    public static final class a extends GeneratedMessageLite.a<CampaignProto$ThickContent, a> implements K {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D<String, String> f29001a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.f29099c;
            f29001a = new D<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        CampaignProto$ThickContent campaignProto$ThickContent = new CampaignProto$ThickContent();
        DEFAULT_INSTANCE = campaignProto$ThickContent;
        GeneratedMessageLite.F(CampaignProto$ThickContent.class, campaignProto$ThickContent);
    }

    public final MessagesProto$Content G() {
        MessagesProto$Content messagesProto$Content = this.content_;
        return messagesProto$Content == null ? MessagesProto$Content.I() : messagesProto$Content;
    }

    public final Map<String, String> H() {
        return Collections.unmodifiableMap(this.dataBundle_);
    }

    public final com.google.internal.firebase.inappmessaging.v1.a I() {
        return this.payloadCase_ == 2 ? (com.google.internal.firebase.inappmessaging.v1.a) this.payload_ : com.google.internal.firebase.inappmessaging.v1.a.K();
    }

    public final boolean J() {
        return this.isTestCampaign_;
    }

    public final PayloadCase K() {
        int i10 = this.payloadCase_;
        if (i10 == 0) {
            return PayloadCase.PAYLOAD_NOT_SET;
        }
        if (i10 == 1) {
            return PayloadCase.VANILLA_PAYLOAD;
        }
        if (i10 != 2) {
            return null;
        }
        return PayloadCase.EXPERIMENTAL_PAYLOAD;
    }

    public final d L() {
        d dVar = this.priority_;
        return dVar == null ? d.G() : dVar;
    }

    public final C2078u.d M() {
        return this.triggeringConditions_;
    }

    public final com.google.internal.firebase.inappmessaging.v1.b N() {
        return this.payloadCase_ == 1 ? (com.google.internal.firebase.inappmessaging.v1.b) this.payload_ : com.google.internal.firebase.inappmessaging.v1.b.K();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\t\u0004\t\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", com.google.internal.firebase.inappmessaging.v1.b.class, com.google.internal.firebase.inappmessaging.v1.a.class, "content_", "priority_", "triggeringConditions_", f.class, "isTestCampaign_", "dataBundle_", b.f29001a});
            case 3:
                return new CampaignProto$ThickContent();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<CampaignProto$ThickContent> bVar = PARSER;
                if (bVar == null) {
                    synchronized (CampaignProto$ThickContent.class) {
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

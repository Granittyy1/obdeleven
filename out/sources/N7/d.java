package N7;

import com.google.protobuf.AbstractC2059a;
import com.google.protobuf.C2078u;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.V;
import com.google.protobuf.W;

/* JADX INFO: compiled from: FetchEligibleCampaignsRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends GeneratedMessageLite<d, a> implements K {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final d DEFAULT_INSTANCE;
    private static volatile S<d> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private p132k6.a clientSignals_;
    private c requestingClientApp_;
    private String projectNumber_ = "";
    private C2078u.d<N7.a> alreadySeenCampaigns_ = V.f29091e;

    /* JADX INFO: compiled from: FetchEligibleCampaignsRequest.java */
    public static final class a extends GeneratedMessageLite.a<d, a> implements K {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.F(d.class, dVar);
    }

    public static void H(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.projectNumber_ = str;
    }

    public static void I(d dVar, C2078u.d dVar2) {
        C2078u.d<N7.a> dVar3 = dVar.alreadySeenCampaigns_;
        if (!dVar3.n()) {
            dVar.alreadySeenCampaigns_ = GeneratedMessageLite.D(dVar3);
        }
        AbstractC2059a.k(dVar2, dVar.alreadySeenCampaigns_);
    }

    public static void J(d dVar, p132k6.a aVar) {
        dVar.getClass();
        dVar.clientSignals_ = aVar;
    }

    public static void K(d dVar, c cVar) {
        dVar.getClass();
        dVar.requestingClientApp_ = cVar;
    }

    public static d L() {
        return DEFAULT_INSTANCE;
    }

    public static a M() {
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
                return new W(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\t", new Object[]{"projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", N7.a.class, "clientSignals_"});
            case 3:
                return new d();
            case 4:
                return new a();
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

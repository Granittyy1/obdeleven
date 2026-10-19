package N7;

import com.google.protobuf.C2078u;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.V;
import com.google.protobuf.W;

/* JADX INFO: compiled from: CampaignImpressionList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends GeneratedMessageLite<b, a> implements K {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    private static volatile S<b> PARSER;
    private C2078u.d<N7.a> alreadySeenCampaigns_ = V.f29091e;

    /* JADX INFO: compiled from: CampaignImpressionList.java */
    public static final class a extends GeneratedMessageLite.a<b, a> implements K {
        public a() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        GeneratedMessageLite.F(b.class, bVar);
    }

    public static void H(b bVar, N7.a aVar) {
        bVar.getClass();
        C2078u.d<N7.a> dVar = bVar.alreadySeenCampaigns_;
        if (!dVar.n()) {
            bVar.alreadySeenCampaigns_ = GeneratedMessageLite.D(dVar);
        }
        bVar.alreadySeenCampaigns_.add(aVar);
    }

    public static b J() {
        return DEFAULT_INSTANCE;
    }

    public static a K() {
        return DEFAULT_INSTANCE.v();
    }

    public static a L(b bVar) {
        a aVarV = DEFAULT_INSTANCE.v();
        aVarV.s(bVar);
        return aVarV;
    }

    public static S<b> M() {
        return DEFAULT_INSTANCE.y();
    }

    public final C2078u.d I() {
        return this.alreadySeenCampaigns_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", N7.a.class});
            case 3:
                return new b();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<b> bVar = PARSER;
                if (bVar == null) {
                    synchronized (b.class) {
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

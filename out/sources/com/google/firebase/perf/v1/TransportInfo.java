package com.google.firebase.perf.v1;

import com.google.protobuf.C2078u;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: loaded from: classes3.dex */
public final class TransportInfo extends GeneratedMessageLite<TransportInfo, a> implements K {
    private static final TransportInfo DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile S<TransportInfo> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    public enum DispatchDestination implements C2078u.a {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);

        private final int value;

        public static final class a implements C2078u.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f28539a = new a();

            @Override // com.google.protobuf.C2078u.b
            public final boolean a(int i10) {
                DispatchDestination dispatchDestination;
                if (i10 != 0) {
                    dispatchDestination = i10 != 1 ? null : DispatchDestination.FL_LEGACY_V1;
                } else {
                    dispatchDestination = DispatchDestination.SOURCE_UNKNOWN;
                }
                return dispatchDestination != null;
            }
        }

        DispatchDestination(int i10) {
            this.value = i10;
        }

        @Override // com.google.protobuf.C2078u.a
        public final int a() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.a<TransportInfo, a> implements K {
    }

    static {
        TransportInfo transportInfo = new TransportInfo();
        DEFAULT_INSTANCE = transportInfo;
        GeneratedMessageLite.F(TransportInfo.class, transportInfo);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", DispatchDestination.a.f28539a});
            case 3:
                return new TransportInfo();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<TransportInfo> bVar = PARSER;
                if (bVar == null) {
                    synchronized (TransportInfo.class) {
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

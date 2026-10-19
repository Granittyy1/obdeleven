package io.grpc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class TlsChannelCredentials$Feature {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TlsChannelCredentials$Feature f36929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TlsChannelCredentials$Feature f36930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TlsChannelCredentials$Feature[] f36931d;

    /* JADX INFO: Fake field, exist only in values array */
    TlsChannelCredentials$Feature EF0;

    static {
        TlsChannelCredentials$Feature tlsChannelCredentials$Feature = new TlsChannelCredentials$Feature("FAKE", 0);
        TlsChannelCredentials$Feature tlsChannelCredentials$Feature2 = new TlsChannelCredentials$Feature("MTLS", 1);
        f36929b = tlsChannelCredentials$Feature2;
        TlsChannelCredentials$Feature tlsChannelCredentials$Feature3 = new TlsChannelCredentials$Feature("CUSTOM_MANAGERS", 2);
        f36930c = tlsChannelCredentials$Feature3;
        f36931d = new TlsChannelCredentials$Feature[]{tlsChannelCredentials$Feature, tlsChannelCredentials$Feature2, tlsChannelCredentials$Feature3};
    }

    public TlsChannelCredentials$Feature() {
        throw null;
    }

    public static TlsChannelCredentials$Feature valueOf(String str) {
        return (TlsChannelCredentials$Feature) Enum.valueOf(TlsChannelCredentials$Feature.class, str);
    }

    public static TlsChannelCredentials$Feature[] values() {
        return (TlsChannelCredentials$Feature[]) f36931d.clone();
    }
}

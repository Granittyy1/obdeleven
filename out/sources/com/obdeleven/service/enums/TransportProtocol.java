package com.obdeleven.service.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class TransportProtocol {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TransportProtocol f29303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TransportProtocol f29304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TransportProtocol f29305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TransportProtocol f29306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TransportProtocol f29307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TransportProtocol f29308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ TransportProtocol[] f29309h;

    static {
        TransportProtocol transportProtocol = new TransportProtocol("UNKNOWN", 0);
        f29303b = transportProtocol;
        TransportProtocol transportProtocol2 = new TransportProtocol("KLINE_KWP1281", 1);
        f29304c = transportProtocol2;
        TransportProtocol transportProtocol3 = new TransportProtocol("KLINE_KWP2000", 2);
        f29305d = transportProtocol3;
        TransportProtocol transportProtocol4 = new TransportProtocol("TP_16", 3);
        f29306e = transportProtocol4;
        TransportProtocol transportProtocol5 = new TransportProtocol("TP_20", 4);
        f29307f = transportProtocol5;
        TransportProtocol transportProtocol6 = new TransportProtocol("ISO_TP", 5);
        f29308g = transportProtocol6;
        f29309h = new TransportProtocol[]{transportProtocol, transportProtocol2, transportProtocol3, transportProtocol4, transportProtocol5, transportProtocol6};
    }

    public TransportProtocol() {
        throw null;
    }

    public static TransportProtocol valueOf(String str) {
        return (TransportProtocol) Enum.valueOf(TransportProtocol.class, str);
    }

    public static TransportProtocol[] values() {
        return (TransportProtocol[]) f29309h.clone();
    }
}

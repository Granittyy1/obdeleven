package com.obdeleven.service.enums;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: GatewayType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GatewayType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GatewayType f29268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final GatewayType f29269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final GatewayType f29270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final GatewayType f29271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final GatewayType f29272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final GatewayType f29273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ GatewayType[] f29274h;

    static {
        GatewayType gatewayType = new GatewayType("UNKNOWN", 0);
        f29268b = gatewayType;
        GatewayType gatewayType2 = new GatewayType("K_LINE", 1);
        f29269c = gatewayType2;
        GatewayType gatewayType3 = new GatewayType("KWP2000", 2);
        f29270d = gatewayType3;
        GatewayType gatewayType4 = new GatewayType("UDS0", 3);
        f29271e = gatewayType4;
        GatewayType gatewayType5 = new GatewayType("UDS1", 4);
        f29272f = gatewayType5;
        GatewayType gatewayType6 = new GatewayType("UDS2", 5);
        f29273g = gatewayType6;
        GatewayType[] gatewayTypeArr = {gatewayType, gatewayType2, gatewayType3, gatewayType4, gatewayType5, gatewayType6};
        f29274h = gatewayTypeArr;
        a.a(gatewayTypeArr);
    }

    public GatewayType() {
        throw null;
    }

    public static GatewayType valueOf(String str) {
        return (GatewayType) Enum.valueOf(GatewayType.class, str);
    }

    public static GatewayType[] values() {
        return (GatewayType[]) f29274h.clone();
    }
}

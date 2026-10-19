package com.voltasit.obdeleven.domain.models;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ConnectionRedirectType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConnectionRedirectType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConnectionRedirectType f30451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConnectionRedirectType f30452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ConnectionRedirectType[] f30453d;

    static {
        ConnectionRedirectType connectionRedirectType = new ConnectionRedirectType("Vag", 0);
        f30451b = connectionRedirectType;
        ConnectionRedirectType connectionRedirectType2 = new ConnectionRedirectType("NonVag", 1);
        f30452c = connectionRedirectType2;
        ConnectionRedirectType[] connectionRedirectTypeArr = {connectionRedirectType, connectionRedirectType2};
        f30453d = connectionRedirectTypeArr;
        a.a(connectionRedirectTypeArr);
    }

    public ConnectionRedirectType() {
        throw null;
    }

    public static ConnectionRedirectType valueOf(String str) {
        return (ConnectionRedirectType) Enum.valueOf(ConnectionRedirectType.class, str);
    }

    public static ConnectionRedirectType[] values() {
        return (ConnectionRedirectType[]) f30453d.clone();
    }
}

package com.google.android.datatransport.cct.internal;

import B4.f;

/* JADX INFO: compiled from: AutoValue_ClientInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ClientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientInfo.ClientType f25252a = ClientInfo.ClientType.ANDROID_FIREBASE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f25253b;

    public c(f fVar) {
        this.f25253b = fVar;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final B4.a a() {
        return this.f25253b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final ClientInfo.ClientType b() {
        return this.f25252a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f25252a;
        if (clientType != null ? clientType.equals(clientInfo.b()) : clientInfo.b() == null) {
            f fVar = this.f25253b;
            if (fVar == null) {
                if (clientInfo.a() == null) {
                    return true;
                }
            } else if (fVar.equals(clientInfo.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f25252a;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        f fVar = this.f25253b;
        return (fVar != null ? fVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f25252a + ", androidClientInfo=" + this.f25253b + "}";
    }
}

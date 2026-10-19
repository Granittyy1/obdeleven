package com.google.firebase.installations.remote;

/* JADX INFO: compiled from: AutoValue_InstallationResponse.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends InstallationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f28247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InstallationResponse.ResponseCode f28248e;

    public a(String str, String str2, String str3, b bVar, InstallationResponse.ResponseCode responseCode) {
        this.f28244a = str;
        this.f28245b = str2;
        this.f28246c = str3;
        this.f28247d = bVar;
        this.f28248e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final TokenResult a() {
        return this.f28247d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String b() {
        return this.f28245b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String c() {
        return this.f28246c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final InstallationResponse.ResponseCode d() {
        return this.f28248e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String e() {
        return this.f28244a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f28244a;
        if (str != null ? str.equals(installationResponse.e()) : installationResponse.e() == null) {
            String str2 = this.f28245b;
            if (str2 != null ? str2.equals(installationResponse.b()) : installationResponse.b() == null) {
                String str3 = this.f28246c;
                if (str3 != null ? str3.equals(installationResponse.c()) : installationResponse.c() == null) {
                    b bVar = this.f28247d;
                    if (bVar != null ? bVar.equals(installationResponse.a()) : installationResponse.a() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f28248e;
                        if (responseCode == null) {
                            if (installationResponse.d() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28244a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f28245b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f28246c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f28247d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f28248e;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f28244a + ", fid=" + this.f28245b + ", refreshToken=" + this.f28246c + ", authToken=" + this.f28247d + ", responseCode=" + this.f28248e + "}";
    }
}

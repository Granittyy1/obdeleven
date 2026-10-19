package com.google.firebase.installations.local;

import Q8.d;
import androidx.compose.ui.text.font.s;

/* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f28223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f28227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f28228h;

    /* JADX INFO: renamed from: com.google.firebase.installations.local.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
    public static final class C0282a extends b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f28230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f28231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f28232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f28233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f28234f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f28235g;

        public final a a() {
            String strB = this.f28230b == null ? " registrationStatus" : "";
            if (this.f28233e == null) {
                strB = strB.concat(" expiresInSecs");
            }
            if (this.f28234f == null) {
                strB = s.b(strB, " tokenCreationEpochInSecs");
            }
            if (strB.isEmpty()) {
                return new a(this.f28229a, this.f28230b, this.f28231c, this.f28232d, this.f28233e.longValue(), this.f28234f.longValue(), this.f28235g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j10, String str4) {
        this.f28222b = str;
        this.f28223c = registrationStatus;
        this.f28224d = str2;
        this.f28225e = str3;
        this.f28226f = j;
        this.f28227g = j10;
        this.f28228h = str4;
    }

    @Override // com.google.firebase.installations.local.b
    public final String a() {
        return this.f28224d;
    }

    @Override // com.google.firebase.installations.local.b
    public final long b() {
        return this.f28226f;
    }

    @Override // com.google.firebase.installations.local.b
    public final String c() {
        return this.f28222b;
    }

    @Override // com.google.firebase.installations.local.b
    public final String d() {
        return this.f28228h;
    }

    @Override // com.google.firebase.installations.local.b
    public final String e() {
        return this.f28225e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str3 = this.f28222b;
        if (str3 != null ? str3.equals(bVar.c()) : bVar.c() == null) {
            if (this.f28223c.equals(bVar.f()) && ((str = this.f28224d) != null ? str.equals(bVar.a()) : bVar.a() == null) && ((str2 = this.f28225e) != null ? str2.equals(bVar.e()) : bVar.e() == null) && this.f28226f == bVar.b() && this.f28227g == bVar.g()) {
                String str4 = this.f28228h;
                if (str4 == null) {
                    if (bVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(bVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.b
    public final PersistedInstallation.RegistrationStatus f() {
        return this.f28223c;
    }

    @Override // com.google.firebase.installations.local.b
    public final long g() {
        return this.f28227g;
    }

    public final C0282a h() {
        C0282a c0282a = new C0282a();
        c0282a.f28229a = this.f28222b;
        c0282a.f28230b = this.f28223c;
        c0282a.f28231c = this.f28224d;
        c0282a.f28232d = this.f28225e;
        c0282a.f28233e = Long.valueOf(this.f28226f);
        c0282a.f28234f = Long.valueOf(this.f28227g);
        c0282a.f28235g = this.f28228h;
        return c0282a;
    }

    public final int hashCode() {
        String str = this.f28222b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f28223c.hashCode()) * 1000003;
        String str2 = this.f28224d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f28225e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f28226f;
        int i10 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f28227g;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f28228h;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f28222b);
        sb2.append(", registrationStatus=");
        sb2.append(this.f28223c);
        sb2.append(", authToken=");
        sb2.append(this.f28224d);
        sb2.append(", refreshToken=");
        sb2.append(this.f28225e);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f28226f);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f28227g);
        sb2.append(", fisError=");
        return d.a(sb2, this.f28228h, "}");
    }
}

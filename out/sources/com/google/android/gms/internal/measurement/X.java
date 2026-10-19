package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class X extends Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzcl f25631c;

    public X() {
        zzcl zzclVar = zzcl.f26004b;
        this.f25630b = "";
        this.f25631c = zzclVar;
    }

    @Override // com.google.android.gms.internal.measurement.Z
    public final zzcl a() {
        return this.f25631c;
    }

    @Override // com.google.android.gms.internal.measurement.Z
    public final String b() {
        return this.f25630b;
    }

    @Override // com.google.android.gms.internal.measurement.Z
    public final boolean c() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.Z
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Z) {
            Z z10 = (Z) obj;
            if (this.f25630b.equals(z10.b()) && !z10.c() && !z10.d() && this.f25631c.equals(z10.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f25630b.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 1237) * 583896283) ^ this.f25631c.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f25630b + ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f25631c) + "}";
    }
}

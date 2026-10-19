package com.facebook.login;

import Z3.C0835a;
import Z3.C0842h;
import java.util.Set;

/* JADX INFO: compiled from: LoginResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0835a f25189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0842h f25190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f25191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<String> f25192d;

    public y(C0835a c0835a, C0842h c0842h, Set<String> set, Set<String> set2) {
        this.f25189a = c0835a;
        this.f25190b = c0842h;
        this.f25191c = set;
        this.f25192d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.i.a(this.f25189a, yVar.f25189a) && kotlin.jvm.internal.i.a(this.f25190b, yVar.f25190b) && kotlin.jvm.internal.i.a(this.f25191c, yVar.f25191c) && kotlin.jvm.internal.i.a(this.f25192d, yVar.f25192d);
    }

    public final int hashCode() {
        int iHashCode = this.f25189a.hashCode() * 31;
        C0842h c0842h = this.f25190b;
        return this.f25192d.hashCode() + ((this.f25191c.hashCode() + ((iHashCode + (c0842h == null ? 0 : c0842h.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.f25189a + ", authenticationToken=" + this.f25190b + ", recentlyGrantedPermissions=" + this.f25191c + ", recentlyDeniedPermissions=" + this.f25192d + ')';
    }
}

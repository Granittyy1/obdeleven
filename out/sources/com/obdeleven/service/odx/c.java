package com.obdeleven.service.odx;

import C4.v;
import kotlin.jvm.internal.i;
import p293xa.p;

/* JADX INFO: compiled from: OdxFileInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f29481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29485e;

    public c(short s10, String odxName, String odxVersion, String platform, boolean z10) {
        i.e(odxName, "odxName");
        i.e(odxVersion, "odxVersion");
        i.e(platform, "platform");
        this.f29481a = s10;
        this.f29482b = odxName;
        this.f29483c = odxVersion;
        this.f29484d = platform;
        this.f29485e = z10;
    }

    public final String a() {
        return this.f29484d + "." + this.f29482b + "_" + this.f29483c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f29481a == cVar.f29481a && i.a(this.f29482b, cVar.f29482b) && i.a(this.f29483c, cVar.f29483c) && i.a(this.f29484d, cVar.f29484d) && this.f29485e == cVar.f29485e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29485e) + B1.a.b(this.f29484d, B1.a.b(this.f29483c, B1.a.b(this.f29482b, Short.hashCode(this.f29481a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = C7.g.a("OdxFileInfo(controlUnitKLineId=", p.a(this.f29481a), ", odxName=");
        sbA.append(this.f29482b);
        sbA.append(", odxVersion=");
        sbA.append(this.f29483c);
        sbA.append(", platform=");
        sbA.append(this.f29484d);
        sbA.append(", overrideUserSelection=");
        return v.f(sbA, this.f29485e, ")");
    }
}

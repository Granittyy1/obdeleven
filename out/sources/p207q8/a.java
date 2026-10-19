package p207q8;

import Q8.d;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: BasicSetting.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46178e;

    public a(int i10, String str, String str2, String str3, String str4) {
        this.f46174a = str;
        this.f46175b = str2;
        this.f46176c = str3;
        this.f46177d = i10;
        this.f46178e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f46174a, aVar.f46174a) && i.a(this.f46175b, aVar.f46175b) && i.a(this.f46176c, aVar.f46176c) && this.f46177d == aVar.f46177d && i.a(this.f46178e, aVar.f46178e);
    }

    public final int hashCode() {
        return this.f46178e.hashCode() + q.b(this.f46177d, B1.a.b(this.f46176c, B1.a.b(this.f46175b, this.f46174a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BasicSetting(name=");
        sb2.append(this.f46174a);
        sb2.append(", originalName=");
        sb2.append(this.f46175b);
        sb2.append(", textId=");
        sb2.append(this.f46176c);
        sb2.append(", channel=");
        sb2.append(this.f46177d);
        sb2.append(", hexValue=");
        return d.a(sb2, this.f46178e, ")");
    }
}

package K1;

import Q8.d;
import p078g1.s;

/* JADX INFO: compiled from: AppInfoTable.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4137b;

    public a(int i10, String str) {
        this.f4136a = i10;
        this.f4137b = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f4136a);
        sb2.append(",url=");
        return d.a(sb2, this.f4137b, ")");
    }
}

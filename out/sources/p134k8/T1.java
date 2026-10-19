package p134k8;

import C4.b;

/* JADX INFO: compiled from: Value.java */
/* JADX INFO: loaded from: classes3.dex */
public class T1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42680c;

    public T1() {
    }

    public final String toString() {
        String str = this.f42679b;
        String str2 = this.f42680c;
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        StringBuilder sbF = b.f(str, " ");
        sbF.append(this.f42680c);
        return sbF.toString();
    }

    public T1(String str, String str2, String str3) {
        this.f42678a = str;
        this.f42679b = str2;
        this.f42680c = str3;
    }
}

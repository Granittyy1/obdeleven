package Ab;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: SignatureImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1056f = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class f1060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f1061e;

    /* JADX INFO: compiled from: SignatureImpl.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SoftReference f1062a;
    }

    public abstract String a();

    public final String b() {
        e eVar = e.f1063f;
        String strA = null;
        if (f1056f) {
            a aVar = this.f1061e;
            if (aVar == null) {
                try {
                    a aVar2 = new a();
                    aVar2.f1062a = new SoftReference(new String[3]);
                    this.f1061e = aVar2;
                } catch (Throwable unused) {
                    f1056f = false;
                }
            } else {
                int i10 = eVar.f1068e;
                String[] strArr = (String[]) aVar.f1062a.get();
                if (strArr != null) {
                    strA = strArr[i10];
                }
            }
        }
        if (strA == null) {
            strA = a();
        }
        if (f1056f) {
            a aVar3 = this.f1061e;
            int i11 = eVar.f1068e;
            String[] strArr2 = (String[]) aVar3.f1062a.get();
            if (strArr2 == null) {
                strArr2 = new String[3];
                aVar3.f1062a = new SoftReference(strArr2);
            }
            strArr2[i11] = strA;
        }
        return strA;
    }

    public final String toString() {
        e eVar = e.f1063f;
        return b();
    }
}

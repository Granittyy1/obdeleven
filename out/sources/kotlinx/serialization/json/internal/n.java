package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: JsonPath.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f43995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f43996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43997c;

    /* JADX INFO: compiled from: JsonPath.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43998a = new a();
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f43997c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f43995a[i11];
            if (obj instanceof p011ab.e) {
                p011ab.e eVar = (p011ab.e) obj;
                if (!kotlin.jvm.internal.i.a(eVar.e(), ab.n.b.f8125a)) {
                    int i12 = this.f43996b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(eVar.g(i12));
                    }
                } else if (this.f43996b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f43996b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f43998a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public final String toString() {
        return a();
    }
}

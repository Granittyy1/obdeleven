package D9;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: InternalLogId.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLong f2907d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2910c;

    public r(String str, String str2, long j) {
        A8.p.j(str, "typeName");
        A8.p.f("empty type", !str.isEmpty());
        this.f2908a = str;
        this.f2909b = str2;
        this.f2910c = j;
    }

    public static r a(Class<?> cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new r(simpleName, str, f2907d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2908a + "<" + this.f2910c + ">");
        String str = this.f2909b;
        if (str != null) {
            sb2.append(": (");
            sb2.append(str);
            sb2.append(')');
        }
        return sb2.toString();
    }
}

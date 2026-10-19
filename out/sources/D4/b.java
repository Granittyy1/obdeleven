package D4;

import android.content.Context;

/* JADX INFO: compiled from: AutoValue_CreationContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L4.a f2789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L4.a f2790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2791d;

    public b(Context context, L4.a aVar, L4.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f2788a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f2789b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f2790c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f2791d = str;
    }

    @Override // D4.f
    public final Context a() {
        return this.f2788a;
    }

    @Override // D4.f
    public final String b() {
        return this.f2791d;
    }

    @Override // D4.f
    public final L4.a c() {
        return this.f2790c;
    }

    @Override // D4.f
    public final L4.a d() {
        return this.f2789b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2788a.equals(fVar.a()) && this.f2789b.equals(fVar.d()) && this.f2790c.equals(fVar.c()) && this.f2791d.equals(fVar.b());
    }

    public final int hashCode() {
        return ((((((this.f2788a.hashCode() ^ 1000003) * 1000003) ^ this.f2789b.hashCode()) * 1000003) ^ this.f2790c.hashCode()) * 1000003) ^ this.f2791d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f2788a);
        sb2.append(", wallClock=");
        sb2.append(this.f2789b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f2790c);
        sb2.append(", backendName=");
        return Q8.d.a(sb2, this.f2791d, "}");
    }
}

package p311z4;

import com.google.android.datatransport.Priority;

/* JADX INFO: compiled from: AutoValue_Event.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> extends d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f48827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Priority f48828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f48829c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, Priority priority, b bVar) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f48827a = obj;
        this.f48828b = priority;
        this.f48829c = bVar;
    }

    @Override // p311z4.d
    public final Integer a() {
        return null;
    }

    @Override // p311z4.d
    public final T b() {
        return this.f48827a;
    }

    @Override // p311z4.d
    public final Priority c() {
        return this.f48828b;
    }

    @Override // p311z4.d
    public final e d() {
        return this.f48829c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.a() == null) {
            if (this.f48827a.equals(dVar.b()) && this.f48828b.equals(dVar.c())) {
                b bVar = this.f48829c;
                if (bVar == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (bVar.equals(dVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f48827a.hashCode()) * 1000003) ^ this.f48828b.hashCode()) * 1000003;
        b bVar = this.f48829c;
        return (bVar == null ? 0 : bVar.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f48827a + ", priority=" + this.f48828b + ", productData=" + this.f48829c + "}";
    }
}

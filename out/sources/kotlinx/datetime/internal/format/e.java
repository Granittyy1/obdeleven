package kotlinx.datetime.internal.format;

/* JADX INFO: compiled from: FormatStructure.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<T> f43883a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(k<? super T> kVar) {
        this.f43883a = kVar;
    }

    @Override // kotlinx.datetime.internal.format.n
    public final Wa.e<T> a() {
        return this.f43883a.a();
    }

    @Override // kotlinx.datetime.internal.format.n
    public final kotlinx.datetime.internal.format.parser.l<T> b() {
        return this.f43883a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f43883a, ((e) obj).f43883a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43883a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.f43883a + ')';
    }
}

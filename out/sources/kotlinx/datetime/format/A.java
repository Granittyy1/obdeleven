package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.ReducedIntFieldDirective;

/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class A extends ReducedIntFieldDirective<InterfaceC2720e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43629c;

    public A(boolean z10) {
        super(DateFields.f43635a);
        this.f43628b = 2000;
        this.f43629c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            A a10 = (A) obj;
            if (this.f43628b == a10.f43628b && this.f43629c == a10.f43629c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43629c) + (Integer.hashCode(this.f43628b) * 31);
    }
}

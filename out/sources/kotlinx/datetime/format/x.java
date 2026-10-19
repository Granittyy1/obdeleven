package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective;

/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends UnsignedIntFieldFormatDirective<InterfaceC2720e> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Padding f43851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Padding padding) {
        super(DateFields.f43636b, padding == Padding.f43774c ? 2 : 1, padding == Padding.f43775d ? 2 : null);
        kotlin.jvm.internal.i.e(padding, "padding");
        kotlinx.datetime.internal.format.o<InterfaceC2720e, Integer> oVar = DateFields.f43635a;
        this.f43851e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            if (this.f43851e == ((x) obj).f43851e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43851e.hashCode();
    }
}

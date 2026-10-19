package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.SignedIntFieldFormatDirective;

/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class L extends SignedIntFieldFormatDirective<InterfaceC2720e> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Padding f43743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Padding padding, boolean z10) {
        super(DateFields.f43635a, Integer.valueOf(padding == Padding.f43774c ? 4 : 1), padding == Padding.f43775d ? 4 : null);
        kotlin.jvm.internal.i.e(padding, "padding");
        this.f43743d = padding;
        this.f43744e = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof L) {
            L l10 = (L) obj;
            if (this.f43743d == l10.f43743d && this.f43744e == l10.f43744e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43744e) + (this.f43743d.hashCode() * 31);
    }
}

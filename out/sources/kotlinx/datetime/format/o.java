package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective;

/* JADX INFO: compiled from: LocalTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends UnsignedIntFieldFormatDirective<C> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Padding f43827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Padding padding) {
        super(TimeFields.f43777a, padding == Padding.f43774c ? 2 : 1, padding == Padding.f43775d ? 2 : null);
        kotlin.jvm.internal.i.e(padding, "padding");
        kotlinx.datetime.internal.format.t<C> tVar = TimeFields.f43777a;
        this.f43827e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (this.f43827e == ((o) obj).f43827e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43827e.hashCode();
    }
}

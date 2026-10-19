package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective;

/* JADX INFO: compiled from: LocalTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends UnsignedIntFieldFormatDirective<C> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Padding f43633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Padding padding) {
        super(TimeFields.f43779c, padding == Padding.f43774c ? 2 : 1, padding == Padding.f43775d ? 2 : null);
        kotlin.jvm.internal.i.e(padding, "padding");
        kotlinx.datetime.internal.format.t<C> tVar = TimeFields.f43777a;
        this.f43633e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            if (this.f43633e == ((B) obj).f43633e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43633e.hashCode();
    }
}

package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective;

/* JADX INFO: compiled from: UtcOffsetFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class K extends UnsignedIntFieldFormatDirective<G> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Padding f43742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Padding padding) {
        super(OffsetFields.f43765a, padding == Padding.f43774c ? 2 : 1, padding == Padding.f43775d ? 2 : null);
        kotlin.jvm.internal.i.e(padding, "padding");
        kotlinx.datetime.internal.format.t<G> tVar = OffsetFields.f43765a;
        this.f43742e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K) {
            if (this.f43742e == ((K) obj).f43742e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43742e.hashCode();
    }
}

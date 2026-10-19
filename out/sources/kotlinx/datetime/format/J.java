package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective;

/* JADX INFO: compiled from: UtcOffsetFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class J extends UnsignedIntFieldFormatDirective<G> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Padding f43741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Padding padding) {
        super(OffsetFields.f43767c, padding == Padding.f43774c ? 2 : 1, padding == Padding.f43775d ? 2 : null);
        kotlin.jvm.internal.i.e(padding, "padding");
        kotlinx.datetime.internal.format.t<G> tVar = OffsetFields.f43765a;
        this.f43741e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J) {
            if (this.f43741e == ((J) obj).f43741e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43741e.hashCode();
    }
}

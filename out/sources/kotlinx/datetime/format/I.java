package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective;

/* JADX INFO: compiled from: UtcOffsetFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class I extends UnsignedIntFieldFormatDirective<G> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Padding f43740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Padding padding) {
        super(OffsetFields.f43766b, padding == Padding.f43774c ? 2 : 1, padding == Padding.f43775d ? 2 : null);
        kotlin.jvm.internal.i.e(padding, "padding");
        kotlinx.datetime.internal.format.t<G> tVar = OffsetFields.f43765a;
        this.f43740e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            if (this.f43740e == ((I) obj).f43740e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43740e.hashCode();
    }
}

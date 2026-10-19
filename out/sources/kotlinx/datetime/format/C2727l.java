package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective;

/* JADX INFO: renamed from: kotlinx.datetime.format.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2727l extends NamedUnsignedIntFieldFormatDirective<InterfaceC2720e> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f43820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2727l(m names) {
        super(DateFields.f43638d, names.f43822a, "dayOfWeekName");
        kotlin.jvm.internal.i.e(names, "names");
        this.f43820d = names;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2727l) && kotlin.jvm.internal.i.a(this.f43820d.f43822a, ((C2727l) obj).f43820d.f43822a);
    }

    public final int hashCode() {
        return this.f43820d.f43822a.hashCode();
    }
}

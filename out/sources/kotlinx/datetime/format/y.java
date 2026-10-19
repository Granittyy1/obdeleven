package kotlinx.datetime.format;

import kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective;

/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends NamedUnsignedIntFieldFormatDirective<InterfaceC2720e> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f43852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z names) {
        super(DateFields.f43636b, names.f43854a, "monthName");
        kotlin.jvm.internal.i.e(names, "names");
        this.f43852d = names;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.i.a(this.f43852d.f43854a, ((y) obj).f43852d.f43854a);
    }

    public final int hashCode() {
        return this.f43852d.f43854a.hashCode();
    }
}

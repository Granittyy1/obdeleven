package kotlinx.datetime.format;

import java.util.Set;
import kotlinx.datetime.internal.format.StringFieldFormatDirective;

/* JADX INFO: compiled from: DateTimeComponents.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class D extends StringFieldFormatDirective<C2721f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f43634c;

    public D(Set<String> set) {
        super(DateTimeComponentsKt.f43660a, set);
        this.f43634c = set;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof D) && kotlin.jvm.internal.i.a(((D) obj).f43634c, this.f43634c);
    }

    public final int hashCode() {
        return this.f43634c.hashCode();
    }
}

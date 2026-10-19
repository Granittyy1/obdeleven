package kotlinx.datetime.format;

import java.util.List;

/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f43821b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f43822a;

    static {
        new m(kotlin.collections.l.s("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        f43821b = new m(kotlin.collections.l.s("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
    }

    public m(List<String> names) {
        kotlin.jvm.internal.i.e(names, "names");
        this.f43822a = names;
        if (names.size() != 7) {
            throw new IllegalArgumentException("Day of week names must contain exactly 7 elements");
        }
    }
}

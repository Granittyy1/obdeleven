package kotlinx.datetime.format;

import java.util.List;

/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f43853b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f43854a;

    static {
        new z(kotlin.collections.l.s("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        f43853b = new z(kotlin.collections.l.s("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public z(List<String> names) {
        kotlin.jvm.internal.i.e(names, "names");
        this.f43854a = names;
        if (names.size() != 12) {
            throw new IllegalArgumentException("Month names must contain exactly 12 elements");
        }
    }
}

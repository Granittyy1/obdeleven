package B7;

import android.content.Context;
import com.google.firebase.messaging.r;
import p228s6.j;

/* JADX INFO: compiled from: LibraryVersionComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: compiled from: LibraryVersionComponent.java */
    public interface a<T> {
        String b(Context context);
    }

    public static p228s6.a<?> a(String str, String str2) {
        B7.a aVar = new B7.a(str, str2);
        p228s6.a.C0531a c0531aA = p228s6.a.a(e.class);
        c0531aA.f46941e = 1;
        c0531aA.f46942f = new r(aVar);
        return c0531aA.b();
    }

    public static p228s6.a<?> b(String str, a<Context> aVar) {
        p228s6.a.C0531a c0531aA = p228s6.a.a(e.class);
        c0531aA.f46941e = 1;
        c0531aA.a(j.b(Context.class));
        c0531aA.f46942f = new f(str, aVar);
        return c0531aA.b();
    }
}

package P8;

import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f4964a = new CopyOnWriteArrayList();

    public static void a(int i10, String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        Iterator it = f4964a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(i10, str, str2);
        }
    }

    public static void b(Throwable th) {
        Iterator it = f4964a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).c(th);
        }
    }

    public static void c(d dVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = f4964a;
        if (copyOnWriteArrayList.contains(dVar)) {
            return;
        }
        copyOnWriteArrayList.add(dVar);
        dVar.a();
    }
}

package p214r3;

import java.util.HashSet;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f46317a = new b();

    public static void a() {
        f46317a.getClass();
    }

    public static void b(String str) {
        f46317a.getClass();
        HashSet hashSet = b.f46316a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f46317a.getClass();
        HashSet hashSet = b.f46316a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }
}

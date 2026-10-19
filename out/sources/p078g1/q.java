package p078g1;

import java.util.HashSet;

/* JADX INFO: compiled from: MediaLibraryInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f35391a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f35392b = "media3.common";

    public static synchronized void a(String str) {
        if (f35391a.add(str)) {
            f35392b += ", " + str;
        }
    }
}

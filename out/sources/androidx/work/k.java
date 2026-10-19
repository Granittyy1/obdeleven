package androidx.work;

import android.util.Log;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f20459a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f20460b;

    /* JADX INFO: compiled from: Logger.java */
    public static class a extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20461c;

        public a(int i10) {
            this.f20461c = i10;
        }

        @Override // androidx.work.k
        public final void a(String str, String str2) {
            if (this.f20461c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.k
        public final void b(String str, String str2, Throwable th) {
            if (this.f20461c <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    public static k c() {
        a aVar;
        synchronized (f20459a) {
            try {
                if (f20460b == null) {
                    f20460b = new a(3);
                }
                aVar = f20460b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static String d(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);
}

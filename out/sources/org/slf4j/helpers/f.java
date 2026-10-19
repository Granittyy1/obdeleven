package org.slf4j.helpers;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f45791a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f45792b = false;

    /* JADX INFO: compiled from: Util.java */
    public static final class a extends SecurityManager {
        @Override // java.lang.SecurityManager
        public final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static final void a(String str) {
        System.err.println("SLF4J: " + str);
    }
}

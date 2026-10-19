package p031c5;

import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f22333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f22334b;

    /* JADX WARN: Code duplicated, block: B:53:0x00a4 A[Catch: all -> 0x00a0, PHI: r1
      0x00a4: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v18 java.lang.Thread) binds: [B:7:0x000a, B:47:0x009d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x009b, B:61:0x00c3, B:12:0x001f, B:52:0x00a3, B:53:0x00a4, B:64:0x00c7, B:65:0x00c8, B:54:0x00a5, B:60:0x00c2, B:59:0x00af, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x0099, B:18:0x003c), top: B:70:0x0003, inners: #3, #6 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader a() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        if (f22333a == null) {
            Thread thread2 = f22334b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f22334b.getContextClassLoader();
                    } catch (SecurityException e11) {
                        new StringBuilder(String.valueOf(e11.getMessage()).length() + 41);
                    }
                }
                f22333a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        c cVar = new c(threadGroup, "GmsDynamite");
                                        try {
                                            cVar.setContextClassLoader(null);
                                            cVar.start();
                                            thread = cVar;
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                            thread = cVar;
                                            new StringBuilder(String.valueOf(e10.getMessage()).length() + 39);
                                        }
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                    }
                                }
                            } catch (SecurityException e14) {
                                e10 = e14;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f22334b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f22334b.getContextClassLoader();
                    }
                }
                f22333a = contextClassLoader;
            }
        }
        return f22333a;
    }
}

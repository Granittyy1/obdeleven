package cc;

import com.voltasit.obdeleven.domain.usecases.device.v;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.NOPLogger;
import org.slf4j.helpers.d;
import org.slf4j.helpers.e;
import org.slf4j.helpers.f;

/* JADX INFO: compiled from: LoggerFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f22683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f22684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final org.slf4j.helpers.b f22685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f22686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile ec.a f22687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f22688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f22689g;

    static {
        String property;
        e eVar = new e();
        eVar.f45790a = new d();
        new ConcurrentHashMap();
        new org.slf4j.helpers.a();
        f22684b = eVar;
        org.slf4j.helpers.b bVar = new org.slf4j.helpers.b();
        bVar.f45779a = new v();
        new ConcurrentHashMap();
        f22685c = bVar;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f22686d = property == null ? false : property.equalsIgnoreCase("true");
        f22688f = new String[]{"1.8", "1.7"};
        f22689g = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static void a() {
        e eVar = f22684b;
        synchronized (eVar) {
            try {
                eVar.f45790a.f45787a = true;
                d dVar = eVar.f45790a;
                dVar.getClass();
                for (org.slf4j.helpers.c cVar : new ArrayList(dVar.f45788b.values())) {
                    cVar.f45781c = c(cVar.f45780b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static b b(Class<?> cls) {
        int i10;
        b bVarC = c(cls.getName());
        if (f22686d) {
            f.a aVar = f.f45791a;
            Class<?> cls2 = null;
            if (aVar == null) {
                if (f.f45792b) {
                    aVar = null;
                } else {
                    try {
                        aVar = new f.a();
                    } catch (SecurityException unused) {
                        aVar = null;
                    }
                    f.f45791a = aVar;
                    f.f45792b = true;
                }
            }
            if (aVar != null) {
                Class<?>[] classContext = aVar.getClassContext();
                String name = f.class.getName();
                int i11 = 0;
                while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
                    i11++;
                }
                if (i11 >= classContext.length || (i10 = i11 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i10];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                f.a("Detected logger name mismatch. Given name: \"" + bVarC.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                f.a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return bVarC;
    }

    public static b c(String str) {
        ec.a aVar;
        if (f22683a == 0) {
            synchronized (c.class) {
                try {
                    if (f22683a == 0) {
                        f22683a = 1;
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i10 = f22683a;
        if (i10 == 1) {
            aVar = f22684b;
        } else {
            if (i10 == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i10 == 3) {
                aVar = f22687e;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                aVar = f22685c;
            }
        }
        return aVar.b().a(str);
    }

    public static final void d() {
        try {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(ec.a.class);
            ArrayList arrayList = new ArrayList();
            Iterator it = serviceLoaderLoad.iterator();
            while (it.hasNext()) {
                arrayList.add((ec.a) it.next());
            }
            g(arrayList);
            if (arrayList.isEmpty()) {
                f22683a = 4;
                f.a("No SLF4J providers were found.");
                f.a("Defaulting to no-operation (NOP) logger implementation");
                f.a("See http://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = c.class.getClassLoader();
                    String str = f22689g;
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e10) {
                    PrintStream printStream = System.err;
                    printStream.println("Error getting resources from path");
                    printStream.println("Reported exception:");
                    e10.printStackTrace();
                }
                f(linkedHashSet);
            } else {
                f22687e = (ec.a) arrayList.get(0);
                f22687e.getClass();
                f22683a = 3;
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    f.a("Actual provider is of type [" + arrayList.get(0) + "]");
                }
                a();
                e();
                d dVar = f22684b.f45790a;
                dVar.f45788b.clear();
                dVar.f45789c.clear();
            }
            if (f22683a == 3) {
                try {
                    String strA = f22687e.a();
                    boolean z10 = false;
                    for (String str2 : f22688f) {
                        if (strA.startsWith(str2)) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        return;
                    }
                    f.a("The requested version " + strA + " by your slf4j binding is not compatible with " + Arrays.asList(f22688f).toString());
                    f.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
                } catch (NoSuchFieldError unused) {
                } catch (Throwable th) {
                    PrintStream printStream2 = System.err;
                    printStream2.println("Unexpected problem occured during version sanity check");
                    printStream2.println("Reported exception:");
                    th.printStackTrace();
                }
            }
        } catch (Exception e11) {
            f22683a = 2;
            PrintStream printStream3 = System.err;
            printStream3.println("Failed to instantiate SLF4J LoggerFactory");
            printStream3.println("Reported exception:");
            e11.printStackTrace();
            throw new IllegalStateException("Unexpected initialization failure", e11);
        }
    }

    public static void e() {
        LinkedBlockingQueue<dc.c> linkedBlockingQueue = f22684b.f45790a.f45789c;
        int size = linkedBlockingQueue.size();
        ArrayList<dc.c> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (dc.c cVar : arrayList) {
                if (cVar != null) {
                    org.slf4j.helpers.c cVar2 = cVar.f34703a;
                    String str = cVar2.f45780b;
                    if (cVar2.f45781c == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(cVar2.f45781c instanceof NOPLogger)) {
                        if (!cVar2.d()) {
                            f.a(str);
                        } else if (cVar2.d()) {
                            try {
                                cVar2.f45783e.invoke(cVar2.f45781c, cVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i11 = i10 + 1;
                if (i10 == 0) {
                    if (cVar.f34703a.d()) {
                        f.a("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        f.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        f.a("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(cVar.f34703a.f45781c instanceof NOPLogger)) {
                        f.a("The following set of substitute loggers may have been accessed");
                        f.a("during the initialization phase. Logging calls during this");
                        f.a("phase were not honored. However, subsequent logging calls to these");
                        f.a("loggers will work as normally expected.");
                        f.a("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        f.a("Class path contains SLF4J bindings targeting slf4j-api versions prior to 1.8.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            f.a("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        f.a("See http://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            f.a("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.a("Found provider [" + ((ec.a) it.next()) + "]");
            }
            f.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}

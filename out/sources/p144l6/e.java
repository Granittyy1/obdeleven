package p144l6;

import B7.b;
import T4.ComponentCallbacks2C0769b;
import U4.C0803k;
import U4.C0804l;
import Y4.f;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import androidx.collection.C0873a;
import androidx.compose.foundation.gestures.d;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.provider.FirebaseInitProvider;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p168n7.a;
import p228s6.h;
import p228s6.l;
import p271w0.k;

/* JADX INFO: compiled from: FirebaseApp.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f44386k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0873a f44387l = new C0873a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f44390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f44391d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l<p168n7.a> f44394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p096h7.b<com.google.firebase.heartbeatinfo.a> f44395h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f44392e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f44393f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f44396i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: FirebaseApp.java */
    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: compiled from: FirebaseApp.java */
    public static class b implements ComponentCallbacks2C0769b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicReference<b> f44397a = new AtomicReference<>();

        @Override // T4.ComponentCallbacks2C0769b.a
        public final void a(boolean z10) {
            synchronized (e.f44386k) {
                try {
                    for (e eVar : new ArrayList(e.f44387l.values())) {
                        if (eVar.f44392e.get()) {
                            Iterator it = eVar.f44396i.iterator();
                            while (it.hasNext()) {
                                ((a) it.next()).a(z10);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: FirebaseApp.java */
    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AtomicReference<c> f44398b = new AtomicReference<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f44399a;

        public c(Context context) {
            this.f44399a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (e.f44386k) {
                try {
                    Iterator it = ((C0873a.e) e.f44387l.values()).iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f44399a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public e(final Context context, String str, f fVar) {
        ?? arrayList;
        this.f44388a = context;
        C0804l.e(str);
        this.f44389b = str;
        this.f44390c = fVar;
        p144l6.a aVar = FirebaseInitProvider.f28543b;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new p096h7.b() { // from class: s6.c
                @Override // p096h7.b
                public final Object get() {
                    String str4 = str3;
                    try {
                        Class<?> cls = Class.forName(str4);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                        }
                        throw new InvalidRegistrarException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                    } catch (ClassNotFoundException unused2) {
                        return null;
                    } catch (IllegalAccessException e10) {
                        throw new InvalidRegistrarException(d.b("Could not instantiate ", str4, "."), e10);
                    } catch (InstantiationException e11) {
                        throw new InvalidRegistrarException(d.b("Could not instantiate ", str4, "."), e11);
                    } catch (NoSuchMethodException e12) {
                        throw new InvalidRegistrarException(b.c("Could not instantiate ", str4), e12);
                    } catch (InvocationTargetException e13) {
                        throw new InvalidRegistrarException(b.c("Could not instantiate ", str4), e13);
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        UiExecutor uiExecutor = UiExecutor.f28070b;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new p096h7.b() { // from class: s6.g
            @Override // p096h7.b
            public final Object get() {
                return firebaseCommonRegistrar;
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new p096h7.b() { // from class: s6.g
            @Override // p096h7.b
            public final Object get() {
                return executorsRegistrar;
            }
        });
        arrayList4.add(p228s6.a.c(context, Context.class, new Class[0]));
        arrayList4.add(p228s6.a.c(this, e.class, new Class[0]));
        arrayList4.add(p228s6.a.c(fVar, f.class, new Class[0]));
        H7.b bVar = new H7.b();
        if (k.a(context) && FirebaseInitProvider.f28544c.get()) {
            arrayList4.add(p228s6.a.c(aVar, g.class, new Class[0]));
        }
        h hVar = new h(arrayList3, arrayList4, bVar);
        this.f44391d = hVar;
        Trace.endSection();
        this.f44394g = new l<>(new p096h7.b() { // from class: l6.c
            @Override // p096h7.b
            public final Object get() {
                e eVar = this.f44383a;
                return new a(context, eVar.d(), (P6.c) eVar.f44391d.a(P6.c.class));
            }
        });
        this.f44395h = hVar.d(com.google.firebase.heartbeatinfo.a.class);
        a aVar2 = new a() { // from class: l6.d
            @Override // l6.e.a
            public final void a(boolean z10) {
                e eVar = this.f44385a;
                if (z10) {
                    eVar.getClass();
                } else {
                    eVar.f44395h.get().c();
                }
            }
        };
        a();
        if (this.f44392e.get() && ComponentCallbacks2C0769b.f5916f.f5917b.get()) {
            aVar2.a(true);
        }
        this.f44396i.add(aVar2);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e c() {
        e eVar;
        synchronized (f44386k) {
            try {
                eVar = (e) f44387l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + f.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                eVar.f44395h.get().c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static e f(Context context, f fVar) {
        e eVar;
        AtomicReference<b> atomicReference = b.f44397a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f44397a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                do {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        ComponentCallbacks2C0769b.b(application);
                        ComponentCallbacks2C0769b.f5916f.a(bVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f44386k) {
            C0873a c0873a = f44387l;
            C0804l.j("FirebaseApp name [DEFAULT] already exists!", !c0873a.containsKey("[DEFAULT]"));
            C0804l.i(context, "Application context cannot be null.");
            eVar = new e(context, "[DEFAULT]", fVar);
            c0873a.put("[DEFAULT]", eVar);
        }
        eVar.e();
        return eVar;
    }

    public final void a() {
        C0804l.j("FirebaseApp was deleted", !this.f44393f.get());
    }

    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.f44391d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f44389b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f44390c.f44401b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void e() {
        HashMap map;
        if (!k.a(this.f44388a)) {
            a();
            Context context = this.f44388a;
            AtomicReference<c> atomicReference = c.f44398b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        h hVar = this.f44391d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f44389b);
        AtomicReference<Boolean> atomicReference2 = hVar.f46955f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                this.f44395h.get().c();
            }
        }
        synchronized (hVar) {
            map = new HashMap(hVar.f46950a);
        }
        hVar.i(map, zEquals);
        this.f44395h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.a();
        return this.f44389b.equals(eVar.f44389b);
    }

    public final boolean g() {
        boolean z10;
        a();
        p168n7.a aVar = this.f44394g.get();
        synchronized (aVar) {
            z10 = aVar.f44975b;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f44389b.hashCode();
    }

    public final String toString() {
        C0803k.a aVar = new C0803k.a(this);
        aVar.a(this.f44389b, "name");
        aVar.a(this.f44390c, "options");
        return aVar.toString();
    }
}

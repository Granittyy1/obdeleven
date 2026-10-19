package com.bumptech.glide;

import B3.m;
import E3.h;
import H3.g;
import H3.v;
import H3.w;
import H3.x;
import H3.y;
import H3.z;
import K3.k;
import K3.o;
import K3.p;
import K3.r;
import K3.s;
import O3.j;
import Q3.i;
import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.collection.C0873a;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import com.braze.support.BrazeLogger;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.google.android.gms.internal.measurement.M1;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Glide.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {
    public static volatile b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile boolean f24469k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E3.c f24470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F3.f f24471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f24472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Registry f24473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f24474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f24475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q3.d f24476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f24477i = new ArrayList();

    public b(Context context, com.bumptech.glide.load.engine.c cVar, F3.f fVar, E3.c cVar2, h hVar, i iVar, Q3.d dVar, int i10, M1 m7, C0873a c0873a, List list) {
        this.f24470b = cVar2;
        this.f24474f = hVar;
        this.f24471c = fVar;
        this.f24475g = iVar;
        this.f24476h = dVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f24473e = registry;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        S3.b bVar = registry.f24466g;
        synchronized (bVar) {
            bVar.f5486a.add(defaultImageHeaderParser);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            k kVar = new k();
            S3.b bVar2 = registry.f24466g;
            synchronized (bVar2) {
                bVar2.f5486a.add(kVar);
            }
        }
        ArrayList arrayListE = registry.e();
        O3.a aVar = new O3.a(context, arrayListE, cVar2, hVar);
        s sVar = new s(cVar2, new s.g());
        com.bumptech.glide.load.resource.bitmap.a aVar2 = new com.bumptech.glide.load.resource.bitmap.a(registry.e(), resources.getDisplayMetrics(), cVar2, hVar);
        K3.f fVar2 = new K3.f(aVar2);
        com.bumptech.glide.load.resource.bitmap.c cVar3 = new com.bumptech.glide.load.resource.bitmap.c(aVar2, hVar);
        M3.d dVar2 = new M3.d(context);
        v.c cVar4 = new v.c(resources);
        v.d dVar3 = new v.d(resources);
        v.b bVar3 = new v.b(resources);
        v.a aVar3 = new v.a(resources);
        K3.c cVar5 = new K3.c(hVar);
        P3.a aVar4 = new P3.a();
        P3.d dVar4 = new P3.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new H3.c());
        registry.a(InputStream.class, new F3.e(hVar));
        registry.d("Bitmap", ByteBuffer.class, Bitmap.class, fVar2);
        registry.d("Bitmap", InputStream.class, Bitmap.class, cVar3);
        registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new o(aVar2));
        registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, sVar);
        registry.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new s(cVar2, new s.c()));
        x.a<?> aVar5 = x.a.f3700a;
        registry.c(Bitmap.class, Bitmap.class, aVar5);
        registry.d("Bitmap", Bitmap.class, Bitmap.class, new r());
        registry.b(Bitmap.class, cVar5);
        registry.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new K3.a(resources, fVar2));
        registry.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new K3.a(resources, cVar3));
        registry.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new K3.a(resources, sVar));
        registry.b(BitmapDrawable.class, new K3.b(cVar2, cVar5));
        registry.d("Gif", InputStream.class, O3.c.class, new j(arrayListE, aVar, hVar));
        registry.d("Gif", ByteBuffer.class, O3.c.class, aVar);
        registry.b(O3.c.class, new O3.d());
        registry.c(p310z3.a.class, p310z3.a.class, aVar5);
        registry.d("Bitmap", p310z3.a.class, Bitmap.class, new O3.h(cVar2));
        registry.d("legacy_append", Uri.class, Drawable.class, dVar2);
        registry.d("legacy_append", Uri.class, Bitmap.class, new p(dVar2, cVar2));
        registry.g(new L3.a.C0065a());
        registry.c(File.class, ByteBuffer.class, new H3.d.b());
        registry.c(File.class, InputStream.class, new H3.f.e(new H3.h()));
        registry.d("legacy_append", File.class, File.class, new N3.a());
        registry.c(File.class, ParcelFileDescriptor.class, new H3.f.b(new g()));
        registry.c(File.class, File.class, aVar5);
        registry.g(new B3.k.a(hVar));
        registry.g(new m.a());
        Class cls = Integer.TYPE;
        registry.c(cls, InputStream.class, cVar4);
        registry.c(cls, ParcelFileDescriptor.class, bVar3);
        registry.c(Integer.class, InputStream.class, cVar4);
        registry.c(Integer.class, ParcelFileDescriptor.class, bVar3);
        registry.c(Integer.class, Uri.class, dVar3);
        registry.c(cls, AssetFileDescriptor.class, aVar3);
        registry.c(Integer.class, AssetFileDescriptor.class, aVar3);
        registry.c(cls, Uri.class, dVar3);
        registry.c(String.class, InputStream.class, new H3.e.b());
        registry.c(Uri.class, InputStream.class, new H3.e.b());
        registry.c(String.class, InputStream.class, new w.c());
        registry.c(String.class, ParcelFileDescriptor.class, new w.b());
        registry.c(String.class, AssetFileDescriptor.class, new w.a());
        registry.c(Uri.class, InputStream.class, new I3.b.a());
        registry.c(Uri.class, InputStream.class, new H3.a.c(context.getAssets()));
        registry.c(Uri.class, ParcelFileDescriptor.class, new H3.a.b(context.getAssets()));
        registry.c(Uri.class, InputStream.class, new I3.c.a(context));
        registry.c(Uri.class, InputStream.class, new I3.d.a(context));
        if (i11 >= 29) {
            registry.c(Uri.class, InputStream.class, new I3.e.c(context, InputStream.class));
            registry.c(Uri.class, ParcelFileDescriptor.class, new I3.e.b(context, ParcelFileDescriptor.class));
        }
        registry.c(Uri.class, InputStream.class, new y.d(contentResolver));
        registry.c(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver));
        registry.c(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver));
        registry.c(Uri.class, InputStream.class, new z.a());
        registry.c(URL.class, InputStream.class, new I3.h.a());
        registry.c(Uri.class, File.class, new H3.m.a(context));
        registry.c(H3.i.class, InputStream.class, new I3.a.C0048a());
        registry.c(byte[].class, ByteBuffer.class, new H3.b.a());
        registry.c(byte[].class, InputStream.class, new H3.b.d());
        registry.c(Uri.class, Uri.class, aVar5);
        registry.c(Drawable.class, Drawable.class, aVar5);
        registry.d("legacy_append", Drawable.class, Drawable.class, new M3.e());
        registry.h(Bitmap.class, BitmapDrawable.class, new P3.b(0, resources));
        registry.h(Bitmap.class, byte[].class, aVar4);
        registry.h(Drawable.class, byte[].class, new P3.c(cVar2, aVar4, dVar4));
        registry.h(O3.c.class, byte[].class, dVar4);
        s sVar2 = new s(cVar2, new s.d());
        registry.d("legacy_append", ByteBuffer.class, Bitmap.class, sVar2);
        registry.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new K3.a(resources, sVar2));
        this.f24472d = new c(context, hVar, registry, new P3.d(), m7, c0873a, list, cVar, i10);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f24469k) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f24469k = true;
        C0873a c0873a = new C0873a();
        M1 m7 = new M1();
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        Log.isLoggable("ManifestParser", 3);
        ArrayList<R3.b> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
            } else {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(R3.d.a(str));
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
                Set<Class<?>> setA = generatedAppGlideModule.a();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    R3.b bVar = (R3.b) it.next();
                    if (setA.contains(bVar.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            bVar.toString();
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((R3.b) it2.next()).getClass().toString();
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((R3.b) it3.next()).b();
            }
            if (G3.a.f3369d == 0) {
                G3.a.f3369d = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i10 = G3.a.f3369d;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            G3.a aVar = new G3.a(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new G3.a.ThreadFactoryC0038a("source", false)));
            int i11 = G3.a.f3369d;
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            G3.a aVar2 = new G3.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new G3.a.ThreadFactoryC0038a("disk-cache", true)));
            if (G3.a.f3369d == 0) {
                G3.a.f3369d = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i12 = G3.a.f3369d >= 4 ? 2 : 1;
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            G3.a aVar3 = new G3.a(new ThreadPoolExecutor(i12, i12, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new G3.a.ThreadFactoryC0038a("animation", true)));
            F3.g gVar = new F3.g(new F3.g.a(applicationContext));
            Q3.d dVar = new Q3.d();
            int i13 = gVar.f3223a;
            E3.c iVar = i13 > 0 ? new E3.i(i13) : new E3.d();
            h hVar = new h(gVar.f3225c);
            F3.f fVar = new F3.f(gVar.f3224b);
            b bVar2 = new b(applicationContext, new com.bumptech.glide.load.engine.c(fVar, new F3.e(new F3.d(applicationContext)), aVar2, aVar, new G3.a(new ThreadPoolExecutor(0, BrazeLogger.SUPPRESS, G3.a.f3368c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new G3.a.ThreadFactoryC0038a("source-unlimited", false))), aVar3), fVar, iVar, hVar, new i(), dVar, 4, m7, c0873a, Collections.emptyList());
            for (R3.b bVar3 : arrayList) {
                try {
                    bVar3.a();
                } catch (AbstractMethodError e10) {
                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(bVar3.getClass().getName()), e10);
                }
            }
            applicationContext.registerComponentCallbacks(bVar2);
            j = bVar2;
            f24469k = false;
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
        }
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (j == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                Log.isLoggable("Glide", 5);
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                try {
                    if (j == null) {
                        a(context, generatedAppGlideModule);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public static i c(Context context) {
        M1.d(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f24475g;
    }

    public static e d(View view) {
        i iVarC = c(view.getContext());
        iVarC.getClass();
        if (X3.j.g()) {
            return iVarC.e(view.getContext().getApplicationContext());
        }
        M1.d(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = i.a(view.getContext());
        if (activityA == null) {
            return iVarC.e(view.getContext().getApplicationContext());
        }
        Fragment fragment = null;
        if (activityA instanceof ActivityC1347l) {
            ActivityC1347l activityC1347l = (ActivityC1347l) activityA;
            C0873a<View, Fragment> c0873a = iVarC.f5082g;
            c0873a.clear();
            i.c(activityC1347l.getSupportFragmentManager().f17676c.f(), c0873a);
            View viewFindViewById = activityC1347l.findViewById(R.id.content);
            while (!view.equals(viewFindViewById) && (fragment = c0873a.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            c0873a.clear();
            return fragment != null ? iVarC.f(fragment) : iVarC.g(activityC1347l);
        }
        C0873a<View, android.app.Fragment> c0873a2 = iVarC.f5083h;
        c0873a2.clear();
        i.b(activityA.getFragmentManager(), c0873a2);
        View viewFindViewById2 = activityA.findViewById(R.id.content);
        android.app.Fragment fragment2 = null;
        while (!view.equals(viewFindViewById2) && (fragment2 = c0873a2.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        c0873a2.clear();
        if (fragment2 != null) {
            if (fragment2.getActivity() != null) {
                return !X3.j.g() ? iVarC.d(fragment2.getActivity(), fragment2.getChildFragmentManager(), fragment2, fragment2.isVisible()) : iVarC.e(fragment2.getActivity().getApplicationContext());
            }
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (X3.j.g()) {
            return iVarC.e(activityA.getApplicationContext());
        }
        if (activityA.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return iVarC.d(activityA, activityA.getFragmentManager(), null, i.j(activityA));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        char[] cArr = X3.j.f7214a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        this.f24471c.e(0L);
        this.f24470b.e();
        this.f24474f.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        long j10;
        char[] cArr = X3.j.f7214a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        Iterator it = this.f24477i.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
        F3.f fVar = this.f24471c;
        fVar.getClass();
        if (i10 >= 40) {
            fVar.e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (fVar) {
                j10 = fVar.f7208b;
            }
            fVar.e(j10 / 2);
        }
        this.f24470b.a(i10);
        h hVar = this.f24474f;
        synchronized (hVar) {
            try {
                if (i10 >= 40) {
                    hVar.a();
                } else if (i10 >= 20 || i10 == 15) {
                    hVar.c(hVar.f3059e / 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}

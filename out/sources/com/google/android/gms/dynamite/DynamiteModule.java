package com.google.android.gms.dynamite;

import U4.C0803k;
import U4.C0804l;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p031c5.e;
import p031c5.f;
import p031c5.g;
import p031c5.h;
import p031c5.i;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f25337d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f25338e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f25339f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f25340g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f25341h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static h f25344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static i f25345m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25346a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f25342i = new ThreadLocal();
    public static final f j = new f();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.a f25343k = new com.google.android.gms.dynamite.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f25335b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f25336c = new c();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class LoadingException extends Exception {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface a {

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        public interface InterfaceC0266a {
            int a(Context context, String str, boolean z10) throws LoadingException;

            int b(Context context, String str);
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f25347a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f25348b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f25349c = 0;
        }

        b a(Context context, String str, InterfaceC0266a interfaceC0266a) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        this.f25346a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(str.length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (C0803k.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(str.length() + 45);
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Not initialized variable reg: 22, insn: 0x022a: MOVE (r10 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]) (LINE:555), block:B:128:0x022a */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:73:0x0150
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context r23, com.google.android.gms.dynamite.DynamiteModule.a r24, java.lang.String r25) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$a, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0169  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af A[Catch: all -> 0x0037, TryCatch #9 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b8, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0097, B:43:0x009f, B:38:0x0072, B:40:0x0078, B:41:0x0089, B:46:0x00a2, B:49:0x00a5, B:50:0x00af, B:17:0x003f), top: B:144:0x0027, inners: #10 }] */
    public static int d(Context context, String str, boolean z10) {
        Throwable th;
        RemoteException e10;
        int i10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f25337d;
                boolean z11 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (f25339f) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z10, true);
                                                String str2 = f25338e;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = p031c5.d.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            p031c5.b.a();
                                                            String str3 = f25338e;
                                                            C0804l.h(str3);
                                                            classLoaderA = p031c5.a.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f25338e;
                                                            C0804l.h(str4);
                                                            classLoaderA = new e(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    g(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    f25337d = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f25337d = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        new StringBuilder(e11.toString().length() + 30);
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z10, false);
                    } catch (LoadingException e12) {
                        new StringBuilder(String.valueOf(e12.getMessage()).length() + 42);
                        return 0;
                    }
                }
                h hVarH = h(context);
                try {
                    if (hVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelE = hVarH.e(hVarH.g(), 6);
                        int i11 = parcelE.readInt();
                        parcelE.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = f25342i;
                            g gVar = (g) threadLocal.get();
                            if (gVar != null && (cursor = gVar.f22335a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) p018b5.b.b0(hVarH.d0(new p018b5.b(context), str, z10, ((Long) j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 > 0) {
                                            g gVar2 = (g) threadLocal.get();
                                            if (gVar2 == null || gVar2.f22335a != null) {
                                                z11 = false;
                                            } else {
                                                gVar2.f22335a = cursor3;
                                            }
                                            cursor2 = z11 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e13) {
                                    e10 = e13;
                                    cursor2 = cursor3;
                                    new StringBuilder(String.valueOf(e10.getMessage()).length() + 42);
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            p018b5.b bVar = new p018b5.b(context);
                            Parcel parcelG = hVarH.g();
                            com.google.android.gms.internal.common.e.b(parcelG, bVar);
                            parcelG.writeString(str);
                            parcelG.writeInt(z10 ? 1 : 0);
                            Parcel parcelE2 = hVarH.e(parcelG, 5);
                            i10 = parcelE2.readInt();
                            parcelE2.recycle();
                        } else {
                            p018b5.b bVar2 = new p018b5.b(context);
                            Parcel parcelG2 = hVarH.g();
                            com.google.android.gms.internal.common.e.b(parcelG2, bVar2);
                            parcelG2.writeString(str);
                            parcelG2.writeInt(z10 ? 1 : 0);
                            Parcel parcelE3 = hVarH.e(parcelG2, 3);
                            i10 = parcelE3.readInt();
                            parcelE3.recycle();
                        }
                        return i10;
                    } catch (RemoteException e14) {
                        e10 = e14;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                C0804l.h(context);
            } catch (Exception e15) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e15);
            }
            throw th5;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f25341h)) {
            return true;
        }
        boolean z10 = false;
        if (f25341h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (com.google.android.gms.common.a.f25299b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f25341h = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f25339f = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x013c A[PHI: r4
      0x013c: PHI (r4v2 boolean) = (r4v1 boolean), (r4v4 boolean) binds: [B:59:0x00f4, B:84:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    public static int f(Context context, String str, boolean z10, boolean z11) throws Throwable {
        MatrixCursor matrixCursor;
        boolean z12;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z13 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? MetricTracker.Place.API : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) j.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z14 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr[i11] = null;
                                        } else if (type == 1) {
                                            objArr[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th) {
                                try {
                                    cursorQuery.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        matrixCursor = null;
                    } catch (Throwable th3) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f25338e = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f25340g = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z12 = matrixCursor.getInt(columnIndex2) != 0;
                                            f25339f = z12;
                                        } else {
                                            z12 = false;
                                        }
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                                g gVar = (g) f25342i.get();
                                if (gVar == null || gVar.f22335a != null) {
                                    z13 = false;
                                } else {
                                    gVar.f22335a = matrixCursor;
                                }
                                z14 = z12;
                                matrixCursor2 = z13 ? null : matrixCursor;
                            }
                            if (z11 && z14) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i12;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        String message = e.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb2.append("V2 version check failed: ");
                        sb2.append(message);
                        throw new LoadingException(sb2.toString(), e);
                    } catch (Throwable th5) {
                        th = th5;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 != null) {
                            matrixCursor2.close();
                        }
                        throw th;
                    }
                }
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void g(ClassLoader classLoader) throws LoadingException {
        try {
            i iVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f25345m = iVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    public static h h(Context context) {
        h hVar;
        synchronized (DynamiteModule.class) {
            h hVar2 = f25344l;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (hVar != null) {
                    f25344l = hVar;
                    return hVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws LoadingException {
        try {
            return (IBinder) this.f25346a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}

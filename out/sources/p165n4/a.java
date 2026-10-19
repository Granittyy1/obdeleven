package p165n4;

import Z3.I;
import Z3.q;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.FacebookException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AttributionIdentifiers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f44866f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44871e;

    /* JADX INFO: renamed from: n4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    public static final class C0509a {
        /* JADX WARN: Code duplicated, block: B:105:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:26:0x0078  */
        /* JADX WARN: Code duplicated, block: B:58:0x011e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:59:0x0120 A[Catch: all -> 0x00e8, Exception -> 0x00eb, TryCatch #8 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:40:0x00c4, B:42:0x00d2, B:44:0x00d6, B:52:0x00ed, B:54:0x0107, B:56:0x0116, B:63:0x0137, B:68:0x0149, B:70:0x014d, B:72:0x0156, B:66:0x013f, B:59:0x0120, B:61:0x012f, B:96:0x01b8, B:97:0x01bf), top: B:114:0x00c4 }] */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        /* JADX WARN: Code duplicated, block: B:61:0x012f A[Catch: all -> 0x00e8, Exception -> 0x00eb, TryCatch #8 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:40:0x00c4, B:42:0x00d2, B:44:0x00d6, B:52:0x00ed, B:54:0x0107, B:56:0x0116, B:63:0x0137, B:68:0x0149, B:70:0x014d, B:72:0x0156, B:66:0x013f, B:59:0x0120, B:61:0x012f, B:96:0x01b8, B:97:0x01bf), top: B:114:0x00c4 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v0, types: [android.content.Context, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r5v2 */
        public static a a(Context context) {
            a aVar;
            Cursor cursorQuery;
            Uri uri;
            String str;
            Uri uri2;
            Method methodQ;
            Object objT;
            ?? r10 = 0;
            try {
                if (!b(context) || (methodQ = s.q("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objT = s.t(null, methodQ, context)) == null) {
                    aVar = null;
                } else {
                    Method methodP = s.p(objT.getClass(), "getId", new Class[0]);
                    Method methodP2 = s.p(objT.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (methodP == null || methodP2 == null) {
                        aVar = null;
                    } else {
                        aVar = new a();
                        aVar.f44867a = (String) s.t(objT, methodP, new Object[0]);
                        Boolean bool = (Boolean) s.t(objT, methodP2, new Object[0]);
                        aVar.f44871e = bool == null ? false : bool.booleanValue();
                    }
                }
            } catch (Exception unused) {
                q qVar = q.f7852a;
            }
            if (aVar == null) {
                if (b(context)) {
                    c cVar = new c();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        try {
                            if (context.bindService(intent, cVar, 1)) {
                                try {
                                    b bVar = new b(cVar.a());
                                    a aVar2 = new a();
                                    aVar2.f44867a = bVar.e();
                                    aVar2.f44871e = bVar.g();
                                    context.unbindService(cVar);
                                    aVar = aVar2;
                                } catch (Exception unused2) {
                                    q qVar2 = q.f7852a;
                                    context.unbindService(cVar);
                                    aVar = null;
                                }
                            } else {
                                aVar = null;
                            }
                        } catch (Throwable th) {
                            context.unbindService(cVar);
                            throw th;
                        }
                    } catch (SecurityException unused3) {
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a();
                }
            }
            try {
                try {
                    if (i.a(Looper.myLooper(), Looper.getMainLooper())) {
                        throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                    }
                    a aVar3 = a.f44866f;
                    if (aVar3 != null && System.currentTimeMillis() - aVar3.f44868b < 3600000) {
                        return aVar3;
                    }
                    String[] strArr = {"aid", "androidid", "limit_tracking"};
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                    ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                    if (providerInfoResolveContentProvider != null) {
                        HashSet<String> hashSet = g.f44886a;
                        String str2 = providerInfoResolveContentProvider.packageName;
                        i.d(str2, "contentProviderInfo.packageName");
                        if (g.a(context, str2)) {
                            uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                        } else {
                            if (providerInfoResolveContentProvider2 != null) {
                                HashSet<String> hashSet2 = g.f44886a;
                                str = providerInfoResolveContentProvider2.packageName;
                                i.d(str, "wakizashiProviderInfo.packageName");
                                if (g.a(context, str)) {
                                    uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                }
                            }
                            uri = null;
                        }
                        uri = uri2;
                    } else {
                        if (providerInfoResolveContentProvider2 != null) {
                            HashSet<String> hashSet3 = g.f44886a;
                            str = providerInfoResolveContentProvider2.packageName;
                            i.d(str, "wakizashiProviderInfo.packageName");
                            if (g.a(context, str)) {
                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                uri = uri2;
                            }
                        }
                        uri = null;
                    }
                    PackageManager packageManager = context.getPackageManager();
                    String installerPackageName = packageManager == null ? null : packageManager.getInstallerPackageName(context.getPackageName());
                    if (installerPackageName != null) {
                        aVar.f44870d = installerPackageName;
                    }
                    if (uri == null) {
                        aVar.f44868b = System.currentTimeMillis();
                        a.f44866f = aVar;
                        return aVar;
                    }
                    cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("aid");
                                int columnIndex2 = cursorQuery.getColumnIndex("androidid");
                                int columnIndex3 = cursorQuery.getColumnIndex("limit_tracking");
                                aVar.f44869c = cursorQuery.getString(columnIndex);
                                if (columnIndex2 > 0 && columnIndex3 > 0 && aVar.a() == null) {
                                    aVar.f44867a = cursorQuery.getString(columnIndex2);
                                    aVar.f44871e = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                                }
                                cursorQuery.close();
                                aVar.f44868b = System.currentTimeMillis();
                                a.f44866f = aVar;
                                return aVar;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            i.k(e, "Caught unexpected exception in getAttributionId(): ");
                            q qVar3 = q.f7852a;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                    }
                    aVar.f44868b = System.currentTimeMillis();
                    a.f44866f = aVar;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    r10 = context;
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        }

        public static boolean b(Context context) {
            Method methodQ = s.q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodQ == null) {
                return false;
            }
            Object objT = s.t(null, methodQ, context);
            return (objT instanceof Integer) && i.a(objT, 0);
        }
    }

    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    public static final class b implements IInterface {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IBinder f44872c;

        public b(IBinder iBinder) {
            this.f44872c = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f44872c;
        }

        public final String e() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            i.d(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            i.d(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f44872c.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean g() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            i.d(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            i.d(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f44872c.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public final String a() {
        if (q.f7866p.get()) {
            I.f7769a.getClass();
            I.c();
            if (I.f7774f.a()) {
                return this.f44867a;
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    public static final class c implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f44873b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkedBlockingDeque f44874c = new LinkedBlockingDeque();

        public final IBinder a() throws InterruptedException {
            if (this.f44873b.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            Object objTake = this.f44874c.take();
            i.d(objTake, "queue.take()");
            return (IBinder) objTake;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f44874c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}

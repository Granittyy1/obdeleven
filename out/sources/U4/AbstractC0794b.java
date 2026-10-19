package U4;

import S4.C0760b;
import S4.C0762d;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: U4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0794b<T extends IInterface> {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0762d[] f6389D = new C0762d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6397f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d0 f6399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f6400i;
    public final b0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.common.a f6401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N f6402l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0801i f6405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f6406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IInterface f6407q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Q f6409s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f6411u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC0086b f6412v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f6414x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile String f6415y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile String f6398g = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f6403m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f6404n = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f6408r = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6410t = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0760b f6416z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6390A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile U f6391B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AtomicInteger f6392C = new AtomicInteger(0);

    /* JADX INFO: renamed from: U4.b$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface a {
        void a();

        void e(int i10);
    }

    /* JADX INFO: renamed from: U4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface InterfaceC0086b {
        void g(C0760b c0760b);
    }

    /* JADX INFO: renamed from: U4.b$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface c {
        void a(C0760b c0760b);
    }

    /* JADX INFO: renamed from: U4.b$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0794b f6417a;

        public d(AbstractC0794b abstractC0794b) {
            Objects.requireNonNull(abstractC0794b);
            this.f6417a = abstractC0794b;
        }

        @Override // U4.AbstractC0794b.c
        public final void a(C0760b c0760b) {
            boolean zK = c0760b.k();
            AbstractC0794b abstractC0794b = this.f6417a;
            if (zK) {
                abstractC0794b.k(null, abstractC0794b.z());
                return;
            }
            InterfaceC0086b interfaceC0086b = abstractC0794b.f6412v;
            if (interfaceC0086b != null) {
                interfaceC0086b.g(c0760b);
            }
        }
    }

    public AbstractC0794b(Context context, Looper looper, b0 b0Var, com.google.android.gms.common.a aVar, int i10, a aVar2, InterfaceC0086b interfaceC0086b, String str) {
        C0804l.i(context, "Context must not be null");
        this.f6400i = context;
        C0804l.i(looper, "Looper must not be null");
        C0804l.i(b0Var, "Supervisor must not be null");
        this.j = b0Var;
        C0804l.i(aVar, "API availability must not be null");
        this.f6401k = aVar;
        this.f6402l = new N(this, looper);
        this.f6413w = i10;
        this.f6411u = aVar2;
        this.f6412v = interfaceC0086b;
        this.f6414x = str;
    }

    public final T A() throws DeadObjectException {
        T t8;
        synchronized (this.f6403m) {
            try {
                if (this.f6410t == 5) {
                    throw new DeadObjectException();
                }
                if (!b()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface = this.f6407q;
                C0804l.i(iInterface, "Client is connected but service is null");
                t8 = (T) iInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t8;
    }

    public abstract String B();

    public abstract String C();

    public boolean D() {
        return n() >= 211700000;
    }

    public void E(int i10) {
        this.f6393b = i10;
        this.f6394c = System.currentTimeMillis();
    }

    public boolean F() {
        return this instanceof com.google.android.gms.internal.location.i;
    }

    public final /* synthetic */ boolean G(int i10, int i11, IInterface iInterface) {
        synchronized (this.f6403m) {
            try {
                if (this.f6410t != i10) {
                    return false;
                }
                H(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H(int i10, IInterface iInterface) {
        d0 d0Var;
        C0804l.b((i10 == 4) == (iInterface != null));
        synchronized (this.f6403m) {
            try {
                this.f6410t = i10;
                this.f6407q = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    Q q10 = this.f6409s;
                    if (q10 != null) {
                        b0 b0Var = this.j;
                        String str = this.f6399h.f6442a;
                        C0804l.h(str);
                        this.f6399h.getClass();
                        if (this.f6414x == null) {
                            this.f6400i.getClass();
                        }
                        boolean z10 = this.f6399h.f6443b;
                        b0Var.getClass();
                        b0Var.c(new Y(str, z10), q10);
                        this.f6409s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    Q q11 = this.f6409s;
                    if (q11 != null && (d0Var = this.f6399h) != null) {
                        String str2 = d0Var.f6442a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str2);
                        sb2.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb2.toString());
                        b0 b0Var2 = this.j;
                        String str3 = this.f6399h.f6442a;
                        C0804l.h(str3);
                        this.f6399h.getClass();
                        if (this.f6414x == null) {
                            this.f6400i.getClass();
                        }
                        boolean z11 = this.f6399h.f6443b;
                        b0Var2.getClass();
                        b0Var2.c(new Y(str3, z11), q11);
                        this.f6392C.incrementAndGet();
                    }
                    Q q12 = new Q(this, this.f6392C.get());
                    this.f6409s = q12;
                    String strC = C();
                    boolean zD = D();
                    this.f6399h = new d0(strC, zD);
                    if (zD && n() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f6399h.f6442a)));
                    }
                    b0 b0Var3 = this.j;
                    String str4 = this.f6399h.f6442a;
                    C0804l.h(str4);
                    this.f6399h.getClass();
                    String name = this.f6414x;
                    if (name == null) {
                        name = this.f6400i.getClass().getName();
                    }
                    C0760b c0760bB = b0Var3.b(new Y(str4, this.f6399h.f6443b), q12, name, null);
                    if (!c0760bB.k()) {
                        new StringBuilder(String.valueOf(this.f6399h.f6442a).length() + 34 + "com.google.android.gms".length());
                        int i11 = c0760bB.f5527c;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (c0760bB.f5528d != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c0760bB.f5528d);
                        }
                        int i12 = this.f6392C.get();
                        T t8 = new T(this, i11, bundle);
                        N n10 = this.f6402l;
                        n10.sendMessage(n10.obtainMessage(7, i12, -1, t8));
                    }
                } else if (i10 == 4) {
                    C0804l.h(iInterface);
                    this.f6395d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        this.f6392C.incrementAndGet();
        ArrayList arrayList = this.f6408r;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    O o10 = (O) arrayList.get(i10);
                    synchronized (o10) {
                        o10.f6363a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f6404n) {
            this.f6405o = null;
        }
        H(1, null);
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f6403m) {
            z10 = this.f6410t == 4;
        }
        return z10;
    }

    public final void d(String str) {
        this.f6398g = str;
        a();
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f6403m) {
            int i10 = this.f6410t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void g(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        InterfaceC0801i interfaceC0801i;
        synchronized (this.f6403m) {
            i10 = this.f6410t;
            iInterface = this.f6407q;
        }
        synchronized (this.f6404n) {
            interfaceC0801i = this.f6405o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) B()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC0801i == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC0801i.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f6395d > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.f6395d;
            String str2 = simpleDateFormat.format(new Date(j));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 1 + String.valueOf(str2).length());
            sb2.append(j);
            sb2.append(" ");
            sb2.append(str2);
            printWriterAppend.println(sb2.toString());
        }
        if (this.f6394c > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f6393b;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j10 = this.f6394c;
            String str3 = simpleDateFormat.format(new Date(j10));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(str3).length());
            sb3.append(j10);
            sb3.append(" ");
            sb3.append(str3);
            printWriterAppend2.println(sb3.toString());
        }
        if (this.f6397f > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.b.a(this.f6396e));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j11 = this.f6397f;
            String str4 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb4 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(str4).length());
            sb4.append(j11);
            sb4.append(" ");
            sb4.append(str4);
            printWriterAppend3.println(sb4.toString());
        }
    }

    public final String h() {
        if (!b() || this.f6399h == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    public final void i(c cVar) {
        C0804l.i(cVar, "Connection progress callbacks cannot be null.");
        this.f6406p = cVar;
        H(2, null);
    }

    public final void k(InterfaceC0800h interfaceC0800h, Set<Scope> set) {
        Bundle bundleY = y();
        String str = Build.VERSION.SDK_INT < 31 ? this.f6415y : this.f6415y;
        int i10 = this.f6413w;
        int i11 = com.google.android.gms.common.a.f25298a;
        Scope[] scopeArr = C0797e.f6444p;
        Bundle bundle = new Bundle();
        C0762d[] c0762dArr = C0797e.f6445q;
        C0797e c0797e = new C0797e(6, i10, i11, null, null, scopeArr, bundle, null, c0762dArr, c0762dArr, true, 0, false, str);
        c0797e.f6449e = this.f6400i.getPackageName();
        c0797e.f6452h = bundleY;
        if (set != null) {
            c0797e.f6451g = (Scope[]) set.toArray(new Scope[0]);
        }
        if (s()) {
            Account accountW = w();
            if (accountW == null) {
                accountW = new Account("<<default account>>", "com.google");
            }
            c0797e.f6453i = accountW;
            if (interfaceC0800h != null) {
                c0797e.f6450f = interfaceC0800h.asBinder();
            }
        }
        c0797e.j = f6389D;
        c0797e.f6454k = x();
        if (F()) {
            c0797e.f6457n = true;
        }
        try {
            try {
                synchronized (this.f6404n) {
                    try {
                        InterfaceC0801i interfaceC0801i = this.f6405o;
                        if (interfaceC0801i != null) {
                            interfaceC0801i.F(new P(this, this.f6392C.get()), c0797e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i12 = this.f6392C.get();
                S s10 = new S(this, 8, null, null);
                N n10 = this.f6402l;
                n10.sendMessage(n10.obtainMessage(1, i12, -1, s10));
            }
        } catch (DeadObjectException unused2) {
            int i13 = this.f6392C.get();
            N n11 = this.f6402l;
            n11.sendMessage(n11.obtainMessage(6, i13, 3));
        } catch (SecurityException e10) {
            throw e10;
        }
    }

    public final boolean l() {
        return true;
    }

    public int n() {
        return com.google.android.gms.common.a.f25298a;
    }

    public final void o(T4.S s10) {
        ((T4.T) s10.f5887b).f5899o.f5941n.post(new T4.Q(s10));
    }

    public final C0762d[] p() {
        U u10 = this.f6391B;
        if (u10 == null) {
            return null;
        }
        return u10.f6374c;
    }

    public final String q() {
        return this.f6398g;
    }

    public final Intent r() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean s() {
        return false;
    }

    public final void u() {
        int iB = this.f6401k.b(this.f6400i, n());
        if (iB == 0) {
            i(new d(this));
            return;
        }
        H(1, null);
        this.f6406p = new d(this);
        int i10 = this.f6392C.get();
        N n10 = this.f6402l;
        n10.sendMessage(n10.obtainMessage(3, i10, iB, null));
    }

    public abstract T v(IBinder iBinder);

    public Account w() {
        return null;
    }

    public C0762d[] x() {
        return f6389D;
    }

    public Bundle y() {
        return new Bundle();
    }

    public Set<Scope> z() {
        return Collections.emptySet();
    }
}

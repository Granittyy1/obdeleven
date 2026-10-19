package T4;

import S4.C0760b;
import U4.AbstractC0799g;
import U4.C0805m;
import U4.C0806n;
import U4.C0807o;
import U4.C0817z;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.collection.C0874b;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: T4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0771d implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f5926p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f5927q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f5928r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static C0771d f5929s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0807o f5932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public W4.d f5933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f5934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GoogleApiAvailability f5935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0817z f5936h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e5.h f5941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f5942o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5930b = 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5931c = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f5937i = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConcurrentHashMap f5938k = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0874b f5939l = new C0874b(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0874b f5940m = new C0874b(0);

    public C0771d(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f5942o = true;
        this.f5934f = context;
        e5.h hVar = new e5.h(looper, this);
        this.f5941n = hVar;
        this.f5935g = googleApiAvailability;
        this.f5936h = new C0817z(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (p019b6.d.f20566e == null) {
            p019b6.d.f20566e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (p019b6.d.f20566e.booleanValue()) {
            this.f5942o = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    public static Status c(C0768a c0768a, C0760b c0760b) {
        return new Status(17, B6.c.d("API: ", c0768a.f5913b.f25314c, " is not available on this device. Connection failed with: ", String.valueOf(c0760b)), c0760b.f5528d, c0760b);
    }

    @ResultIgnorabilityUnspecified
    public static C0771d e(Context context) {
        C0771d c0771d;
        HandlerThread handlerThread;
        synchronized (f5928r) {
            if (f5929s == null) {
                synchronized (AbstractC0799g.f6461a) {
                    try {
                        handlerThread = AbstractC0799g.f6463c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            AbstractC0799g.f6463c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = AbstractC0799g.f6463c;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                f5929s = new C0771d(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.f25297d);
            }
            c0771d = f5929s;
        }
        return c0771d;
    }

    public final boolean a() {
        if (this.f5931c) {
            return false;
        }
        C0806n c0806n = C0805m.a().f6477a;
        if (c0806n != null && !c0806n.f6479c) {
            return false;
        }
        int i10 = this.f5936h.f6502a.get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean b(C0760b c0760b, int i10) {
        PendingIntent activity;
        GoogleApiAvailability googleApiAvailability = this.f5935g;
        googleApiAvailability.getClass();
        Context context = this.f5934f;
        if (p006a5.a.c(context)) {
            return false;
        }
        boolean zE = c0760b.e();
        int i11 = c0760b.f5527c;
        if (zE) {
            activity = c0760b.f5528d;
        } else {
            activity = null;
            Intent intentA = googleApiAvailability.a(context, null, i11);
            if (intentA != null) {
                activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
            }
        }
        if (activity == null) {
            return false;
        }
        int i12 = GoogleApiActivity.f25300c;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        googleApiAvailability.f(context, i11, PendingIntent.getActivity(context, 0, intent, e5.g.f34741a | 134217728));
        return true;
    }

    @ResultIgnorabilityUnspecified
    public final T d(com.google.android.gms.common.api.c cVar) {
        ConcurrentHashMap concurrentHashMap = this.f5938k;
        C0768a c0768a = cVar.f25320e;
        T t8 = (T) concurrentHashMap.get(c0768a);
        if (t8 == null) {
            t8 = new T(this, cVar);
            concurrentHashMap.put(c0768a, t8);
        }
        if (t8.f5889d.s()) {
            this.f5940m.add(c0768a);
        }
        t8.m();
        return t8;
    }

    public final void f(C0760b c0760b, int i10) {
        if (b(c0760b, i10)) {
            return;
        }
        e5.h hVar = this.f5941n;
        hVar.sendMessage(hVar.obtainMessage(5, i10, 0, c0760b));
    }

    /* JADX WARN: Code duplicated, block: B:148:0x037e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0384  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:152:0x03b7  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 T4.T, still in use, count: 2, list:
          (r2v10 T4.T) from 0x0376: IGET (r2v10 T4.T) A[WRAPPED] (LINE:887) T4.T.i int
          (r2v10 T4.T) from 0x037c: PHI (r2 I:??) = (r2v7 T4.T), (r2v10 T4.T) binds: [B:146:0x037b, B:195:0x037c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.C0771d.handleMessage(android.os.Message):boolean");
    }
}

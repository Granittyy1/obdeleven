package H7;

import A8.p;
import D9.j;
import N7.g;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.protobuf.C2071m;
import com.google.protobuf.C2078u;
import com.google.protobuf.GeneratedMessageLite;
import io.grpc.MethodDescriptor;
import io.grpc.stub.ClientCalls;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p033c7.C1490c;
import p033c7.C1509w;
import p033c7.H;
import p033c7.J;
import p033c7.U;
import p144l6.e;
import p183oa.c;
import p228s6.d;
import p228s6.q;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements d, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3738c;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f3737b = obj;
        this.f3738c = obj2;
    }

    @Override // p183oa.c, p311z4.f
    public Object apply(Object obj) {
        String str;
        H h8 = (H) this.f3737b;
        N7.b bVar = (N7.b) this.f3738c;
        J j = (J) obj;
        C1490c c1490c = h8.f22357e;
        c1490c.getClass();
        Q3.d.C();
        U u10 = c1490c.f22431d;
        u10.getClass();
        try {
            l5.a.a(u10.f22408a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e10) {
            e10.printStackTrace();
        }
        C1509w c1509w = c1490c.f22428a.get();
        N7.d.a aVarM = N7.d.M();
        e eVar = c1490c.f22429b;
        eVar.a();
        String str2 = eVar.f44390c.f44404e;
        aVarM.r();
        N7.d.H((N7.d) aVarM.f29047c, str2);
        C2078u.d dVarI = bVar.I();
        aVarM.r();
        N7.d.I((N7.d) aVarM.f29047c, dVarI);
        p132k6.a.C0474a c0474aL = p132k6.a.L();
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        c0474aL.r();
        p132k6.a.J((p132k6.a) c0474aL.f29047c, strValueOf);
        String string = Locale.getDefault().toString();
        c0474aL.r();
        p132k6.a.K((p132k6.a) c0474aL.f29047c, string);
        String id = TimeZone.getDefault().getID();
        c0474aL.r();
        p132k6.a.I((p132k6.a) c0474aL.f29047c, id);
        Application application = c1490c.f22430c;
        try {
            str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("FIAM.Headless", "Error finding versionName : " + e11.getMessage());
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            c0474aL.r();
            p132k6.a.H((p132k6.a) c0474aL.f29047c, str);
        }
        p132k6.a aVarP = c0474aL.p();
        aVarM.r();
        N7.d.J((N7.d) aVarM.f29047c, aVarP);
        N7.c.a aVarK = N7.c.K();
        e eVar2 = c1490c.f22429b;
        eVar2.a();
        String str3 = eVar2.f44390c.f44401b;
        aVarK.r();
        N7.c.H((N7.c) aVarK.f29047c, str3);
        String strA = j.a();
        aVarK.r();
        N7.c.I((N7.c) aVarK.f29047c, strA);
        String strA2 = j.b().a();
        aVarK.r();
        N7.c.J((N7.c) aVarK.f29047c, strA2);
        N7.c cVarP = aVarK.p();
        aVarM.r();
        N7.d.K((N7.d) aVarM.f29047c, cVarP);
        N7.d dVarP = aVarM.p();
        g.a aVar = c1509w.f22513a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.grpc.b bVar2 = aVar.f3932b;
        bVar2.getClass();
        if (timeUnit == null) {
            j.a aVar2 = j.f2887e;
            throw new NullPointerException("units");
        }
        j jVar = new j(timeUnit.toNanos(30000L));
        io.grpc.b.a aVarB = io.grpc.b.b(bVar2);
        aVarB.f36945a = jVar;
        io.grpc.b bVar3 = new io.grpc.b(aVarB);
        D9.a aVar3 = aVar.f3931a;
        p.j(aVar3, "channel");
        MethodDescriptor<N7.d, N7.e> methodDescriptor = g.f4669a;
        if (methodDescriptor == null) {
            synchronized (g.class) {
                try {
                    methodDescriptor = g.f4669a;
                    if (methodDescriptor == null) {
                        String strA3 = MethodDescriptor.a("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns");
                        N7.d dVarL = N7.d.L();
                        C2071m c2071m = H9.b.f3744a;
                        MethodDescriptor<N7.d, N7.e> methodDescriptor2 = new MethodDescriptor<>(strA3, new H9.b.a(dVarL), new H9.b.a(N7.e.I()));
                        g.f4669a = methodDescriptor2;
                        methodDescriptor = methodDescriptor2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        N7.e eVar3 = (N7.e) ClientCalls.a(aVar3, methodDescriptor, bVar3, dVarP);
        if (eVar3.J() >= TimeUnit.MINUTES.toMillis(1L) + System.currentTimeMillis()) {
            if (eVar3.J() <= TimeUnit.DAYS.toMillis(3L) + System.currentTimeMillis()) {
                return eVar3;
            }
        }
        GeneratedMessageLite.a aVar4 = (GeneratedMessageLite.a) eVar3.w(GeneratedMessageLite.MethodToInvoke.f29042f);
        aVar4.s(eVar3);
        N7.e.a aVar5 = (N7.e.a) aVar4;
        long millis = TimeUnit.DAYS.toMillis(1L) + System.currentTimeMillis();
        aVar5.r();
        N7.e.H((N7.e) aVar5.f29047c, millis);
        return aVar5.p();
    }

    @Override // p228s6.d
    public Object f(q qVar) {
        String str = (String) this.f3737b;
        p228s6.a aVar = (p228s6.a) this.f3738c;
        try {
            Trace.beginSection(str);
            return aVar.f46935f.f(qVar);
        } finally {
            Trace.endSection();
        }
    }
}

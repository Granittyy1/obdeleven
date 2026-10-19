package M2;

import K2.K;
import K2.M;
import O2.n;
import Q2.A;
import Q2.z;
import R2.w;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.collection.C0874b;
import androidx.core.app.C1283h;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.j;
import androidx.work.k;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.Z;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4530c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f4529b = i10;
        this.f4530c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0140  */
    /* JADX WARN: Code duplicated, block: B:106:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p271w0.g gVar;
        Context contextF;
        com.google.firebase.installations.local.a aVarC;
        com.google.firebase.installations.local.a aVarF;
        Object systemService = null;
        int i10 = 1;
        switch (this.f4529b) {
            case 0:
                f.c((f) this.f4530c);
                return;
            case 1:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f4530c;
                i.e(this$0, "this$0");
                if (this$0.f20455e.f20427b instanceof AbstractFuture.b) {
                    return;
                }
                Object obj = this$0.getInputData().f20353a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj instanceof String ? (String) obj : null;
                k kVarC = k.c();
                i.d(kVarC, "get()");
                if (str == null || str.length() == 0) {
                    kVarC.a(T2.a.f5798a, "No worker to delegate to.");
                    androidx.work.impl.utils.futures.a<j.a> future = this$0.f20455e;
                    i.d(future, "future");
                    future.k(new j.a.C0203a());
                    return;
                }
                j jVarA = this$0.getWorkerFactory().a(this$0.getApplicationContext(), str, this$0.f20452b);
                this$0.f20456f = jVarA;
                if (jVarA == null) {
                    String str2 = T2.a.f5798a;
                    androidx.work.impl.utils.futures.a<j.a> future2 = this$0.f20455e;
                    i.d(future2, "future");
                    future2.k(new j.a.C0203a());
                    return;
                }
                K kB = K.b(this$0.getApplicationContext());
                i.d(kB, "getInstance(applicationContext)");
                A aT = kB.f4146c.t();
                String string = this$0.getId().toString();
                i.d(string, "id.toString()");
                z zVarT = aT.t(string);
                if (zVarT == null) {
                    androidx.work.impl.utils.futures.a<j.a> future3 = this$0.f20455e;
                    i.d(future3, "future");
                    String str3 = T2.a.f5798a;
                    future3.k(new j.a.C0203a());
                    return;
                }
                n nVar = kB.j;
                i.d(nVar, "workManagerImpl.trackers");
                WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(nVar);
                Z zA = kB.f4147d.a();
                i.d(zA, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
                this$0.f20455e.a(new e(i10, androidx.work.impl.constraints.e.a(workConstraintsTracker, zVarT, zA, this$0)), new w());
                if (!workConstraintsTracker.a(zVarT)) {
                    String str4 = T2.a.f5798a;
                    androidx.work.impl.utils.futures.a<j.a> future4 = this$0.f20455e;
                    i.d(future4, "future");
                    future4.k(new j.a.b());
                    return;
                }
                String str5 = T2.a.f5798a;
                try {
                    j jVar = this$0.f20456f;
                    i.b(jVar);
                    p107i6.f<j.a> fVarStartWork = jVar.startWork();
                    i.d(fVarStartWork, "delegate!!.startWork()");
                    fVarStartWork.a(new M(this$0, i10, fVarStartWork), this$0.getBackgroundExecutor());
                    return;
                } catch (Throwable unused) {
                    String str6 = T2.a.f5798a;
                    synchronized (this$0.f20453c) {
                        try {
                            if (this$0.f20454d) {
                                androidx.work.impl.utils.futures.a<j.a> future5 = this$0.f20455e;
                                i.d(future5, "future");
                                future5.k(new j.a.b());
                                return;
                            } else {
                                androidx.work.impl.utils.futures.a<j.a> future6 = this$0.f20455e;
                                i.d(future6, "future");
                                future6.k(new j.a.C0203a());
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            case 2:
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    Context context = (Context) this.f4530c;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i11 >= 33) {
                            C0874b<WeakReference<p100i.f>> c0874b = p100i.f.f36290h;
                            c0874b.getClass();
                            C0874b.a aVar = new C0874b.a();
                            while (aVar.hasNext()) {
                                p100i.f fVar = (p100i.f) ((WeakReference) aVar.next()).get();
                                if (fVar != null && (contextF = fVar.f()) != null) {
                                    systemService = contextF.getSystemService("locale");
                                    if (systemService != null) {
                                        gVar = new p271w0.g(new p271w0.i(i.f.b.a(systemService)));
                                    } else {
                                        gVar = p271w0.g.f47682b;
                                    }
                                }
                            }
                            if (systemService != null) {
                                gVar = new p271w0.g(new p271w0.i(i.f.b.a(systemService)));
                            } else {
                                gVar = p271w0.g.f47682b;
                            }
                        } else {
                            gVar = p100i.f.f36286d;
                            if (gVar == null) {
                                gVar = p271w0.g.f47682b;
                            }
                        }
                        if (gVar.f47683a.f47685a.isEmpty()) {
                            String strB = C1283h.b(context);
                            Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                i.f.b.b(systemService2, i.f.a.a(strB));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                p100i.f.f36289g = true;
                return;
            default:
                com.google.firebase.installations.a aVar2 = (com.google.firebase.installations.a) this.f4530c;
                aVar2.getClass();
                Object obj2 = com.google.firebase.installations.a.f28202m;
                synchronized (obj2) {
                    try {
                        p144l6.e eVar = aVar2.f28203a;
                        eVar.a();
                        p019b6.f fVarB = p019b6.f.b(eVar.f44388a);
                        try {
                            aVarC = aVar2.f28205c.c();
                            if (fVarB != null) {
                                fVarB.c();
                            }
                        } catch (Throwable th2) {
                            if (fVarB != null) {
                                fVarB.c();
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                try {
                    if ((aVarC.f() == PersistedInstallation.RegistrationStatus.f28220f) == true) {
                        aVarF = aVar2.f(aVarC);
                    } else {
                        if (aVarC.f() != PersistedInstallation.RegistrationStatus.f28218d) {
                            i10 = 0;
                        }
                        if (i10 != 0) {
                            aVarF = aVar2.f(aVarC);
                        } else if (!aVar2.f28206d.a(aVarC)) {
                            return;
                        } else {
                            aVarF = aVar2.c(aVarC);
                        }
                    }
                    synchronized (obj2) {
                        try {
                            p144l6.e eVar2 = aVar2.f28203a;
                            eVar2.a();
                            p019b6.f fVarB2 = p019b6.f.b(eVar2.f44388a);
                            try {
                                aVar2.f28205c.b(aVarF);
                                if (fVarB2 != null) {
                                    fVarB2.c();
                                }
                            } catch (Throwable th4) {
                                if (fVarB2 != null) {
                                    fVarB2.c();
                                }
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    synchronized (aVar2) {
                        if (aVar2.f28212k.size() != 0 && !TextUtils.equals(aVarC.f28222b, aVarF.f28222b)) {
                            Iterator it = aVar2.f28212k.iterator();
                            while (it.hasNext()) {
                                ((p120j7.a) it.next()).a();
                            }
                        }
                    }
                    if (aVarF.f() == PersistedInstallation.RegistrationStatus.f28219e) {
                        String str7 = aVarF.f28222b;
                        synchronized (aVar2) {
                            aVar2.j = str7;
                        }
                    }
                    if (aVarF.f() == PersistedInstallation.RegistrationStatus.f28220f) {
                        aVar2.g(new FirebaseInstallationsException());
                        return;
                    }
                    PersistedInstallation.RegistrationStatus registrationStatus = PersistedInstallation.RegistrationStatus.f28217c;
                    PersistedInstallation.RegistrationStatus registrationStatus2 = aVarF.f28223c;
                    if (registrationStatus2 == registrationStatus || registrationStatus2 == PersistedInstallation.RegistrationStatus.f28216b) {
                        aVar2.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        aVar2.h(aVarF);
                        return;
                    }
                } catch (FirebaseInstallationsException e10) {
                    aVar2.g(e10);
                    return;
                }
        }
    }
}

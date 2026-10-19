package X8;

import com.facebook.appevents.FlushReason;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7373c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f7372b = i10;
        this.f7373c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f7373c;
        switch (this.f7372b) {
            case 0:
                s sVar = (s) obj;
                sVar.E(R.string.common_something_went_wrong);
                sVar.w();
                break;
            case 1:
                FlushReason reason = (FlushReason) obj;
                kotlin.jvm.internal.i.e(reason, "$reason");
                p005a4.j.a(reason);
                break;
            case 2:
                ((Ia.a) obj).invoke();
                break;
            case 3:
                ((com.google.firebase.installations.a) obj).b();
                break;
            default:
                com.google.firebase.perf.util.h hVar = AppStartTrace.f28434w;
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                appStartTrace.getClass();
                com.google.firebase.perf.v1.i.a aVarA0 = com.google.firebase.perf.v1.i.a0();
                aVarA0.y(Constants$TraceNames.APP_START_TRACE_NAME.toString());
                aVarA0.w(appStartTrace.a().f28507b);
                aVarA0.x(appStartTrace.a().b(appStartTrace.f28447l));
                ArrayList arrayList = new ArrayList(3);
                com.google.firebase.perf.v1.i.a aVarA1 = com.google.firebase.perf.v1.i.a0();
                aVarA1.y(Constants$TraceNames.ON_CREATE_TRACE_NAME.toString());
                aVarA1.w(appStartTrace.a().f28507b);
                aVarA1.x(appStartTrace.a().b(appStartTrace.j));
                arrayList.add(aVarA1.p());
                if (appStartTrace.f28446k != null) {
                    com.google.firebase.perf.v1.i.a aVarA2 = com.google.firebase.perf.v1.i.a0();
                    aVarA2.y(Constants$TraceNames.ON_START_TRACE_NAME.toString());
                    aVarA2.w(appStartTrace.j.f28507b);
                    aVarA2.x(appStartTrace.j.b(appStartTrace.f28446k));
                    arrayList.add(aVarA2.p());
                    com.google.firebase.perf.v1.i.a aVarA3 = com.google.firebase.perf.v1.i.a0();
                    aVarA3.y(Constants$TraceNames.ON_RESUME_TRACE_NAME.toString());
                    aVarA3.w(appStartTrace.f28446k.f28507b);
                    aVarA3.x(appStartTrace.f28446k.b(appStartTrace.f28447l));
                    arrayList.add(aVarA3.p());
                }
                aVarA0.r();
                com.google.firebase.perf.v1.i.K((com.google.firebase.perf.v1.i) aVarA0.f29047c, arrayList);
                com.google.firebase.perf.v1.h hVarA = appStartTrace.f28453r.a();
                aVarA0.r();
                com.google.firebase.perf.v1.i.M((com.google.firebase.perf.v1.i) aVarA0.f29047c, hVarA);
                appStartTrace.f28439c.c(aVarA0.p(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                break;
        }
    }
}

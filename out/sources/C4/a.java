package C4;

import Z3.I;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import com.facebook.internal.FeatureManager;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements A1.t, com.google.common.base.c, p183oa.c, B7.g.a, j1.j.b, j1.j.a, FeatureManager.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2340b;

    public /* synthetic */ a(int i10) {
        this.f2340b = i10;
    }

    public static C1105p0 a(C1086g c1086g, boolean z10, boolean z11) {
        c1086g.T(z10);
        c1086g.T(z11);
        return c1086g.V();
    }

    public static SurveyUiColors g(String str, String str2, int i10, kotlin.jvm.internal.e eVar) {
        return SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(str, str2, i10, eVar));
    }

    public static String h(StringBuilder sb2, long j, char c10) {
        sb2.append(j);
        sb2.append(c10);
        return sb2.toString();
    }

    public static HashMap i(Class cls, com.google.firebase.encoders.proto.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static kotlin.jvm.internal.c j(org.koin.core.scope.a aVar, String str, Ob.a aVar2, String str2, Class cls) {
        kotlin.jvm.internal.i.e(aVar, str);
        kotlin.jvm.internal.i.e(aVar2, str2);
        return kotlin.jvm.internal.l.a(cls);
    }

    @Override // com.google.common.base.c
    public Object apply(Object obj) {
        switch (this.f2340b) {
            case 2:
                long j = ((X1.c) obj).f7142b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            default:
                return ((N7.b) obj).I();
        }
    }

    @Override // B7.g.a
    public String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    @Override // A1.t
    public A1.p[] c() {
        return new A1.p[]{new F1.c()};
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            AtomicBoolean atomicBoolean = p203q4.d.f46096a;
            synchronized (p203q4.d.class) {
                try {
                    if (p203q4.d.f46096a.getAndSet(true)) {
                        return;
                    }
                    Z3.q qVar = Z3.q.f7852a;
                    if (I.a()) {
                        p203q4.d.a();
                    }
                    p203q4.b.f46092b.scheduleWithFixedDelay(p203q4.b.f46094d, 0L, 500, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // j1.j.b
    public void f(Object obj, p078g1.m mVar) {
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}

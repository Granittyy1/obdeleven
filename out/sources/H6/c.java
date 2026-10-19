package H6;

import A1.p;
import A1.t;
import Z3.q;
import android.text.TextUtils;
import androidx.compose.foundation.text.selection.CrossStatus;
import androidx.compose.foundation.text.selection.h;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.foundation.text.selection.k;
import androidx.compose.foundation.text.selection.s;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.perf.v1.g;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import p033c7.J;
import p228s6.d;
import p228s6.l;
import p311z4.f;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements d, t, FeatureManager.a, j, p183oa.d, f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3736b;

    public /* synthetic */ c(int i10) {
        this.f3736b = i10;
    }

    @Override // p183oa.d
    public boolean a(Object obj) {
        J j = (J) obj;
        return (TextUtils.isEmpty(j.a()) || TextUtils.isEmpty(j.b().a())) ? false : true;
    }

    @Override // p311z4.f
    public Object apply(Object obj) {
        return ((g) obj).n();
    }

    @Override // A1.t
    public p[] c() {
        return new p[]{new V1.c()};
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) throws JSONException {
        HashSet<String> hashSet;
        if (z10) {
            ProtectedModeManager.f24937a = true;
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
            int i10 = 0;
            p165n4.j jVarF = FetchedAppSettingsManager.f(q.b(), false);
            if (jVarF == null) {
                return;
            }
            JSONArray jSONArray = jVarF.f44906m;
            if (jSONArray == null || jSONArray.length() == 0) {
                hashSet = null;
            } else {
                hashSet = new HashSet<>();
                int length = jSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        i.d(string, "jsonArray.getString(i)");
                        hashSet.add(string);
                        if (i11 >= length) {
                            break;
                        } else {
                            i10 = i11;
                        }
                    }
                }
            }
            if (hashSet == null) {
                hashSet = (HashSet) ProtectedModeManager.f24938b.getValue();
            }
            ProtectedModeManager.f24939c = hashSet;
        }
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        switch (this.f3736b) {
            case 0:
                return TransportRegistrar.lambda$getComponents$2(qVar);
            case 5:
                return AbtRegistrar.lambda$getComponents$0(qVar);
            default:
                l<ScheduledExecutorService> lVar = ExecutorsRegistrar.f28050a;
                return UiExecutor.f28070b;
        }
    }

    @Override // androidx.compose.foundation.text.selection.j
    public androidx.compose.foundation.text.selection.i g(s sVar) {
        androidx.compose.foundation.text.selection.i.a aVarB;
        androidx.compose.foundation.text.selection.i.a aVar;
        androidx.compose.foundation.text.selection.i iVarE = sVar.f11622b;
        if (iVarE == null) {
            return k.a(sVar, j.a.b.f11613a);
        }
        h hVar = sVar.f11623c;
        boolean z10 = sVar.f11621a;
        androidx.compose.foundation.text.selection.i.a aVar2 = iVarE.f11603b;
        androidx.compose.foundation.text.selection.i.a aVar3 = iVarE.f11602a;
        if (z10) {
            aVarB = k.b(sVar, hVar, aVar3);
            aVar = aVar2;
            aVar2 = aVar3;
            aVar3 = aVarB;
        } else {
            aVarB = k.b(sVar, hVar, aVar2);
            aVar = aVarB;
        }
        if (!i.a(aVarB, aVar2)) {
            iVarE = k.e(new androidx.compose.foundation.text.selection.i(aVar3, aVar, sVar.b() == CrossStatus.f11530b || (sVar.b() == CrossStatus.f11532d && aVar3.f11606b > aVar.f11606b)), sVar);
        }
        return iVarE;
    }
}

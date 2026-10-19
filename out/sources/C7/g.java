package C7;

import Ia.p;
import Z3.q;
import androidx.compose.runtime.C1086g;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import p078g1.v;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements p191p5.f, FeatureManager.a, j1.j.a {
    public static StringBuilder a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static void b(int i10, p pVar, C1086g c1086g, boolean z10) {
        pVar.invoke(c1086g, Integer.valueOf(i10));
        c1086g.T(z10);
    }

    @Override // p191p5.f
    public p191p5.g c(Object obj) {
        return p191p5.j.e(null);
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
            p165n4.j jVarF = FetchedAppSettingsManager.f(q.b(), false);
            if (jVarF != null) {
                p080g4.a.f35600b = jVarF.f44907n;
            }
            if (p080g4.a.f35600b != null) {
                p080g4.a.f35599a = true;
            }
        }
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((v.c) obj).c(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
    }
}

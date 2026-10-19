package androidx.compose.animation;

import android.view.View;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements com.google.gson.internal.f, InterfaceC1309y, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9650b;

    public /* synthetic */ k(int i10) {
        this.f9650b = i10;
    }

    public static String a(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.C());
        return sb2.toString();
    }

    public static void b(int i10, InterfaceC1084f interfaceC1084f, int i11, Ia.p pVar) {
        interfaceC1084f.E(Integer.valueOf(i10));
        interfaceC1084f.t(Integer.valueOf(i11), pVar);
    }

    @Override // androidx.core.view.InterfaceC1309y
    public n0 g(View view, n0 n0Var) {
        return IntercomCarouselActivity.lambda$setInsets$0(view, n0Var);
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return new ArrayList();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        p162n1.b bVar = (p162n1.b) obj;
        switch (this.f9650b) {
            case 4:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ k(n1.b.a aVar, ExoPlaybackException exoPlaybackException) {
        this.f9650b = 4;
    }

    public /* synthetic */ k(n1.b.a aVar, boolean z10) {
        this.f9650b = 5;
    }
}

package A1;

import com.facebook.internal.FeatureManager;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: A1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0576k implements C0577l.a.InterfaceC0002a, p191p5.f, p228s6.d, FeatureManager.a, androidx.compose.foundation.text.selection.j, j1.j.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f528b;

    public /* synthetic */ C0576k(int i10) {
        this.f528b = i10;
    }

    public static void b(g1.n.a aVar, K k10) {
        k10.d(new p078g1.n(aVar));
    }

    @Override // A1.C0577l.a.InterfaceC0002a
    public Constructor a() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(p.class).getConstructor(null);
    }

    @Override // p191p5.f
    public p191p5.g c(Object obj) {
        return p191p5.j.e(null);
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void e(boolean z10) {
        if (z10) {
            p068f4.l.f34985a.set(true);
            p068f4.l.a();
        }
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        switch (this.f528b) {
            case 2:
                return TransportRegistrar.lambda$getComponents$1(qVar);
            case 3:
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(qVar);
            default:
                return ExecutorsRegistrar.f28051b.get();
        }
    }

    @Override // androidx.compose.foundation.text.selection.j
    public androidx.compose.foundation.text.selection.i g(androidx.compose.foundation.text.selection.s sVar) {
        return androidx.compose.foundation.text.selection.k.a(sVar, androidx.compose.foundation.text.selection.j.a.C0140a.f11612a);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}

package androidx.navigation.compose;

import androidx.compose.runtime.X;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19127d;

    public /* synthetic */ J(Object obj, int i10, Object obj2) {
        this.f19125b = i10;
        this.f19126c = obj;
        this.f19127d = obj2;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        Lifecycle lifecycle;
        switch (this.f19125b) {
            case 0:
                p141l2.H h8 = (p141l2.H) this.f19126c;
                h8.getClass();
                InterfaceC1376t owner = (InterfaceC1376t) this.f19127d;
                kotlin.jvm.internal.i.e(owner, "owner");
                p163n2.j jVar = h8.f44310b;
                jVar.getClass();
                if (!owner.equals(jVar.f44797n)) {
                    InterfaceC1376t interfaceC1376t = jVar.f44797n;
                    p163n2.g gVar = jVar.f44801r;
                    if (interfaceC1376t != null && (lifecycle = interfaceC1376t.getLifecycle()) != null) {
                        lifecycle.c(gVar);
                    }
                    jVar.f44797n = owner;
                    owner.getLifecycle().a(gVar);
                }
                return new P();
            case 1:
                return HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen$lambda$1$lambda$0((X) this.f19126c, (Ia.l) this.f19127d, (androidx.compose.foundation.lazy.p) obj);
            default:
                return ShortTextQuestionKt.ShortTextQuestion$lambda$2((kotlinx.coroutines.A) this.f19126c, (androidx.compose.foundation.relocation.a) this.f19127d, (androidx.compose.ui.focus.y) obj);
        }
    }
}

package androidx.compose.ui.platform;

import android.content.res.Resources;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements Ia.q<androidx.compose.ui.draganddrop.g, I.h, Ia.l<? super J.e, ? extends p293xa.r>, Boolean> {
    @Override // Ia.q
    public final Boolean invoke(androidx.compose.ui.draganddrop.g gVar, I.h hVar, Ia.l<? super J.e, ? extends p293xa.r> lVar) {
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class<?> cls = AndroidComposeView.f14644V0;
        Resources resources = androidComposeView.getContext().getResources();
        androidx.compose.ui.draganddrop.a aVar = new androidx.compose.ui.draganddrop.a(new p013b0.d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), hVar.f3769a, lVar);
        return Boolean.valueOf(C1247u.f15094a.a(androidComposeView, gVar, aVar));
    }
}

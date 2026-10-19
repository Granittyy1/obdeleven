package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends FunctionReferenceImpl implements Ia.l<View, InputMethodManagerImpl> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 f11293b = new LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1();

    public LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1() {
        super(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    @Override // Ia.l
    public final InputMethodManagerImpl invoke(View view) {
        return new InputMethodManagerImpl(view);
    }
}

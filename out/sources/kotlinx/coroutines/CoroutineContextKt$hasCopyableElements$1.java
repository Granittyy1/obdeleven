package kotlinx.coroutines;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
final class CoroutineContextKt$hasCopyableElements$1 extends Lambda implements Ia.p<Boolean, kotlin.coroutines.e.a, Boolean> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CoroutineContextKt$hasCopyableElements$1 f43164h = new CoroutineContextKt$hasCopyableElements$1();

    public CoroutineContextKt$hasCopyableElements$1() {
        super(2);
    }

    @Override // Ia.p
    public final Boolean invoke(Boolean bool, kotlin.coroutines.e.a aVar) {
        return Boolean.valueOf(bool.booleanValue() || (aVar instanceof InterfaceC2710u));
    }
}

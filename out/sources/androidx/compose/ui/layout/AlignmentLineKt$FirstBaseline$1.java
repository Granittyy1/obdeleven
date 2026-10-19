package androidx.compose.ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements Ia.p<Integer, Integer, Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AlignmentLineKt$FirstBaseline$1 f14167b = new AlignmentLineKt$FirstBaseline$1();

    public AlignmentLineKt$FirstBaseline$1() {
        super(2, Ka.a.class, "min", "min(II)I", 1);
    }

    @Override // Ia.p
    public final Integer invoke(Integer num, Integer num2) {
        return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
    }
}

package androidx.compose.ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements Ia.p<Integer, Integer, Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AlignmentLineKt$LastBaseline$1 f14168b = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, Ka.a.class, "max", "max(II)I", 1);
    }

    @Override // Ia.p
    public final Integer invoke(Integer num, Integer num2) {
        return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
    }
}

package kotlinx.datetime.format;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: UtcOffsetFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
final class UtcOffsetFormatKt$isoOffset$appendIsoOffsetWithoutZOnZero$1 extends Lambda implements Ia.l<InterfaceC2724i.e, p293xa.r> {
    final /* synthetic */ WhenToOutput $outputSecond;
    final /* synthetic */ boolean $useSeparator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtcOffsetFormatKt$isoOffset$appendIsoOffsetWithoutZOnZero$1(boolean z10, WhenToOutput whenToOutput) {
        super(1);
        this.$useSeparator = z10;
        this.$outputSecond = whenToOutput;
    }

    @Override // Ia.l
    public final p293xa.r invoke(InterfaceC2724i.e eVar) {
        InterfaceC2724i.e outputIfNeeded = eVar;
        kotlin.jvm.internal.i.e(outputIfNeeded, "$this$outputIfNeeded");
        if (this.$useSeparator) {
            C2725j.b(outputIfNeeded, ':');
        }
        InterfaceC2724i.e.a.b(outputIfNeeded);
        WhenToOutput whenToOutput = this.$outputSecond;
        final boolean z10 = this.$useSeparator;
        UtcOffsetFormatKt.a(outputIfNeeded, whenToOutput, new Ia.l<InterfaceC2724i.e, p293xa.r>() { // from class: kotlinx.datetime.format.UtcOffsetFormatKt$isoOffset$appendIsoOffsetWithoutZOnZero$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC2724i.e eVar2) {
                InterfaceC2724i.e outputIfNeeded2 = eVar2;
                kotlin.jvm.internal.i.e(outputIfNeeded2, "$this$outputIfNeeded");
                if (z10) {
                    C2725j.b(outputIfNeeded2, ':');
                }
                InterfaceC2724i.e.a.c(outputIfNeeded2);
                return p293xa.r.f47939a;
            }
        });
        return p293xa.r.f47939a;
    }
}

package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements Ia.p<Long, i<Object>, i<Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BufferedChannelKt$createSegmentFunction$1 f43267b = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // Ia.p
    public final i<Object> invoke(Long l10, i<Object> iVar) {
        long jLongValue = l10.longValue();
        i<Object> iVar2 = iVar;
        i<Object> iVar3 = c.f43269a;
        BufferedChannel<Object> bufferedChannel = iVar2.f43294f;
        kotlin.jvm.internal.i.b(bufferedChannel);
        return new i<>(jLongValue, iVar2, bufferedChannel, 0);
    }
}

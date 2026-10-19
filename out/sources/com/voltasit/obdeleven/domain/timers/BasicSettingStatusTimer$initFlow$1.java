package com.voltasit.obdeleven.domain.timers;

import Aa.c;
import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import m8.o;
import me.zhanghai.android.materialprogressbar.R;
import p109i8.k;
import p293xa.r;

/* JADX INFO: compiled from: BasicSettingStatusTimer.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.domain.timers.BasicSettingStatusTimer$initFlow$1", f = "BasicSettingStatusTimer.kt", l = {R.styleable.AppCompatTheme_colorButtonNormal, R.styleable.AppCompatTheme_colorControlActivated, R.styleable.AppCompatTheme_colorError, R.styleable.AppCompatTheme_colorSwitchThumbNormal}, m = "invokeSuspend")
final class BasicSettingStatusTimer$initFlow$1 extends SuspendLambda implements p<InterfaceC2687d<? super o>, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ ControlUnit $controlUnit;
    final /* synthetic */ k $requestProvider;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BasicSettingStatusTimer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSettingStatusTimer$initFlow$1(ControlUnit controlUnit, k kVar, BasicSettingStatusTimer basicSettingStatusTimer, kotlin.coroutines.c<? super BasicSettingStatusTimer$initFlow$1> cVar) {
        super(2, cVar);
        this.$controlUnit = controlUnit;
        this.$requestProvider = kVar;
        this.this$0 = basicSettingStatusTimer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BasicSettingStatusTimer$initFlow$1 basicSettingStatusTimer$initFlow$1 = new BasicSettingStatusTimer$initFlow$1(this.$controlUnit, this.$requestProvider, this.this$0, cVar);
        basicSettingStatusTimer$initFlow$1.L$0 = obj;
        return basicSettingStatusTimer$initFlow$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<? super o> interfaceC2687d, kotlin.coroutines.c<? super r> cVar) {
        return ((BasicSettingStatusTimer$initFlow$1) create(interfaceC2687d, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x001b, CancellationException -> 0x00dd, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00dd, all -> 0x001b, blocks: (B:9:0x0017, B:25:0x004d, B:28:0x0063, B:31:0x007b, B:35:0x008b, B:38:0x00a1, B:40:0x00a9, B:17:0x002f, B:20:0x0037), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1 A[Catch: all -> 0x001b, CancellationException -> 0x00dd, TryCatch #2 {CancellationException -> 0x00dd, all -> 0x001b, blocks: (B:9:0x0017, B:25:0x004d, B:28:0x0063, B:31:0x007b, B:35:0x008b, B:38:0x00a1, B:40:0x00a9, B:17:0x002f, B:20:0x0037), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9 A[Catch: all -> 0x001b, CancellationException -> 0x00dd, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00dd, all -> 0x001b, blocks: (B:9:0x0017, B:25:0x004d, B:28:0x0063, B:31:0x007b, B:35:0x008b, B:38:0x00a1, B:40:0x00a9, B:17:0x002f, B:20:0x0037), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlinx.coroutines.flow.d] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.flow.d] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x009e -> B:23:0x0043). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a7 -> B:23:0x0043). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d1 -> B:23:0x0043). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d4 -> B:23:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:42:0x00d3
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.domain.timers.BasicSettingStatusTimer$initFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

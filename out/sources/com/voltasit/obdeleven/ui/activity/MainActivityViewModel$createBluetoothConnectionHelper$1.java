package com.voltasit.obdeleven.ui.activity;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$createBluetoothConnectionHelper$1", f = "MainActivityViewModel.kt", l = {809}, m = "invokeSuspend")
final class MainActivityViewModel$createBluetoothConnectionHelper$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ MainActivity $mainActivity;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$createBluetoothConnectionHelper$1(MainActivityViewModel mainActivityViewModel, MainActivity mainActivity, kotlin.coroutines.c<? super MainActivityViewModel$createBluetoothConnectionHelper$1> cVar) {
        super(2, cVar);
        this.this$0 = mainActivityViewModel;
        this.$mainActivity = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$createBluetoothConnectionHelper$1(this.this$0, this.$mainActivity, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$createBluetoothConnectionHelper$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x007e A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:6:0x0017, B:17:0x0076, B:19:0x007e, B:14:0x0066, B:21:0x008a, B:22:0x0090, B:13:0x005f), top: B:31:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:6:0x0017, B:17:0x0076, B:19:0x007e, B:14:0x0066, B:21:0x008a, B:22:0x0090, B:13:0x005f), top: B:31:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0073 -> B:17:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r1.label
            r3 = 1
            if (r2 == 0) goto L29
            if (r2 != r3) goto L21
            java.lang.Object r2 = r1.L$2
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.f) r2
            java.lang.Object r4 = r1.L$1
            kotlinx.coroutines.channels.p r4 = (kotlinx.coroutines.channels.p) r4
            java.lang.Object r5 = r1.L$0
            com.voltasit.obdeleven.ui.activity.MainActivityViewModel r5 = (com.voltasit.obdeleven.ui.activity.MainActivityViewModel) r5
            kotlin.b.b(r18)     // Catch: java.lang.Throwable -> L1d
            r6 = r18
            goto L76
        L1d:
            r0 = move-exception
            r2 = r0
            goto L99
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L29:
            kotlin.b.b(r18)
            com.voltasit.obdeleven.ui.activity.MainActivityViewModel r2 = r1.this$0
            com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper r15 = new com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper
            com.voltasit.obdeleven.ui.activity.MainActivity r5 = r1.$mainActivity
            com.voltasit.obdeleven.domain.usecases.device.c r6 = r2.f33661y
            J8.c r7 = r2.f33663z
            com.voltasit.obdeleven.domain.usecases.device.B r8 = r2.f33578B
            com.voltasit.obdeleven.domain.usecases.device.D r9 = r2.f33580C
            com.voltasit.obdeleven.domain.usecases.device.e r10 = r2.f33582D
            com.voltasit.obdeleven.domain.usecases.device.g r11 = r2.f33594J
            com.voltasit.obdeleven.domain.usecases.device.b r12 = r2.f33604O
            com.voltasit.obdeleven.domain.usecases.device.m r13 = r2.f33602N
            J8.a r14 = r2.f33657w
            J8.u r4 = r2.f33624Y
            r16 = r4
            r4 = r15
            r3 = r15
            r15 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.f33628a0 = r3
            com.voltasit.obdeleven.ui.activity.MainActivityViewModel r2 = r1.this$0
            K8.v r2 = r2.f33648r
            kotlinx.coroutines.channels.a r2 = r2.y()
            kotlinx.coroutines.channels.BufferedChannel r4 = r2.m()
            com.voltasit.obdeleven.ui.activity.MainActivityViewModel r2 = r1.this$0
            kotlinx.coroutines.channels.BufferedChannel$a r3 = new kotlinx.coroutines.channels.BufferedChannel$a     // Catch: java.lang.Throwable -> L1d
            r3.<init>()     // Catch: java.lang.Throwable -> L1d
            r5 = r2
            r2 = r3
        L66:
            r1.L$0 = r5     // Catch: java.lang.Throwable -> L1d
            r1.L$1 = r4     // Catch: java.lang.Throwable -> L1d
            r1.L$2 = r2     // Catch: java.lang.Throwable -> L1d
            r3 = 1
            r1.label = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r6 = r2.a(r1)     // Catch: java.lang.Throwable -> L1d
            if (r6 != r0) goto L76
            return r0
        L76:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L1d
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L1d
            if (r6 == 0) goto L90
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L1d
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L1d
            boolean r7 = r6.booleanValue()     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L66
            U7.a<java.lang.Boolean> r7 = r5.f33641n0     // Catch: java.lang.Throwable -> L1d
            r7.j(r6)     // Catch: java.lang.Throwable -> L1d
            goto L66
        L90:
            xa.r r0 = p293xa.r.f47939a     // Catch: java.lang.Throwable -> L1d
            r0 = 0
            r4.i(r0)
            xa.r r0 = p293xa.r.f47939a
            return r0
        L99:
            throw r2     // Catch: java.lang.Throwable -> L9a
        L9a:
            r0 = move-exception
            r3 = r0
            p241t7.b.b(r4, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.ui.activity.MainActivityViewModel$createBluetoothConnectionHelper$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

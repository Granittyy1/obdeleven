package com.voltasit.obdeleven.ui.dialogs.autocodeprogress;

import Aa.c;
import Ia.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: AutocodeProgressViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressViewModel$startAutocode$1", f = "AutocodeProgressViewModel.kt", l = {R.styleable.AppCompatTheme_dialogTheme}, m = "invokeSuspend")
final class AutocodeProgressViewModel$startAutocode$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocodeProgressViewModel$startAutocode$1(b bVar, kotlin.coroutines.c<? super AutocodeProgressViewModel$startAutocode$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AutocodeProgressViewModel$startAutocode$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((AutocodeProgressViewModel$startAutocode$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0066 -> B:17:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r8.label
            com.voltasit.obdeleven.models.AutocodingState r2 = com.voltasit.obdeleven.models.AutocodingState.f31123d
            com.voltasit.obdeleven.models.AutocodingState r3 = com.voltasit.obdeleven.models.AutocodingState.f31122c
            java.lang.String r4 = "<this>"
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 != r5) goto L17
            java.lang.Object r1 = r8.L$0
            java.util.List r1 = (java.util.List) r1
            kotlin.b.b(r9)
            goto L69
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.b.b(r9)
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r9 = r8.this$0
            androidx.lifecycle.C<com.voltasit.obdeleven.models.AutocodingState> r9 = r9.j
            r9.j(r3)
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r9 = r8.this$0
            androidx.lifecycle.C<java.util.List<Q8.a>> r9 = r9.f33900h
            java.lang.Object r9 = r9.d()
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L37
            kotlin.collections.EmptyList r9 = kotlin.collections.EmptyList.f42983b
        L37:
            r1 = r9
        L38:
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r9 = r8.this$0
            int r9 = r9.f33903l
            int r6 = r1.size()
            if (r9 >= r6) goto L9f
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r9 = r8.this$0
            int r9 = r9.f33903l
            java.lang.Object r9 = r1.get(r9)
            Q8.a r9 = (Q8.a) r9
            r9.f5125a = r3
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r6 = r8.this$0
            androidx.lifecycle.C<java.util.List<Q8.a>> r6 = r6.f33900h
            kotlin.jvm.internal.i.e(r6, r4)
            java.lang.Object r7 = r6.d()
            r6.k(r7)
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r6 = r8.this$0
            r8.L$0 = r1
            r8.label = r5
            java.lang.Object r9 = com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b.b(r6, r9, r8)
            if (r9 != r0) goto L69
            return r0
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L89
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r9 = r8.this$0
            androidx.lifecycle.C<java.util.List<Q8.a>> r9 = r9.f33900h
            kotlin.jvm.internal.i.e(r9, r4)
            java.lang.Object r0 = r9.d()
            r9.k(r0)
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r9 = r8.this$0
            androidx.lifecycle.C<com.voltasit.obdeleven.models.AutocodingState> r9 = r9.j
            r9.j(r2)
            xa.r r9 = p293xa.r.f47939a
            return r9
        L89:
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r9 = r8.this$0
            androidx.lifecycle.C<java.util.List<Q8.a>> r9 = r9.f33900h
            kotlin.jvm.internal.i.e(r9, r4)
            java.lang.Object r6 = r9.d()
            r9.k(r6)
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r9 = r8.this$0
            int r6 = r9.f33903l
            int r6 = r6 + r5
            r9.f33903l = r6
            goto L38
        L9f:
            com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b r9 = r8.this$0
            androidx.lifecycle.C<com.voltasit.obdeleven.models.AutocodingState> r9 = r9.j
            r9.j(r2)
            xa.r r9 = p293xa.r.f47939a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressViewModel$startAutocode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

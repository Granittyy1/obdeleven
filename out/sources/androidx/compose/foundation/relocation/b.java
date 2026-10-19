package androidx.compose.foundation.relocation;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<d> f11024a = new androidx.compose.runtime.collection.c<>(new d[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0065 -> B:19:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // androidx.compose.foundation.relocation.a
    public final java.lang.Object a(I.f r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r10 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.L$0
            I.f r5 = (I.f) r5
            kotlin.b.b(r11)
            r11 = r5
            goto L68
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            kotlin.b.b(r11)
            androidx.compose.runtime.collection.c<androidx.compose.foundation.relocation.d> r11 = r9.f11024a
            T[] r2 = r11.f12943b
            int r11 = r11.f12945d
            r4 = 0
            r7 = r11
            r11 = r10
            r10 = r7
            r8 = r4
            r4 = r2
            r2 = r8
        L4c:
            if (r2 >= r10) goto L6a
            r5 = r4[r2]
            androidx.compose.foundation.relocation.d r5 = (androidx.compose.foundation.relocation.d) r5
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1 r6 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1
            r6.<init>()
            r0.L$0 = r11
            r0.L$1 = r4
            r0.I$0 = r2
            r0.I$1 = r10
            r0.label = r3
            java.lang.Object r5 = androidx.compose.ui.relocation.b.a(r5, r6, r0)
            if (r5 != r1) goto L68
            return r1
        L68:
            int r2 = r2 + r3
            goto L4c
        L6a:
            xa.r r10 = p293xa.r.f47939a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.b.a(I.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

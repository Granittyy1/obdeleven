package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScrollingLogic f9972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9973c;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z10) {
        this.f9972b = scrollingLogic;
        this.f9973c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object U(long j, long j10, kotlin.coroutines.c<? super p013b0.p> cVar) {
        ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        long jD;
        long j11;
        if (cVar instanceof ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (ScrollableNestedScrollConnection$onPostFling$1) cVar;
            int i10 = scrollableNestedScrollConnection$onPostFling$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, (ContinuationImpl) cVar);
            }
        } else {
            scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, (ContinuationImpl) cVar);
        }
        Object objB = scrollableNestedScrollConnection$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scrollableNestedScrollConnection$onPostFling$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                j10 = scrollableNestedScrollConnection$onPostFling$1.J$0;
                kotlin.b.b(objB);
                j11 = ((p013b0.p) objB).f20496a;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = scrollableNestedScrollConnection$onPostFling$1.J$0;
                kotlin.b.b(objB);
                j11 = ((p013b0.p) objB).f20496a;
            }
            jD = p013b0.p.d(j10, j11);
        } else {
            kotlin.b.b(objB);
            jD = 0;
            if (this.f9973c) {
                ScrollingLogic scrollingLogic = this.f9972b;
                if (scrollingLogic.f9992h) {
                    j11 = 0;
                } else {
                    scrollableNestedScrollConnection$onPostFling$1.J$0 = j10;
                    scrollableNestedScrollConnection$onPostFling$1.label = 1;
                    objB = scrollingLogic.b(j10, scrollableNestedScrollConnection$onPostFling$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j11 = ((p013b0.p) objB).f20496a;
                }
                jD = p013b0.p.d(j10, j11);
            }
        }
        return new p013b0.p(jD);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long c1(int i10, long j, long j10) {
        if (!this.f9973c) {
            return 0L;
        }
        ScrollingLogic scrollingLogic = this.f9972b;
        if (scrollingLogic.f9985a.a()) {
            return 0L;
        }
        return scrollingLogic.h(scrollingLogic.d(scrollingLogic.f9985a.e(scrollingLogic.d(scrollingLogic.g(j10)))));
    }
}

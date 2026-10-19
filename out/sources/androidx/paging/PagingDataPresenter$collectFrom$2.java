package androidx.paging;

import android.os.Build;
import android.util.Log;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PagingDataPresenter.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", l = {R.styleable.AppCompatTheme_windowFixedHeightMinor}, m = "invokeSuspend")
public final class PagingDataPresenter$collectFrom$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ PagingData<T> $pagingData;
    int label;
    final /* synthetic */ PagingDataPresenter<T> this$0;

    /* JADX INFO: compiled from: PagingDataPresenter.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PagingDataPresenter<T> f19306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PagingData<T> f19307c;

        public a(PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData) {
            this.f19306b = pagingDataPresenter;
            this.f19307c = pagingData;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) throws Throwable {
            PageEvent pageEvent = (PageEvent) obj;
            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                String message = "Collected " + pageEvent;
                kotlin.jvm.internal.i.e(message, "message");
            }
            PagingDataPresenter<T> pagingDataPresenter = this.f19306b;
            Object objF = C2680e.f(pagingDataPresenter.f19293a, new PagingDataPresenter$collectFrom$2$1$2(pageEvent, pagingDataPresenter, this.f19307c, null), cVar);
            return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$collectFrom$2(PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData, kotlin.coroutines.c<? super PagingDataPresenter$collectFrom$2> cVar) {
        super(1, cVar);
        this.this$0 = pagingDataPresenter;
        this.$pagingData = pagingData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new PagingDataPresenter$collectFrom$2(this.this$0, this.$pagingData, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PagingDataPresenter$collectFrom$2) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to androidx.paging.PagingDataPresenter$collectFrom$2 for r5v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.b.b(r6)
            goto L4a
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            kotlin.b.b(r6)
            androidx.paging.PagingDataPresenter<T> r6 = r5.this$0
            androidx.paging.PagingData<T> r1 = r5.$pagingData
            androidx.paging.G r1 = r1.f19289b
            androidx.paging.G r3 = r6.f19295c
            r6.f19295c = r1
            boolean r6 = r3 instanceof androidx.paging.PagingDataPresenter.a
            if (r6 == 0) goto L36
            androidx.paging.PagingDataPresenter$a r3 = (androidx.paging.PagingDataPresenter.a) r3
            boolean r6 = r3.f19304a
            if (r6 == 0) goto L2f
            r1.a()
        L2f:
            boolean r6 = r3.f19305b
            if (r6 == 0) goto L36
            r1.b()
        L36:
            androidx.paging.PagingData<T> r6 = r5.$pagingData
            kotlinx.coroutines.flow.c<androidx.paging.PageEvent<T>> r1 = r6.f19288a
            androidx.paging.PagingDataPresenter$collectFrom$2$a r3 = new androidx.paging.PagingDataPresenter$collectFrom$2$a
            androidx.paging.PagingDataPresenter<T> r4 = r5.this$0
            r3.<init>(r4, r6)
            r5.label = r2
            java.lang.Object r6 = r1.collect(r3, r5)
            if (r6 != r0) goto L4a
            return r0
        L4a:
            xa.r r6 = p293xa.r.f47939a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter$collectFrom$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

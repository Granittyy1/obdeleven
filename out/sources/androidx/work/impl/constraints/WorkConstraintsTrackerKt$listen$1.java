package androidx.work.impl.constraints;

import Ia.p;
import Q2.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.internal.g;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: WorkConstraintsTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight}, m = "invokeSuspend")
final class WorkConstraintsTrackerKt$listen$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ d $listener;
    final /* synthetic */ z $spec;
    final /* synthetic */ WorkConstraintsTracker $this_listen;
    int label;

    /* JADX INFO: compiled from: WorkConstraintsTracker.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f20388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z f20389c;

        public a(d dVar, z zVar) {
            this.f20388b = dVar;
            this.f20389c = zVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            this.f20388b.a(this.f20389c, (b) obj);
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerKt$listen$1(WorkConstraintsTracker workConstraintsTracker, z zVar, d dVar, kotlin.coroutines.c<? super WorkConstraintsTrackerKt$listen$1> cVar) {
        super(2, cVar);
        this.$this_listen = workConstraintsTracker;
        this.$spec = zVar;
        this.$listener = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new WorkConstraintsTrackerKt$listen$1(this.$this_listen, this.$spec, this.$listener, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((WorkConstraintsTrackerKt$listen$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            WorkConstraintsTracker workConstraintsTracker = this.$this_listen;
            z spec = this.$spec;
            workConstraintsTracker.getClass();
            i.e(spec, "spec");
            List<androidx.work.impl.constraints.controllers.c<?>> list = workConstraintsTracker.f20385a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((androidx.work.impl.constraints.controllers.c) obj2).b(spec)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(m.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((androidx.work.impl.constraints.controllers.c) it.next()).d());
            }
            final InterfaceC2686c[] interfaceC2686cArr = (InterfaceC2686c[]) q.o0(arrayList2).toArray(new InterfaceC2686c[0]);
            InterfaceC2686c interfaceC2686cH = C2688e.h(new InterfaceC2686c<b>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

                /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
                /* JADX INFO: compiled from: Zip.kt */
                @Aa.c(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
                public static final class AnonymousClass3 extends SuspendLambda implements Ia.q<InterfaceC2687d<? super b>, b[], kotlin.coroutines.c<? super r>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    @Override // Ia.q
                    public final Object invoke(InterfaceC2687d<? super b> interfaceC2687d, b[] bVarArr, kotlin.coroutines.c<? super r> cVar) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, cVar);
                        anonymousClass3.L$0 = interfaceC2687d;
                        anonymousClass3.L$1 = bVarArr;
                        return anonymousClass3.invokeSuspend(r.f47939a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        b bVar;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        int i10 = this.label;
                        if (i10 == 0) {
                            kotlin.b.b(obj);
                            InterfaceC2687d interfaceC2687d = (InterfaceC2687d) this.L$0;
                            b[] bVarArr = (b[]) ((Object[]) this.L$1);
                            int length = bVarArr.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    bVar = null;
                                    break;
                                }
                                bVar = bVarArr[i11];
                                if (!i.a(bVar, b.a.f20390a)) {
                                    break;
                                }
                                i11++;
                            }
                            if (bVar == null) {
                                bVar = b.a.f20390a;
                            }
                            this.label = 1;
                            if (interfaceC2687d.emit(bVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                        }
                        return r.f47939a;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC2686c
                public final Object collect(InterfaceC2687d<? super b> interfaceC2687d, kotlin.coroutines.c cVar) {
                    final InterfaceC2686c[] interfaceC2686cArr2 = interfaceC2686cArr;
                    Object objA = g.a(new Ia.a<b[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final b[] invoke() {
                            return new b[interfaceC2686cArr2.length];
                        }
                    }, new AnonymousClass3(3, null), cVar, interfaceC2687d, interfaceC2686cArr2);
                    return objA == CoroutineSingletons.f43038b ? objA : r.f47939a;
                }
            });
            a aVar = new a(this.$listener, this.$spec);
            this.label = 1;
            if (interfaceC2686cH.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}

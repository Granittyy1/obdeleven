package androidx.datastore.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2 implements InterfaceC2687d<l<Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2687d f17040b;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
    @Aa.c(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2(InterfaceC2687d interfaceC2687d) {
        this.f17040b = interfaceC2687d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(l<Object> lVar, kotlin.coroutines.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            l<Object> lVar2 = lVar;
            if (lVar2 instanceof i) {
                throw ((i) lVar2).f17045a;
            }
            if (lVar2 instanceof g) {
                throw ((g) lVar2).f17044a;
            }
            if (!(lVar2 instanceof b)) {
                if (lVar2 instanceof m) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new NoWhenBranchMatchedException();
            }
            T t8 = ((b) lVar2).f17041a;
            anonymousClass1.label = 1;
            if (this.f17040b.emit(t8, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}

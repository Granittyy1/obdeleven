package S6;

import X8.n;
import androidx.compose.ui.text.font.s;
import com.google.android.gms.common.util.VisibleForTesting;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import java.util.concurrent.Executor;
import p033c7.C1501n;
import p033c7.C1502o;
import p033c7.H;
import p033c7.g0;
import p123ja.o;

/* JADX INFO: compiled from: FirebaseInAppMessaging.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1502o f5677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1501n f5678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p108i7.c f5679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U6.a f5680d;

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public j(H h8, p108i7.c cVar, C1502o c1502o, C1501n c1501n, @p217r6.c Executor executor) throws Exception {
        p123ja.d flowableFlatMap;
        p123ja.d flowableConcatMap;
        this.f5679c = cVar;
        this.f5677a = c1502o;
        this.f5678b = c1501n;
        cVar.getId().f(executor, new B6.c(2));
        FlowablePublish flowablePublish = h8.j.f22424b;
        int i10 = p123ja.d.f41194b;
        p171na.a<String> aVar = h8.f22353a;
        Q3.d.I(aVar, "source1 is null");
        Q3.d.I(flowablePublish, "source2 is null");
        p171na.a<String> aVar2 = h8.f22354b;
        Q3.d.I(aVar2, "source3 is null");
        FlowableFromArray flowableFromArray = new FlowableFromArray(new bc.a[]{aVar, flowablePublish, aVar2});
        qa.a.f fVar = qa.a.f46188a;
        Q3.d.L(3, "maxConcurrency");
        int i11 = p123ja.d.f41194b;
        Q3.d.L(i11, "bufferSize");
        if (flowableFromArray instanceof ra.h) {
            T tCall = ((ra.h) flowableFromArray).call();
            flowableFlatMap = tCall == 0 ? io.reactivex.internal.operators.flowable.d.f40753c : new io.reactivex.internal.operators.flowable.h.a(tCall, fVar);
        } else {
            flowableFlatMap = new FlowableFlatMap(flowableFromArray, i11);
        }
        s sVar = new s(2);
        flowableFlatMap.getClass();
        io.reactivex.internal.operators.flowable.b bVar = new io.reactivex.internal.operators.flowable.b(flowableFlatMap, sVar);
        g0 g0Var = h8.f22358f;
        o oVar = g0Var.f22451a;
        Q3.d.I(oVar, "scheduler is null");
        Q3.d.L(i11, "bufferSize");
        FlowableObserveOn flowableObserveOn = new FlowableObserveOn(bVar, oVar, i11);
        n nVar = new n(h8);
        Q3.d.L(2, "prefetch");
        if (flowableObserveOn instanceof ra.h) {
            T tCall2 = ((ra.h) flowableObserveOn).call();
            flowableConcatMap = tCall2 == 0 ? io.reactivex.internal.operators.flowable.d.f40753c : new io.reactivex.internal.operators.flowable.h.a(tCall2, nVar);
        } else {
            flowableConcatMap = new FlowableConcatMap(flowableObserveOn, nVar);
        }
        flowableConcatMap.getClass();
        o oVar2 = g0Var.f22452b;
        Q3.d.I(oVar2, "scheduler is null");
        Q3.d.L(i11, "bufferSize");
        new FlowableObserveOn(flowableConcatMap, oVar2, i11).d(new LambdaSubscriber(new i(0, this)));
    }
}
